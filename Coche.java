
/**
 * Write a description of class Coche here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coche extends VehiculoPequeno implements Medida
{
    /**
     * Constructor for objects of class Coche
     */
    public Coche(Marca marca, int antiguedad, int kilometraje, int numeroPlazas)
    {
        super(marca,antiguedad,kilometraje,numeroPlazas);
    }
    
    /**
     * Devuelve cada cuantos años hay que pasar una revision
     */
    public int anosRevision()
    {
        int anos = 0;
        if (getMarca() == Marca.FORD) {
            anos = 2;
        }
        else {
            anos = 1;
        }
        return anos;
    }
    
    /**
     * Devuelve si cumple las medidas de 
     */
    @Override
    public boolean cumpleMedidas() {
        boolean cumple = false;
        if (getNumeroPlazas() <= 5) {
            cumple = true; 
        }
        return cumple;
    }
}
