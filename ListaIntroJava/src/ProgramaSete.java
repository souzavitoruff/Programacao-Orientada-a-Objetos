import java.util.Scanner;

public class ProgramaSete {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int pessimas = 0;
        int ruins = 0;
        int boas = 0;
        int otimas = 0;
        int notaAtual;
        
        do{
            System.out.print("Digite uma nota de 0 a 100: ");
            notaAtual = teclado.nextInt();

            if(notaAtual >= 0 && notaAtual <= 25){
                pessimas++;
            }else if(notaAtual > 25 && notaAtual <= 50){
                ruins++;
            }else if(notaAtual > 50 && notaAtual <= 75){
                boas++;
            }else if(notaAtual > 50 && notaAtual <= 100){
                otimas++;
            }
        }while(notaAtual >= 0 && notaAtual <= 100);

        System.out.printf("%nNotas Péssimas: %d    Notas Ruins: %d    Notas Boas: %d    Notas Ótimas: %d.", pessimas, ruins, boas, otimas);

        teclado.close();
    }
}
