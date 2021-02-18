public class Main {
    public static void main(String[] args){
        Celular celular = new Celular();

        celular.cargaCelular();

        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();
        celular.enviarMensagem();

        celular.cargaCelular();

        celular.fazerLigacao(180);

        celular.cargaCelular();

        celular.carregarBateria();

        celular.cargaCelular();
    }
}
