package Estrutura_De_Repeticao_For;

import java.util.Random;

public class ExemploDoWhile {

    // Método principal, que será executado quando o programa for iniciado
    public static void main(String[] args) {
        // Exibe a mensagem inicial informando que está discando
        System.out.println("Discando...");

        // Estrutura de repetição do-while: Executa o bloco de código ao menos uma vez
        do {
            // Exibe a mensagem informando que o telefone está tocando
            System.out.println("Telefone tocando");

            // Continua repetindo enquanto o método 'tocando()' retornar true
        } while (tocando());

        // Exibe a mensagem "Alô" quando alguém finalmente atender
        System.out.println("Alô !!! ");
    }

    // Método auxiliar que simula se alguém atendeu o telefone ou não
    private static boolean tocando() {
        // Gera um número aleatório entre 0 e 2, e verifica se o resultado é igual a 1 (33% de chance)
        boolean atendeu = new Random().nextInt(3) == 1;

        // Exibe o resultado da verificação, se alguém atendeu ou não
        System.out.println("Atendeu? " + atendeu);

        // Retorna o inverso da variável 'atendeu': se atendeu for true, retorna false (telefone parou de tocar);
        // se atendeu for false, retorna true (continua tocando)
        return !atendeu;
    }
}
