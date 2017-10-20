import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by E159453T on 28/09/17.
 */
public class Application {
    public static void funcMenuGerant(){
        System.out.println("Que souhaitez-vous faire ? ");
        System.out.println("Effectuez une recherche: 1");
        System.out.println("Afficher l'ensemble des locations en cours pour un client donné: 2");
        System.out.println("Calculer le montant total des recettes sur une période donnée: 3");

    }

    public static void funcMenuClient(){
        System.out.println("Que souhaitez-vous faire ? ");
        System.out.println("Effectuez une recherche: 1");
        System.out.println("Louez un article: 2");
        System.out.println("Afficher vos locations: 3");

    }


    public static void main(String[] args) {
        System.out.println("Bonjour ! Bienvenue dans le magasin de Stéphane Plazza.");
        System.out.println("Entrez votre nom afin que nous puissions procéder à la création de votre profil client :");

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

        System.out.println("Êtes-vous client ou Gérant ? c/g");
        Scanner menuReader = new Scanner(System.in);
        String user = menuReader.next();
        if (user.equals("g")){
            funcMenuGerant();
        }
        else if(user.equals("c")) {
            funcMenuClient();
        }


    }
}
