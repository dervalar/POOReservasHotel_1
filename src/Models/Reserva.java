/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 * Representa una reserva realizada en el hotel.
 * Contiene información sobre la habitación, la persona y las fechas de estadía.
 * 
 * @author Lisandro
 * @version 1.0
 */
public class Reserva {
    
    private int id;
    private int habitacionId;
    private int personaId;
    private java.sql.Date checkIn;
    private java.sql.Date checkOut;
    private double monto;
    private String estado;
    private String numeroHabitacion;
    private String dniPersona;

    /**
     * Crea una reserva vacía.
     */
    public Reserva() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    /** @return ID de la habitación reservada. */
    public int getHabitacionId() { return habitacionId; }
    /** @param habitacionId nuevo ID de la habitación reservada. */
    public void setHabitacionId(int habitacionId) { this.habitacionId = habitacionId; }

    /** @return ID de la persona que realizó la reserva. */
    public int getPersonaId() { return personaId; }
    /** @param personaId nuevo ID de la persona que realizó la reserva. */
    public void setPersonaId(int personaId) { this.personaId = personaId; }

    /** @return fecha de entrada. */
    public Date getCheckIn() { return checkIn; }
    /** @param d nueva fecha de entrada. */
    public void setCheckIn(java.util.Date d)  { this.checkIn  = new java.sql.Date(d.getTime()); }

    /** @return fecha de salida. */
    public Date getCheckOut() { return checkOut; }
    /** @param d nueva fecha de salida. */
    public void setCheckOut(java.util.Date d) { this.checkOut = new java.sql.Date(d.getTime()); }

    /** @return monto total de la reserva. */
    public double getMonto() { return monto; }
    /** @param monto nuevo monto total. */
    public void setMonto(double monto) { this.monto = monto; }

    /** @return estado actual de la reserva. */
    public String getEstado() { return estado; }
    /** @param estado nuevo estado de la reserva. */
    public void setEstado(String estado) { this.estado = estado; }
    
    public String getNumeroHabitacion() { return numeroHabitacion; }
    public void setNumeroHabitacion(String numeroHabitacion) { this.numeroHabitacion = numeroHabitacion; }

    public String getDniPersona() { return dniPersona; }
    public void setDniPersona(String dniPersona) { this.dniPersona = dniPersona; }
}
