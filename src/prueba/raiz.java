/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class raiz {
    public void rc(){
        System.out.println("*** Raiz Cuadrada ***");
        System.out.print("Numero ==> ");
        int x;
        Scanner t = new Scanner(System.in);
        x = Integer.valueOf(t.nextLine());
        int r;
        r=(int) Math.sqrt(x);
        System.out.println("Resultado ==> "+r);
    }
}
