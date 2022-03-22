/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import ClasesLib.Autor;
import ClasesLib.Editorial;

/**
 *
 * @author anahi
 */
public class Libro {
    private String titulo;
    private int year;
    private Autor escritor;
    private Editorial editorial;

    public Libro() {
        escritor = new Autor();
        editorial = new Editorial();
    }

    public Libro(String titulo, int year, Autor escritor, Editorial editorial) {
        this.titulo = titulo;
        this.year = year;
        this.escritor = escritor;
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", year=" + year + ", escritor=" + escritor + ", editorial=" + editorial + '}';
    }
    
    public void abierto(){
        System.out.println("El libro " + this.getTitulo() + "está abierto");
    }
}
