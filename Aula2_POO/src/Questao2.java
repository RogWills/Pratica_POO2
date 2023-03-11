import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        int ano=0;
        String placa;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a Placa");
        placa = ler.next();
        System.out.println("Digite o ano");
        ano = ler.nextInt();
        if (ano<=2010)
            System.out.println("Carro Velho");
        else if (ano<=2021)
            System.out.println("Carro Semi-novo");
        else if(ano==2022)
            System.out.println("Carro novo");
        else
            System.out.println("Ano desconhecido");
       // for (int i=0; i<placa.length(); i++)
       // {
            //if (placa.charAt(i)=='a' || placa.charAt(i)=='e'|| placa.charAt(i)=='i'|| placa.charAt(i)=='o'|| placa.charAt(i)=='u'|| placa.charAt(i)=='A'|| placa.charAt(i)=='E'|| placa.charAt(i)=='I'|| placa.charAt(i)=='O'|| placa.charAt(i)=='U')
            placa = placa.replace('a','*');
            placa = placa.replace('e','*');
            placa = placa.replace('i','*');
            placa = placa.replace('o','*');
            placa = placa.replace('u','*');
            placa = placa.replace('A','*');
            placa = placa.replace('E','*');
            placa = placa.replace('I','*');
            placa = placa.replace('O','*');
            placa = placa.replace('U','*');
       // }
        System.out.println("Placa alterada: "+ placa);
    }
}
