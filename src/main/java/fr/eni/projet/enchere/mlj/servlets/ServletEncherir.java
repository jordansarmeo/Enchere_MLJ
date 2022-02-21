package fr.eni.projet.enchere.mlj.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bll.ArticleManager;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;
import fr.eni.projet.enchere.mlj.bo.Categorie;

/**
 * Servlet implementation class ServletEncherir
 */
@WebServlet("/ServletEncherir")
public class ServletEncherir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id;
		id=Integer.parseInt(request.getParameter("noArticle"));
		ArticleManager mgr;
		ArticleVendu art;		
		try {
			mgr = new ArticleManager();
			art=mgr.SelectById(id);
			request.setAttribute("article", art);
			request.getRequestDispatcher("/pageEncherir.html").forward(request, response);
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nomArticle = null;
		 String description = null;
		 LocalDate dateDebutEncheres = null;
		 LocalDate dateFinEncheres = null ;
		
		 int prixVente = 0;
		 
		 String categorieArticle;
		 String rue;
		 int codePostal;
		 String ville;
		 
		int miseAPrix;
		int id;
		ArticleVendu art = null;
		id=Integer.parseInt(request.getParameter("noArticle"));
		prixVente=Integer.parseInt(request.getParameter("prixVente"));
		
		try 
		{
			art=new ArticleManager().SelectById(id);
		} catch (BusinessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		art.setNomArticle(nomArticle);
		art.setDescription(description);
		art.setDateDebutEncheres(dateDebutEncheres);
		art.setDateFinEncheres(dateFinEncheres);
		art.setPrixVente(prixVente);
		
		
	}

}
