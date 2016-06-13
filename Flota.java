import java.util.ArrayList;

/**
 * Write a description of class Flota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flota
{
    //Almacena la coleccion de vehiculos
    private ArrayList<Vehiculo> vehiculos;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        vehiculos = new ArrayList<>();
    }

    /**
     * Añade un vehiculo
     */
    public void addVehiculo(Vehiculo vehiculo)
    {
        vehiculos.add(vehiculo);
    }

    /**
     * Borra un vehiculo
     */
    public void removeVehiculo(int numero)
    {
        int i = 0;
        boolean encontrado = false;
        while (i < vehiculos.size() && !encontrado) {
            if (numero == vehiculos.get(i).getNumero()) {
                vehiculos.remove(i);
                encontrado = true;
                i++;
            }            
        }
    }
    
    /**
     * Devuelve la marca con el mayor número de vehículos en la flota.
     * Si hay empate entre cualquier marca o no hubiera aun vehiculos devuelve null
     */
    public Marca marcaMayoritaria() {
        Marca marca = null;
        int ford = 0;
        int opel = 0;
        int citroen = 0;
        int fiat = 0;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca() == Marca.FORD) {
                ford++;
            }
            if (vehiculo.getMarca() == Marca.OPEL) {
                opel++;
            }
            if (vehiculo.getMarca() == Marca.CITROEN) {
                citroen++;
            }
            if (vehiculo.getMarca() == Marca.FIAT) {
                fiat++;
            }
        }
        if (ford > opel && ford > citroen && ford > fiat) {
            marca = Marca.FORD;          
        }
        else if (opel > ford && opel > citroen && opel > fiat) {
            marca = Marca.OPEL;
        }
        else if (citroen > opel && citroen > ford && citroen > fiat) {
            marca = Marca.CITROEN;
        }
        else if (fiat > opel && fiat > citroen && fiat > ford) {
            marca = Marca.FIAT;
        }
        return marca;
    }
    
    /**
     * Devuelve verdadero si todos los vehiculos cumplen las medidas de seguridad (obviando a las furgonetas grandes) y falso en caso contrario
     */
    public boolean cumplenMedidas() {
        boolean cumple = true;
        int i = 0;
        while (i < vehiculos.size() && !cumple) {
            if (vehiculos.get(i) instanceof Coche) {
                if (((Coche) vehiculos.get(i)).cumpleMedidas() == false) {
                    cumple = false;
                }
            }
            if (vehiculos.get(i) instanceof FurgonetaPequena) {
                if (((FurgonetaPequena) vehiculos.get(i)).cumpleMedidas() == false) {
                    cumple = false;
                }
            }
            if (vehiculos.get(i) instanceof Camion) {
                if (((Camion) vehiculos.get(i)).cumpleMedidas() == false) {
                    cumple = false;
                }
            }            
            i++;
        }
        return cumple;
    }
    
    /**
     * Devuelve un array de enteros con todos los datos del vehiculo excepto si es articulado o no para los camiones
     */
    public int[] getDatosVehiculo(int numero) {
        int[] datos = null;
        int i = 0;
        boolean encontrado = false;
        while (i < vehiculos.size() && !encontrado) {
            if (vehiculos.get(i).getNumero() == numero) {
                if (vehiculos.get(i) instanceof Coche) {
                    datos = new int[5];
                    datos[0] = vehiculos.get(i).getNumero();
                    datos[1] = vehiculos.get(i).getAntiguedad();
                    datos[2] = vehiculos.get(i).getKilometraje();
                    datos[3] = ((Coche) vehiculos.get(i)).getNumeroPlazas();
                    datos[3] = ((Coche) vehiculos.get(i)).anosRevision();
                }
            }
            if (vehiculos.get(i).getNumero() == numero) {
                if (vehiculos.get(i) instanceof FurgonetaPequena) {
                    datos = new int[4];
                    datos[0] = vehiculos.get(i).getNumero();
                    datos[1] = vehiculos.get(i).getAntiguedad();
                    datos[2] = vehiculos.get(i).getKilometraje();
                    datos[3] = ((FurgonetaPequena) vehiculos.get(i)).getNumeroPlazas();
                }
            }
            if (vehiculos.get(i).getNumero() == numero) {
                if (vehiculos.get(i) instanceof FurgonetaGrande) {
                    datos = new int[4];
                    datos[0] = vehiculos.get(i).getNumero();
                    datos[1] = vehiculos.get(i).getAntiguedad();
                    datos[2] = vehiculos.get(i).getKilometraje();
                    datos[3] = ((FurgonetaGrande) vehiculos.get(i)).pesoMedio();
                }
            }
            if (vehiculos.get(i).getNumero() == numero) {
                if (vehiculos.get(i) instanceof Camion) {
                    datos = new int[4];
                    datos[0] = vehiculos.get(i).getNumero();
                    datos[1] = vehiculos.get(i).getAntiguedad();
                    datos[2] = vehiculos.get(i).getKilometraje();
                    datos[3] = ((Camion) vehiculos.get(i)).getPesoMedio();
                }
            }
            i++;
        }
        return datos;
    }
}
