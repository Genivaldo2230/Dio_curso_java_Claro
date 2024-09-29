package Condicionais_ecadeadas;

public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 6;

        if (nota >= 7)
        System.out.println("Aprovado!");

        else if (nota >= 5 && nota < 7)
            System.out.println(" Esta em Recuperação");
        else

            System.out.println("Reprovado!");

    }
}