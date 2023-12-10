/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cleancode1ev;

/**
 *
 * @author 
 */

public class CleanCode1Ev {

    /**
     * @param args the command line arguments
     */
    public static final int MAX = 1000;
    public static void calcularFibonacci (int num1, int num2){
        int contador = 0;
        int num3;
        System.out.print(num1 + ",");
        System.out.print(num2 + ",");
        while (true){
            if (contador == 0){
                num1 = num1 + num2;
                num3 = num1 + num2;
                contador = 1;
            }
            else {
                num2 = num1 + num2;
                num3 = num1 + num2;
                contador = 0;
            }
            if (num3 <= MAX)
                System.out.print(num3 + ",");
            else
                break;
        }
    }
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        
        calcularFibonacci(num1, num2);
        
        
        /* Codigo mal hecho
        int x = 1;
        int y = 1;
        
        for (;;){
            System.out.print(y + ", ");
            x = x + y;
            y = x - y;
            if (y >= 1000)
                break;
        }*/
    }
    
}
