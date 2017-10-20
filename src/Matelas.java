public class Matelas extends Article
{
    private Dimensions dimensions ;
    private double poidsMax ;
    private double tempsGonflage ;

    public Matelas(String reference, String marque, String modele, double ppj, int nbStock, Dimensions dim, double poidsMax, double tempsGonflage)
    {
        super(reference, marque, modele, ppj, nbStock) ;
        this.dimensions = dim ;
        this.poidsMax = poidsMax ;
        this.tempsGonflage = tempsGonflage ;
    }

    //getter&setter
    public Dimensions getDimensions()
    {
        return this.dimensions ;
    }

    public void setDimensions(Dimensions dim)
    {
        this.dimensions = dim ;
    }

    public double getPoidsMax()
    {
        return this.poidsMax ;
    }

    public void setPoidsMax(double p)
    {
        this.poidsMax = p ;
    }

    public double getTempsGonflage()
    {
        return this.tempsGonflage ;
    }

    public void setTempsGonflage(double t)
    {
        this.tempsGonflage = t ;
    }

    public String getType() {
        return "Matelas";
    }
}
