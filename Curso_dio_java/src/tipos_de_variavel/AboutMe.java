import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        //os argumentos começãm com indices 0
        System.out.println("Digite seu nome ");
        String nome = sc.next();

        System.out.println("Digte seu Sobrenome :");
        String sobrenome = sc.next();

        System.out.println("Digite sua Idade");
        int idade = sc.nextInt();// vamos falar sobre
        
        System.out.println("Qual sua Alturage");
        double altura = sc.nextDouble();

        System.out.println("Òla, Me chamo: " + nome + " " + sobrenome);
        System.out.println("Tenho: " + idade + " anos");
        System.out.println("Minha Altura é :" + altura + " cm");
    }
}
