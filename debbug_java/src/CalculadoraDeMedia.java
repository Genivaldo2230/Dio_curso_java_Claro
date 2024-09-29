import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculoMediaDaTurma(alunos, sc);

        System.out.printf("Média da turma %.1f", media);
    }

    private static double calculoMediaDaTurma(String[] alunos, Scanner sc) {
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = sc.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }

}