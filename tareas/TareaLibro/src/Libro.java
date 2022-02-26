
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anahi
 */
public class Libro {
    private String titulo;
    private String editorial;
    private Color color;
    private String empastado;
    private String papel;

    public Libro() {
    }

    public Libro(String titulo, String editorial, Color color, String empastado, String papel) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.color = color;
        this.empastado = empastado;
        this.papel = papel;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEmpastado() {
        return empastado;
    }

    public void setEmpastado(String empastado) {
        this.empastado = empastado;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
    
    
}
