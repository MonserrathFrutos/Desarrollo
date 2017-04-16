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
public class Multiplicacion {
    public void multiplicar(){
        int n1,n2,m;
        System.out.println("****MULTIPLICACION****");
        Scanner tecla=new Scanner(System.in);
        System.out.println("NUMERO 1:   ");
        n1=tecla.nextInt();
        System.out.println("NUMERO 2:   ");
        n2=tecla.nextInt();
        m=n1*n2;
        System.out.println("Resultado : " +m);
        
    }
}
