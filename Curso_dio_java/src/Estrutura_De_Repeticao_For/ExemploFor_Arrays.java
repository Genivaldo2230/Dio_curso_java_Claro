package Estrutura_De_Repeticao_For;

public class ExemploFor_Arrays {
    public static void main(String[] args) {

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for(int x=0; x<alunos.length; x++ ){
            System.out.println("O aluno no indice x= " + x + " è " + alunos[x]);
        }
    }
}
