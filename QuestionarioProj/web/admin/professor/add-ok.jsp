<%@include file="../cabecalho.jsp"%>
<%@page import="dao.ProfessorDAO"%>
<%@page import="modelo.Professor"%>
<%
    String msg="";
    
    if(request.getParameter("txtIdProf")== null || request.getParameter("txtNmProfessor") == null || request.getParameter("txtPeriodoProf") == null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
        
        Long idProfessor = Long.parseLong(request.getParameter("txtIdProf"));
        String nm_prof = request.getParameter("txtNmProfessor");
        String per_prof = request.getParameter("txtPeriodoProf");
                
        ProfessorDAO dao = new ProfessorDAO();
        Professor prof = new Professor();

        prof.setIdProfessor(idProfessor);
        prof.setProfNome(nm_prof);
        prof.setProfPeriodo(per_prof);
        
       try
        {
            dao.incluir(prof);
            msg = "Cadastro de Professor feito com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao fazer cadastro de professor";
        }
        
    }
    
    String idProfessor = request.getParameter("txtIdProf");
    String nm_prof = request.getParameter("txtNmProfessor");
    String per_prof = request.getParameter("txtPeriodoProf");

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
             <%=msg%>.<br />
             ID de Professor: <%=idProfessor%><br />
             Nome: <%=nm_prof%><br />
             Período: <%=per_prof%><br />
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

