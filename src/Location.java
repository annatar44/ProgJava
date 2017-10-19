import java.util.ArrayList;

/**
 * Created by E159453T on 28/09/17.
 */
public class Location {
    //Attributs
    private ArrayList<Article> articles;

    public Location(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public void ajouterArticle(Article article) {
        this.articles.add(article);
    }
}
