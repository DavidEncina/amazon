/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
    // Almacena la marca
    private Marca marca;
    // Almacena la antigüedad
    public int antiguedad;
    // Almacena los km recorridos
    public int kilometraje;
    // Almacena el numero del vehiculo
    private static int contador = -1;
    // 
    private int numero;
    
    /**
     * Constructor de la clase Vehiculo
     */
    public Vehiculo(Marca marca, int antiguedad, int kilometraje) {
        contador++;
        numero = contador;
        this.marca = marca;
        this.antiguedad = antiguedad;
        this.kilometraje = kilometraje;
    }  
    
    /**
     * Devuelve la marca
     */
    public Marca getMarca() {
        return marca;
    }
    
    /**
     * Devuelve el numero del vehiculo
     */
    public int getNumero() {
        return numero;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }
    
    public int getKilometraje() {
        return kilometraje;
    }
    
    /**
     * Datos del vehiculo
     */
    @Override
    public String toString() {
        return numero + "," + antiguedad + "," + kilometraje;
    }
}
