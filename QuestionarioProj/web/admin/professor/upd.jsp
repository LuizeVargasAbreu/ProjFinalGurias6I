<%@include file="../cabecalho.jsp"%>
<%@page import="dao.ProfessorDAO"%>
<%@page import="modelo.Professor"%>
<%
    if (request.getParameter("IdProf") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    Long idProfessor = Long.parseLong(request.getParameter("IdProf"));
    ProfessorDAO dao = new ProfessorDAO();
    Professor prof = dao.buscarPorChavePrimaria(idProfessor);

    if (prof == null)
    {
        response.sendRedirect("list.jsp");
        return;

    }

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text">
            <h4>Professor - Atualizar</h4>
            <form action="upd-ok.jsp" method="post">
                <!-- 
                    primeira div -- área que ocupará o campo de formulário
                    segunda div -- campo de texto e label 
                -->
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtIdProf" value="<%=prof.getIdProfessor()%>" readonly="readonly" />
                        <label class="mdl-textfield__label" for="txtIdProf">ID de Professor</label>
                    </div>
                </div>
                
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtNmProfessor" value="<%=prof.getProfNome()%>" />
                        <label class="mdl-textfield__label" for="txtNmProfessor">Nome</label>
                    </div>
                </div>
                        
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtPeriodoProf" value="<%=prof.getProfPeriodo()%>" />
                        <label class="mdl-textfield__label" for="txtPeriodoProf">Período</label>
                    </div>
                </div>        
                
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


