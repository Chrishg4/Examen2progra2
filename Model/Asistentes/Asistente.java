/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Asistentes;

/**
 *
 * @author Student
 */
public class Asistente {
    private String cedula;
    private String nombre;
    private String telefono;
    private String correo;

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Asistente(String cedula, String nombre, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Asistente() {
        this("","","","");
    }

    @Override
    public String toString() {
        return "Asistente{" + "cedula=" + cedula + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
}
