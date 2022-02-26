/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

/**
 *
 * @author anahi
 */
public class TareaLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido");
        
        Libro lib1 = new Libro();
        lib1.setTitulo("Pedro Páramo");
        System.out.println("Título: " + lib1.getTitulo());
        lib1.setEditorial("Porrúa");
        System.out.println("Editorial: " + lib1.getEditorial());
        lib1.setTamano("A5");
        System.out.println("Tamaño: " + lib1.getTamano());
        lib1.setPasta("Gruesa");
        System.out.println("Pasta: " + lib1.getPasta());
        lib1.setPapel("Ahuesado");
        System.out.println("Papel: " + lib1.getPapel());
        
        Libro lib2 = new Libro();
        lib2.setTitulo("Alicia en el país de las maravillas");
        System.out.println("Título: " + lib2.getTitulo());
        lib2.setEditorial("Diana");
        System.out.println("Editorial: " + lib2.getEditorial());
        lib2.setTamano("Carta");
        System.out.println("Tamaño: " + lib2.getTamano());
        lib2.setPasta("Blanda");
        System.out.println("Pasta: " + lib2.getPasta());
        lib2.setPapel("Reciclado");
        System.out.println("Papel: " + lib2.getPapel());
        
        Libro lib3 = new Libro();
        lib3.setTitulo("Fundamentos de física");
        System.out.println("Título: " + lib3.getTitulo());
        lib3.setEditorial("Pearson");
        System.out.println("Editorial: " + lib3.getEditorial());
        lib3.setTamano("A4");
        System.out.println("Tamaño: " + lib3.getTamano());
        lib3.setPasta("Gruesa");
        System.out.println("Pasta: " + lib3.getPasta());
        lib3.setPapel("Satinado");
        System.out.println("Papel: " + lib3.getPapel());
    }
    
}
