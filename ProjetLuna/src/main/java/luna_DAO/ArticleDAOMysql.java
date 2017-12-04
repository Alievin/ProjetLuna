package luna_DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import luna_Class.Article;

public class ArticleDAOMysql implements ArticleDAO {
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	public ArticleDAOMysql(Connection connection){
		this.conn=connection;
	}

	public List<Article> getAllArticle() {
		List<Article> articles=new ArrayList<Article>();
		Article article=null;
		try {
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM Article");

			while (result.next()) {
				article=new Article();
				article.setId(result.getInt("id"));
				article.setCodeCategorie(result.getInt("codeCategorie"));
				article.setCategorie(result.getString("Categorie"));
				article.setDesignation(result.getString("designation"));
				article.setQuantitestock(result.getInt("quantitestock"));
				article.setPrixUnitaire(result.getInt("prixUnitaire"));
				articles.add(article);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articles;
	}

	@Override
	public Article getArticle(int articleID) {
		Article article=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT "+articleID+" FROM Article");

			while (result.next()) {
				article=new Article();
				article.setId(result.getInt("id"));
				article.setCodeCategorie(result.getInt("codeCategorie"));
				article.setCategorie(result.getString("Categorie"));
				article.setDesignation(result.getString("designation"));
				article.setQuantitestock(result.getInt("quantitestock"));
				article.setPrixUnitaire(result.getInt("prixUnitaire"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return article;
	}

	@Override
	public void insertArticle(Article article) {
		try 
		{
			
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO article (codeCategorie, Categorie, designation, quantitestock, prixUnitaire) VALUES  ('"+article.getCodeCategorie()+"', '"
																																			 +article.getCategorie()+"', '"
																																			 +article.getDesignation()+"', '"
																																			 +article.getQuantitestock()+"', '"
																																			 +article.getPrixUnitaire()+"')");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeArticle(int articleID) {
		try 
		{			
			state = conn.createStatement();
			state.executeUpdate("DELETE FROM article WHERE id='"+articleID+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void updateArticle(Article article) {
		try 
		{			
			state = conn.createStatement();
			state.executeUpdate("UPDATE article SET codeCategorie='"+article.getCodeCategorie()
											   +"', Categorie='"+article.getCategorie()
											   +"', designation='"+article.getDesignation()
											   +"', quantitestock='"+article.getQuantitestock()
											   +"', prixunitaire='"+article.getPrixUnitaire()
											   +"' WHERE id='"+article.getId()+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}

}
