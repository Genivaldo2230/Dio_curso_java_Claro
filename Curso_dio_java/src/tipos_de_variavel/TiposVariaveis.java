public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        // Declaração de uma variável short com um valor pequeno.
        short numeroCurto = 1;  
        
        // Atribuição de um short para um int, que é permitido sem cast devido à promoção automática de tipo.
        int numeroNormal = numeroCurto; 
        
        // Tentativa de atribuir um int para um short causaria erro de compilação porque int é maior que short.
        // Para corrigir, é necessário o uso de cast explícito.
        short numeroCurto2 = (short) numeroNormal; // Usando cast explícito para converter int para short.
        
        // Exibindo os valores para verificação.
        System.out.println("Valor de numeroCurto: " + numeroCurto);
        System.out.println("Valor de numeroNormal: " + numeroNormal);
        System.out.println("Valor de numeroCurto2: " + numeroCurto2);
    }


}
