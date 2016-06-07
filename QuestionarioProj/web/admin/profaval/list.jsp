<%@page import="modelo.ProfAval"%>
<%@page import="dao.ProfAvalDAO"%>
<%@page import="java.util.List"%>
<%@include file="../cabecalho.jsp"%>
<%
    ProfAvalDAO dao = new ProfAvalDAO();

    List<ProfAval> lista;

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
            <h4>Avaliação de Professores</h4>
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

                        <th>ID da Avaliação</th>
                        <th>Professor Avaliado</th>
                        <th>Período</th>
                        <th>Respostas</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <%
                   for (ProfAval item : lista) {
                %>
                <tbody>
                    <tr>
                        <td><%=item.getIdProfaval()%></td>
                        <td><%=item.getProfessor()%></td>
                        <td><%=item.getPaPeriodo()%></td>
                        <td><%=item.getPaResposta1()%></td>
                        <td>
                            <!-- 
                                Atualizar 
                            -->
                            <div id="ttupd" class="icon material-icons">
                                <i class="material-icons"><a href="upd.jsp?Idpa=<%=item.getIdProfaval()%>">update</a></i>
                            </div>
                            <div class="mdl-tooltip" for="ttupd">
                                Atualizar
                            </div>
                            <!-- 
                                Excluir 
                            -->
                            <div id="ttdel" class="icon material-icons">
                                <i class="material-icons"><a href="del-ok.jsp?Idpa=<%=item.getIdProfaval()%>">delete</a></i>
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

