package Main;

import java.util.Scanner;

public class AppDivideFuncao {
    public static void main(String[] args) {
        
        div(0, 0);
        
    }
    
    public static void div(double num1, double num2) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ola! Seja bem vindo(a) ao AppDivideFun��o.");
        System.out.println("Um app que divide dois n�meros, utilizando duas fun��es! (m�todos)");
        
        System.out.println("Por favor digite o primeiro n�mero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Agora digite o segundo n�mero: ");
        num2 = scanner.nextInt();
        
        double div = num1 / num2;
        
        System.out.println("A soma dos dois n�meros �: " + div);
        
        
    }
    
}
