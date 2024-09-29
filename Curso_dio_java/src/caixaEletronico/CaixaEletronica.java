package caixaEletronico;

public class CaixaEletronica {

    public static void main(String[] args) {
        // Adicione os métodos necessários para o caixa eletrônico funcionar
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo) {

            saldo = saldo - valorSolicitado;
            System.out.println("Saldo em conta " + "R$ " + saldo +" reais");

        } else {

            System.out.println("Saldo insuficiente");

        }
    }
}
