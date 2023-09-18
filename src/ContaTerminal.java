import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int number = 0;
        String agency = "";
        String clientName = "";
        Double bal = 0.00;

        System.out.println("Qual o número da sua conta?");
        number = scan.nextInt();
        scan.nextLine();

        System.out.println("Qual a sua agência?");
        agency = scan.nextLine();
        
        System.out.println("Digite o seu nome por favor:");
        clientName = scan.nextLine();

        System.out.println("Qual o valor da sua conta?");
        bal = scan.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agency +", conta " + number + " e seu saldo de "+ bal + " já está disponível para saque.");
        
        
    }
}
