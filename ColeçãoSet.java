package Coections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ColecçãoSet {

	public static void main(String[] args) {
		

		
        Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que deseja encontar: ");
		int n = leia.nextInt();
		
		boolean verifica;
		
		verifica = numeros.contains(n);
		
		if(verifica == true) {
			System.out.printf("O número %d foi encontrado!! ",n);
		
		}else {
			
			
			System.out.printf(" O número %d não foi encontrado!",n);
		}
		
	}



		
		
	}
	


