public class Juego
{

    // -----------------------------------------------------------------
    // Enumeraciones
    // -----------------------------------------------------------------

    /**
     * Enumeradores para la categor�a del juego.
     */
    public enum Categoria
    {
        /**
         * Representa la categor�a rompecabezas.
         */
        ROMPECABEZAS,

        /**
         * Representa la categor�a deportes.
         */
        DEPORTE,

        /**
         * Representa la categor�a acci�n.
         */
        ACCION
    }

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre del juego.
     */
    private String nombre;

    /**
     * Categor�a del juego.
     */
    private Categoria categoria;

    /**
     * Precio del juego.
     */
    private int precio;

    /**
     * Tama�o en KB del juego.
     */
    private int Edad;
    public Animales( String pNombre, Categoria pCategoria, int pPrecio, int pedad, )
    {
        nombre = pNombre;
        categoria = pCategoria;
        precio = pPrecio;
        edad = pedad;
        cantidadVendidas = 0;
    }

    public String darNombre( )
    {
        return nombre;
    }
    
    public Categoria darCategoria( )
    {
        return categoria;
    }

    public int darPrecio( )
    {
        return precio;
    }

    public int darEdad( )
    {
        return Edad;
    }



    public int darCantidadVendidas( )
    {
        return cantidadVendidas;
    }


    public void comprarMascotas( int pCantidad )
    {
        cantidadMascotas  += pCantidad;
    }

    public boolean venderMascotas( int pCantidad )
    {
        boolean respuesta = false;
        if( cantidadMascotas >= pCantidad )
        {
            cantidadLicencias -= pCantidad;
            cantidadVendidas += pCantidad;
            respuesta = true;
        }
        return respuesta;
    }
}
