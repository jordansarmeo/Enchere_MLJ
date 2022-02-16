package fr.eni.projet.enchere.mlj.dal;

import fr.eni.projet.enchere.mlj.dal.jdbc.ArticleDAOJdbcImpl;
import fr.eni.projet.enchere.mlj.dal.jdbc.UtilisateurDAOJdbcImpl;

public abstract class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO()
	{
		return new UtilisateurDAOJdbcImpl();
	}

	public static ArticleDAO getArticleDAO() 
	{
		return new ArticleDAOJdbcImpl();
	}
}
