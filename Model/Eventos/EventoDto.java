/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Eventos;

import java.time.LocalDate;
import java.sql.Date;
/**
 *
 * @author Student
 */
public class EventoDto {
    private int id;
    private String nombre;
    private Date fecha;
    private String lugar;
    private static int CAPACIDAD=1000;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public static int getCAPACIDAD() {
        return CAPACIDAD;
    }


    public EventoDto(int id, String nombre, Date fecha, String lugar) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
    }
    
    
    
}
