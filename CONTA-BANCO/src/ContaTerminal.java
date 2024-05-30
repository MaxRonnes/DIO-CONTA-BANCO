
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //classe para que o usuário possa entrar com dados
        Scanner entradaUsuario = new Scanner(System.in).useLocale(Locale.US);

        //logo abaixo entradas com informações pessoais do usuário.
        System.out.println("Informe seu nome: ");
        String nomeCliente = entradaUsuario.nextLine();

        System.out.println("Informe sua agencia: ");
        String agencia = entradaUsuario.nextLine();
        
        System.out.println("Por favor, informe o numero da sua conta: ");
        int numeroConta = entradaUsuario.nextInt();

        System.out.println("Informe quanto quer depositar: ");
        double saldo = entradaUsuario.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
         + agencia + ", conta " + numeroConta + " e o seu saldo " + saldo + " já esta disponível para saque!");

    }
    
}
