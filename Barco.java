
/**
 * Write a description of class Barco here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Barco
{

    
    private String matricula;
    private Cliente propietario;
    private double eslora;
    private String anoFabricacion;
    
    public Barco(String matricula,Cliente propietario,double eslora,String anoFabricacion){
        this.matricula = matricula;
        this.propietario = propietario;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }
    
    
    public String toString(){
        String aDevolver = "";
        aDevolver = "BARCO :" + matricula + "CLIENTE :" + propietario;
        aDevolver += "\rESLORA :" + eslora + "AÑO FABRICACIÓN: " + anoFabricacion;
        return aDevolver;
    
    }
    
    public double getEslora(){
        return eslora;
    }
    
    public abstract int getBernua();
    
}