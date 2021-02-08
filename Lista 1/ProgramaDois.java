import java.util.Scanner;

public class ProgramaDois{
    
    public static void main(String[] args){

        float r, s, t;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de R: ");
        r = teclado.nextFloat();
        System.out.print("Digite o valor de S: ");
        s = teclado.nextFloat();
        System.out.print("Digite o valor de T: ");
        t = teclado.nextFloat();

        if(r > s && r > t){
            System.out.printf("R é maior que S e T, e vale %.2f.", r);
        }else if(s > t && s > r){
            System.out.printf("S é maior que R e T, e vale %.2f.", s);
        }else{
            System.out.printf("T é maior que R e S, e vale %.2f.", t);
        }

        teclado.close();
    }
}
