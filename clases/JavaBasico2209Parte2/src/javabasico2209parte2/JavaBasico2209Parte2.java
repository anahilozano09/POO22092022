/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209parte2;

import ico.fes.Aritmetica;
import ico.fes.Circulo;
import ico.fes.Cuadrado;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author anahi
 */
public class JavaBasico2209Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Excepciones*/
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Alma");
        nombres.add("Bartolo");
        nombres.add("Carlos");
        nombres.add("Diana");
        nombres.add("Ernesto");
        
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        System.out.println("---------------");
        Scanner teclado = new Scanner(System.in);
        
        int seleccion = 0;
        
        
        String elNombre = "";
        //try + ctrl + espacio + selecciobnar el segundo
        try {
            seleccion = teclado.nextInt(); //10
            elNombre = nombres.get(seleccion);
        }catch(InputMismatchException e){
            System.out.println("Debes teclear valores numericos");
        } catch(IndexOutOfBoundsException e){
            System.out.println("Error, debe ser entre 0 y 4");
            elNombre = nombres.get(0);
        }
        
        
        catch (Exception e) {
            System.out.println("Generica");
            elNombre = nombres.get(1);
            
        } finally {
            System.out.println(elNombre);
            //Limpieza
        }
        
        //System.out.println(nombres.get(seleccion));
        
        System.out.println("Continua el programa...");
        
        Aritmetica cal = new Aritmetica(2, 0);
        System.out.println(cal.getA() + "+" + cal.getB() + "=" + cal.sumar());
        
        
        try {
            System.out.println(cal.getA() + "/" + cal.getB() + "=" + cal.dividir());
        } catch (Exception e) {
            System.out.println("Error de aritmetica");
        }
        
        System.out.println("Fin del programa");
        
        Cuadrado cuad = new Cuadrado(5.0f);
        Circulo circ = new Circulo(4.5f);
        
        System.out.println("Área del cuadrado es: " + cuad.calcularArea());
        System.out.println("Área del círculo es: " + circ.calcularArea());
        
    }
    
}
