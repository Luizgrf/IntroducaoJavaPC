package Aulas;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// OPERADORES UNÁRIOS//
		
		//Incremento e Decremento: ++ e --
		int a = 0;
		int b = a ++;   //incrementado depois de atribuir
		int c = ++a;    //incrementado antes de atribuir
		b = a--;        //decrementado depois de atribuir
		c = --a;        //decrementado antes de atribuir
		
		//Mais e menos Unário: + e -
		int x = +3;    //x recebe o positivo 3
		x = -x;       //x recebe -3, nesse caso
		
		//Inversão de Bits: ~
		int i = ~1;    // i = -2 (os bits foram invertidos)
		
		//Complementar booleano: !
		boolean falsidade = !(true);   //inverte o valor do booleano
		
		//Conversão de Tipos: (tipo)
		double d = 1.99;
		int in = (int) d;   //converte de double p/ int (perda de precisão)
		
		//OPERADORES ARITIMÉTICOS
		
		//Multplicação e Divisão: *e/
	}

}
