import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by E159453T on 28/09/17.
 */
public class Application {
    public static void main(String[] args) {

        FauteuilRoulant a1 = new FauteuilRoulant("0001", "Luigi", "", 37, 10, 35, 50);
        FauteuilRoulant a2 = new FauteuilRoulant("0001", "Mario", "", 37, 10, 35, 50);
        FauteuilRoulant a3 = new FauteuilRoulant("0001", "OldRepublic", "", 37, 10, 35, 50);
        LitMedicalise a4 = new LitMedicalise("0001", "toto", "", 37, 10, new Dimensions(10, 10, 10), 35, "coco");

        ArrayList<Article> array1 = new ArrayList<>();
        array1.add(a1);
        array1.add(a2);
        array1.add(a3);
        array1.add(a4);

//        Client c1 = new Client("Vieux", a1);
//        Client c2 = new Client("Guillaume Plaza");

        ArrayList<Client> array2 = new ArrayList<>();

        Magasin m = new Magasin(array1, array2);

        m.afficheArticles();
    }
}
