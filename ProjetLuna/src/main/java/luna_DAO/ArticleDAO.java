package luna_DAO;
import java.util.List;
import luna_Class.Article;

public interface ArticleDAO {
	public void insertArticle(Article article);
	public void updateArticle(Article article);
	public void removeArticle(int articleID);
	public Article getArticle(int articleID);
	public List<Article> getAllArticle();
}
