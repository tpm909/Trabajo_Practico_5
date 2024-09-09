
package trabajo_practico_5;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Tomi
 */
public class Directorio {
    
   private TreeMap<Long, Contacto> contactos = new TreeMap(); //En contactos, se van almacernar todos los contactos
    
   public Directorio() {
   }
   
   public void agregarContacto (Long telefono, Contacto otroContacto){
       contactos.put(telefono, otroContacto); //Agrega un contacto al TreeMap
   }
   
   public Contacto buscarContacto (Long telefono ){ //Busca un contacto segun su Key, dentro del TreeMap
       return contactos.get(telefono);
   }
   public TreeSet<Long> buscarTelefono (String apellido){ //Se usa el TreeMap y el Iterator
       TreeSet<Long> telefonos = new TreeSet<>(); //Aqui vamos a guardar los numeros de telefono
       Iterator<Long> it = contactos.keySet().iterator();//Creamos el iterator para recorrer los numeros de telefonos

       while(it.hasNext()){
           Long telefono = it.next();
           Contacto contacto = contactos.get(telefono); //Le colocamos el contacto del TreeMap
           
           if(contacto.getApellido().equalsIgnoreCase(apellido)){ //Comparamos el apellido del TreeMap y el Apellido pasado por parametro
               telefonos.add(telefono);//Si el apellido coincide, Agregamos el telefono al TreeSet
           }
       }
       return telefonos; //Retornara los telefonos del TreeSet
   }
       
   public ArrayList<Contacto> buscarContactos (String ciudad){
       ArrayList<Contacto> buscaContactos = new ArrayList<>(); //Guardamos los contactos en el ArrayList
       for(Contacto contacto : contactos.values()){ //Recorremos el bucle for each
           if(contacto.getCiudad().equals(ciudad)){//Comparamos la ciudad del TreeMap con la ciudad pasada por parametro
               buscaContactos.add(contacto); //Si se cumple la condicion, Agregamos el contacto al ArrayList
           }
       }
       return buscaContactos;//Retornamos los contactos del ArrayList
   }
   
   public void borrarContacto (Long telefono){ //Borramos un elemeneto del TreeMap, Osea borramos un contacto segun su numero de telefono
       contactos.remove(telefono);
   }
}
