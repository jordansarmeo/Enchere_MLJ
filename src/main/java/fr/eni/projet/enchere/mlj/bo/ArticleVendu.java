package fr.eni.projet.enchere.mlj.bo;

import java.io.Serializable;
import java.time.LocalDate;

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
	private String étatVente;
	
	private Retrait lieuRetrait;
	private Utilisateur Acquereur;
	private Utilisateur Vendeur;
	private Categorie categorieArticle;
	
	
	public ArticleVendu() {
		super();
	}


	public ArticleVendu(Integer noArticle, String nomArticle, String description, LocalDate dateDebutEncheres,
			LocalDate dateFinEncheres, int misAPrix, int prixVente, String étatVente, Retrait lieuRetrait,
			Utilisateur acquereur, Utilisateur vendeur, Categorie categorieArticle) {
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.étatVente = étatVente;
		this.lieuRetrait = lieuRetrait;
		Acquereur = acquereur;
		Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
	}


	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int misAPrix, int prixVente, String étatVente, Retrait lieuRetrait, Utilisateur acquereur,
			Utilisateur vendeur, Categorie categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.étatVente = étatVente;
		this.lieuRetrait = lieuRetrait;
		Acquereur = acquereur;
		Vendeur = vendeur;
		this.categorieArticle = categorieArticle;
	}


	public ArticleVendu(String nomArticle, String description, LocalDate dateDebutEncheres, LocalDate dateFinEncheres,
			int misAPrix, int prixVente, String étatVente, Retrait lieuRetrait, Utilisateur vendeur,
			Categorie categorieArticle) {
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.misAPrix = misAPrix;
		this.prixVente = prixVente;
		this.étatVente = étatVente;
		this.lieuRetrait = lieuRetrait;
		Vendeur = vendeur;
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


	public String getÉtatVente() {
		return étatVente;
	}


	public void setÉtatVente(String étatVente) {
		this.étatVente = étatVente;
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


	public Utilisateur getVendeur() {
		return Vendeur;
	}


	public void setVendeur(Utilisateur vendeur) {
		Vendeur = vendeur;
	}


	public Categorie getCategorieArticle() {
		return categorieArticle;
	}


	public void setCategorieArticle(Categorie categorieArticle) {
		this.categorieArticle = categorieArticle;
	}


	@Override
	public String toString() {
		return "ArticleVendu [noArticle=" + noArticle + ", nomArticle=" + nomArticle + ", description=" + description
				+ ", dateDebutEncheres=" + dateDebutEncheres + ", dateFinEncheres=" + dateFinEncheres + ", misAPrix="
				+ misAPrix + ", prixVente=" + prixVente + ", étatVente=" + étatVente + ", lieuRetrait=" + lieuRetrait
				+ ", Acquereur=" + Acquereur + ", Vendeur=" + Vendeur + ", categorieArticle=" + categorieArticle + "]";
	}
	
	

}
