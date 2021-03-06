<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="fr.eni.projet.enchere.mlj.bll.UtilisateurManager"%>

<%@ page import="fr.eni.projet.enchere.mlj.bo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//FR" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta name="viewport"content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="Keywords" content=" " />
    <meta name="author" content="Laurent" />

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"rel="stylesheet" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css" />
    <script 
      src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
      integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
      crossorigin="anonymous"
    ></script>
<title>Utilisateur Connecté</title>
</head>
<body class="bg-light">
<!-- ----------------------------------------------------------------------------------------------------- -->
	
	<%String userName =(String)session.getAttribute("userName");  %>
	
    
<!--      ------------------------------------------------------------------------------------------------ -->



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
	
    <h2 class="text-center">Liste des Enchères</h2>
    <h4 class="text-center">Bonjour <%=userName %></h4>
    <div class="container">
      <div class="row">
        <div class="col-md-5">
          <div class="small fw-light">Chercher par le nom d'article :</div>
          <div class="input-group">
            <input
              class="form-control border-end-0 border rounded-pill"
              type="search"
              value=""
              id="example-search-input"
              placeholder="Le nom de l'article contient :"
            />
            <span class="input-group-append">
              <button
                class="btn btn-outline-secondary bg-white border-bottom-0 border rounded-pill ms-n5"
                type="button"
              >
                <i class="fa fa-search"></i>
              </button>
            </span>
          </div>
        </div>
      </div>
      <div class="row mt-3 m-lg-3">
        <div class="col-6">
          <div class="dropdown">
            <button
              class="btn btn-secondary dropdown-toggle"
              type="button"
              id="dropdownMenuButton2"
              data-bs-toggle="dropdown"
              aria-expanded="false"
            >
              Catégories
            </button>
            <ul
              class="dropdown-menu dropdown-menu-dark"
              aria-labelledby="dropdownMenuButton2"
            >
              <li><a class="dropdown-item active" href="#">Informatique</a></li>
              <li><a class="dropdown-item" href="#">Ameublement</a></li>
              <li><a class="dropdown-item" href="#">Vêtements </a></li>
              <li><a class="dropdown-item" href="#">Sport&Loisir</a></li>
            </ul>
          </div>
          <!-- Check  -->
          
          <div class="row mt-4">
            <div class="col-4">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" />
                            <label class="form-check-label" for="inlineRadio1">Achats</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck1">
                    <label class="form-check-label" for="defaultCheck1">enchéres ouvertes </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck2">
                    <label class="form-check-label" for="defaultCheck1">mes enchéres en cours </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck3">
                    <label class="form-check-label" for="defaultCheck1">mes enchéres remportées </label>
                </div>
            </div>
              <div class="col-4">
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked/>
                        <label class="form-check-label" for="inlineRadio1">Mes ventes</label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck1" checked>
                    <label class="form-check-label" for="defaultCheck1">mes ventes en cours </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck2">
                    <label class="form-check-label" for="defaultCheck1">ventes non débutées </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="defaultCheck3">
                    <label class="form-check-label" for="defaultCheck1">ventes terminées </label>
                </div>
              </div>
              <div class="col-4 text-end">
                <a class="btn btn-primary btn-lg" href="listeEnchereMesVentes.jsp" role="button">Rechercher</a>
              </div>
          </div>
          
        </div>
      </div>
    </div>

    <div class="container mt-5">
      <div class="row">
        <div class="col-6">
          <div class="card mb-3 shadow-sm p-3 mb-5 bg-body rounded" style="max-width: 540px">
            <div class="row g-0">
              <div class="col-md-4">
              <button type="button" ><a href="PageEncherir.html">
                 <img src="img/pc_gamer_travail.png" class="img-fluid rounded-start"></a>
              </div>
              <div class="col-md-8">
           	 
                <div class="card-body">
                  <h5 class="card-title">PC Gamer pour travailler</h5>
                  <p class="card-text">
                    Prix: 210 points</p><p>Fin de l'enchère: 10/08/2022</p><p>Vendeur: <a href="pageAfficheAutreUtilisateur.jsp">jojo44</a>
                  </p>
                  <p class="card-text">
                    <small class="text-muted">Last updated 3 mins ago</small>
                  </p>
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col-6">
          <div class="card mb-3 shadow-sm p-3 mb-5 bg-body rounded" style="max-width: 540px">
            <div class="row g-0">
              <div class="col-md-4">
               <button type="button" ><a href="PageEncherir2.html">
                <img src="img/rechaud.png" class="img-fluid rounded-start"></a>
              </div>
              <div class="col-md-8">
            	 
                <div class="card-body">
                  <h5 class="card-title">Rocket stove pour riz et pâtes</h5>
                  <p class="card-text">
                   Prix: 185 points</p><p>Fin de l'enchère: 20/09/2022</p><p>Vendeur: <a href="pageAfficheAutreUtilisateur.jsp">NineJea</a>
                  </p>
                  <p class="card-text">
                    <small class="text-muted">Last updated 3 mins ago</small>
                  </p>
                 </button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!--content end-->

	
	
<!-- JavaScript -->
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js"
      integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js"
      integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG"
      crossorigin="anonymous"
    ></script>
</body>
</html>