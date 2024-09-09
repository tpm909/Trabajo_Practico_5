package trabajo_practico_5;

import JFrame.JFrame_Principal;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Tomi
 */
public abstract class Directorio {

    public static TreeMap<Long, Contacto> contactos = new TreeMap<>(); //En contactos, se van almacernar todos los contactos
    public static ArrayList<Contacto> buscaContactos = new ArrayList<>(); //En buscaContactos, se van almacenar los elementos del arraylist
    public static TreeSet<Long> telefonos = new TreeSet<>(); //En telefonos, se van almacenar los numeros de telefono

    public static void agregarContacto(Long telefono, Contacto otroContacto) {
        contactos.put(telefono, otroContacto); //Agrega un contacto al TreeMap
    }

    public static Contacto buscarContacto(Long telefono) { //Busca un contacto segun su Key, dentro del TreeMap
        return JFrame_Principal.contactos.get(telefono);
    }

    public static TreeSet<Long> buscarTelefono(String apellido) { //Se usa el TreeMap y el Iterator
        Iterator<Long> it = JFrame_Principal.contactos.keySet().iterator();//Creamos el iterator para recorrer los numeros de telefonos
        while (it.hasNext()) {
            Long telefono = it.next();
            Contacto contacto = JFrame_Principal.contactos.get(telefono); //Le colocamos el contacto del TreeMap

            if (contacto.getApellido().equalsIgnoreCase(apellido)) { //Comparamos el apellido del TreeMap y el Apellido pasado por parametro
                telefonos.add(telefono);//Si el apellido coincide, Agregamos el telefono al TreeSet
            }
        }
        return telefonos; //Retornara los telefonos del TreeSet
    }

    public static ArrayList<Contacto> buscarContactos(String ciudad) {
        for (Contacto contacto : JFrame_Principal.contactos.values()) { //Recorremos el bucle for each
            if (contacto.getCiudad().equals(ciudad)) {//Comparamos la ciudad del TreeMap con la ciudad pasada por parametro
                buscaContactos.add(contacto); //Si se cumple la condicion, Agregamos el contacto al ArrayList
            }
        }
        return buscaContactos;//Retornamos los contactos del ArrayList
    }

    public static void borrarContacto(Long telefono) { //Borramos un elemeneto del TreeMap, Osea borramos un contacto segun su numero de telefono
        // Verificamos si el contacto existe en el TreeMap antes de intentar eliminarlo
        if (JFrame_Principal.contactos.containsKey(telefono)) {
            JFrame_Principal.contactos.remove(telefono); // Elimina el contacto según su número de teléfono
            JOptionPane.showMessageDialog(null, "Contacto borrado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ningún contacto con ese número de teléfono.");
        }
    }
}
