package contaBancaria.src;


import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try { //inicio tratamento de erro quando digitado letra em luga de numero
            Scanner sc = new Scanner(System.in);


            String nomeCliente;

            do {//Não e permitido fica em branco o campo usando trim()
                System.out.println("Digite seu Nome: ");
                nomeCliente = sc.next();
            } while (nomeCliente.trim().isEmpty());
            double numeroConta = 0;
            double agencia = 0;
            try {
                System.out.println("Digite sua Agencia: ");
                agencia = sc.nextDouble();

                System.out.println("Digite seu Numero da Conta: ");
                numeroConta = sc.nextInt();

                System.out.println("==========================================================================");

                //Verifica se o sequenciade numero qual  tipo de conta poupança ou corrente
                String tipoConta;
                if (numeroConta <= 2344) {
                    tipoConta = "Conta Corrente";
                } else if (numeroConta >= 2345) {
                    tipoConta = "Conta Poupanca";
                } else {
                    tipoConta = "Conta Desconhecida";
                }
                System.out.println("==========================================================================");

                System.out.println("Bem Vindo(a), " + tipoConta + "");
                System.out.println("==========================================================================");
                System.out.println("==========================================================================");
                System.out.println("Agencia nº : " + agencia + "\n" + "Numero da Conta Nº:" + numeroConta);
                System.out.println("==========================================================================");
                System.out.println("Tipo de Conta: " + tipoConta);
                System.out.println("==========================================================================");
                double deposito = 5000.00;
                double saldo = deposito;


                // Obtém um formatador de números para a localidade brasileira
                NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

                // Formata o valor e imprime na tela
                String valorFormatado = formatador.format(deposito);
                System.out.println("Seu saldo em real: " + valorFormatado);

                System.out.println("==========================================================================");
                System.out.print("Digite o valor do saque: \n R$: ");
                double saque = 0;
                try {
                    saque = sc.nextDouble();

                    System.out.println("==========================================================================");

                    /**
                     * Verifica se o saque é valido e se o saldo é suficiente
                     * Diminui o numero da conta do saldo
                     * Adiciona o numero da conta ao saldo
                     */

                    if (saldo >= saque) {
                        // Se o saldo for maior ou igual ao valor do saque, a operação pode ser realizada
                        saldo -= saque; // Subtrai o valor do saque do saldo
                        System.out.println("Saque realizado com sucesso!\nSaldo R$: " + saldo + " Real");
                    } else {
                        // Se o saldo for menor que o valor do saque, a operação não pode ser realizada
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }


                    System.out.println("==========================================================================");

                    // Adiciona o valor do depósito ao saldo
                    saldo = saldo + deposito;
                    // Subtrai o valor do saque do saldo
                    saldo = saldo - saque;
                    System.out.println("==========================================================================");
                    System.out.println("Obrigado, volte sempre!");
                    System.out.println("==========================================================================");
                    System.out.println("==========================================================================");


                } catch (InputMismatchException e) {
                    System.out.println("Digite so numeros !!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite campos com número !!!");
            }
        } catch (NumberFormatException e) {
            System.out.println("DIGITE SOMENTE NÚMEROS NO CAMPO AGÉNCIA e CONTA !!!");
        }
    }
}
