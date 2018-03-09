package Aulas;

public class LacoWhile {
	public static void main (String[] args){
        int i = 0;
        //laço while() com bloco de código definido
        
        while (i <10){
            System.out.println("Linha: "+ i);
            i++;
        }
        int j = 0;
        do{
            System.out.println("Coluna: "+ j);
            j++;
        }while (j<10);
    }
}
