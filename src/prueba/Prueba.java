/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author G Pro
 */
public class Prueba {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecla=new Scanner(System.in);
        int p;
        System.out.println("**UNIVERSIDAD TÉCNICA DE AMBATO");
        System.out.println("BIENVENIDOS ");
        System.out.println("Integrantes :");
        System.out.println("Dennis Barba");
        System.out.println("Iveth Barros");
        System.out.println("Marilyn Barros");
        System.out.println("MonserrathFrutos");
        System.out.println("Cristina Nuñez");

        System.out.println(" Operaciones Básicas ");
        System.out.println("1- SUMA");
         System.out.println("2- RESTA");
          System.out.println("3- MULTIPLICACIÓN");
           System.out.println("4-DIVISIÓN");
            System.out.println("5- RAIZ CUADRADA");
            
            System.out.println("Escoja una Opción :");
            p=tecla.nextInt();
            
            if(p==0 || p>5){
                System.out.println("No existe dicha opciñon");
            }else if(p==1){
                Suma1  suma= new Suma1();
                suma.operacion();
            }else if(p==2){
               
            }else if(p==3){
                Multiplicacion mul=new Multiplicacion();
                mul.multiplicar();
            }else if(p==4){
               
                
            }
            
            
            
            
        
    }
}
