<%@include file="../cabecalho.jsp"%>
<%@page import="dao.DisciplinaDAO"%>
<%@page import="modelo.Disciplina"%>
<%
    String msg="";
    
    if(request.getParameter("txtLogin") == null || request.getParameter("txtSenha")== null || request.getParameter("txtEmail")== null || request.getParameter("txtFoto")== null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
             
        String login = request.getParameter("txtLogin");
        String senha = request.getParameter("txtSenha");
        String email = request.getParameter("txtEmail");
        String foto = request.getParameter("txtFoto");
        
        DisciplinaDAO dao = new DisciplinaDAO();
        Disciplina disc = new Disciplina();

      /*  disc.setLogin(login);
        disc.setSenha(senha);
        disc.setEmail(email);
        disc.setFoto(foto);*/
        
       try
        {
            dao.incluir(disc);
            msg = "Disciplina cadastrado com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao cadastrar disc";
        }
        
    }
     String login = request.getParameter("txtLogin");
     String senha = request.getParameter("txtSenha");
     String email = request.getParameter("txtEmail");
     String foto = request.getParameter("txtFoto");

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
             <%=msg%>.<br />
             Login: <%=login%><br />
             Senha: <%=senha%><br />
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

