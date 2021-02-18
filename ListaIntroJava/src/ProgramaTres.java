public class ProgramaTres {
    public static void main(String[] args){
        int soma = 0;

        for(int i = 1; i <= 999; i++){
            soma += i;
        }

        System.out.printf("O valor da soma de 1 até 999 é: %d.", soma);
    }
}
