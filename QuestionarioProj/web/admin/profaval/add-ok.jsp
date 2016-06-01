<%@include file="../cabecalho.jsp"%>
<%@page import="dao.ProfAvalDAO"%>
<%@page import="modelo.ProfAval"%>
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
        
        ProfAvalDAO dao = new ProfAvalDAO();
        ProfAval pa = new ProfAval();

        pa.setNome(nome);
     //   pa.setId(id);
        
       try
        {
            dao.incluir(pa);
            msg = "ProfAval cadastrada com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao cadastrar paegoria";
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
<!--             ID da ProfAval: <%//=id%><br />-->
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

