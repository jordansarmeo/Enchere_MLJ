<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="fr.eni.projet.enchere.mlj.bo.*"%>
      <%@ page import="fr.eni.projet.enchere.mlj.bll.*"%>
      <%@ page import="fr.eni.projet.enchere.mlj.*"%>
<!DOCTYPE html>
<html>
<head>
 <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <meta name="description" content=""/>
    <meta name="Keywords" content=" ">
    <meta name="author" content="contain by Wepora team">
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <title>Page de modification du profil d'un utilisateur</title>
</head>
<body>
<%
		String userName =(String)session.getAttribute("userName");  
		Utilisateur u;
		u=(Utilisateur)request.getAttribute("utilisateurs"); %>
<%-- <% 
String pseudo=null;
Utilisateur u = (Utilisateur) session.getAttribute( "utilisateur" ) ; 
		 pseudo = request.getParameter("pseudo");--%>
		
		

<!-- 
		try {
			
			UtilisateurManager utilManager = new UtilisateurManager();
			
				u= utilManager.selectionnerMonProfil(pseudo);
			
			request.getAttribute("utilisateurs");
		} catch (BusinessException e) {
			e.printStackTrace();
			
		}%>  -->
   <header>
      <nav class="navbar navbar-light bg-light">
        <div class="container-fluid">
          <a href="index.html" class="navbar-brand">ENI-Enchères</a>
          <div class="d-flex">
            <a class="p-2 mx-2 btn btn-outline-info" href="nouveauAchat.html">Enchères</a>
            <a class="p-2 mx-2 btn btn-outline-info " href="nouvelleVente.jsp">Vendre un article</a>
            <a class="p-2 mx-2 btn btn-outline-info" href="ServletListerUtilisateur">Mon profil</a>
            <a class="p-2 mx-2 btn btn-outline-info" href="LogoutServlet">Déconnexion</a>
          </div>
        </div>
      </nav>
    </header>
<!--content start-->
<h2 class="text-center mb-3">Modifier mon profil</h2>
    <div class="container mt-5">
        <form action="<%=request.getContextPath()%>/ServletValidantModificationUtilisateur" method="post">
            <div class="row">
                <div class="col-6 bg-light p-4">
                    <div class="row mb-3">
                        <label for="pseudo" class="col-sm-3 col-form-label">Pseudo</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="pseudo" name="pseudo" value="<%=u.getPseudo()%>" >
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="prenom" class="col-sm-3 col-form-label">Prénom</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="prenom" name="prenom" value="<%=u.getPrenom()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="telephone" class="col-sm-3 col-form-label">Téléphone</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="telephone" name="telephone" value="<%=u.getTelephone()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="codePostal" class="col-sm-3 col-form-label">Code Postal</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="codePostal" name="codePostal" value="<%=u.getCodePostal()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="motDePasse" class="col-sm-4 col-form-label">Mot de passe Actuel</label>
                        <div class="col-sm-8">
                        <input type="password" class="form-control"id="motDePasse" name="motDePasse" value="<%=u.getMotDePasse()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="newMotDePasse" class="col-sm-4 col-form-label">Nouveau mot de passe</label>
                        <div class="col-sm-8">
                        <input type="text" class="form-control"id="newMotDePasse" name="newMotDePasse">
                        </div>
                    </div>
                </div>
                <div class="col-6 bg-light p-4">
                    <div class="row mb-3">
                        <label for="nom" class="col-sm-3 col-form-label">Nom</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="nom" name="nom" value="<%=u.getNom()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="email" class="col-sm-3 col-form-label">Email</label>
                        <div class="col-sm-9">
                        <input type="email" class="form-control"id="email" name="email" value="<%=u.getEmail()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="rue" class="col-sm-3 col-form-label">Rue</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="rue" name="rue" value="<%=u.getRue()%>">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="ville" class="col-sm-3 col-form-label">Ville</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="ville" name="ville" value="<%=u.getVille()%>">
                        </div>
                    </div>
                    <div class="row mb-3 hide">
                        <label for="" class="col-sm-3 col-form-label"></label>
                        <div class="col-sm-9">
                        <input type="hidden" class="form-control ">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="confirmMotDePasse" class="col-sm-3 col-form-label">Confirmation</label>
                        <div class="col-sm-9">
                        <input type="text" class="form-control"id="confirmMotDePasse" name="confirmMotDePasse">
                        </div>
                    </div>
                </div>
            </div>
            <div class="form-group row mt-3">
                <div class="col-6 text-end">
                
                <input class="btn btn-success" type="submit" name="enregistrer" value="Enregistrer">
                </div>
                <div class="col-6">
                    <button type="submit" class="btn btn-danger">Supprimer mon compte</button>
                </div>
            </div>
        </form> 
    </div>

<!--content end-->
<!-- JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
</body>
</html>