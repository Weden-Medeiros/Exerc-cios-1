package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Informe um numero");
		numero = leia.nextInt();//Campo aonde chama trazer apenas numero.
		
	
		System.out.println("O n�mero informado foi:" + numero);
		

		leia.close();
		
 }

}
