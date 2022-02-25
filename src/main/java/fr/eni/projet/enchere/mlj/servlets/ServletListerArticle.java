package fr.eni.projet.enchere.mlj.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bll.ArticleManager;
import fr.eni.projet.enchere.mlj.bll.UtilisateurManager;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;

/**
 * Servlet implementation class ServletListerArticle
 */
@WebServlet("/ServletListerArticle")
public class ServletListerArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(); 
		String userName =(String)session.getAttribute("userName"); 
		Utilisateur u;
		u=(Utilisateur)request.getAttribute("utilisateurs");
		
		
		List<ArticleVendu> liste = new ArrayList<>();
		ArticleManager artMan = new ArticleManager();
		try 
		{
			liste= artMan.getToutArticleVendu();
			request.setAttribute("liste", liste);
			
			getServletContext().getRequestDispatcher("/listeEnchereMesVentes.jsp").forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	



}
