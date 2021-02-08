public class ProgramaSeis {
    public static void main(String[] args){
        int termoUm = 1;
        int termoDois = 1;
        int termoTres = 1;

        System.out.println(0);
        System.out.println(1);

        while(termoTres <= 100){
            System.out.println(termoTres);
            termoTres = termoUm + termoDois;
            termoUm = termoDois;
            termoDois = termoTres;
        }

    }
}
