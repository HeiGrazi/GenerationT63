package projetojava;

import java.util.Scanner;

public class Laçocond1 {

	public static void main(String[] args) {
		
         int n1,n2,n3,soma;

		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Entre com o primeiro valor inteiro: " );
		n1 = leia.nextInt();
		
		System.out.println(" Entre com o segundo valor inteiro: ");
		n2 = leia.nextInt();
		
		System.out.print(" Entre com o terceiro valor inteiro: ");
		n3 = leia.nextInt();
		
		soma = n1 + n2 ;
		
		if(soma > n3){
			System.out.println(" A Soma é maior: ");
			}
		
		else if (soma < n3){
			System.out.println(" A Soma é menor: ");
			}
		
	else {
			System.out.println(" A soma é igual ao valor: ");
		}
		
	}

	
	
}
