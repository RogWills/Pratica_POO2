import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome,agencia,numConta;
        double valor;

        System.out.println("Digite o nome:");
        nome = ler.nextLine();
        System.out.println("Digite a Agência:");
        agencia = ler.nextLine();
        System.out.println("Digite o numero da conta:");
        numConta = ler.nextLine();
        /* Imprimindo tudo em somente uma linha, criando uma classe*/
        ContaBancaria cli1 = new ContaBancaria(nome,agencia,numConta);

        System.out.println("Digite o valor para depósito:");
        valor = ler.nextDouble();
        cli1.depositar(valor);

        System.out.println("Saldo atual:" + cli1.mostraSaldo());

        System.out.println("Digite o valor para Sacar:");
        valor = ler.nextDouble();
        cli1.sacar(valor);

        System.out.println("Saldo atual:" + cli1.mostraSaldo());



        /* ContaBancaria cli1;
        cli1 = new ContaBancaria("Isabela","123","12454");
        cli1.depositar(1000);
        cli1.sacar(500);
        System.out.println("Saldo: " + cli1.mostraSaldo()); */
    }

}
