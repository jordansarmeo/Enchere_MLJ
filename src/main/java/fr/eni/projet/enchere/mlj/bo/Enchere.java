package fr.eni.projet.enchere.mlj.bo;

import java.io.Serializable;
import java.time.LocalDate;

public class Enchere implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LocalDate dateEnchere;
	private int montantEnchere;
	
	
	private Utilisateur utilisateurEnchere;
	private ArticleVendu articleEnchere;
	
	
	public Enchere() {
		super();
	}


	public Enchere(LocalDate dateEnchere, int montantEnchere, Utilisateur utilisateurEnchere,
			ArticleVendu articleEnchere) {
		this.dateEnchere = dateEnchere;
		this.montantEnchere = montantEnchere;
		this.utilisateurEnchere = utilisateurEnchere;
		this.articleEnchere = articleEnchere;
	}


	public LocalDate getDateEnchere() {
		return dateEnchere;
	}


	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}


	public int getMontantEnchere() {
		return montantEnchere;
	}


	public void setMontantEnchere(int montantEnchere) {
		this.montantEnchere = montantEnchere;
	}


	public Utilisateur getUtilisateurEnchere() {
		return utilisateurEnchere;
	}


	public void setUtilisateurEnchere(Utilisateur utilisateurEnchere) {
		this.utilisateurEnchere = utilisateurEnchere;
	}


	public ArticleVendu getArticleEnchere() {
		return articleEnchere;
	}


	public void setArticleEnchere(ArticleVendu articleEnchere) {
		this.articleEnchere = articleEnchere;
	}


	@Override
	public String toString() {
		return "Enchere [dateEnchere=" + dateEnchere + ", montantEnchere=" + montantEnchere + ", utilisateurEnchere="
				+ utilisateurEnchere + ", articleEnchere=" + articleEnchere + "]";
	}
	
	
}
