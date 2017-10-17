public class LitMedicalise extends SupportMedical
{
    private static String type = "Lit Medicalisee";
    private String somethingElse ;

    public LitMedicalise(String reference, String marque, String modele, double prixParJour, int nbStock, Dimensions dimensions, double poids, String smthgElse)
    {
        super(reference, marque, modele, prixParJour, nbStock, dimensions, poids);
        this.somethingElse = smthgElse ;
    }

    //getter&setter
    public String getSomethingElse()
    {
        return this.somethingElse ;
    }

    public void setSomethingElse(String s)
    {
        this.somethingElse = s ;
    }

    public static String getType() {
        return type;
    }
}
