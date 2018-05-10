
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numCamarotes;
 
    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula, Cliente propietario, double eslora, String anoFabricacion, int cv, int numCamarotes)
    {
        super(matricula, propietario, eslora, anoFabricacion, cv);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }
    
    public int getBernua() {
        return 0;
    }
    
    public String toString(){
    String aDevolver = super.toString();
    aDevolver += "\rCAMAROTES :" + numCamarotes; 
    return aDevolver;
    }
}
