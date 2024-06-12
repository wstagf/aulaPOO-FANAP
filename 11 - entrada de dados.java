import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um inteiro do usuário
        
        System.out.println("Sua idade é: " + idade);
        scanner.close(); // Fecha o scanner
    }
}