/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Resta {
      public void Resta(){
        int n1,n2,r;
        System.out.println("****RESTA DE DOS NÚMEROS****");
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingrese el numero 1 : ");
        n1=tecla.nextInt();
        System.out.println("Ingrese el numero 2 : ");
        n2=tecla.nextInt();
        r=n1-n2;
        System.out.println("Resultado : " +r);
        
    }
}
