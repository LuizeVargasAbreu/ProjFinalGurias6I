<%@page import="java.math.BigInteger"%>
<%@page import="modelo.Professor"%>
<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.ProfAval"%>
<%@page import="dao.ProfAvalDAO"%>
<%
    if (request.getParameter("txtIdpa") == null || request.getParameter("txtPeriodoPA")== null || request.getParameter("txtPAResposta") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    Long idPA = Long.parseLong(request.getParameter("txtIdpa"));
    String periodoPA = request.getParameter("txtPeriodoPA");
    BigInteger v_resposta = new BigInteger(request.getParameter("txtPAResposta"));
    Long idProfessor = Long.parseLong(request.getParameter("selProfessor"));


    ProfAvalDAO dao = new ProfAvalDAO();
    ProfAval pa = dao.buscarPorChavePrimaria(idPA);
    
    Professor prof = new Professor ();
    prof.setIdProfessor(idProfessor);

    if (pa == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }
    pa.setIdProfaval(idPA);
    pa.setPaPeriodo(periodoPA);
    pa.setPaResposta1(v_resposta);
    
    dao.alterar(pa);

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
            <h4>Atualizar</h4>
            <p>Avaliação atualizada com sucesso.</p>
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

