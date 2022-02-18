package fr.eni.projet.enchere.mlj;

import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.enchere.mlj.bll.BLLException;
import fr.eni.projet.enchere.mlj.bll.UtilisateurManager;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) throws BusinessException {

		
		
		List<Utilisateur> utiliLst = new ArrayList<>();
		Utilisateur u ;
		
		utiliLst.add(u= new Utilisateur ("monia", "Salmani", "Monika", "monikasalmani@gmail.com", 075023140 , "rue", 01150,"Blyes","coco"));
		
		UtilisateurManager mger = null;
	
			mger = new UtilisateurManager();
	

		// Ajout d'un article au catalogue
	
			for (Utilisateur uti : utiliLst) {
				mger.ajouterUtilisateur(uti);
			}
			System.out.println("utilisateur ajoute");

		
		
		
		
		
		System.out.println("je ne sais pas");
	}

}
