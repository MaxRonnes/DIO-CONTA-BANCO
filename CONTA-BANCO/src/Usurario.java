import java.util.Scanner;

public class Usurario {

    public static void main(String[] args) {

        //Classe para que o usuario consiga entrqar com dados.
        Scanner usuarioEntrada = new Scanner(System.in);


        ContaTerminal contaCorrente = new ContaTerminal();
        
        System.out.println("Informe o numero da conta: ");
        int numeroConta = Scanner.nextInt();

        System.out.println("Informe a agencia da conta: ");
        String agencia = Scanner.next();

        System.out.println("Informe o nome do cliente: ");
        String nomeCliente = Scanner.next();

        System.out.println("Informe quanto quer depositar: ");
        Double saldo = Scanner.next();

        System.out.println("Olá" + nomeCliente + ", orbrigado por criar uma conta em nosso banco, sua agencia é," + agencia + " conta," + numeroConta + " e seu dado " + saldo + "já está disponivel para saque.");








        
    }


    
}
