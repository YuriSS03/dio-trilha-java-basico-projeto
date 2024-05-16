import java.util.Scanner;

public class Banco {
    String agencia;
    int numero;
    double saldo;

    public void  inserirAgencia (){
        Scanner scan = new Scanner(System.in);
        agencia = scan.next();
    }

    public void inserirNumero (){
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
    }

    public void inserirSaldo (){
        Scanner scan = new Scanner(System.in);
        saldo = scan.nextDouble();
    }
    
}
