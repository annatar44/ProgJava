public class TableAlite extends SupportMedical
{
    private String something ;

    public TableAlite(String r, String ma, String mo, double ppj, int nbSt, Dimensions dim, double p, String smthg)
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

    public String getType() {
        return "Table alitée";
    }
}
