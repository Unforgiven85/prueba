package tarea;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){       
        Scanner sc = new Scanner(System.in);
    
        int x;
        int p=1;
        int potencia;
    
        while(p>0){
            System.out.println("Introduzca el valor de x");
            x=sc.nextInt();
            System.out.println("Introduzca el valor del exponente");
            p=sc.nextInt();
            potencia=x*x;
            p--; 
          
            while(p!=1){
                potencia *= x;
                p--;
            }
            System.out.println("El valor de la potencia solicitada es:");
            System.out.println(potencia);
        }
    }
}
