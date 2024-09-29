public class Usuario {

    public static void main(String[] args) throws Exception {

        SmartTv smartv = new SmartTv();

        System.out.println("Tv ligada ? "+ smartv.ligada);
        System.out.println("Canal atual ? " +smartv.canal);
        System.out.println("Volume atual ? " +smartv.volume);

        smartv.ligar();
        System.out.println("Novo Status ! "+"{ " + smartv.ligada +" = Tv ligada }");  

        smartv.desligar();
        System.out.println("Novo Status ! "+"{ " + smartv.ligada +" = Tv desligada }");

        smartv.aumentarVolume();
        System.out.println("Novo Status ! "+"{ " + smartv.volume +" = Volume aumentado }");
        
        smartv.diminuirVolume();
        System.out.println("Novo Status ! "+"{ " + smartv.volume +" = Volume diminuído }");


        smartv.canal = 12;
        System.out.println("Novo Status ! "+"{ " + smartv.canal +" = Canal alterado }");





    }
}
