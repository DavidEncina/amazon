
/**
 * Write a description of class Camion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camion extends VehiculoGrande implements Medida
{
    /**
     * Constructor for objects of class Camion
     */
    public Camion(Marca marca, int antiguedad, int kilometraje, int pesoMedio)
    {
        super(marca,antiguedad,kilometraje, pesoMedio);
    }

    /**
     * Devuelve cada cuantos años hay que pasar una revision
     */
    public boolean esArticulado()
    {
        boolean articulado = false;
        if (getMarca() == Marca.FORD || getMarca() == Marca.FIAT) {
            articulado = true;
        }        
        return articulado;
    }
    
    /**
     * Devuelve si cumple las medidas de 
     */
    @Override
    public boolean cumpleMedidas() {
        boolean cumple = false;
        if (esArticulado() == true) {
            if (getPesoMedio() < 3000) {
                cumple = true; 
            }
        }
        else {
            if (getPesoMedio() < 2000) {
                cumple = true; 
            }
        }
        return cumple;
    }
    
}
