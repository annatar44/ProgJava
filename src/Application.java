import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * Created by E159453T on 28/09/17.
 */
public class Application {

        public static void main(String[] args) throws IOException {


        // On instancie les articles

        SouleveMalade a1 = new SouleveMalade("0001", "INVACARE", "", 10.99, 10, 39, 12);
        FauteuilRoulant a2 = new FauteuilRoulant("0002", "INVACARE", "", 13.99, 10, 44, 20);
        Matelas a3 = new Matelas("0003", "OTTOBOCK", "", 12.99, 10, new Dimensions(200, 100, 50), 100, 40);
        LitMedicalise a4 = new LitMedicalise("0004", "Mario", "", 20, 10, new Dimensions(10, 10, 10), 35, "coco");

        ArrayList<Article> array1 = new ArrayList<>();
        array1.add(a1);
        array1.add(a2);
        array1.add(a3);
        array1.add(a4);

        // on instancie les clients

        Client c1 = new Client("Clément Lassalle","Masculin,060605052");
        Client c2 = new Client("Tianyou Ni","Masculin,060605053");
        Client c3 = new Client("Simon Plouffe","Masculin,060605050");
        Client c4 = new Client("Guillaume Connan","Masculin,06060606");
        Client c5 = new Client("Jean-François Remm","Masculin,060605051");

        c1.louerArticle(a3, c1.getCoordonnees(), "01/01/2017", "15/01/2017");
        c1.louerArticle(a4, c1.getCoordonnees(), "01/01/2017", "15/01/2017");
        c2.louerArticle(a1, c2.getCoordonnees(), "02/02/2017", "18/02/2017");
        c3.louerArticle(a2, c3.getCoordonnees(), "22/05/2017", "30/05/2017");
        c3.louerArticle(a3, c3.getCoordonnees(), "22/05/2017", "30/05/2017");
        c4.louerArticle(a3, c4.getCoordonnees(), "05/08/2017", "08/08/2017");
        c5.louerArticle(a1, c5.getCoordonnees(), "14/06/2017", "15/06/2017");

        ArrayList<Client> array2 = new ArrayList<>();
        array2.add(c1);
        array2.add(c2);

        // On instancie le magasin

        Magasin m = new Magasin(array1, array2);

        // Et on lance l'application

        System.out.println("Bonjour ! Bienvenue dans le magasin de Stéphane Plazza.");

        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Que souhaitez-vous faire ? ");
            System.out.println("Effectuez une recherche: 1");
            System.out.println("Afficher l'ensemble des locations en cours pour un client donné: 2");
            System.out.println("Calculer le montant total des recettes sur une période donnée: 3");
            System.out.println("Quitter l'application : 0");

            int choix = reader.nextInt();

            if (choix == 0){
                System.exit(0);
            }

            if(choix == 1) {

                System.out.println("Veuillez maintenant saisir le chiffre correspondant au mode de recherche que vous souhaitez effectuer :");
                System.out.println("Afficher tous les articles : 1");
                System.out.println("Par référence : 2");
                System.out.println("Par marque : 3");
                System.out.println("Par modèle : 4");
                System.out.println("Par prix pour chaque jour de location : 5");
                System.out.println("Quitter l'application : 0");

                choix = reader.nextInt();

                if (choix == 0){
                    System.exit(0);
                }

                m.choixRecherche(choix);

            }
            else if(choix == 2) {

                System.out.println("Sélectionnez le client concerné :");
                System.out.println("Client 1 -> " + c1.getNom() + " : 1");
                System.out.println("Client 2 -> " + c2.getNom() + " : 2");
                System.out.println("Client 3 -> " + c3.getNom() + " : 3");
                System.out.println("Client 4 -> " + c4.getNom() + " : 4");
                System.out.println("Client 5 -> " + c5.getNom() + " : 5");
                System.out.println("Quitter l'application : 0");

                choix = reader.nextInt();

                if (choix == 1){
                    c1.afficherLocations();
                }
                if (choix == 2){
                    c2.afficherLocations();
                }
                if (choix == 3){
                    c3.afficherLocations();
                }
                if (choix == 4){
                    c4.afficherLocations();
                }
                if (choix == 5){
                    c5.afficherLocations();
                }
                if (choix == 0){
                    System.exit(0);
                }
            }
            else if(choix == 3) {

                double montantTotal = 0.0;

                System.out.println("Montant total des locations : ");
                for(Client client : m.getClients()) {
                    for(Location location : client.getLocations()) {
                        montantTotal += location.getMontant();
                    }
                }

                System.out.println(montantTotal);
            }

            System.out.println("========================================================================================");

        }

        while (true);
    }
}
