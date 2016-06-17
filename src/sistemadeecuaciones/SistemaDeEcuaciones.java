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
        
        //System.out.print("hola mundo");
        
        /*String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        System.out.println("yo ingrese" + entradaTeclado);*/
        // TODO code application logic here
        //Algoritmo para matrices de 2x3, si ningún elemento es 0:
        //float [][] Matriz= new float[2][3];
        
        Scanner IngresarDatos = new Scanner (System.in);
        
        /*for (int i = 0; i <= 1; i++) 
        {
            System.out.println("Ecuación " +(i + 1));
            for (int j = 0; j <= 2; j++) 
            {
                if (j < 2)
                    System.out.println("Ingrese el coeficiente de x"+(j+1) + ":");
                else
                    System.out.println("Ingrese el valor del término independiente");
               
                Matriz[i][j] = IngresarDatos.nextFloat();
            }
        }
        
        Matriz[0][1] = Matriz[0][1]/Matriz[0][0];
        Matriz[0][2] = Matriz[0][2]/Matriz[0][0];
	Matriz[0][0] = Matriz[0][0]/Matriz[0][0];

	//---------------------------------------------------------------
	Matriz[1][1] = Matriz[1][1]/Matriz[1][0];
	Matriz[1][2] = Matriz[1][2]/Matriz[1][0];
	Matriz[1][0] = Matriz[1][0]/Matriz[1][0];

	//---------------------------------------------------------------
	Matriz[1][0] = Matriz[0][0] - Matriz[1][0];
	Matriz[1][1] = Matriz[0][1] - Matriz[1][1];
	Matriz[1][2] = Matriz[0][2] - Matriz[1][2];
	//---------------------------------------------------------------
	Matriz[1][2] = Matriz[1][2]/Matriz[1][1];
	Matriz[0][2] = Matriz[0][2]-(Matriz[1][2]*Matriz[0][1])/Matriz[0][0];
	float x=Matriz[0][2];
	float y=Matriz[1][2];
        if (x ==0 && y == 0)
        {
            System.out.println("El resultado de x es " + 0);
            System.out.println("El resultado de y es " + 0);
            
        }
        else if (y == 0)
        {
            System.out.println("El resultado de y es " + 0);
            System.out.println("El resultado de x es " + x);
        }
        else if (x == 0)
        {
            System.out.println("El resultado de x es " + 0);
            System.out.println("El resultado de y es " + y);
        }
        else
        {
            System.out.println("El resultado de x es " + x);
            System.out.println("El resultado de y es " + y);    
        }
        */
        //Algoritmo para matrices de 3x4, si ningún elemento es 0:
        
        float [][] Matriz2= new float[3][4];
        
        Scanner IngresarDatos2 = new Scanner (System.in);
        
        for (int i = 0; i <= 2; i++) 
        {
            System.out.println("Ecuación " +(i + 1));
            for (int j = 0; j <= 3; j++) 
            {
                if (j < 3)
                    System.out.println("Ingrese el coeficiente de x"+(j+1) + ":");
                else
                    System.out.println("Ingrese el valor del término independiente");
               
                Matriz2[i][j] = IngresarDatos.nextFloat();
            }
        }
        
        Matriz2[0][1] = Matriz2[0][1]/Matriz2[0][0];
        Matriz2[0][2] = Matriz2[0][2]/Matriz2[0][0];
        Matriz2[0][3] = Matriz2[0][3]/Matriz2[0][0];
        Matriz2[0][0] = Matriz2[0][0]/Matriz2[0][0];
        //--------------------------------------------------------
        Matriz2[1][1] = Matriz2[1][1]/Matriz2[1][0];
        Matriz2[1][2] = Matriz2[1][2]/Matriz2[1][0];
        Matriz2[1][3] = Matriz2[1][3]/Matriz2[1][0];
        Matriz2[1][0] = Matriz2[1][0]/Matriz2[1][0];
        //--------------------------------------------------------
        Matriz2[2][1] = Matriz2[2][1]/Matriz2[2][0];
        Matriz2[2][2] = Matriz2[2][2]/Matriz2[2][0];
        Matriz2[2][3] = Matriz2[2][3]/Matriz2[2][0];
        Matriz2[2][0] = Matriz2[2][0]/Matriz2[2][0];
        //--------------------------------------------------------
        Matriz2[1][0] = Matriz2[0][0]-Matriz2[1][0];
        Matriz2[1][1] = Matriz2[0][1]-Matriz2[1][1];
        Matriz2[1][2] = Matriz2[0][2]-Matriz2[1][2];
        Matriz2[1][3] = Matriz2[0][3]-Matriz2[1][3];
        //--------------------------------------------------------
        Matriz2[2][0] = Matriz2[0][0]-Matriz2[2][0];
        Matriz2[2][1] = Matriz2[0][1]-Matriz2[2][1];
        Matriz2[2][2] = Matriz2[0][2]-Matriz2[2][2];
        Matriz2[2][3] = Matriz2[0][3]-Matriz2[2][3];
        //--------------------------------------------------------
        Matriz2[1][3] = Matriz2[1][3]/Matriz2[1][1];
        Matriz2[1][2] = Matriz2[1][2]/Matriz2[1][1];
        Matriz2[1][1] = Matriz2[1][1]/Matriz2[1][1];
        //--------------------------------------------------------
        Matriz2[2][3] = Matriz2[2][3]/Matriz2[2][1];
        Matriz2[2][2] = Matriz2[2][2]/Matriz2[2][1];
        Matriz2[2][1] = Matriz2[2][1]/Matriz2[2][1];
        //--------------------------------------------------------
        Matriz2[2][1] = Matriz2[1][1]-Matriz2[2][1];
        Matriz2[2][2] = Matriz2[1][2]-Matriz2[2][2];
        Matriz2[2][3] = Matriz2[1][3]-Matriz2[2][3];
        //--------------------------------------------------------
        Matriz2[2][3] = Matriz2[2][3]/Matriz2[2][2];
        Matriz2[1][3] = (Matriz2[1][3]-(Matriz2[1][2]*Matriz2[2][3]))/Matriz2[1][1];
        Matriz2[0][3] = (Matriz2[0][3]-(Matriz2[0][2]*Matriz2[2][3])-(Matriz2[0][1]*Matriz2[1][3]))/Matriz2[0][0];
        
        float a=Matriz2[0][3];
	float b=Matriz2[1][3];
        float c=Matriz2[2][3];
        if ((a ==0) && (b == 0) && (c == 0))
        {
            System.out.println("El resultado de a es " + 0);
            System.out.println("El resultado de b es " + 0);
            System.out.println("El resultado de c es " + 0);
            
        }
        else if (a == 0 && b == 0)
        {
            System.out.println("El resultado de a es " + 0);
            System.out.println("El resultado de b es " + 0);
            System.out.println("El resultado de c es " + c);
        }
        else if (b == 0 && c == 0)
        {
            System.out.println("El resultado de b es " + 0);
            System.out.println("El resultado de c es " + 0);
            System.out.println("El resultado de a es " + a);
        }
        else if (a == 0 && c == 0)
        {
            System.out.println("El resultado de a es " + 0);
            System.out.println("El resultado de c es " + 0);
            System.out.println("El resultado de b es " + b);
        }
        else if (b == 0)
        {
            System.out.println("El resultado de b es " + 0);
            System.out.println("El resultado de a es " + a);
            System.out.println("El resultado de c es " + c);
        }
        else if (a == 0)
        {
            System.out.println("El resultado de a es " + 0);
            System.out.println("El resultado de b es " + b);
            System.out.println("El resultado de c es " + c);
        }
        else
        {
            System.out.println("El resultado de a es " + a);
            System.out.println("El resultado de b es " + b);
            System.out.println("El resultado de c es " + c);
        }
    }
    
        
    
}
                        