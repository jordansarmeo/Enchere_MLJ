package fr.eni.projet.enchere.mlj.dal;

import java.util.List;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;

public interface ArticleDAO {
	
	public void insert(ArticleVendu art) throws BusinessException;
	
	public List<ArticleVendu> selectAll() throws BusinessException;
	
	public ArticleVendu selectByNom(String nomArticle)throws BusinessException;
	
	public void encherir(ArticleVendu art) throws BusinessException;
	
	public ArticleVendu SelectById(int noArticle)throws BusinessException;

}
