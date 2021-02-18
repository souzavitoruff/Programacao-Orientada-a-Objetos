public class Televisao {
    Boolean ligada = false;
    int volumeAtual = 5;
    int volumeAnterior = 5;
    int canal = 0;
    Boolean silencioso = false;

    void ligaTelevisao(){
        ligada = true;
        System.out.println("Televisão ligada!");
    }

    void desligaTelevisao(){
        ligada = false;
        System.out.println("Televisão desligada!");
    }

    void escolheCanalEspecifico(int canalEscolhido){
        if(canalEscolhido < 0){
            System.out.println("Você passou do início da lista. Começando do final...%n");
            canal = 99 + canalEscolhido;
            System.out.printf("O canal atual é o: %d", canal);
        }else if(canalEscolhido > 99){
            System.out.println("Você passou do final da lista. Começando do início...%n");
            canal = (canalEscolhido - 99);
            System.out.printf("O canal atual é o: %d%n%n", canal);
        }else{
            canal = canalEscolhido;
            System.out.printf("O canal atual é o: %d%n%n", canal);
        }
    }

    void proximoCanal(){
        canal++;
        System.out.printf("O canal atual é o: %d%n%n", canal);
    }

    void canalAnterior(){
        canal--;
        System.out.printf("O canal atual é o: %d%n%n", canal);
    }

    void silenciarTelevisao(){
        silencioso = true;
        volumeAnterior = volumeAtual;
        volumeAtual = 0;
        System.out.println("A Televisão foi silenciada!");
    }

    void dessilenciarTelevisao(){
        silencioso = false;
        volumeAtual = volumeAnterior; 
    }

    void volumeEspecifico(int volumeEscolhido){
        if(volumeEscolhido > 10){
            volumeAtual = 10;
            System.out.println("O volume está no máximo!%n");
        }else if(volumeEscolhido < 0){
            this.silenciarTelevisao();
        }else{
            volumeAtual = volumeEscolhido;
            System.out.printf("O volume atual é: %d.%n%n", volumeAtual);
        }
    }

    void aumentarVolumeUnico(){
        volumeAtual++;
        System.out.printf("O volume atual é: %d.%n%n", volumeAtual);
    }

    void diminuirVolumeUnico(){
        volumeAtual--;
        System.out.printf("O volume atual é: %d.%n%n", volumeAtual);
    }

    void estadoDaTelevisao(){
        if(ligada){
            System.out.println("*****Televisão ligada!*****");
            System.out.printf("Canal atual: %d.%n", canal);
            if(silencioso){
                System.out.println("A Televisão está no modo silencioso. Volume: 0.");
            }else{
                System.out.printf("Volume atual: %d.%n", volumeAtual);
            }
        }else{
            System.out.println("*****Televisão desligada!*****");
        }
    }

}
