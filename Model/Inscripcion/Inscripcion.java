/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Model.Asistentes.Asistente;
import Model.Eventos.Evento;
import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Inscripcion {
   private int id;
   private Evento evento;
   private Asistente asistente;
   private LocalDate fecha;
   private boolean asistencia;

    public int getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Inscripcion(int id, Evento evento, Asistente asistente, LocalDate fecha, boolean asistencia) {
        this.id = id;
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

    public Inscripcion(Evento evento, Asistente asistente, LocalDate fecha, boolean asistencia) {
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }
   
   
   
}
