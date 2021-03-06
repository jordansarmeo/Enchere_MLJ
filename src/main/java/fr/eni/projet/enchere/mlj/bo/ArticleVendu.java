package fr.eni.projet.enchere.mlj.bo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class ArticleVendu implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer noArticle;
	private String nomArticle;
	private String description;
	private LocalDate dateDebutEncheres;
	private LocalDate dateFinEncheres;
	private int misAPrix;
	private int prixVente;
	private String etatVente;
	
	private Retrait lieuRetrait;
	private Utilisateur Acquereur;
	private int Vendeur;
	private int categorieArticle;
	
	
	public ArticleVendu() {
		super();
	}

	

	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int misAPrix, int vendeur, int categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
	}



	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int misAPrix, int prixVente, String etatVente) {
		
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		setNoArticle(noArticle);
	}



	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int misAPrix, int prixVente, String etatVente, Retrait lieuRetrait,
			int vendeur, int categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
		this.Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
		setNoArticle(noArticle);
	}

	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int misAPrix, int prixVente, String etatVente, Retrait lieuRetrait,
			Utilisateur acquereur, int vendeur, int categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
		Acquereur = acquereur;
		this.Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
		setNoArticle(noArticle);
	}


	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int misAPrix, int prixVente, String etatVente, Retrait lieuRetrait, Utilisateur acquereur,
			int vendeur, int categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
		Acquereur = acquereur;
		this.Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
	}


	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int misAPrix, int prixVente, String etatVente, Retrait lieuRetrait, int vendeur,
			int categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.etatVente = etatVente;
		this.lieuRetrait = lieuRetrait;
		this.Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
	}

	

	

	

	public Integer getNoArticle() {
		return noArticle;
	}


	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}


	public String getNomArticle() {
		return nomArticle;
	}


	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDateDebutEncheres() {
		return dateDebutEncheres;
	}


	public void setDateDebutEncheres(LocalDate dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}


	public LocalDate getDateFinEncheres() {
		return dateFinEncheres;
	}


	public void setDateFinEncheres(LocalDate dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}


	public int getMisAPrix() {
		return misAPrix;
	}


	public void setMisAPrix(int misAPrix) {
		this.misAPrix = misAPrix;
	}


	public int getPrixVente() {
		return prixVente;
	}


	public void setPrixVente(int prixVente) {
		this.prixVente = prixVente;
	}


	public String getetatVente() {
		return etatVente;
	}


	public void setetatVente(String etatVente) {
		this.etatVente = etatVente;
	}


	public Retrait getLieuRetrait() {
		return lieuRetrait;
	}


	public void setLieuRetrait(Retrait lieuRetrait) {
		this.lieuRetrait = lieuRetrait;
	}


	public Utilisateur getAcquereur() {
		return Acquereur;
	}


	public void setAcquereur(Utilisateur acquereur) {
		Acquereur = acquereur;
	}


	public int getVendeur() {
		return Vendeur;
	}


	public void setVendeur(int vendeur) {
		Vendeur = vendeur;
	}


	public int getCategorieArticle() {
		return categorieArticle;
	}


	public void setCategorieArticle(int categorieArticle) {
		this.categorieArticle = categorieArticle;
	}


	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", misAPrix="
				+ misAPrix + ", prixVente=" + prixVente + ", etatVente=" + etatVente + ", lieuRetrait=" + lieuRetrait
				+ ", Acquereur=" + Acquereur + ", Vendeur=" + Vendeur + ", categorieArticle=" + categorieArticle + "]";
	}
	
	

}
