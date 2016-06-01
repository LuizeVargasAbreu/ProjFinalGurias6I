<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Monitor"%>
<%@page import="dao.MonitorDAO"%>
<%
    if (request.getParameter("txtNome") == null || request.getParameter("txtID") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    String nome = request.getParameter("txtNome");
    Integer id = Integer.parseInt(request.getParameter("txtID"));

    MonitorDAO dao = new MonitorDAO();
    Monitor mon = dao.buscarPorChavePrimaria(id);

    if (mon == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }
    mon.setNome(nome);
    mon.setId(id);
   

    dao.alterar(mon);



%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <h4>Atualizar</h4>
            <p>Registro atualizado com sucesso.</p>
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

