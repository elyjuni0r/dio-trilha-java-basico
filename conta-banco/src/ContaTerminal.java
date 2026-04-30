import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
        
        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();
  
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
 
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = sc.nextInt();
 
        System.out.print("Insira qual valor deseja depositar: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Seu saldo é: " + saldo + " e já está disponível para saque");
         }
    }    
}