package segundasemana;
public class MinhaClasses {
    public static void main(String[] args) {

       String primeiroNome ="Genivaldo";
       String segundoNome = "Alves";

       String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println("Meu nome Completo: " + nomeCompleto);
       

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome ) {

        return primeiroNome.concat(" ").concat(segundoNome);

        

    }
}