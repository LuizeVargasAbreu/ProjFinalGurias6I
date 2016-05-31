<%@include file="../cabecalho.jsp"%>
<%@page import="modelo.Disciplina"%>
<%@page import="dao.DisciplinaDAO"%>
<%
    if(request.getParameter("txtLogin") == null || request.getParameter("txtSenha")== null || request.getParameter("txtEmail")== null || request.getParameter("txtFoto")== null)
    {
        response.sendRedirect("list.jsp");
        return;
    }

    String login = request.getParameter("txtLogin");
    String senha = request.getParameter("txtSenha");
    String email = request.getParameter("txtEmail");
    String foto = request.getParameter("txtFoto");

    DisciplinaDAO dao = new DisciplinaDAO();
  /*  Disciplina disc = dao.buscarPorChavePrimaria(login);

    if (disc == null)
    {
        response.sendRedirect("list.jsp");
        return;
    }
     disc.setLogin(login);
     disc.setSenha(senha);
     disc.setEmail(email);
     disc.setFoto(foto);
   

    dao.alterar(disc);

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

