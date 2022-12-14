/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package pooej12;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Mile
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);        
        ServicioPersona sp = new ServicioPersona();
        
          
              
        Persona p1 = sp.crearPersona();
        
        int edad1 = sp.calcularEdad(p1);
        System.out.println("Edad: " + edad1);
        
        Persona p2 = new Persona();
        Date fecha = new Date(105, 2, 12);//2005, Marzo, 12.
        p2.setFecha(fecha);
        p2.setNombre("Rigoberto");
        
        int edad2 = sp.calcularEdad(p2); 
        
        
        boolean menor = sp.menorQue(edad2, edad1);        
        if (menor == true) {
            System.out.println("Sos mayor que la otra persona.");
        } else {
            System.out.println("La persona es mayor que vos.");
        }
        
        sp.mostrarPersona(p2);
        sp.mostrarPersona(p1);               
        
    }
    
}
