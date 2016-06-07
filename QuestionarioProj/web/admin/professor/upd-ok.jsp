<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Professor"%>
<%@page import="dao.ProfessorDAO"%>
<%
    if (request.getParameter("txtIdProf")== null || request.getParameter("txtNmProfessor") == null || request.getParameter("txtPeriodoProf") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    Long idProfessor = Long.parseLong(request.getParameter("txtIdProf"));
    String nm_prof = request.getParameter("txtNmProfessor");
    String per_prof = request.getParameter("txtPeriodoProf");

    ProfessorDAO dao = new ProfessorDAO();
    Professor prof = dao.buscarPorChavePrimaria(idProfessor);

    if (prof == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }
    
    prof.setIdProfessor(idProfessor);
    prof.setProfNome(nm_prof);
    prof.setProfPeriodo(per_prof);
   
    dao.alterar(prof);

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

