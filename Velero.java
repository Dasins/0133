
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula, Cliente propietario, double eslora, String anoFabricacion, int numMastiles)
    {
        super(matricula,propietario,eslora,anoFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }
    
    public int getBernua() {
        return 0;
    }
    
    public String toString(){
    String aDevolver = super.toString();
    aDevolver += "\rMASTILES :" + numMastiles; 
    return aDevolver;
    }
}
