/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 * Representa a una persona registrada en el sistema del hotel.
 * Contiene datos personales utilizados para realizar reservas.
 * 
 * @author Lisandro
 * @version 1.0
 */
public class Persona {
    
    private int id;

    private String dni;

    private String nombre;

    private String email;

    private String telefono;
    
    /**
     * Crea una persona con todos sus atributos.
     *
     * @param id Identificador único de la persona.
     * @param nombre Nombre completo de la persona.
     * @param email Dirección de correo electrónico.
     * @param telefono Teléfono de contacto.
     * @param dni Documento Nacional de Identidad.
     */
    public Persona(int id, String dni, String nombre, String email, String telefono){
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }
    
    /**
     * Crea una persona sin datos iniciales.
     */
    public Persona(){}

    public int getId() {
    return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /** @return número de documento. */
    public String getDni() {
        return dni;
    }

    /** @param dni nuevo número de documento. */
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    /** @return nombre completo de la persona. */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre nuevo nombre completo. */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /** @return dirección de correo electrónico. */
    public String getEmail() {
        return email;
    }

    /** @param email nueva dirección de correo. */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /** @return teléfono de contacto. */
    public String getTelefono() {
    return telefono;
    }

    /** @param telefono nuevo número telefónico. */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
