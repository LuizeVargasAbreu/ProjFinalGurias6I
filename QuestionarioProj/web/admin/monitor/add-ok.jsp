<%@include file="../cabecalho.jsp"%>
<%@page import="dao.MonitorDAO"%>
<%@page import="modelo.Monitor"%>
<%
    String msg="";
    
    if(request.getParameter("txtNome") == null)// || request.getParameter("txtID")== null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
             
        String nome = request.getParameter("txtNome");
     //   Integer id = Integer.parseInt(request.getParameter("txtID"));
        
        MonitorDAO dao = new MonitorDAO();
        Monitor mon = new Monitor();

        mon.setNome(nome);
     //   mon.setId(id);
        
       try
        {
            dao.incluir(mon);
            msg = "Monitor cadastrada com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao cadastrar monitor";
        }
        
    }
    String nome = request.getParameter("txtNome");
   // String id = request.getParameter("txtID");

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
             <%=msg%>.<br />
             Nome: <%=nome%><br />
<!--             ID da Monitor: <%//=id%><br />-->
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

