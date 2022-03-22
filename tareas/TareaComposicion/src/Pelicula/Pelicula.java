/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

import ClasesPeli.Actor;
import ClasesPeli.Director;
import ClasesPeli.Productora;

/**
 *
 * @author anahi
 */
public class Pelicula {
    private String nombre;
    private int year;
    private Director director;
    private Productora productora;
    private Actor actor;

    public Pelicula() {
        director = new Director();
        productora = new Productora();
        actor = new Actor();
    }

    public Pelicula(String nombre, int year, Director director, Productora productora, Actor actor) {
        this.nombre = nombre;
        this.year = year;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", year=" + year + ", director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
    
    public void proyectar(){
        System.out.println("La película " + this.getNombre() + "se está proyectando en estos momentos");
    }
}
