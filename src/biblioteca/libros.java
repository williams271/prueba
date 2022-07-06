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
public class libros {
    private int codigo_l;
    private String titulo;
    private String autor;
    private String tematica;
    private String estado_l;
    private int stock;
    private int n_estante;

    public libros(int codigo_l, String titulo, String autor, String tematica, String estado_l, int stock, int n_estante) {
        this.codigo_l = codigo_l;
        this.titulo = titulo;
        this.autor = autor;
        this.tematica = tematica;
        this.estado_l = estado_l;
        this.stock = stock;
        this.n_estante = n_estante;
    }

    public int getCodigo_l() {
        return codigo_l;
    }

    public void setCodigo_l(int codigo_l) {
        this.codigo_l = codigo_l;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getEstado_l() {
        return estado_l;
    }

    public void setEstado_l(String estado_l) {
        this.estado_l = estado_l;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getN_estante() {
        return n_estante;
    }

    public void setN_estante(int n_estante) {
        this.n_estante = n_estante;
    }
}  


    