/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_practico_5;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Tomi
 */
public class Directorio {
    
   private TreeMap<Long, Contacto> contactos = new TreeMap();
    
   private TreeSet<Contacto> cosaInutil =new TreeSet();

   public Directorio() {
   }
   
   public void agregarContacto (Long telefono, Contacto otroContacto){
       contactos.put(telefono, otroContacto);
   }
   
   public Contacto buscarContacto (Long telefono ){
       return contactos.get(telefono);
   }
   public void buscarTelefono (){
       
   }
   public void buscarContactos (){
       
   }
   public void borrarContacto (Long telefono){
       contactos.remove(telefono);
   }
}
