<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Disciplina"%>
<%@page import="dao.DisciplinaDAO"%>
<%
    String msg = "";
    if(request.getParameter("login")==null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        String login = request.getParameter("login");
        
        DisciplinaDAO dao = new DisciplinaDAO();

      /*  Disciplina disc = dao.buscarPorChavePrimaria(login);
        if(disc!=null)
        {
            dao.excluir(disc);
            msg = "Registro de Disciplina excluído com sucesso";
        }
        else
        {
            msg = "Registro de Disciplina não encontrado. Verifique.";
        }
        
    }*/
%>
<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <%=msg%><br />
            <a href="list.jsp"><i class="material-icons">Voltar para Disciplina</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

