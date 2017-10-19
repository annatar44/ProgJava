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

    /**
     * Méthode permettant d'afficher l'ensemble des articles en stock, avec tous les détails
     */
    public void afficherArticles()
    {
        for(Article a : this.articles)
        {
            System.out.println("Article " + a.getReference() + " de type " + a.getType());
        }
    }

    /**
     * Méthode permettant d'afficher l'ensemble des clients du magasin
     */
    public void afficherClients()
    {
        for(Client c : this.clients)
        {
            System.out.println("Client " + c.getNom());
        }
    }

    /**
     * Méthode permettant d'afficher l'article correspondant à la référence passée en paramètre
     * @param ref représentant la référence de l'article à afficher
     */
    public void afficherParReference(String ref) {
        for(Article a : this.articles)
        {
            if(a.getReference().equals(ref))
            {
                System.out.println("Article " + a.getReference() + " de type " + a.getType());
            }
        }
    }

    /**
     * Méthode permettant d'afficher l'article correspondant à la marque passée en paramètre
     * @param marque représentant la marque de l'article à afficher
     */
    public void afficherParMarque(String marque) {
        for(Article a : this.articles)
        {
            if(a.getMarque().equals(marque))
            {
                System.out.println("Article " + a.getReference() + " de type " + a.getType());
            }
        }
    }

    /**
     * Méthode permettant d'afficher l'article correspondant au prix passé en paramètre
     * @param prixParJour représentant le prix par jour de location de l'article à afficher
     */
    public void afficherParModele(double prixParJour) {
        for(Article a : this.articles)
        {
            if(a.getPrixParJour() == prixParJour)
            {
                System.out.println("Article " + a.getReference() + " de type " + a.getType());
            }
        }
    }

    /**
     * Méthode permettant d'afficher l'article correspondant au modele passée en paramètre
     * @param modele représentant le modele de l'article à afficher
     */
    public void afficherParModele(String modele) {
        for(Article a : this.articles)
        {
            if(a.getModele().equals(modele))
            {
                System.out.println("Article " + a.getReference() + " de type " + a.getType());
            }
        }
    }
}
