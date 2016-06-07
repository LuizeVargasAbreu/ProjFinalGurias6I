<%@page import="dao.ProfAvalDAO"%>
<%@page import="modelo.ProfAval"%>
<%@page import="modelo.Professor"%>
<%@page import="java.util.List"%>
<%@page import="dao.ProfessorDAO"%>
<%@include file="../cabecalho.jsp"%>
<%
    if (request.getParameter("Idpa") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    Long idPA = Long.parseLong(request.getParameter("Idpa"));
    ProfAvalDAO dao = new ProfAvalDAO();
    ProfAval pa = dao.buscarPorChavePrimaria(idPA);

    if (pa == null)
    {
        response.sendRedirect("list.jsp");
        return;

    }
    
    ProfessorDAO pdao = new ProfessorDAO();
    List<Professor> lista = pdao.listar();

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text">
            <h4>ProfAval - Cadastrar</h4>
            <form action="add-ok.jsp" method="post">
                <!-- 
                    primeira div -- área que ocupará o campo de formulário
                    segunda div -- campo de texto e label 
                -->
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtIdpa" />
                        <label class="mdl-textfield__label" for="txtIdpa">ID da Avaliação do Professor</label>
                    </div>
                </div>
                
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtPeriodoPA" />
                        <label class="mdl-textfield__label" for="txtPeriodoPA">Período</label>
                    </div>
                </div>
                
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtPAResposta" />
                        <label class="mdl-textfield__label" for="txtPAResposta">Resposta</label>
                    </div>
                </div>
                
                <div class="mdl-cell--12-col">
                    <div class="mdl-select mdl-js-select mdl-select--floating-label">
                        <select class="mdl-select__input" id="selProfessor" name="selProfessor" value="<%=pa.getProfessor()%>">
                        <option value="">Selecione a resposta</option>
                            <%                         
                               String selected = "";    
                               for (Professor item : lista) {
                               if(item.getProfNome()== pa.getProfessor().getProfNome())
                               {
                               selected = "selected";
                               }
                            %>
                        <option value="<%=item.getProfNome()%>" <%=selected%>><%=item%></option>
                            <%
                            selected = "";
                             }
                            %>
                        </select>

                <div class="mdl-cell--12-col">
                    
                    <button type="submit" class="mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored">
                    <i class="material-icons">save</i></button>
                    <button type="reset" class="mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored">
                    <i class="material-icons">clear</i></button>
                    
                    
                </div>
            </form>
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>


