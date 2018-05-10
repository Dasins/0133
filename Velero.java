
/**
 * Representa una embarcacion a vela.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Un velero se caracteriza por tener mastiles. Su coeficiente de 
 * Bernua es igual a : su numero de mastiles.
 * 
 * @author nacho, d4sins
 * @version 2018/05/09
 */
public class Velero extends Barco
{
    // Cantidad de mastiles.
    private int numMastiles;

    /**
     * Constructor - Crea un velero. 
     * No se comprueba si el velero tiene al menos un mastil, como
     * seria logico. Se da por hecho que los valores introducidos
     * son validos.
     */
    public Velero(String matricula, double eslora, int anoFabricacion, 
                  Persona propietario, int numMastiles)
    {
        super(matricula, eslora, anoFabricacion, propietario);
        this.numMastiles = numMastiles;
    }
    
    /**
     * Devuelve el numero de mastiles del barco.
     * @return Devuelve el numero de mastiles del barco.
     */
    public int getNumMastiles() {
        return numMastiles;
    }
    
    /**
     * Devuelve el coeficiente de Bernua del barco.
     * @return Devuelve el coeficiente de Bernua del barco.
     */
    @Override
    public int getBernua() {
        return numMastiles;
    }
    
    /**
     * Devuelve la informacion del barco como una cadena.
     * @return Devuelve la informacion del barco como una cadena.
     */
    @Override
    public String toString(){
        String aDevolver = super.toString();
        aDevolver += "\rMASTILES: " + numMastiles; 
        return aDevolver;
    }
}
