<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Curso"%>
<%@page import="dao.CursoDAO"%>
<%
    if (request.getParameter("txtNome") == null || request.getParameter("txtID") == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    String nome = request.getParameter("txtNome");
    Integer id = Integer.parseInt(request.getParameter("txtID"));

    CursoDAO dao = new CursoDAO();
  /*  Curso curso = dao.buscarPorChavePrimaria(id);

    if (curso == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }
    curso.setNome(nome);
    curso.setId(id);
   

    dao.alterar(curso);

*/

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

