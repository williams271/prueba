/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author usuario
 */
public class socio {
    private int rut;
    private String direccion;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int cantidad_de_libro;
    private boolean estado_socio;

    public socio(int rut, String direccion, String nombre, String apellido1, String apellido2, int cantidad_de_libro, boolean estado_socio) {
        this.rut = rut;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.cantidad_de_libro = cantidad_de_libro;
        this.estado_socio = estado_socio;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getCantidad_de_libro() {
        return cantidad_de_libro;
    }

    public void setCantidad_de_libro(int cantidad_de_libro) {
        this.cantidad_de_libro = cantidad_de_libro;
    }

    public boolean isEstado_socio() {
        return estado_socio;
    }

    public void setEstado_socio(boolean estado_socio) {
        this.estado_socio = estado_socio;
    }
}    
   
