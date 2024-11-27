package com.mycomany.operaciones;

import java.util.Scanner;

public class Operaciones {

        public static double suma (double numero1, double numero2){
            return (numero1+numero2);
        }
        public static double resta (double numero1, double numero2){
            return (numero1-numero2);
        }
        public static double multiplicacion (double numero1, double numero2){
            return (numero1*numero2);
        }
        public static double division (double numero1, double numero2){
         if (numero2 != 0){
            return (numero1/numero2);
        }else{
                System.out.println("Syntax Error");
                return 0;
                }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Calculadora de Operaciones Basicas");
            System.out.println("Introduce el primer numero: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Introduce el segundo numero: ");
            double num2 = scanner.nextDouble();
            
            System.out.println("\nResultados; ");
            
            System.out.println("La suma es: "+suma(num1, num2));
            
            System.out.println("La resta es: "+resta(num1, num2));
            
            System.out.println("La multiplicacion es: "+multiplicacion(num1, num2));

            
            if (num2 !=0){
            System.out.println("La division es: "+division(num1, num2));
            }else{
            System.out.println("Syntax Error");
            }
        scanner.close();
        }
}