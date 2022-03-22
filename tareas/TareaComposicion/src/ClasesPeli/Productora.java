/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPeli;

/**
 *
 * @author anahi
 */
public class Productora {
    private String nombre;
    private String pais;

    public Productora() {
    }

    public Productora(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    public void producir(){
        System.out.println("La productora " + this.getNombre() + "está produciendo una nueva película");
    }
}
