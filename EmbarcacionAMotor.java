
/**
 * Representa una embarcacion a motor.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Una embarcacion a motor es un barco caracterizado por la potencia de su 
 * motor. Su coeficiente de Bernau es: la potencia de su motor en CV.
 * 
 * @author nacho, d4s1ns
 * @version 2018/05/09
 */
public class EmbarcacionAMotor extends Barco 
{
    // Potencia del motor en CV.
    private int cv;
    
    /**
     * Constructor - Crea una embarcacion a motor.
     * @param matricula Matricula del barco.
     * @param eslora Longitud del barco de proa a popa expresada en metros.
     * @param anoFabricacion Ano en el que fue construido el barco.
     * @param propietario Propietario del barco.
     * @param cv Potencia del motor en CV.
     */
    public EmbarcacionAMotor(String matricula, double eslora, 
                             int anoFabricacion, Persona propietario, int cv)
    {
        super(matricula, eslora, anoFabricacion, propietario);
        this.cv = cv;
    }
    
    /**
     * Devuelve la potencia del motor en CV.
     * @return Devuelve la potencia del motor en CV.
     */
    public int getPotenciaMotor() 
    {
        return cv;
    }
    
    /**
     * Devuelve el coeficiente de Bernua del barco.
     * @return Devuelve el coeficiente de Bernua del barco.
     */
    @Override
    public int getBernua() 
    {
        return cv;
    }
    
    /**
     * Devuelve la informacion del barco como una cadena.
     * @return Devuelve la informacion del barco como una cadena.
     */
    @Override
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "\rCV:" + cv; 
        return aDevolver;
    }
}