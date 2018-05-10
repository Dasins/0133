
/**
 * Representa un yate.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Un yate es una embarcacion a motor que dispone de camarotes. Su 
 * coeficiente de Bernua es igual a: su potencia en CV + el numero de 
 * camarotes.
 * 
 * @author nacho, d4s1ns
 * @version 2018/05/09
 */
public class Yate extends EmbarcacionAMotor
{
    // Cantidad de camarotes del yate.
    private int numCamarotes;

    /**
     * Constructor - Crea un yate.
     * @param matricula Matricula del barco.
     * @param eslora Longitud del barco de proa a popa expresada en metros.
     * @param anoFabricacion Ano en el que fue construido el barco.
     * @param propietario Propietario del barco.
     * @param cv Potencia del motor en CV.
     * @param numCamarotes Cantidad de camarotes en el barco.
     */
    public Yate(String matricula, double eslora, int anoFabricacion, 
                Persona propietario, int cv, int numCamarotes) 
    {
        super(matricula, eslora, anoFabricacion, propietario, cv);
        this.numCamarotes = numCamarotes;
    }
    
    /**
     * Devuelve la cantidad de camarotes del yate.
     * @return Devuelve la cantidad de camarotes del yate.
     */
    public int getNumCamarotes() 
    {
        return numCamarotes;
    }
    
    /**
     * Devuelve el coeficiente de Bernua del barco.
     * @return Devuelve el coeficiente de Bernua del barco.
     */
    @Override
    public int getBernua()
    {
        return getPotenciaMotor() + numCamarotes;
    }
    
    /**
     * Devuelve la informacion del barco como una cadena.
     * @return Devuelve la informacion del barco como una cadena.
     */
    public String toString()
    {
        String aDevolver = super.toString();
        aDevolver += "\rCAMAROTES:" + numCamarotes; 
        return aDevolver;
    }
}
