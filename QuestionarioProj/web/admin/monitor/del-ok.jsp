<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Monitor"%>
<%@page import="dao.MonitorDAO"%>
<%
    String msg = "";
    if(request.getParameter("ID")==null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        Long idMonitor = Long.parseLong(request.getParameter("ID"));
        
        MonitorDAO dao = new MonitorDAO();

        Monitor mon = dao.buscarPorChavePrimaria(idMonitor);
        if(mon!=null)
        {
            dao.excluir(mon);
            msg = "Registro de Monitor excluído com sucesso";
        }
        else
        {
            msg = "Registro de Monitor não encontrado. Verifique.";
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

