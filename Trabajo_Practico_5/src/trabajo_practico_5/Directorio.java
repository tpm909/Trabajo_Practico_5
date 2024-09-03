
package trabajo_practico_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Roma
 */
public class Directorio {
    private TreeMap<Long, Contacto> contactos;

    public Directorio() {
        contactos = new TreeMap<>();
    }
    
    public void agregarContacto(Long telefono, Contacto contacto) {
        if (!contactos.containsKey(telefono)) {
            contactos.put(telefono, contacto);
            System.out.println("Contacto agregado exitosamente.");
        } else {
            System.out.println("El número de teléfono ya está registrado.");
        }
    }
    
    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

   
     public TreeSet<Long> buscarTelefono(String apellido) {
        TreeSet<Long> telefonos = new TreeSet<>();
        Iterator<Map.Entry<Long, Contacto>> iterator = contactos.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Long, Contacto> entry = iterator.next();
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    
    public ArrayList<Contacto> buscarContactos(String ciudad) {
        ArrayList<Contacto> contactosPorCiudad = new ArrayList<>();
        Iterator<Contacto> iterator = contactos.values().iterator();

        while (iterator.hasNext()) {
            Contacto contacto = iterator.next();
            if (contacto.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosPorCiudad.add(contacto);
            }
        }
        return contactosPorCiudad;
    }

    
    public void borrarContacto(Long telefono) {
        Iterator<Map.Entry<Long, Contacto>> iterator = contactos.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Long, Contacto> entry = iterator.next();
            if (entry.getKey().equals(telefono)) {
                iterator.remove();
                System.out.println("Contacto eliminado exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró el contacto con el número de teléfono proporcionado.");
    }
}