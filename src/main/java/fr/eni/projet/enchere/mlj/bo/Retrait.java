package fr.eni.projet.enchere.mlj.bo;

import java.io.Serializable;

public class Retrait implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String rue;
	private int codePostal;
	private String ville;
	
	private ArticleVendu article;

	public Retrait() {
		super();
	}

	public Retrait(String rue, int codePostal, String ville, ArticleVendu article) {
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.article = article;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public ArticleVendu getArticle() {
		return article;
	}

	public void setArticle(ArticleVendu article) {
		this.article = article;
	}

	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + ", article=" + article + "]";
	}
	
	

}
