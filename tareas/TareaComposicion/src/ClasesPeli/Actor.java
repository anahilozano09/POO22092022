/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPeli;

/**
 *
 * @author anahi
 */
public class Actor {
    private String nombre;
    private int edad;

    public Actor() {
    }

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    public void interpretar(){
        System.out.println("El actor " + this.getNombre() + "está interpretando un personaje en su nueva película");
    }
}
