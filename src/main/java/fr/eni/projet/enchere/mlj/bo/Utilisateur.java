package fr.eni.projet.enchere.mlj.bo;

import java.io.Serializable;
import java.util.List;

public class Utilisateur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private int telephone;
	private String rue;
	private int codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private int administrateur;
	
	
	private List<ArticleVendu> lstArticlesVendus;
	
	
	public Utilisateur() {
		super();
	}



	public Utilisateur(String pseudo, String nom) {
		this.pseudo = pseudo;
		this.nom = nom;
	}



	
	



	public Utilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}



	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse) {
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}



	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone, String rue, int codePostal, String ville) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		setNoUtilisateur(noUtilisateur);
	}



	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse, int credit) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		setNoUtilisateur(noUtilisateur);
	}



	public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, int telephone,
			String rue, int codePostal, String ville, String motDePasse, int credit, int administrateur,
			List<ArticleVendu> lstArticlesVendus) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.lstArticlesVendus = lstArticlesVendus;
		setNoUtilisateur(noUtilisateur);
	}

	public Utilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			int codePostal, String ville, String motDePasse, int credit, int administrateur,
			List<ArticleVendu> lstArticlesVendus) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		this.lstArticlesVendus = lstArticlesVendus;
	}

	public Utilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			int codePostal, String ville, String motDePasse, int credit, int administrateur) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}

	
	

	

	public Utilisateur(String pseudo, String nom, String prenom, String email, int telephone, String rue,
			int codePostal, String ville, String motDePasse) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
	}



	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
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

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(int administrateur) {
		this.administrateur = administrateur;
	}

	public List<ArticleVendu> getLstArticlesVendus() {
		return lstArticlesVendus;
	}

	public void setLstArticlesVendus(List<ArticleVendu> lstArticlesVendus) {
		this.lstArticlesVendus = lstArticlesVendus;
	}

	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
				+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal="
				+ codePostal + ", ville=" + ville + ", motDePasse=" + motDePasse + ", credit=" + credit
				+ ", administrateur=" + administrateur + ", lstArticlesVendus=" + lstArticlesVendus + "]";
	}

	
	


	

	

	

	
	







}
