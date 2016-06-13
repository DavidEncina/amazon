
/**
 * Write a description of class FurgonetaPequena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaPequena extends Vehiculo implements Medida
{
    // Almacena las plazas del vehiculo
    private int numeroPlazas;

    /**
     * Constructor for objects of class FurgonetaPequena
     */
    public FurgonetaPequena(Marca marca, int antiguedad, int kilometraje, int numeroPlazas)
    {
        super(marca,antiguedad,kilometraje);
        this.numeroPlazas = numeroPlazas;
    }

    /**
     * Devuelve si cumple las medidas de 
     */
    @Override
    public boolean cumpleMedidas() {
        boolean cumple = false;
        if (numeroPlazas <= 7) {
            cumple = true; 
        }
        return cumple;
    }
    
    public int getNumeroPlazas() {
        return numeroPlazas;
    }
}
