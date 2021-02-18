public class Main {
    public static void main(String[] args){
        Televisao tv = new Televisao();

        tv.ligaTelevisao();
        tv.volumeEspecifico(8);
        tv.aumentarVolumeUnico();
        tv.escolheCanalEspecifico(4);
        tv.proximoCanal();

        tv.estadoDaTelevisao();

        System.out.println("----------------------");

        tv.silenciarTelevisao();

        System.out.println("----------------------");

        tv.estadoDaTelevisao();

        System.out.println("----------------------");

        tv.desligaTelevisao();

        System.out.println("----------------------");


        tv.estadoDaTelevisao();
    }
}
