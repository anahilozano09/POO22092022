/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import ClasesLib.Autor;
import ClasesLib.Editorial;
import ClasesPeli.Actor;
import ClasesPeli.Director;
import ClasesPeli.Productora;
import Libro.Libro;
import Pelicula.Pelicula;

/**
 *
 * @author anahi
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib1 = new Libro("Yo antes de ti", 2012, 
                new Autor("Jojo Moyes", 52),
                new Editorial("Penguin Books", "Estados Unidos"));
        System.out.println(lib1);
        
        System.out.println("------------------------------------------");
        
        Pelicula peli1 = new Pelicula("Yo robot", 2004, 
                new Director("Alex Proyas", 59), 
                new Productora("20th Century Studios", "Estados Unidos"), 
                new Actor("Will Smith", 53));
        System.out.println(peli1);
        
    }
    
}
