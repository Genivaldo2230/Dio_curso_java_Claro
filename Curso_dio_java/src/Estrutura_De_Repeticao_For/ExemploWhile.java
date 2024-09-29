package Estrutura_De_Repeticao_For;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main(String[] args) {

        Random rd = new Random();

        double mesada = 50.0;
        while (mesada > 0){
            double valorDorce = valorAleatorio();
            if(valorDorce > mesada)
                valorDorce = mesada;

            System.out.println("Doce do valor :" + valorDorce + "Adicionado no carrinho");
            mesada = mesada - valorDorce;
        }
        System.out.println("Mesada " + mesada);
        System.out.println("Joãozinho gastou toda a sus mesada em doce");

    }
    // Metodo de valore aleatorio
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
