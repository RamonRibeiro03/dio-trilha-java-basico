import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //IMPORTANDO O SCANNER PARA RECEBER ENTRADA DE DADOS
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //EXIBIR AS MENSAGENS PARA O USUÁRIO
        System.out.println("SISTEMA BANCÁRIO");
        System.out.println();

        System.out.print("Digite o número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o número da agência com o dígito seguido com o (-): ");
        String agencia = sc.next();
        System.out.print("Nome Cliente: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.println();


        //EXIBIR A MENSAGEM DA CONTA CRIADA
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco sua agência " +
                "é %s, conta %d e seu saldo %.2f já está disponível",nome,agencia,numero,saldo);



        sc.close();
    }
}
