package fr.eni.projet.enchere.mlj.dal;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;

public interface UtilisateurDAO {
	public void insert(Utilisateur u) throws BusinessException;
	public Utilisateur SelectMonProfil(String pseudo) throws BusinessException;
	public Utilisateur SelectByPseudo(String pseudo) throws BusinessException;
	public void upDate(Utilisateur u)throws BusinessException;
	public void delete(int noUtilisateur)throws BusinessException;

}
