/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_practico_5;

/**
 *
 * @author franco
 */
public class Trabajo_Practico_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // Crear contactos
        Contacto c1 = new Contacto(12345678, "Juan", "Pérez", "Buenos Aires", "Calle 1");
        Contacto c2 = new Contacto(23456789, "María", "Gómez", "Rosario", "Calle 2");
        Contacto c3 = new Contacto(34567890, "Carlos", "Pérez", "Córdoba", "Calle 3");
        Contacto c4 = new Contacto(45678901, "Ana", "López", "Mendoza", "Calle 4");

        // Agregar contactos al directorio
        directorio.agregarContacto(1234567890L, c1);
        directorio.agregarContacto(2345678901L, c2);
        directorio.agregarContacto(3456789012L, c3);
        directorio.agregarContacto(4567890123L, c4);

        // Probar los métodos
        System.out.println("Buscar contacto por teléfono 1234567890: " + directorio.buscarContacto(1234567890L));

        System.out.println("Buscar teléfonos por apellido 'Pérez': " + directorio.buscarTelefono("Pérez"));

        System.out.println("Buscar contactos por ciudad 'Buenos Aires': " + directorio.buscarContactos("Buenos Aires"));

        directorio.borrarContacto(1234567890L);
        System.out.println("Buscar contacto por teléfono 1234567890 después de eliminar: " + directorio.buscarContacto(1234567890L));
    }
}
    
    
