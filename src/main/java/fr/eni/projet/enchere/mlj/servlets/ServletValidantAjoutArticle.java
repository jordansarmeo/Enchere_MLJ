package fr.eni.projet.enchere.mlj.servlets;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bll.ArticleManager;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;


/**
 * Servlet implementation class ServletValidantAjoutArticle
 */
@WebServlet("/ServletValidantAjoutArticle")
public class ServletValidantAjoutArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/resultatLogin.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nomArticle = null;
		 String description = null;
		 LocalDate dateDebutEncheres = null;
		 LocalDate dateFinEncheres = null ;
		 int misAPrix = 0;
		 int prixVente = 0;
		 
		 String categorieArticle;
		 String rue;
		 int codePostal;
		 String ville;
		
		 
		 nomArticle=request.getParameter("nomArticle");
		 description=request.getParameter("description");
			try
			{
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				dateDebutEncheres = LocalDate.parse(request.getParameter("dateDebutEncheres"),dtf);
			}
			catch(DateTimeParseException e)
			{
				e.printStackTrace();
			}	
				
			try
			{
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				dateFinEncheres = LocalDate.parse(request.getParameter("dateFinEncheres"),dtf);
			}
			catch(DateTimeParseException e)
			{
				e.printStackTrace();
			}
		// dateDebutEncheres= LocalDate.parse(request.getParameter("dateDebutEncheres"));
		// dateFinEncheres=LocalDate.parse(request.getParameter("dateFinEncheres"));
		 misAPrix=Integer.parseInt(request.getParameter("miseAPrix"));
		 
		 rue=request.getParameter("rue");
		 codePostal=Integer.parseInt(request.getParameter("codePostal"));
		 ville=request.getParameter("ville");
		 
		 categorieArticle =request.getParameter("categorieArticle");
		
				 ArticleVendu art = new ArticleVendu();
				
						try {
							new ArticleManager().ajoutArticle(art);
						} catch (BusinessException e) {
							e.printStackTrace();
						}
					
			 getServletContext().getRequestDispatcher("/resultatLogin.jsp").forward(request, response);
			 //response.sendRedirect("resultatLogin.jsp");
		
			
	
	}
			
}
