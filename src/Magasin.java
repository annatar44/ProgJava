import java.util.ArrayList;

/**
 * Created by E159453T on 28/09/17.
 */
public class Magasin {
    //Attributs
    private ArrayList<Article> articles;
    private ArrayList<Client> clients;

    public Magasin(ArrayList<Article> articles, ArrayList<Client> clients) {
        this.articles = articles;
        this.clients = clients;
    }

    public void afficherArticles()
    {
        for(Article a : this.articles)
        {
            System.out.println("Article " + a.getReference() + " de type " + a.getType());
        }
    }

    public void afficherClients()
    {
        for(Client c : this.clients)
        {
            System.out.println("Client " + c.getNom());
        }
    }
}
