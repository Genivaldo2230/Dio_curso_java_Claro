package CondicaoTernaria;

public class ResultadoEscolar_ternario_fase2 {
    public static void main(String[] args) {

        int nota = 4;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação " : "Reprovado";
        //expressao ternária
        System.out.println(resultado);


    }
}
