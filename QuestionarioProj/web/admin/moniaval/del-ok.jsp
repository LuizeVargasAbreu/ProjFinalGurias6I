<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.MoniAval"%>
<%@page import="dao.MoniAvalDAO"%>
<%
    String msg = "";
    if(request.getParameter("idzinho")==null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        Integer idzinho = Integer.parseInt(request.getParameter("idzinho"));
        
        MoniAvalDAO dao = new MoniAvalDAO();

       // MoniAval pg = dao.buscarPorChavePrimaria(idzinho);
      /*  if(pg!=null)
        {
            dao.excluir(pg);
            msg = "Registro de MoniAval excluído com sucesso";
        }
        else
        {
            msg = "Registro de MoniAval não encontrado. Verifique.";
        }
        
    }*/
%>
<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <%=msg%><br />
            <a href="list.jsp"><i class="material-icons">Voltar para MoniAval</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

