import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        Banco banco = new Banco();
       
        System.out.println("Por favor, digite seu nome completo");
        cliente.inserirCliente();

        System.out.println("Digite o número da Agência !");
        banco.inserirAgencia();

        System.out.println("Digite o número da Conta !");
        banco.inserirNumero();

        System.out.println("Digite o valor que deseja inserir");
        banco.inserirSaldo();

        System.out.println("Olá "+cliente.nomeCliente+", \n obrigado por criar uma conta em nosso banco, sua agência é "+banco.agencia+", conta "+ banco.numero +" \n e seu saldo R$ "+ banco.saldo +" já está disponível para saque");
        
        
    }
}
