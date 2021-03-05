package br.ic.uff.poo.anteriores.televisao;

public class Televisao {
    private Boolean ligada = false;
    private int volumeAtual = 5;
    private int volumeAnterior = 5;
    private int canal = 0;
    private Boolean silencioso = false;

    public void ligaTelevisao(){
        this.ligada = true;
        System.out.println("Televisão ligada!");
    }

    public void desligaTelevisao(){
        this.ligada = false;
        System.out.println("Televisão desligada!");
    }

    public void escolheCanalEspecifico(int canalEscolhido){
        if(canalEscolhido < 0){
            System.out.println("Você passou do início da lista. Começando do final...%n");
            this.canal = 99 + canalEscolhido;
            System.out.printf("O canal atual é o: %d", canal);
        }else if(canalEscolhido > 99){
            System.out.println("Você passou do final da lista. Começando do início...%n");
            this.canal = (canalEscolhido - 99);
            System.out.printf("O canal atual é o: %d%n%n", canal);
        }else{
            this.canal = canalEscolhido;
            System.out.printf("O canal atual é o: %d%n%n", canal);
        }
    }

    public void proximoCanal(){
        this.canal++;
        System.out.printf("O canal atual é o: %d%n%n", canal);
    }

    public void canalAnterior(){
        this.canal--;
        System.out.printf("O canal atual é o: %d%n%n", canal);
    }

    public void silenciarTelevisao(){
        this.silencioso = true;
        this.volumeAnterior = volumeAtual;
        this.volumeAtual = 0;
        System.out.println("A Televisão foi silenciada!");
    }

    public void dessilenciarTelevisao(){
        this.silencioso = false;
        this.volumeAtual = volumeAnterior;
    }

    public void volumeEspecifico(int volumeEscolhido){
        if(volumeEscolhido > 10){
            this.volumeAtual = 10;
            System.out.println("O volume está no máximo!%n");
        }else if(volumeEscolhido < 0){
            this.silenciarTelevisao();
        }else{
            this.volumeAtual = volumeEscolhido;
            System.out.printf("O volume atual é: %d.%n%n", volumeAtual);
        }
    }

    public void aumentarVolumeUnico(){
        this.volumeAtual++;
        System.out.printf("O volume atual é: %d.%n%n", volumeAtual);
    }

    public void diminuirVolumeUnico(){
        this.volumeAtual--;
        System.out.printf("O volume atual é: %d.%n%n", volumeAtual);
    }

    public void estadoDaTelevisao(){
        if(this.ligada){
            System.out.println("*****Televisão ligada!*****");
            System.out.printf("Canal atual: %d.%n", canal);
            if(this.silencioso){
                System.out.println("A Televisão está no modo silencioso. Volume: 0.");
            }else{
                System.out.printf("Volume atual: %d.%n", volumeAtual);
            }
        }else{
            System.out.println("*****Televisão desligada!*****");
        }
    }
}
