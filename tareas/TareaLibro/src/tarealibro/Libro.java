/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

/**
 *
 * @author anahi
 */
public class Libro {
    private String titulo;
    private String editorial;
    private String tamano;
    private String papel;
    private String pasta;

    public Libro() {
    }

    public Libro(String titulo, String editorial, String tamano, String papel, String pasta) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.tamano = tamano;
        this.papel = papel;
        this.pasta = pasta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
    }
    
    public void abierto(){
        System.out.println("El libro " + this.titulo + " esta abierto");
    }
    
    public void cerrado(){
        System.out.println("El libro " + this.titulo + " esta cerrado");
    }
}
