<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="fr">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <meta name="description" content=""/>
    <meta name="Keywords" content=" ">
    <meta name="author" content="Laurent">
    
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <title>Page de connexion eni</title>
  </head>
<body>
    <header>
        <nav class="navbar navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="index.html">ENI-Enchères</a>
              <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
              </form>
            </div>
          </nav>
    </header>
<!--content start-->
<h1>ENI-Enchères</h1>
<div class="container mt-5 pt-5 mb-5">
    <div class="row justify-content-center">
       <div class="col-md-6 col-lg-4 col-xl-4">
          <div class="card bg-light">
             <div class="card-body">
                <div class="text-center m-auto">
                   <h4 class="text-uppercase text-center">Login</h4>
                </div>
                <form action="zonesecure" method="POST">
                    <div class="form-group mb-3">
                      <label for="pseudo">Identifiant </label>
                      <input type="text" name="pseudo" placeholder="Entrer votre pseudo" class="form-control" required="">
                   </div>
                   <div class="form-group mb-3">
                      <label for="motDePasse">Password</label>
                      <div class="input-group bg-light" id="show_hide_password">
                         <input type="password" class="form-control" id="motDePasse" value="motDePasse" name="motDePasse"   required="">
                         <div class="input-group-addon">
                            <a href=""><i class="fa fa-lg fa-eye" style="padding-top: 10px; padding-left: 10px; padding-right: 10px;" aria-hidden="true"></i></a>
                         </div>
                      </div>
                   </div>
                   <div class="form-group mb-3">
                      <div class="custom-control custom-checkbox checkbox-success">
                         <input type="checkbox" class="custom-control-input" id="checkbox-signin" >
                         <label class="custom-control-label" for="checkbox-signin">Se souvenir de moi</label>
                      </div>
                      <div><a href="">Mot de passe oublié</a></div>
                   </div>
                   <div class="form-group mb-0 text-center">
                      <button class="btn btn-outline-success btn-block" type="submit" name="Authentification"> Connexion </button>
                   </div>
                
                </form>
                
             </div>
          </div>
       </div>
    </div>
    
  </div>
  <div class="text-center">
    <a class="btn btn-secondary btn-lg" href="pageProfilUtilisateur.html" role="button">Créer un compte</a>
  </div>

<!--content end-->
<!-- JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.6.0/dist/umd/popper.min.js" integrity="sha384-KsvD1yqQ1/1+IA7gi3P0tyJcT3vR+NdBTt13hSJ2lnve8agRGXTTyNaBYmCR/Nwi" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.min.js" integrity="sha384-nsg8ua9HAw1y0W1btsyWgBklPnCUAFLuTMS2G72MMONqmOymq585AcH49TLBQObG" crossorigin="anonymous"></script>
</body>
</html>