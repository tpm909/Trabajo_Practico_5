/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_practico_5;

/**
 *
 * @author Tomas
 */
public class Contacto {
    
    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Contacto() {
    }

    
    public Contacto(int dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    // Getters y Setters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getApellido() { 
        return apellido; 
    }
    
    public void setApellido(String apellido) { 
        this.apellido = apellido; 
    }

    public String getCiudad() { 
        return ciudad; 
    }
    
    public void setCiudad(String ciudad) { 
        this.ciudad = ciudad; 
    }

    public String getDireccion() { 
        return direccion; 
    }
    
    public void setDireccion(String direccion) { 
        this.direccion = direccion; 
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ", DNI: " + dni + ", Ciudad: " + ciudad + ", Dirección: " + direccion;
    }
    
}

