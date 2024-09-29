package candidato;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // Exemplo de chamadas comentadas para a função analisarCandidato,
        // que analisaria o candidato com base no salário pretendido.
        // analisarCandidato(1900.0);
        // analisarCandidato(2200.0);
        // analisarCandidato(2000.0);
        selecaoCandidatos();
    }

    // Função que simula a seleção de candidatos com base no salário pretendido
    static void selecaoCandidatos() {
        // Array que armazena a lista de candidatos
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO",
                "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;  // Contador de candidatos selecionados
        int candidatosAtual = 0;         // Índice do candidato atual na lista
        double salarioBase = 2000.00;    // Salário base oferecido pela empresa

        // Loop que continua até que 5 candidatos sejam selecionados
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual]; // Pega o nome do candidato atual
            double salarioPretendido = valorPretendido();   // Gera o salário pretendido aleatoriamente

            // Exibe o salário pretendido pelo candidato
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            // Verifica se o salário pretendido é menor ou igual ao salário base
            if (salarioBase >= salarioPretendido) {
                // Candidato é selecionado se o salário for compatível
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++; // Incrementa o contador de selecionados
            }

            candidatosAtual++; // Passa para o próximo candidato
        }
    }

    // Função que gera aleatoriamente o salário pretendido por um candidato
    static double valorPretendido() {
        // Gera um valor aleatório entre 1800 e 2200
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Função que analisa se um candidato deve ser chamado com base no salário pretendido
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0; // Salário base oferecido pela empresa

        // Verifica se o salário pretendido pelo candidato é menor que o salário base
        if (salarioBase > salarioPretendido) {
            // Se o salário pretendido for menor, liga para o candidato
            System.out.println("LIGAR PARA O CANDIDATO");

            // Verifica se o salário pretendido é igual ao salário base
        } else if (salarioBase == salarioPretendido) {
            // Se o salário for igual, faz uma ligação com uma contraproposta
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");

        } else {
            // Se o salário pretendido for maior, o candidato aguarda os outros candidatos
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
