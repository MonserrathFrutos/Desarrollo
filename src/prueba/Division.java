
package prueba;

import java.util.Scanner;


public class Division {
  public void div(){
      int num1, num2, res;
      Scanner tecla= new Scanner(System.in);
      System.out.println("DIVISION DE DOS NUMEROS");
        System.out.println("NUMERO 1 :");
        num1= tecla.nextInt();
          System.out.println("numero 2 :");
          num2=tecla.nextInt();
          res=num1/num2;
            System.out.println("El resultado es: "+res);
      
  }  
}
