package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		int numero2;
		
		
		System.out.println("Primeiro N�mero da Opera��o de adi��o");
		numero = leia.nextInt();//Campo aonde chama trazer apenas numero.
	
		
		System.out.println("Primeiro Segundo N�mero Opera��o de adi��o");
		numero2 = leia.nextInt();//Campo aonde chama trazer apenas numero
	
		System.out.println("Resultado da Opera��o:" + (numero+numero2));
		
		
		
		
		leia.close();
	}

}
