package fr.eni.projet.enchere.mlj.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;
import fr.eni.projet.enchere.mlj.dal.CodesResultatDAL;
import fr.eni.projet.enchere.mlj.dal.ConnectionProvider;
import fr.eni.projet.enchere.mlj.dal.UtilisateurDAO;



public class UtilisateurDAOJdbcImpl implements UtilisateurDAO{
	
	private static final String INSERT= "INSERT INTO UTILISATEURS(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe,credit,administrateur) values(?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SelectMonProfil="SELECT pseudo, nom, prenom, email,telephone, rue, code_postal, ville, mot_de_passe from utilisateurs where pseudo=?";
	private static final String SelectByPseudo="SELECT  noUtilisateur, pseudo, nom, prenom, email,telephone, rue, code_postal, ville" +"from usilisateurs where pseudo=?";
	private static final String UpDate = "update utilisateurs set nom=?,prenom=?, telephone=?, rue =?, code_postal=? , ville=?, mot_de_passe=? where pseudo=?";
	private static final String Delete = "delete from Utilisateurs where noUtilisateur=?";
	
	
	
	public void insert(Utilisateur u) throws BusinessException {
		if(u==null)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, u.getPseudo());
			pstmt.setString(2, u.getNom());
			pstmt.setString(3, u.getPrenom());
			pstmt.setString(4, u.getEmail());
			pstmt.setInt(5, u.getTelephone());
			pstmt.setString(6, u.getRue());
			pstmt.setInt(7, u.getCodePostal());
			pstmt.setString(8, u.getVille());
			pstmt.setString(9, u.getMotDePasse());
			pstmt.setInt(10, u.getCredit());
			pstmt.setInt(11, u.getAdministrateur());
			
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next())
			{
				u.setNoUtilisateur(rs.getInt(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
		
		}	
	}
	
	//afficher Mon profil
	public Utilisateur SelectMonProfil(String pseudo) throws BusinessException
	{
		ResultSet rs = null;
		Utilisateur u = new Utilisateur();
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SelectMonProfil);
			pstmt.setString(1, pseudo);
			
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				u= new Utilisateur(rs.getString("pseudo"), rs.getString("nom"), rs.getString("prenom"),rs.getString("email"), 
						rs.getInt("telephone"), rs.getString("rue"), rs.getInt("code_postal"), rs.getString("ville"), rs.getString("mot_de_passe"));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		
		}	return u;
	}
	//afficher profil d'autre utilisateur
	public Utilisateur SelectByPseudo(String pseudo) throws BusinessException
	{
		ResultSet rs = null;
		Utilisateur u = null;
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SelectByPseudo);
			pstmt.setString(1, pseudo);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				u= new Utilisateur(rs.getInt("noUtilisateur"), rs.getString("pseudo"), rs.getString("nom"), rs.getString("prenom"),rs.getString("email"), 
						rs.getInt("telephone"), rs.getString("rue"), rs.getInt("codePostal"), rs.getString("ville"));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		
		}	return u;
	}
	
	public void upDate(Utilisateur u)throws BusinessException
	{
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(UpDate);
			pstmt.setString(1, u.getPseudo());
			pstmt.setString(2, u.getNom());
			pstmt.setString(3, u.getPrenom());
			pstmt.setString(4, u.getEmail());
			pstmt.setInt(5, u.getTelephone());
			pstmt.setString(6, u.getRue());
			pstmt.setInt(7, u.getCodePostal());
			pstmt.setString(8, u.getVille());
			pstmt.setString(9, u.getMotDePasse());
			pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
		
		}	
		
	}
	
	public void delete(int noUtilisateur)throws BusinessException
	{
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(Delete);
			pstmt.setInt(1, noUtilisateur);
			pstmt.executeUpdate();
			
		} catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.DELETE_OBJET_ECHEC);
		}
	}

	
	
	
	
}
