package fr.eni.projet.enchere.mlj.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.projet.enchere.mlj.BusinessException;
import fr.eni.projet.enchere.mlj.bo.ArticleVendu;
import fr.eni.projet.enchere.mlj.bo.Categorie;
import fr.eni.projet.enchere.mlj.bo.Retrait;
import fr.eni.projet.enchere.mlj.bo.Utilisateur;
import fr.eni.projet.enchere.mlj.dal.ArticleDAO;
import fr.eni.projet.enchere.mlj.dal.CodesResultatDAL;

public class ArticleDAOJdbcImpl implements ArticleDAO{
	
	private static final String INSERT= "INSERT INTO Articles_Vendus(nomArticle, description, dateDebutEncheres, dateFinEncheres, misAPrix, lieuRetrait, categorieArticle) values(?,?,?,?,?,?,?)";
	private static final String SelectAll="SELECT noArticle, nomArticle,descripstion, dateDebutEncheres, dateFinEncheres, misAPrix, prixVente, etatVente, lieuRetrait, Vendeur, categorieArticle" + "from ArticleVendu";
	private static final String SelectByNom="SELECT  noArticle, nomArticle,descripstion, dateDebutEncheres, dateFinEncheres, misAPrix, prixVente, etatVente, lieuRetrait, Vendeur, categorieArticle" +"where nom=?";
	
	public void insert(ArticleVendu art) throws BusinessException {
		if(art==null)
		{
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_NULL);
			throw businessException;
		}
		
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, art.getNomArticle());
			pstmt.setString(2, art.getDescription());
			pstmt.setDate(3, java.sql.Date.valueOf(art.getDateDebutEncheres()));
			pstmt.setDate(4, java.sql.Date.valueOf(art.getDateFinEncheres()));
			pstmt.setInt(5, art.getMisAPrix());
			pstmt.setString(6,  art.getLieuRetrait());
			pstmt.setString(7,art.getCategorieArticle());
			
			
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next())
			{
				art.setNoArticle(rs.getInt(1));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.INSERT_OBJET_ECHEC);
		
		}	
	}



	public List<ArticleVendu> selectAll() throws BusinessException
	{
		List<ArticleVendu> liste=new ArrayList<>();
		ResultSet rs=null;
		ArticleVendu art = null;
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			Statement stmt = cnx.createStatement();
			rs = stmt.executeQuery(SelectAll);
			
			while (rs.next()) {
				art = new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"), rs.getString("description"), rs.getDate("dateDebutENcheres"),
						rs.getDate("DateFinEnchere"), rs.getInt("misAPrix"), rs.getInt("prixVente"), rs.getString("etatVente"), rs.getString("lieuRetrait"), rs.getString("Vendeur"), rs.getString("categorieArticle"));
			}
			liste.add(art);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_OBJET_ECHEC);
		
		}	
		return liste;
	}
	public ArticleVendu selectByNom(String nomArticle)throws BusinessException
	{
		ResultSet rs=null;
		ArticleVendu art = null;
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SelectByNom);
			pstmt.setString(1, nomArticle);
			pstmt.executeUpdate();
			
			if (rs.next()) {
				art= new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"), rs.getString("description"), rs.getDate("dateDebutENcheres"),
						rs.getDate("DateFinEnchere"), rs.getInt("misAPrix"), rs.getInt("prixVente"), rs.getString("etatVente"), rs.getString("lieuRetrait"), rs.getString("Vendeur"), rs.getString("categorieArticle"));
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_OBJET_ECHEC);
		}	
		return art;
	}
	
}