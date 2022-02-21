package fr.eni.projet.enchere.controlSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.projet.enchere.mlj.bo.Utilisateur;



/**
 * Servlet implementation class zonesecure
 */
@WebServlet("/zonesecure")
public class zonesecure extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public zonesecure() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Etape 1 : Récupération des paramètres de la requête
    	
    	// Recupere la session
    	
    	HttpSession session = request.getSession();
    	String s= session.getId();
    	session.setAttribute("noUtilisateur",s);
    	 
    	String pseudo = request.getParameter("pseudo");
    	String motDePasse = request.getParameter("motDePasse");
    	
    	
    	
    	if(session.getAttribute("pseudo") != null)
		{
			pseudo=(String)session.getAttribute("pseudo");
		}
		
    	if(session.getAttribute("motDePasse") != null)
		{
			pseudo=(String)session.getAttribute("motDePasse");
		}
		
		
		
    	
    	// Etape 2 : Soumettre les paramètres de la requête à la couche service et récupérer résultat
    	
    	Utilisateur user = new Utilisateur(pseudo, motDePasse);	
    	//HttpSession maSession = request.getSession();		
    	session.setAttribute("utilisateur", user);
    	
    	request.getSession().setAttribute("utilisateur", user);
    	
    	
    	// Etape 3 : Réponse à l'utilisateur
    	RequestDispatcher   dispatcher = request.getRequestDispatcher("resultatLogin.jsp");
    	dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
	
	

}
