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
public class prestamo {
    private int id_socio;
    private int codigo_l;
    private String fecha_de_prestamo;
    private String fecha_de_entrega;
    private int codigo_p;
    private String fecha_prestamo_real;

    public prestamo(int id_socio, int codigo_l, String fecha_de_prestamo, String fecha_de_entrega, int codigo_p, String fecha_prestamo_real) {
        this.id_socio = id_socio;
        this.codigo_l = codigo_l;
        this.fecha_de_prestamo = fecha_de_prestamo;
        this.fecha_de_entrega = fecha_de_entrega;
        this.codigo_p = codigo_p;
        this.fecha_prestamo_real = fecha_prestamo_real;
    }

    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    public int getCodigo_l() {
        return codigo_l;
    }

    public void setCodigo_l(int codigo_l) {
        this.codigo_l = codigo_l;
    }

    public String getFecha_de_prestamo() {
        return fecha_de_prestamo;
    }

    public void setFecha_de_prestamo(String fecha_de_prestamo) {
        this.fecha_de_prestamo = fecha_de_prestamo;
    }

    public String getFecha_de_entrega() {
        return fecha_de_entrega;
    }

    public void setFecha_de_entrega(String fecha_de_entrega) {
        this.fecha_de_entrega = fecha_de_entrega;
    }

    public int getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(int codigo_p) {
        this.codigo_p = codigo_p;
    }

    public String getFecha_prestamo_real() {
        return fecha_prestamo_real;
    }

    public void setFecha_prestamo_real(String fecha_prestamo_real) {
        this.fecha_prestamo_real = fecha_prestamo_real;
    }
}
    