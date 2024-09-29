public class Operadores {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // String concatenacao = "?";

        // concatenacao = 1+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;
        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1+"1";
        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;
        // System.out.println(concatenacao);


        // concatenacao = "1"+(1+1+1);
        // System.out.println(concatenacao);


        /*Aula de operadores e condiçães abaixo temos codigo representa isso usando Operador relacional com true ou false  fazendo verificação se sao verdadeira ou falsas  */

        String nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";
        System.out.println("Os nomes são iguais? "+ nomeUm.equals(nomeDois));

        // Podemos usar o operador == para verificar se os objetos referenciados são iguais, não só o conteúdo.        

        int numero1 = 1;
        int numero2 = 2;
        
        //usaremos a mesma variavel usando uma expreção dieferentes pra obter mesmo resultado
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a NumeroDois a condição é " + "[ "+ simNao +" ]");

        
        //Aqui a condição ele compara se n1 e n2 e uma condicional IF onde ele pecorre e compara pra devolver os valores da  condição false
        if(numero1 == numero2){
            
        }else{
            System.out.println("numeroUm é igual a numeroDois a condição (if) é "+ "{ "+ simNao +" }");
        }

        //Aqui a condição ele compara se n1 e Diferente que n2 tendo condição true
        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente do NumeroDois a condição é " + "{ "+ simNao +" }");

        //Aqui a condição ele compara se n1 e Maior que n2 tendo condição false
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que  numeroDois a condição é " + "{ "+ simNao +" }"); 

    }
    
}
