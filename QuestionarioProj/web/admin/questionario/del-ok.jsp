<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Questionario"%>
<%@page import="dao.QuestionarioDAO"%>
<%
    String msg = "";
    if(request.getParameter("id")==null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        QuestionarioDAO dao = new QuestionarioDAO();

        Questionario q = dao.buscarPorChavePrimaria(id);
        if(q!=null)
        {
            dao.excluir(q);
            msg = "Registro de Questionario excluído com sucesso";
        }
        else
        {
            msg = "Registro de Questionario não encontrado. Verifique.";
        }
        
    }
%>
<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <%=msg%><br />
            <a href="list.jsp"><i class="material-icons">Voltar</i></a>
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

