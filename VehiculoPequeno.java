
/**
 * Write a description of class VehiculoPequeno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class VehiculoPequeno extends Vehiculo
{
    // Almacena las plazas del vehiculo
    private int numeroPlazas;

    /**
     * Constructor for objects of class VehiculoPequeno
     */
    public VehiculoPequeno(Marca marca, int antiguedad, int kilometraje, int numeroPlazas)
    {
        super(marca,antiguedad,kilometraje);
        this.numeroPlazas = numeroPlazas;
    }
    
    /**
     * Devuelve el numero de plazas
     */
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
    
    /**
     * Datos del vehiculo
     */
    @Override
    public String toString() {
        return super.toString() + "," + numeroPlazas;
    }
}
