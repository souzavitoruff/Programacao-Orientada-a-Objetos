import java.util.Scanner;

public class ProgramaUm{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n;
        int controle = 0;
        float novoNumero;

        System.out.print("Digite a quantidade de números a serem lidos: ");
        n = teclado.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            novoNumero = teclado.nextFloat();

            if(novoNumero < 0){
                controle++;
            }

        }
        
        System.out.printf("Dos valores inseridos, %d são negativos.", controle);

        teclado.close();
    }
}