package com.mycompany.calculator;

import java.util.Scanner;  // Importar Scanner

public class Calculator {

    public Calculator(){
        
    }

    public int add(int a, int b){
      return a + b;
    }
    
    public int substract(int a, int b){
      return a - b;
    }
    
    public int multiply(int a, int b){
      return a * b;
    }
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Calculator myCalculator = new Calculator();
            
            System.out.print("Ingresa el primer número: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingresa el segundo número: ");
            int num2 = scanner.nextInt();
            
            System.out.println("Elige la operación a realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            
            int opcion = scanner.nextInt();
            double resultado = 0;
            
            switch(opcion) {
                case 1:
                    resultado = myCalculator.add(num1, num2);
                    break;
                case 2:
                    resultado = myCalculator.substract(num1, num2);
                    break;
                case 3:
                    resultado = myCalculator.multiply(num1, num2);
                    break;
                
                default:
                    System.out.println("Opción inválida.");
                    scanner.close();
                    return;
            }
            
            System.out.println("El resultado es: " + resultado);
        }
    }
}
