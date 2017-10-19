import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by E159453T on 28/09/17.
 */
public class Application {
    public static void main(String[] args) {

        FauteuilRoulant a1 = new FauteuilRoulant("0001", "INVACARE", "", 10.99, 10, 39, 12);
        FauteuilRoulant a2 = new FauteuilRoulant("0002", "INVACARE", "", 13.99, 10, 44, 20);
        FauteuilRoulant a3 = new FauteuilRoulant("0003", "OTTOBOCK", "", 12.99, 10, 42, 18);
        LitMedicalise a4 = new LitMedicalise("0004", "Mario", "", 20, 10, new Dimensions(10, 10, 10), 35, "coco");

        ArrayList<Article> array1 = new ArrayList<>();
        array1.add(a1);
        array1.add(a2);
        array1.add(a3);
        array1.add(a4);

//        Client c1 = new Client("Vieux", new Location());
//        Client c2 = new Client("Guillaume Plaza", new Location());
//        c1.louerArticle(a3);
//        c2.louerArticle(a2, a4);
//
//        ArrayList<Client> array2 = new ArrayList<>();
//        array2.add(c1);
//        array2.add(c2);

        Magasin m = new Magasin(array1);

//        m.afficherArticles();
//        m.afficherClients();

        System.out.println("Bonjour ! Bienvenue dans le magasin de Stéphane Plazza.");
        System.out.println("Entrez votre nom afin que nous puissions procéder à la création de votre profil client :");

        Scanner nameReader = new Scanner(System.in);
        String name = nameReader.next();
        Client c1 = new Client(name);
        m.ajouterClient(c1);

        System.out.println("Votre profil client a été créé avec succès.");
        System.out.println("Veuillez maintenant saisir le chiffre correspondant au mode de recherche que vous souhaitez effectuer :");
        System.out.println("Afficher tous les articles : 1");
        System.out.println("Par référence : 2");
        System.out.println("Par marque : 3");
        System.out.println("Par modèle : 4");
        System.out.println("Par prix pour chaque jour de location : 5");

        Scanner choiceReader1 = new Scanner(System.in);
        int choix = choiceReader1.nextInt();

        m.choixRecherche(choix);

        choiceReader1.close();

        System.out.println("Saisissez la référence d'un article pour le louer (dans la limite du stock disponible) :");



        Scanner choiceReader2 = new Scanner(System.in);
        String ouiNon = choiceReader2.next();

        if(ouiNon.equals("o")) {

        }
    }
}
