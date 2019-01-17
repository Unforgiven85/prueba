package tarea;

import java.util.Scanner;

public class Absoluto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("Su valor absoluto es:");
            System.out.println(num);
        }else if(num<0){
            System.out.println("Su valor absoluto es:");
            System.out.println (-(num));
        }
    } 
}
    