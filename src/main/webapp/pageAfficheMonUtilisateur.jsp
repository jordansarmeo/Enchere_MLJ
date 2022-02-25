<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.eni.projet.enchere.mlj.bo.*"%>
      <%@ page import="fr.eni.projet.enchere.mlj.bll.*"%>
        <%@ page import="fr.eni.projet.enchere.mlj.*"%>

<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport"content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="Keywords" content=" " />
    <meta name="author" content="Monika" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"rel="stylesheet" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" />
    <script 
      src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
      integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
      crossorigin="anonymous"
    ></script>
<title>Afficher Mon Profil</title>
</head>
<body>
	
	<%
		String userName =(String)session.getAttribute("userName");  
		Utilisateur u;
		u=(Utilisateur)request.getAttribute("utilisateurs"); %>
	

<header>
      <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
          <a href="index.html" class="navbar-brand">ENI-Enchères</a>
          <div class="d-flex">
            <a class="p-2" href="nouveauAchat.html">Enchères</a>
            <a class="p-2" href="nouvelleVente.jsp">Vendre un article</a>
            <a class="p-2" href="ServletListerUtilisateur">Mon profil</a>
            <a class="p-2" href="LogoutServlet">Déconnexion</a>
          </div>
        </div>
      </nav>
    </header>
  <div class="text-aling"> 
  <form action="ServletListerModifUtilisateur">  
	   <table class="table table-borderless">
	  
	  <tbody>
	   <tr>
	      <th scope="row"></th>
	      <td>Pseudo</td>
	      <td><%=u.getPseudo()%></td>
	    
	    </tr>
	    <tr>
	      <th scope="row"></th>
	      <td>Nom</td>
	      <td><%=u.getNom()%></td>

	    </tr>
	    <tr>
	      <th scope="row"></th>
	      <td>Prénom</td>
	      <td><%=u.getPrenom()%></td>

	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Email</td>
	      <td><%=u.getEmail()%></td>
	    
	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Téléphone</td>
	      <td><%=u.getTelephone()%></td>
	   
	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Rue</td>
	       <td><%=u.getRue()%></td>
	 
	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Code Postal</td>
	      <td><%=u.getCodePostal()%></td>
	   
	     <tr>
	      <th scope="row"></th>
	      <td>Ville</td>
	      <td><%=u.getVille()%></td>
	      
	    </tr>
	   
	  </tbody>
	</table>
	

  <div class="form-group mb-0 text-center">
         <button class="btn btn-outline-success btn-block" type="submit" name="Modification"> Modification </button>
  </div>
</form> 
</div>  
</body>
</html>