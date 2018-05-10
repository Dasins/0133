
/**
 * Representa una persona.
 * 
 * Pertenece al proyecto '0133'.
 * 
 * Un individuo humano.
 *
 * @author nacho, d4sins
 * @version 2018/05/09
 */
public class Persona
{
    // Nombre de la persona.
    private String nombre;
    // DNI de la persona.
    private String dni;
    
    /**
     * Constructor - Crea una persona a partir de su nombre y su dni.
     * @param nombre Nombre de la persona.
     * @param dni DNI de la persona.
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Devuelve el nombre de la persona.
     * @return Devuelve el nombre de la persona.
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve el DNI de la persona.
     * @return Devuelve el DNI de la persona.
     */
    public String getDNI()
    {
        return dni;
    }
    
    /**
     * Devuelve la informacion de la persona como una cadena.
     * @return Devuelve la informacion de la persona como una cadena.
     */
    @Override
    public String toString()
    {
        String aDevolver="";
        aDevolver += "CLIENTE: " + nombre + "\r";
        aDevolver += "DNI: " + dni;
        return aDevolver;
    }
}
