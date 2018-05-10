
/**
 * Representa un puerto nautico.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Un puerto nautico tiene un numero de amarres. Cada amarre se 
 * identifica con su posicion dentro del array tradicional. 
 * Un amarre tiene capacidad para un unico barco y no se puede alquilar
 * si se encuenta ocupado. 
 *
 * @author nacho, d4s1ns
 * @version 2018
 */
public class Puerto
{
    // Numero de amarres.
    private final static int NUM_AMARRES = 4;
    
    // Amarres alquilados.
    private Alquiler[] alquileres;
    
    /**
     * Constructor - Crea un puerto nautico y crea e inicializa sus 
     * alquileres a null.
     */
    public Puerto()
    {
        alquileres = new Alquiler[NUM_AMARRES];
        for (Alquiler alquiler : alquileres) {
            alquiler = null;
        }
    }
    
    /**
     * Finaliza el alquiler del amarre indicado por parametro.
     * @param numAmarre El numero del amarre del alquiler liquidado.
     * @return Devuelve el importe total del amarre o -1 si no hay
     *         ningun alquiler o el amarre no existe.
     */
    public double liquidarAlquilerAmarre(int numAmarre)
    {
        double aDevolver = -1;
        if (numAmarre < NUM_AMARRES && alquileres[numAmarre] != null) {
            aDevolver = alquileres[numAmarre].getPrecio();
            alquileres[numAmarre] = null;            
        }
        return aDevolver;
    } 
    
    /**
     * Alquila el primer amarre disponible para el barco indicado
     * por una cantidad de dias especificada por parametro.
     * @param nDias Duracion del alquiler.
     * @param barco Barco que solicita el alquiler.
     * @return El importe total del alquiler o -1 si no hay amarres
     *         libres.
     */
    public double alquilarAmarre(int nDias, Barco barco)
    {
        double aDevolver = -1;
        boolean continuar = true;
        int i = 0;
        while(continuar && i < NUM_AMARRES) {
            if (alquileres[i] == null) {
                continuar = false;
                alquileres[i] = new Alquiler(nDias, barco);
                aDevolver = alquileres[i].getPrecio(); 
            }
            i++;
        }
        return aDevolver;
    }
    
    /**
     * Devuelve toda la informacion del puerto como cadena.
     * @return Devuelve toda la informacion del puerto como cadena.
     */
    public String toString() 
    {
        String aDevolver = "";
        for (int i = 0; i < NUM_AMARRES; i++) {
            Alquiler alquiler = alquileres[i];
            aDevolver += "AMARRE: " + i;
            if (alquiler != null) { 
                aDevolver += alquiler;
            }
            else {
                aDevolver += " [DISPONIBLE]";
            }
            aDevolver += "\r=========================\r";
        }
        return aDevolver;
    }
    
    /**
     * Imprime la informacion de los amarres por pantalla.
     */
    public void verEstadoAmarres() {
        System.out.println(this);
    }
}
