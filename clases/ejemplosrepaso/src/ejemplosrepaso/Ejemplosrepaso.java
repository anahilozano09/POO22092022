/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosrepaso;

import java.awt.Color;

/**
 *
 * @author anahi
 */
public class Ejemplosrepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CubreBocas cubre1 = new CubreBocas();
        cubre1.setColor(Color.blue);
        System.out.println(cubre1.getColor());
        System.out.println(cubre1);
        
        CubreBocas cubreDeAnahi = new CubreBocas(Color.black, "Tela", "KN-Home");
        System.out.println(cubreDeAnahi);
        
        cubreDeAnahi = new CubreBocas(Color.white, "Tela", "Kn95");
        System.out.println(cubreDeAnahi);
    }
    
}
