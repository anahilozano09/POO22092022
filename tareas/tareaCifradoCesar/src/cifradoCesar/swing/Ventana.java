/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradoCesar.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;


/**
 *
 * @author anahi
 */
public class Ventana extends JFrame{
    
    private JTextField cuadro1;
    private JTextArea cuadro2;
    private JTextArea cuadro3;
    private JButton boton;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3; 

    public Ventana() throws HeadlessException {
        
        setTitle("Cifrado César");
        setSize(600,400);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        etiqueta1 = new JLabel("Núm. desplazamientos");
        
        cuadro1 = new JTextField( 4 );
        cuadro1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        
        etiqueta2 = new JLabel("Texto a codificar");
        
        cuadro2 = new JTextArea(10,15);
        cuadro2.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        
        etiqueta3 = new JLabel("Texto codificado");
        
        cuadro3 = new JTextArea(10, 15);
        cuadro3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
        
        boton = new JButton("Presionar");
        boton.setBackground(Color.MAGENTA);
        
        boton.setOpaque(true);
        boton.setToolTipText("Click para codificar el texto a cifrado César");
        
        
        this.getContentPane().add(etiqueta1);
        this.getContentPane().add(cuadro1);
        this.getContentPane().add(etiqueta2);
        this.getContentPane().add(cuadro2);
        this.getContentPane().add(boton);
        this.getContentPane().add(etiqueta3);
        this.getContentPane().add(cuadro3);
  
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String texto = cuadro2.getText();

                try {
                        char letra = texto.charAt(0);
                        String textoCodificado = Character.toString(letra);
                        cuadro3.setText(textoCodificado);

                } 
                catch (Exception ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
        
        
    }
    
    
    
    
}
