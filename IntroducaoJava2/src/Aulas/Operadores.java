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
		int um = 3/2;
        float umEmeio = (float) 3/2;
        double xyz = umEmeio * um;
        
        //Módulo %
        int resto = 7%2;
        
        //Adição e Subtração: + e -
        long l = 1000 + 4000;
        double dou = 1.0- 0.01;
        
        //COncatenação
        long var = 12345;
        String str = "O valor de var é "+ var;
        
        //OPERADORES DE COMPARAÇÃO
        //ORDINAL 
        
        boolean bo = (10 < 3);
        
        //Condicioanl: ?
        
        int z = 10;
        int y = (x > 10) ? x : x+1;
        
        // é igual a
        
        if (x > 10){
            y=x;
        }else{
            y = x+1;
        }
        
        //Operadores de Atribuição
        
        int j = 10;
        
        int dois = 1;
        dois += 1; // dois = dois + 1
        
        int cinco = 7;
        cinco += 7; //cinco = cinco -2
        
        int dez = 5;
        dez *= 2; // dez = dez * 1
        
        int quatro = 7;
        quatro /= 7; //quatro = quatro /3 
        
        
        //conversão de tipos primitivos
        
        d = 1.99;
        i = (int) d;  //i recebe o valor 1
        
        short s = 15;
         x = s;   //convrsão widening
        long ab = (long) s;  //não é necessário
        
        
	}

}
