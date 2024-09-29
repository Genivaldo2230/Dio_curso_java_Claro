/*operadores Logicos O operadores logicos representam o recursos que noas permite criar expressoẽs logicas maiores a parti da junção de duas ou mais expressões 
( && Operador logico E) ou (|| Operador Logico "OU")  tambem conhecido como tabela verdade*/

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("A Condição são verdadeira");
        }
        System.out.println("fim");

        if (condicao1 || condicao2){
            System.out.println("A Condições "+" { OU }"+" é verdadeira ");
    }
}
}
