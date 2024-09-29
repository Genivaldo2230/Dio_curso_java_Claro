package Condionais_SwitchCase;

import java.util.Scanner;

public class SistemaMedidasSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra ");
        String sigla = sc.next().toUpperCase();

        switch (sigla) {

            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}