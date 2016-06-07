<%@include file="../cabecalho.jsp"%>
<%@page import="dao.MonitorDAO"%>
<%@page import="modelo.Monitor"%>
<%
    String msg="";
    
    if(request.getParameter("txtID")== null || request.getParameter("txtNome") == null || request.getParameter("txtPeriodo") == null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        Long idMonitor = Long.parseLong(request.getParameter("txtID"));
        String nome = request.getParameter("txtNome");
        String periodo = request.getParameter("txtPeriodo");
            
        MonitorDAO dao = new MonitorDAO();
        Monitor mon = new Monitor();

        mon.setIdMonitor(idMonitor);
        mon.setMonNome(nome);
        mon.setMonPeriodo(periodo);
        
        
        
       try
        {
            dao.incluir(mon);
            msg = "Cadastro de Monitor feito com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao fazer cadastro de monitor";
        }
        
    }
   
    String idMonitor = request.getParameter("txtID");
    String nome = request.getParameter("txtNome");
    String periodo = request.getParameter("txtPeriodo");
   

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
             <%=msg%>.<br />
             ID do Monitor: <%=idMonitor%><br />
             Nome: <%=nome%><br />
             Período: <%=periodo%><br />
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

