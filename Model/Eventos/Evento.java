/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Evento {
    private int id;
    private String nombre;
    private LocalDate fecha;
    private String lugar;
    private int CAPACIDAD=1000;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public  int getCAPACIDAD() {
        return CAPACIDAD;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Evento(int id, String nombre, LocalDate fecha, String lugar, int CAPACIDAD) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.CAPACIDAD=1000;
    }
    
    
    
}
