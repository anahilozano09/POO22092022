/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesLib;

/**
 *
 * @author anahi
 */
public class Editorial {
    private String nombre;
    private String pais;

    public Editorial() {
    }

    public Editorial(String nombre, String pais) {
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
        return "Editorial{" + "nombre=" + nombre + ", pais=" + pais + '}';
    }
    
    public void publicar(){
        System.out.println("La editorial " + this.getNombre() + "está publicando un libro");
    }
}
