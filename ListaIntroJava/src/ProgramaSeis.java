public class ProgramaSeis {
    public static void main(String[] args){
        int termoUm = 0;
        int termoDois = 1;
        int termoTres = 0;

        while(termoTres <= 100){
            if(termoTres == 1){
                System.out.println(termoTres);
            }
            
            System.out.println(termoTres);
            termoTres = termoUm + termoDois;
            termoUm = termoDois;
            termoDois = termoTres;
            
            if(termoUm + termoDois > 100){
                System.out.println(termoTres);
                System.out.println(termoUm + termoDois);
                break;
            }

        }

    }
}
