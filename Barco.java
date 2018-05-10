
/**
 * Representa cualquier tipo de embarcacion.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Esta clase sirve como plantilla para modelar clases que representen barcos 
 * mas concretos. 
 *
 * @author nacho, d4s1ns
 * @version 2018/05/09
 */
public abstract class Barco 
{
    // Matricula del barco.
    private String matricula;
    // Propietario del barco.
    private Persona propietario;
    // Eslora del barco.
    private double eslora;
    // Ano en el que fue fabricado el barco.
    private int anoFabricacion;
    
    /**
     * Constructor - Crea una embarcacion.
     * @param matricula Matricula del barco.
     * @param eslora Longitud del barco de proa a popa expresada en metros.
     * @param anoFabricacion Ano en el que fue construido el barco.
     * @param propietario Propietario del barco.
     */
    public Barco(String matricula, double eslora, int anoFabricacion, 
                 Persona propietario) 
    {
        this.matricula = matricula;
        this.propietario = propietario;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }
    
    /**
     * Devuelve la informacion del barco como una cadena.
     * @return Devuelve la informacion del barco como una cadena.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        aDevolver = "BARCO:" + matricula + "\r" + propietario;
        aDevolver += "\rESLORA:" + eslora + "\rANO FABRICACIÓN: " + anoFabricacion;
        return aDevolver;
    }
    
    /**
     * Devuelve la eslora del barco.
     * @return Devuelve la eslora del barco.
     */
    public double getEslora(){
        return eslora;
    }
    
    /**
     * Devuelve el coeficiente de Bernua del barco.
     * @return Devuelve el coeficiente de Bernua del barco.
     */
    public abstract int getBernua();
    
}
    
    
    

