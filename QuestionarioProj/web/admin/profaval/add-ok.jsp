<%@page import="java.math.BigInteger"%>
<%@include file="../cabecalho.jsp"%>
<%@page import="dao.ProfAvalDAO"%>
<%@page import="modelo.ProfAval"%>
<%
    String msg="";
    
    if(request.getParameter("txtIdpa") == null || request.getParameter("txtPeriodoPA")== null || request.getParameter("txtPAResposta") == null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
             
        Long idPA = Long.parseLong(request.getParameter("txtIdpa"));
        String periodoPA = request.getParameter("txtPeriodoPA");
        BigInteger v_resposta = new BigInteger(request.getParameter("txtPAResposta"));
        
        ProfAvalDAO dao = new ProfAvalDAO();
        ProfAval pa = new ProfAval();
        
        pa.setIdProfaval(idPA);
        pa.setPaPeriodo(periodoPA);
        pa.setPaResposta1(v_resposta);
        
       try
        {
            dao.incluir(pa);
            msg = "Avaliação do Professor cadastrada com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao cadastrar avaliação";
        }
        
    }
    
    String idPA = request.getParameter("txtIdpa");
    String periodoPA = request.getParameter("txtPeriodoPA");
    String respostaPA = request.getParameter("txtPAResposta");

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
             <%=msg%>.<br />
             Id da Avaliação do Professor: <%=idPA%><br />
             Período da Avaliação: <%=periodoPA%><br />
             Resposta: <%=respostaPA%><br />
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

