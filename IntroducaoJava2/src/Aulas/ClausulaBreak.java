package Aulas;

public class ClausulaBreak {
	public static void main (String[] args){
        char letras [] = {'A', 'B', 'C', 'D', 'E'};
        int i;
        for (i = 0;  i< letras.length; i++) {
            if (letras[i] == 'C') {
                break;
            }
        }
        System.out.println("Úlimo índice: "+i);
        
        //break rotulado
        int j = 0, a = 0;
        principal1: while (true){
            for( a = 0; a<100; a++){
                if ( j == 10 && i == 100)
                    break principal1;             }
            j++;
        }
    }
}
