import java.util.Scanner;

public class ProgramaCinco {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int fatorial = 1;
        int n;
        System.out.print("Digite o número que você quer calcular o fatorial: ");
        n = teclado.nextInt();

        if(n < 0){
            System.out.println(-1);
        }else{
            for(int i = n; i > 1; i--){
                fatorial *= i;
            }
            System.out.printf("O fatorial de %d é %d.", n, fatorial);
        }

        teclado.close();
    }
}
