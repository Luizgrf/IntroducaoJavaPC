package Aulas;

public class ClausulaContinue {
	public static void main (String[] args){
        char letras [] = {'B', 'X', 'R', 'A', 'S', 'I', 'L'};
        int i;
        for (i = 0;  i< letras.length; i++) {
            if (letras[i] == 'X') {
                continue;
            }
            System.out.println(letras[i]);
        }
        //break rotulado
        int j = 0, a = 0;
        principal2: for (j=1; j<10; j++){
        for( a = 1; a<1; a++){
            if ( (i%j) == 0){
                System.out.println("i=" + i + " j="+j);
                continue principal2;
            }         
        }
        j++;
        
        }
} 
}
