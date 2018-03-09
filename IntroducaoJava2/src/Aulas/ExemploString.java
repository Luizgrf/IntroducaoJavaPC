package Aulas;

public class ExemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Isto é uma String do Java";
		String xyz = new String ("Isto é uma String do Java");
		
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if (str.equals(xyz)){
			//maneira correta de se compara o conteúdo das Strings
		}
		
		System.out.println("Tamanho da String: " + str.length() );
		
		System.out.println("SubString: "+ str.substring(0, 10) );
				
		System.out.println("Caracter na posição 5: " + str.charAt(5) );
		
		// o método split quebra a String e várias outras, pelo separador desejado
		String [] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o índice de palvras na String
		
		if (str.startsWith("Olá") || str.endsWith("Mundo!")){
			//testa o começo e o fim da String - retorno boolean
		}
		str = str.trim(); //elimina os espaços em branco no inicio e no fim
		
		str = str.replace('a', '@'); //substitui os caracteres
		
		//substitui uma palavra (usa experessões regulares)
		str = str.replaceAll("String", "Cadeia de Caracteres");
			
	}

}
