package fr.eni.projet.enchere.mlj.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import fr.eni.projet.enchere.mlj.dal.ConnectionProvider;

public class ArticleDAOJdbcImpl implements ArticleDAO{
	
	private static final String INSERT= "INSERT INTO articles_vendus(nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, no_utilisateur, no_categorie) values(?,?,?,?,?,?,?)";
	private static final String SelectAll="SELECT no_article, nom_article,description, date_debut_encheres, date_fin_encheres, prix_initial,no_utilisateur, no_categorie from articles_vendus";
	private static final String SelectByNom="SELECT  no_article, nom_article,description, date_debut_encheres, date_fin_encheres, prix_initial, no_categorie from articles_vendus where nom=?";
	private static final String SelectById ="SELECT  no_article, nom_article,description, date_debut_encheres, date_fin_encheres, prix_initial,  Vendeur, no_categorie from articles_vendus where id=?";
	private static final String Encherir="update articles_vendus set prix_vente=? where no_article=?";
	
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
			pstmt.setInt(6 , ((ArticleVendu) art).getVendeur());
			pstmt.setInt(7, art.getCategorieArticle());
			
			
			
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
	{ System.out.println("coucou");
		List<ArticleVendu> liste=new ArrayList<>();
		ResultSet rs=null;
		ArticleVendu art = null;
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			Statement stmt = cnx.createStatement();
			rs = stmt.executeQuery(SelectAll);
			
			while (rs.next()) {
				art = new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"), rs.getString("description"), rs.getDate("dateDebutENcheres").toLocalDate(),
						rs.getDate("DateFinEnchere").toLocalDate(), rs.getInt("misAPrix"), rs.getInt("prixVente"), rs.getString("etatVente"), ((ArticleVendu) rs).getLieuRetrait(), ((ArticleVendu) rs).getVendeur(), ((ArticleVendu) rs).getCategorieArticle());
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
				art= new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"), rs.getString("description"), rs.getDate("dateDebutENcheres").toLocalDate(),
						rs.getDate("DateFinEnchere").toLocalDate(), rs.getInt("misAPrix"), rs.getInt("prixVente"), rs.getString("etatVente"),  ((ArticleVendu) rs).getLieuRetrait(), ((ArticleVendu) rs).getVendeur(), ((ArticleVendu) rs).getCategorieArticle());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_OBJET_ECHEC);
		}	
		return art;
	}

	public ArticleVendu SelectById(int noArticle)throws BusinessException
	{
		ResultSet rs=null;
		ArticleVendu art = null;
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(SelectById);
			pstmt.setInt(1, noArticle);
			pstmt.executeUpdate();
			
			if (rs.next()) {
				art= new ArticleVendu(rs.getInt("noArticle"), rs.getString("nomArticle"), rs.getString("description"), rs.getDate("dateDebutENcheres").toLocalDate(),
						rs.getDate("DateFinEnchere").toLocalDate(), rs.getInt("misAPrix"), rs.getInt("prixVente"), rs.getString("etatVente"),  ((ArticleVendu) rs).getLieuRetrait(), ((ArticleVendu) rs).getVendeur(), ((ArticleVendu) rs).getCategorieArticle());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			BusinessException businessException = new BusinessException();
			businessException.ajouterErreur(CodesResultatDAL.SELECT_OBJET_ECHEC);
		}	
		return art;
	}
	public void encherir(ArticleVendu art) throws BusinessException 
	{
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(Encherir);
			pstmt.setInt(1, art.getPrixVente());
			
			pstmt.executeUpdate();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
