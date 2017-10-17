public class Matelas extends Article
{
    private static String type = "Matelas";
    private Dimensions dimensions ;
    private double poidsMax ;
    private double tempsGonflage ;

    public Matelas(String r, String ma, String mo, double ppj, int nbSt, Dimensions dim, double p, double t)
    {
        super(r, ma, mo, ppj, nbSt) ;
        this.dimensions = dim ;
        this.poidsMax = p ;
        this.tempsGonflage = t ;
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
}
