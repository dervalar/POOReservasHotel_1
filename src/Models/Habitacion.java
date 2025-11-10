/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Representa una habitación del hotel.
 * Contiene información como número, tipo, capacidad, precio base y estado.
 * 
 * @author Lisandro
 * @version 1.0
 */
package Models;


public class Habitacion {
    
    private int id;

    private String numero;

    private String tipo;

    private int capacidad;

    private double precioBase;

    private String estado;

    /**
     * Crea una habitación con todos sus atributos.
     *
     * @param id Identificador único de la habitación.
     * @param numero Número de habitación.
     * @param tipo Tipo de habitación (ej: simple, doble, suite).
     * @param capacidad Cantidad de personas que admite.
     * @param precioBase Precio base por noche.
     * @param estado Estado actual (DISPONIBLE, OCUPADA, CLAUSURADA).
     */
    public Habitacion(int id, String numero, String tipo, int capacidad, double precioBase, String estado) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.precioBase = precioBase;
        this.estado = estado;
    }
    
    /**
     * Crea una habitación vacía.
     */
    public Habitacion(){}

    public int getId() {
    return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /** @return el número de habitación. */
    public String getNumero() {
        return numero;
    }

    /** @param numero nuevo número de habitación. */
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    /** @return tipo de habitación. */
    public String getTipo() {
        return tipo;
    }

    /** @param tipo nuevo tipo de habitación. */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /** @return capacidad de la habitacion. */
    public int getCapacidad() {
    return capacidad;
    }

    /** @param capacidad nuevo estado de la habitación. */

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    /** @return precio base por noche. */
    public double getPrecioBase() {
    return precioBase;
    }

    /** @param precioBase nuevo precio base por noche. */
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    /** @return estado actual de la habitación. */
    public String getEstado() {
        return estado;
    }

    /** @param estado nuevo estado de la habitación. */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
