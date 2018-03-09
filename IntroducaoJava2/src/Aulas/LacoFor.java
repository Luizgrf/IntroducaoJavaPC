package Aulas;

public class LacoFor {
	public static void main (String[] args){
        for (int i = 0; i < 10; i++) {
            System.out.println("Linha: "+ i);
        }
        for (String s : args){
            System.out.println("Argumento: "+ s);
        }
    }
}
