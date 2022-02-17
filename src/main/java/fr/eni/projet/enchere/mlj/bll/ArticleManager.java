package fr.eni.projet.enchere.mlj.bll;

import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;
import fr.eni.projet.enchere.mlj.dal.ArticleDAO;
import fr.eni.projet.enchere.mlj.dal.DAOFactory;

public class ArticleManager {
	private ArticleDAO articleDao;
	
	public ArticleManager()
	{
		this.articleDao=DAOFactory.getArticleDAO();
	}

	BusinessException businessException = new BusinessException();
	
	public void ajoutArticle(ArticleVendu a) throws BusinessException
	{	boolean valide = true;
		
		if(valide = true)
		{
			if(a==null){
				businessException.ajouterErreur(BLLException.OBJET_NULL);
			}
			if(a.getNomArticle()==null || a.getNomArticle().trim().length()==0){
				valide = false; 
			}
			if(a.getDescription()==null || a.getDescription().trim().length()==0){
				valide = false;
			}
			if(a.getDateDebutEncheres()==null){
				valide = false;
			}
			if(a.getDateFinEncheres()==null){
				valide = false;
			}
			if(a.getMisAPrix()==0 || a.getMisAPrix()<0){
				valide = false;
			}
			if(a.getLieuRetrait()==null){
				valide = false;
			}
			if(a.getCategorieArticle()==null){
				valide = false;
			}
			
			if(a.getNoArticle()!= null){
				businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
			}
			try {
				articleDao.insert(a);
			} catch (BusinessException e) {
				businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
			}
		}else 
			businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
	}
	
	public List<ArticleVendu> getToutArticleVendu()
	{
		List<ArticleVendu> liste = new ArrayList<>();
		try {
			liste =articleDao.selectAll();
		}catch (BusinessException e) {
			businessException.ajouterErreur(BLLException.ECHEC);
		}return liste;
	}
	
	
	public ArticleVendu selectionnerArticle(String nom) throws BusinessException{
		return this.articleDao.selectByNom(nom);
	}
}
