
/**
 * El alquiler de un amarre del puerto nautico.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Cada alquiler se realiza por un numero de dias y esta a asociado a una 
 * embarcacion. El alquiler debe ser liquidado antes de quel barco abandone el
 * puerto.
 *
 * @author nacho, d4s1ns
 * @version 2018/05/09
 */
public class Alquiler
{
    // Multiplicador aplicado sobre la eslora.
    private static final int MULTIPLICADOR_ESLORA = 10;
    // Precio base de un alquiler.
    private static final int PRECIO_BASE = 300;
    
    // Duracion del alquiler en dias.
    private int numeroDias;
    // Barco que solicita el alquiler.
    private Barco barco;
    // Importe total del alquiler.
    private double precio;
    
    /**
     * Constructor - Crea un alquiler indicando su duracion en dias y el barco 
     * que lo realiza.
     * 
     * El importe total de un alquiler se calcula en base a la 
     * siguiente formula:
     * Duracion del alquiler en dias * Eslora del barco * Multiplicador +      
     * Precio base * Coeficiente de Bernua. 
     * 
     * @param numeroDias Numero de dias que dura el alquiler.
     * @param barco Barco que realiza el alquiler.
     */
    public Alquiler(int numeroDias, Barco barco)
    {
        this.numeroDias = numeroDias;
        this.barco = barco;
        precio = numeroDias * MULTIPLICADOR_ESLORA * barco.getEslora();
        precio += PRECIO_BASE * barco.getBernua();
    }
    
    /**
     * Devuelve el importe total del alquiler.
     * @return Devuelve el importe total del alquiler.
     */
    public double getPrecio()
    {
        return precio;
    }
    
    /**
     * Devuelve la informacion sobre el alquiler como una cadena.
     * @return Devuelve la informacion sobre el alquiler como una cadena.
     */
    @Override
    public String toString()
    {
        String aDevolver = "";
        aDevolver = "\rNumero de Dias: " + numeroDias;
        aDevolver += "\rImporte: " + getPrecio() + "€";
        aDevolver += "\r" + barco;
        return aDevolver;
    }
}
