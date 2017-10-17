public class SupportMedical extends Article
{
    private static String type = "Support Medical";
    private Dimensions dimensions ;
    private double poidsMaxAdmissible ;

    public SupportMedical(String r, String ma, String mo, double ppj, int nbSt, Dimensions dim, double p)
    {
        super(r, ma, mo, ppj, nbSt) ;
        this.dimensions = dim ;
        this.poidsMaxAdmissible = p ;
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

    public double getPoidsMaxAdmissible()
    {
        return this.poidsMaxAdmissible ;
    }

    public void setPoidsMaxAdmissible(double p)
    {
        this.poidsMaxAdmissible = p ;
    }

    public static String getType() {
        return type;
    }
}
