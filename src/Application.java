import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by E159453T on 28/09/17.
 */
public class Application {
    public static void main(String[] args) {

        FauteuilRoulant a1 = new FauteuilRoulant("0001", "Luigi", "", 37, 10, 35, 50);
        FauteuilRoulant a2 = new FauteuilRoulant("0002", "Mario", "", 37, 10, 35, 50);
        FauteuilRoulant a3 = new FauteuilRoulant("0003", "OldRepublic", "", 37, 10, 35, 50);
        LitMedicalise a4 = new LitMedicalise("0004", "toto", "", 37, 10, new Dimensions(10, 10, 10), 35, "coco");

        ArrayList<Article> array1 = new ArrayList<>();
        array1.add(a1);
        array1.add(a2);
        array1.add(a3);
        array1.add(a4);

        Client c1 = new Client("Vieux", new Location());
        Client c2 = new Client("Guillaume Plaza", new Location());
        c1.louerArticle(a3);
        c2.louerArticle(a2, a4);

        ArrayList<Client> array2 = new ArrayList<>();
        array2.add(c1);
        array2.add(c2);

        Magasin m = new Magasin(array1, array2);

//        m.afficherArticles();
//        m.afficherClients();

        System.out.println("Bonjour ! Bienvenue dans le magasin de Stéphane Plazza. Veuillez choisir le type de recherche que vous souhaitez effectuer :");
        System.out.println("Afficher tous les articles : 1");
        System.out.println("Par référence : 2");
        System.out.println("Par marque : 3");
        System.out.println("Par modèle : 4");
        System.out.println("Par prix pour chaque jour de location : 5");
    }
}
