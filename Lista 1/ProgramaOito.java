import java.util.Scanner;

public class ProgramaOito {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.print("Digite a ordem da sua matriz quadrada: ");
        n = teclado.nextInt();

        int[][] matriz = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.printf("Digite o valor da matriz na posição %d X %d: ", i, j);
                matriz[i][j] = teclado.nextInt();
            }
        }

        int somaPrincipal = 0, somaSecundaria = 0;

        //calcula a soma da diagonal principal
        for(int i = 0; i < n; i++){
            somaPrincipal += matriz[i][i]; 
        }

        //calcula a soma da diagonal secundaria
        for(int i = 0; i < n; i++){
            somaSecundaria += matriz[i][n - 1 - i];
        }

        if(somaPrincipal != somaSecundaria){
            System.out.println("Não é quadrada!");
            return;
        }

        //calcula e checa a soma das linhas
        for(int i = 0; i < n; i++){
            int somaLinha = 0;
            for(int j = 0; j < n; j++){
                somaLinha += matriz[i][j];
            }

            if(somaLinha != somaPrincipal){
                System.out.println("Não é quadrada!");
                return;
            }
        }

        //calcula e checa a soma das colunas
        for(int i = 0; i < n; i++){
            int somaColuna = 0;
            for(int j = 0; j < n; j++){
                somaColuna += matriz[j][i];
            }

            if(somaColuna != somaPrincipal){
                System.out.println("Não é quadrada!");
                return;
            }
        }

        System.out.print("É quadrada!");
        teclado.close();
    }
}
