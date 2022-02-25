package fr.eni.projet.enchere.mlj.bll;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;
import fr.eni.projet.enchere.mlj.dal.ArticleDAO;
import fr.eni.projet.enchere.mlj.dal.DAOFactory;

public class ArticleManager {
	private ArticleDAO articleDao;
	
	public ArticleManager()
	{
		this.articleDao=DAOFactory.getArticleDAO();
	}

	BusinessException businessException = new BusinessException();
	
	public ArticleVendu ajoutArticle(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres, int misAPrix, int vendeur, int categorieArticle) throws BusinessException
	{	
		this.validerDate(dateDebutEncheres,dateFinEncheres, businessException);
		ArticleVendu a = new ArticleVendu(nomArticle, description, dateDebutEncheres, dateFinEncheres, misAPrix, vendeur, categorieArticle);
		
			a.getNomArticle();
			a.getDescription();
			a.getDateDebutEncheres();
			a.getDateFinEncheres();
			a.getMisAPrix();
			a.getVendeur();
			a.getCategorieArticle();
			try {
				articleDao.insert(a);
			} catch (BusinessException e) {
				businessException.ajouterErreur(BLLException.INSERT_OBJET_ECHEC);
			}
	
		return a;
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
	
	public void encherir(ArticleVendu art) throws BusinessException
	{
		try {
			
			articleDao.encherir(art);
			
		}catch (BusinessException e) {
			businessException.ajouterErreur(BLLException.ECHEC);
		}
	}
	public ArticleVendu SelectById(int id)throws BusinessException
	{
		return this.articleDao.SelectById(id);
		
	}
	private void validerDate(LocalDate dateDebutEncheres, LocalDate dateFinEncheres, BusinessException businessException) {
		if(dateDebutEncheres==null || 
			dateDebutEncheres.isAfter(LocalDate.now()) ||
			(dateDebutEncheres.isEqual(LocalDate.now()) && dateFinEncheres.isAfter(LocalDate.now())))
		{
			businessException.ajouterErreur(BLLException.ECHEC);
		}
	}
}
