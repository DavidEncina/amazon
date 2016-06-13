
/**
 * Write a description of class FurgonetaGrande here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FurgonetaGrande extends Vehiculo
{
    // Almacena el peso del vehiculo
    private int pesoMedio;

    /**
     * Constructor for objects of class FurgonetaGrande
     */
    public FurgonetaGrande(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca,antiguedad,kilometraje);
        this.pesoMedio = pesoMedio;
    }
    
    public int pesoMedio() {
        return pesoMedio;
    }
}
