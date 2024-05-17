import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        //Exibir as mensagens  para o nosso usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Digital! Para prosseguir, necessitaremos de algumas informações...");
        System.out.println("Por favor, insira seu nome: ");
        String nome = scan.next();
        System.out.println("Por favor, insira o número da conta: ");
        int numeroConta = scan.nextInt();
        System.out.println("Por favor, insira o número da Agência:");
        String agencia = scan.next();
        System.out.println("Por favor, insira o saldo: ");
        double saldo = scan.nextDouble();

        scan.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}
