/**
 * Abstract class VehiculoGrande - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class VehiculoGrande extends Vehiculo
{
    // Almacena el peso del vehiculo
    private int pesoMedio;

    /**
     * Constructor for objects of class VehiculoGrande
     */
    public VehiculoGrande(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca,antiguedad,kilometraje);
        this.pesoMedio = pesoMedio;
    }
    
    /**
     * Devuelve el numero de plazas
     */
    public int getPesoMedio() {
        return pesoMedio;
    }
}
