/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author anahi
 */
public class Foco {
    private String color;
    private String tipo;
    private int tamano;

    public Foco() {
    }

    public Foco(String color, String tipo, int tamano) {
        this.color = color;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Foco{");
        sb.append("color=").append(color);
        sb.append(", tipo=").append(tipo);
        sb.append(", tamano=").append(tamano);
        sb.append('}');
        return sb.toString();
    }
    
    
}
