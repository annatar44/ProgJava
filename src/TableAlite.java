/**
 * @author Tianyou Ni - Clément Lassalle
 */
public class TableAlite extends SupportMedical
{
    private boolean pliante ;

    public TableAlite(String r, String ma, String mo, double ppj, int nbSt, Dimensions dim, double p, boolean pliante)
    {
        super(r, ma, mo, ppj, nbSt, dim, p) ;
        this.pliante = pliante ;
    }

    //getter&setter
    public boolean isPliante() {
        return pliante;
    }

    public void setPliante(boolean pliante) {
        this.pliante = pliante;
    }

    public String getType() {
        return "Table alitée";
    }
}
