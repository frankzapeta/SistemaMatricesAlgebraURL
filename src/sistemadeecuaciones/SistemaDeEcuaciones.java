/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeecuaciones;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.util.Scanner;

/**
 *
 * @author EST1583708
 */
public class SistemaDeEcuaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("hola mundo");
        
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println("yo ingrese" + entradaTeclado);
        // TODO code application logic here
    }
    
}
