package projetojava;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		
		int[][] numero = new int[3][3];
		int linha , coluna;
		int somaP=0 , somaS=0;
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println(" Insira um numero: ");
				numero[linha][coluna] = read.nextInt();
				
				if(linha==coluna) {
					somaP += numero [linha][coluna];
					
				} else if((linha==0 && coluna == 2)||(linha==1 && coluna==1)||(linha==2 && coluna==0)) {
					somaS += numero[linha][coluna];
					
				}
			}
			
		}
		System.out.println(" Elemento da diagonal secundaria: ");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
			if((linha==0 && coluna == 2)||(linha==1 && coluna==1)||(linha==2 && coluna==0)) {
				System.out.println(numero[linha][coluna]);
				
		}
			}
	}
		System.out.println("  Elemento da diagonal principal: ");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
			if(linha==coluna) {
				System.out.println(numero[linha][coluna]);
				
		}
			}
	}
		System.out.println("  Soma dos elementos da Diagonal Principal: "+somaP);
		System.out.println("  Soma dos elementos da Diagonal Secundaria: "+somaS);
		
	}
}
		
