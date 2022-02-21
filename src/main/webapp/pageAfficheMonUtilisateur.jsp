<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="fr.eni.projet.enchere.mlj.bo.*"%>
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
	<% Utilisateur u = (Utilisateur) request.getAttribute("psuedo"); %>
<header>
        <nav class="navbar navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand">ENI-Enchères</a>
            </div>
        </nav>
</header>
  <div class="text-aling"> 
  <form action="modificationsProfil.html">  
	   <table class="table table-borderless">
	  
	  <tbody>
	   <tr>
	      <th scope="row"></th>
	      <td>Pseudo</td>
	      <td>jojo44</td>
	    
	    </tr>
	    <tr>
	      <th scope="row"></th>
	      <td>Nom</td>
	      <td> Dubois </td>

	    </tr>
	    <tr>
	      <th scope="row"></th>
	      <td>Prénom</td>
	      <td>Jordan</td>

	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Email</td>
	      <td>duboi@gmail.com</td>
	    
	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Téléphone</td>
	      <td>0769369852</td>
	   
	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Rue</td>
	       <td>Jean Moulin</td>
	 
	    </tr>
	     <tr>
	      <th scope="row"></th>
	      <td>Code Postal</td>
	      <td>69140</td>
	   
	     <tr>
	      <th scope="row"></th>
	      <td>Ville</td>
	      <td>Lyon</td>
	      
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