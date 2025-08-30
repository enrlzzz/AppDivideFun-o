package Main;

import java.util.Scanner;

public class AppDivideFuncao {
    public static void main(String[] args) {
        
        div(0, 0);
        
    }
    
    public static void div(double num1, double num2) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ola! Seja bem vindo(a) ao AppDivideFunção.");
        System.out.println("Um app que divide dois números, utilizando duas funções! (métodos)");
        
        System.out.println("Por favor digite o primeiro número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Agora digite o segundo número: ");
        num2 = scanner.nextInt();
        
        double div = num1 / num2;
        
        System.out.println("A soma dos dois números é: " + div);
        
        
    }
    
}
