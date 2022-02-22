package fr.eni.projet.enchere.mlj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bll.BLLException;
import fr.eni.projet.enchere.mlj.bll.UtilisateurManager;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;

/**
 * Servlet implementation class ServletValidantUtilisateur
 */
@WebServlet("/ServletValidantUtilisateur")
public class ServletValidantUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/zonesecure").forward(request, response);
		
		
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String pseudo = null;
		 String nom = null;
		 String prenom = null;
		 String email = null;
		 int telephone = 0;
		 String rue = null;
		 int codePostal = 0;
		 String ville = null;
		 String motDePasse = null;
		 String confirmationMotDePasse = null;
		 
		 pseudo=request.getParameter("pseudo");
		 nom=request.getParameter("nom");
		 prenom=request.getParameter("prenom");
		 email=request.getParameter("email");
		 telephone=Integer.parseInt(request.getParameter("telephone"));
		 rue=request.getParameter("rue");
		 codePostal=Integer.parseInt(request.getParameter("codePostal"));
		 ville=request.getParameter("ville");
		
		 motDePasse=request.getParameter("motDePasse");
		confirmationMotDePasse=request.getParameter("confirmationMotDePasse");
		  
		
				 Utilisateur u = new Utilisateur();
				
						try {
							new UtilisateurManager().ajouterUtilisateur(u);
							
						} catch (BusinessException e) {
							e.printStackTrace();
						}
					
			 getServletContext().getRequestDispatcher("/zonesecure").forward(request, response);
			 //response.sendRedirect("/pageProfilUtilisateur.html");
		
			}
	
}
