import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    System.out.println("Bem vindo ao banco DIO!");
   System.out.println("------------------------");
    System.out.println("Vamos criar a sua conta?");
    
     Scanner scanner = new Scanner(System.in);
     
        System.out.print("Primeiro digite seu nome: ");
        String nome = scanner.nextLine();
        
        
        
        System.out.print("Bem vindo ao banco DIO " + nome);
        System.out.print(" Digite o número da sua conta : ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da sua agência :");
        String agencia = scanner.nextLine();

        String saldo = "251.36";

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque");







        
        
    }
}
