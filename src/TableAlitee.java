public class TableAlitee extends SupportMedical
{
    private static String type = "Table Alitee";
    private String something ;

    public TableAlitee(String r, String ma, String mo, double ppj, int nbSt, Dimensions dim, double p, String smthg)
    {
        super(r, ma, mo, ppj, nbSt, dim, p) ;
        this.something = smthg ;
    }

    //getter&setter
    public String getSomething()
    {
        return this.something ;
    }

    public void setSomething(String s)
    {
        this.something = s ;
    }

    public static String getType() {
        return type;
    }
}
