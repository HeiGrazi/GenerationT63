package projetojava;

import java.util.Scanner;

public class vetore {

	public static void main(String[] args) {

		int[] vetor = new int[10];
		int impares = 0, pares = 0, x;
		int soma = 0;
		int media=0;
		

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 10; x++) {
			System.out.println("Entre com o primeiro numero: ");
			vetor[x] = leia.nextInt();

			soma += vetor[x];
			if (vetor[x] % 2==0);
		}

		System.out.println("Número pares: ");
		for (x=0; x<10; x++) {
			if (vetor[x] % 2==0) {
				System.out.println(vetor[x]);
			}
		}
				
			
			System.out.println("Números impares: ");
		for (x=0; x<10; x++) {
			if (vetor[x] % 2 !=0) { 
				System.out.println(vetor[x]);
			
			}
		}
		System.out.println("soma: " +soma);
		 for(x=0; x<10; x++)
			 soma += vetor[x];
	   
		  media = soma/10;
		 System.out.println("Média: "+media);
		 
	
		 
		 	
				 
			 
	}
	
	
	}

				
			 
				 
					 
		
				 
						 
				
			
		
		
			
		 
		 
		
			
		
		
	


	


			

		
	


