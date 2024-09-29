package Estrutura_De_Repeticao_For;

public class ExemploFor_Arrays_For_Each {
    public static void main(String[] args) {

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};// formação de um Array

        for( String aluno : alunos ){//usamos metodo for-each para pecorrer o Array
            System.out.println("Nome do aluno è " + aluno);
        }
    }
}
