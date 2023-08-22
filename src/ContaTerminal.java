import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int nConta;
        String agencia,nomeCLiente;
        Double saldoConta;

        System.out.println("Digite o numero da conta");
          nConta= scanner.nextInt();
          
        scanner.nextLine();

        System.out.println("Digite a agencia da conta");
            agencia = scanner.nextLine();
            
        System.out.println("Digite o nome do Cliente Da Conta");
            nomeCLiente = scanner.nextLine();

        System.out.println("Digite o saldo da Conta");
            saldoConta = scanner.nextDouble();

        System.out.println("Olá "+nomeCLiente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+nConta+" e seu saldo "+saldoConta+" já está disponivel para saque");    
    }
}
