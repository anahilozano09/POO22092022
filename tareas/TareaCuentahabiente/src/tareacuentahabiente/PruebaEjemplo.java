/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author anahi
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuentahabiente [] lista = new Cuentahabiente[5];
        lista[0] = new Cuentahabiente("38298306", "Fernando", 150000f);
        lista [1] = new Cuentahabiente("34928125", "María", 450000f);
        lista[2] = new Cuentahabiente("23927432", "Sandra", 345000f);
        lista[3] = new Cuentahabiente("48957301", "Fernando", 296790f);
        lista[4] = new Cuentahabiente("78392974", "Gerardo", 167000f);
        
        System.out.println("-----------Antes del retiro-----------");
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente);
            System.out.println("---------------------------");
        }
        
        System.out.println("-------------Después del retiro--------------");
        
        lista[0].retirarDinero(56000f);
        lista[1].retirarDinero(90000f);
        lista[2].retirarDinero(340000f);
        lista[3].retirarDinero(87623f);
        lista[4].retirarDinero(98760f);
        
        
        for (Cuentahabiente cuentahabiente : lista) {
            System.out.println(cuentahabiente);
            System.out.println(cuentahabiente.evaluarNivelCliente());
            System.out.println("---------------------------");
        }
        
    }
    
}
