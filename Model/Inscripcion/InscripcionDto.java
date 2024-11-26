/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Inscripcion;

import Model.Asistentes.Asistente;
import Model.Eventos.Evento;
import java.sql.Date;

/**
 *
 * @author Student
 */
public class InscripcionDto {

    private int id;
    private Evento evento;
    private Asistente asistente;
    private Date fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public InscripcionDto(int id, Evento evento, Asistente asistente, Date fecha, boolean asistencia) {
        this.id = id;
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

    public InscripcionDto(Evento evento, Asistente asistente, Date fecha, boolean asistencia) {
        this.evento = evento;
        this.asistente = asistente;
        this.fecha = fecha;
        this.asistencia = asistencia;
    }

}
