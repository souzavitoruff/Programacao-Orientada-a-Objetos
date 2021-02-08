public class ProgramaQuatro {
    public static void main(String[] args){
        int soma = 0;

        for(int i = 1; i <= 100; i++){
            if((i % 3) == 0){
                soma += i;
            }
        }

        System.out.printf("A soma dos múltiplos de 3 entre 1 e 100 é: %d.", soma);
    }
}
