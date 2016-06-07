<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Professor"%>
<%@page import="dao.ProfessorDAO"%>
<%
    String msg = "";
    if(request.getParameter("IdProf")==null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        Long idProfessor = Long.parseLong(request.getParameter("IdProf"));
        
        ProfessorDAO dao = new ProfessorDAO();

        Professor prof = dao.buscarPorChavePrimaria(idProfessor);
        if(prof!=null)
        {
            dao.excluir(prof);
            msg = "Registro de Professor excluído com sucesso";
        }
        else
        {
            msg = "Registro de Professor não encontrado. Verifique.";
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

