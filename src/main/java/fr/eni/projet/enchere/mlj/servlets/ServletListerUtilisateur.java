package fr.eni.projet.enchere.mlj.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bll.UtilisateurManager;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;

/**
 * Servlet implementation class ServletListerUtilisateur
 */
@WebServlet("/ServletListerUtilisateur")
public class ServletListerUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo;
		pseudo=request.getParameter("userName");
		Utilisateur u = new Utilisateur();
		try 
		{
			u= new UtilisateurManager().selectionnerMonProfil(pseudo);
			request.setAttribute("utilisateurs", u);
			getServletContext().getRequestDispatcher("/pageAfficheMonUtilisateur.jsp").forward(request, response);
		
		} catch (BusinessException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
