package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double delta, x1, x2;

        System.out.println("Equacao do Segundo Grau \n----------------");
        System.out.print("Informe o valo de A: ");
        a = sc.nextInt();
        System.out.print("Informe o valor de B: ");
        b = sc.nextInt();

        System.out.print("Informe o valor de C: ");
        c = sc.nextInt();

        System.out.println("------------");
        System.out.println("Sua equacao eh: " + a + "x2 +" + b + "x +" + c + " = 0");
        delta = (b*b) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Para Delta negativo, não existem raizes reais");
        } else if (delta == 0) {
            x1 = (-b + Math.abs(delta)) / (2 * a);
            System.out.println("Para Delta zero, temos duas raizes iguais a " + x1);
        } else {
            System.out.println("-------------------");
            System.out.print("Para Delta positivo. Raizes Diferentes: \n");
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        }
    }
}
