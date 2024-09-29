package HieraraquiaDasExcecoes;

public class FormatadoCeprExemplo {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("06867650");
            System.out.println("QUAl Cep formatado : " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep nao corresponde com a regras de negocios");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();
        //simulando cep
        return "06.867-650";
    }
}
