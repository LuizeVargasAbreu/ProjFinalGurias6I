<%@page import="modelo.Professor"%>
<%@page import="dao.ProfessorDAO"%>
<%@page import="java.util.List"%>
<%@include file="../cabecalho.jsp"%>
<%
    ProfessorDAO dao = new ProfessorDAO();

    List<Professor> lista;

    if (request.getParameter("txtFiltro") != null && request.getParameter("txtFiltro") != "")
    {
        String txtFiltro = request.getParameter("txtFiltro");
        lista = dao.listar(txtFiltro);
    }
    else
    {
        lista = dao.listar();
    }

%>
<!-- gambiarra pra alinhar o botão a esquerda-->
<style>
    .direita
            {
                text-align: right;
                padding-right: 10%;
                
            }
</style>
<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text">
            <h4>Professor</h4>
            <!-- Colored mini FAB button -->
            <div class="direita">
                <a href="add.jsp">
                    <button class="mdl-button mdl-js-button mdl-button--fab mdl-button--mini-fab mdl-button--colored">
                         <i class="material-icons">add</i>
                    </button>  
                </a>
            </div>

            <table class="mdl-data-table mdl-js-data-table">
                <thead>
                    <tr>

                        <th>ID do Professor</th>
                        <th>Nome</th>
                        <th>Período</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <%
                   for (Professor item : lista) {
                %>
                <tbody>
                    <tr>
                        <td><%=item.getIdProfessor()%></td>
                        <td><%=item.getProfNome()%></td>
                        <td><%=item.getProfPeriodo()%></td>
                        <td>
                            <!-- 
                                Atualizar 
                            -->
                            <div id="ttupd" class="icon material-icons">
                                <i class="material-icons"><a href="upd.jsp?IdProf=<%=item.getIdProfessor()%>">update</a></i>
                            </div>
                            <div class="mdl-tooltip" for="ttupd">
                                Atualizar
                            </div>
                            <!-- 
                                Excluir 
                            -->
                            <div id="ttdel" class="icon material-icons">
                                <i class="material-icons"><a href="del-ok.jsp?IdProf=<%=item.getIdProfessor()%>">delete</a></i>
                            </div>
                            <div class="mdl-tooltip" for="ttdel">
                                Excluir
                            </div>
                            
                        </td>
                
                    </tr>
                  
                </tbody>
                <%
                    }
                %>
            </table>   
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

