package Aulas;

public class ExemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Isto � uma String do Java";
		String xyz = new String ("Isto � uma String do Java");
		
		if(str == xyz) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if (str.equals(xyz)){
			//maneira correta de se compara o conte�do das Strings
		}
		
		System.out.println("Tamanho da String: " + str.length() );
		
		System.out.println("SubString: "+ str.substring(0, 10) );
				
		System.out.println("Caracter na posi��o 5: " + str.charAt(5) );
		
		// o m�todo split quebra a String e v�rias outras, pelo separador desejado
		String [] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o �ndice de palvras na String
		
		if (str.startsWith("Ol�") || str.endsWith("Mundo!")){
			//testa o come�o e o fim da String - retorno boolean
		}
		str = str.trim(); //elimina os espa�os em branco no inicio e no fim
		
		str = str.replace('a', '@'); //substitui os caracteres
		
		//substitui uma palavra (usa experess�es regulares)
		str = str.replaceAll("String", "Cadeia de Caracteres");
			
	}

}
