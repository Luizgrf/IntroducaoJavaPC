package Aulas;

public class LacoWhile {
	public static void main (String[] args){
        int i = 0;
        //la�o while() com bloco de c�digo definido
        
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
