<%@include file="../cabecalho.jsp"%>
<%@page import="dao.MonitorDAO"%>
<%@page import="modelo.Monitor"%>
<%
    if (request.getParameter("ID") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    Long idMonitor = Long.parseLong(request.getParameter("ID"));
    String nome = request.getParameter("txtNome");
    String periodo = request.getParameter("txtPeriodo");
    
    MonitorDAO dao = new MonitorDAO();
    Monitor mon = dao.buscarPorChavePrimaria(idMonitor);

    if (mon == null)
    {
        response.sendRedirect("list.jsp");
        return;

    }

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text">
            <h4>Monitor - Atualizar</h4>
            <form action="upd-ok.jsp" method="post">
                <!-- 
                    primeira div -- área que ocupará o campo de formulário
                    segunda div -- campo de texto e label 
                -->
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtID" value="<%=mon.getIdMonitor()%>" readonly="readonly" />
                        <label class="mdl-textfield__label" for="txtID">ID de Monitor</label>
                    </div>
                </div>
                
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtNome" value="<%=mon.getMonNome()%>" />
                        <label class="mdl-textfield__label" for="txtNome">Nome</label>
                    </div>
                </div>
                        
                
                <div class="mdl-cell--12-col"> 
                    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
                        <input class="mdl-textfield__input" type="text" required  name="txtPeriodo" value="<%=mon.getMonPeriodo()%>" />
                        <label class="mdl-textfield__label" for="txtPeriodo">Período</label>
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


