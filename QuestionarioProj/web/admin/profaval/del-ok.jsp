<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.ProfAval"%>
<%@page import="dao.ProfAvalDAO"%>
<%
    String msg = "";
    if(request.getParameter("id")==null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        ProfAvalDAO dao = new ProfAvalDAO();

        ProfAval pa = dao.buscarPorChavePrimaria(id);
        if(pa!=null)
        {
            dao.excluir(pa);
            msg = "Registro de ProfAval excluído com sucesso";
        }
        else
        {
            msg = "Registro de ProfAval não encontrado. Verifique.";
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

