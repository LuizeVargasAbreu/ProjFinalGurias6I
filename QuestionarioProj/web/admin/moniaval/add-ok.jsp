<%@page import="modelo.Curso"%>
<%@include file="../cabecalho.jsp"%>
<%@page import="dao.MoniAvalDAO"%>
<%@page import="modelo.MoniAval"%>
<%
    String msg="";
    
    if(request.getParameter("txtIdzinho") == null || request.getParameter("txtA")== null || request.getParameter("txtB")== null || request.getParameter("txtC")== null || request.getParameter("txtD")== null
            || request.getParameter("txtNivel")== null || request.getParameter("txtCerta")== null || request.getParameter("txtEnunciado")== null)
    {
        response.sendRedirect("list.jsp");
    }
    else
    {
       // Integer idzinho = Integer.parseInt(request.getParameter("txtIdzinho"));     
        String a = request.getParameter("txtA");
        String b = request.getParameter("txtB");
        String c = request.getParameter("txtC");
        String d = request.getParameter("txtD");
        Integer nivel = Integer.parseInt(request.getParameter("txtNivel"));
        String certa = request.getParameter("txtCerta");
        String enunciado = request.getParameter("txtEnunciado");
        Integer id = Integer.parseInt(request.getParameter("selCurso")); 
        
        MoniAvalDAO dao = new MoniAvalDAO();
        MoniAval ma = new MoniAval();
        
        Curso curso = new Curso();
        curso.setId(id);
        
      //  ma.setId(idzinho);
        ma.setA(a);
        ma.setB(b);
        ma.setC(c);
        ma.setD(d);
        ma.setNivel(nivel);
        ma.setCerta(certa);
        ma.setEnunciado(enunciado);
        ma.setCurso(curso);
       try
        {
            dao.incluir(ma);
            msg = "MoniAval cadastrada com sucesso";
            
        }
        catch(Exception ex)
        {
            msg = "Erro ao cadastrar pergunta";
        }
        
    }
     Integer nivel = Integer.parseInt(request.getParameter("txtNivel"));
     String certa = request.getParameter("txtCerta");
     String enunciado = request.getParameter("txtEnunciado");

%>

<section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
    <div class="mdl-card mdl-cell mdl-cell--12-col">
        <div class="mdl-card__supporting-text ">
             <%=msg%>.<br />
             Nível: <%=nivel%><br />
             Enunciado: <%=enunciado%><br />
             Certa: <%=certa%><br />
            <a href="list.jsp"><i class="material-icons">list</i></a>
            
        </div>

    </div>

</section>

<%@include file="../rodape.jsp"%>

