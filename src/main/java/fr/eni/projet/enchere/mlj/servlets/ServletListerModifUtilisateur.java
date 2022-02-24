package fr.eni.projet.enchere.mlj.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bll.UtilisateurManager;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;

/**
 * Servlet implementation class ServletListerModifUtilisateur
 */
@WebServlet("/ServletListerModifUtilisateur")
public class ServletListerModifUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo;
		HttpSession session = request.getSession(); 
		String userName =(String)session.getAttribute("userName"); 
		
		Utilisateur u = new Utilisateur();
		try 
		{
			u= new UtilisateurManager().selectionnerMonProfil(userName);
			request.setAttribute("utilisateurs", u);
			getServletContext().getRequestDispatcher("/modificationsProfil.jsp").forward(request, response);
		
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

}