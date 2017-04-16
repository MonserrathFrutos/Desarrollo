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
public class Suma1 {
    public void operacion(){
        int n1,n2,r;
        System.out.println("****SUMA DE DOS NÚMEROS****");
        Scanner tecla=new Scanner(System.in);
        System.out.println("Ingrese el valor 1 : ");
        n1=tecla.nextInt();
        System.out.println("Ingrese el valor 2 : ");
        n2=tecla.nextInt();
        r=n1+n2;
        System.out.println("Resultado : " +r);
        
    }
}
