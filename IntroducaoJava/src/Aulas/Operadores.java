package Aulas;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// OPERADORES UN�RIOS//
		
		//Incremento e Decremento: ++ e --
		int a = 0;
		int b = a ++;   //incrementado depois de atribuir
		int c = ++a;    //incrementado antes de atribuir
		b = a--;        //decrementado depois de atribuir
		c = --a;        //decrementado antes de atribuir
		
		//Mais e menos Un�rio: + e -
		int x = +3;    //x recebe o positivo 3
		x = -x;       //x recebe -3, nesse caso
		
		//Invers�o de Bits: ~
		int i = ~1;    // i = -2 (os bits foram invertidos)
		
		//Complementar booleano: !
		boolean falsidade = !(true);   //inverte o valor do booleano
		
		//Convers�o de Tipos: (tipo)
		double d = 1.99;
		int in = (int) d;   //converte de double p/ int (perda de precis�o)
		
		//OPERADORES ARITIM�TICOS
		
		//Multplica��o e Divis�o: *e/
	}

}
