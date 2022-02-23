package fr.eni.projet.enchere.mlj.bll;


import java.util.List;


import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;
import fr.eni.projet.enchere.mlj.dal.DAOFactory;
import fr.eni.projet.enchere.mlj.dal.UtilisateurDAO;

public class UtilisateurManager {
	private UtilisateurDAO utilisateurDao;
	
	BusinessException businessException = new BusinessException(); 
	
	public UtilisateurManager()
	{
		this.utilisateurDao=DAOFactory.getUtilisateurDAO();
	}

	public void validerUtilisateur(Utilisateur u) throws BusinessException
	{
		boolean valide = true;
		int credit = 0;
		int administrateur = 0;
		
		BusinessException businessException = new BusinessException();
		if(u==null){
			businessException.ajouterErreur(BLLException.OBJET_NULL);
		}
		if(u.getPseudo()==null || u.getPseudo().trim().length()==0){
			valide = false; 
		}
		if(u.getNom()==null || u.getNom().trim().length()==0){
			valide = false;
		}
		if(u.getPrenom()==null || u.getPrenom().trim().length()==0){
			valide = false;
		}
		if(u.getEmail()==null || u.getEmail().trim().length()==0){
			valide = false;
		}
		if(u.getTelephone()==0 || u.getTelephone()<0){
			valide = false;
		}
		if(u.getRue()==null || u.getRue().trim().length()==0){
			valide = false;
		}
		if(u.getCodePostal()==0 || u.getCodePostal()<0){

			valide = false;
		}
		if(u.getMotDePasse()==null || u.getRue().trim().length()==0){
			valide = false;
		}
	}
	
	public Utilisateur ajouterUtilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			int codePostal, String ville, String motDePasse) throws BusinessException
	{
		Utilisateur u = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,codePostal,ville,motDePasse);
		if(u.getNoUtilisateur()!= null){
			businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
		}
		try {
			this.validerUtilisateur(u);
			this.utilisateurDao.insert(u);
		} catch (BusinessException e) {
			businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
		}
		return u;
	}
	public void modifUtilisateur(Utilisateur u) throws BusinessException
	{

	
		try {
			validerUtilisateur(u);
			utilisateurDao.upDate(u);
		} catch (BusinessException e) {
			businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
		}
	}
	
	public void supprimerUtilisateur(Utilisateur u) throws BusinessException
	{
		
		try {
			
			utilisateurDao.delete(u.getNoUtilisateur());
		} catch (BusinessException e) {
			businessException.ajouterErreur(BLLException.DELETE_OBJET_ECHEC);
		}
	}

	
	public Utilisateur selectionnerMonProfil(String pseudo) throws BusinessException{
		
		return this.utilisateurDao.SelectMonProfil(pseudo);
	}
	
	public Utilisateur selectionnerAutre(String pseudo) throws BusinessException{
		return this.utilisateurDao.SelectByPseudo(pseudo);
	}
}