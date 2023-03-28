package Coections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//**O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores 
//e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
//Mostre na tela todas as cores que foram adicionadas. 
//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.

public class coleção1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		ArrayList <String> lista = new ArrayList <String> ();
		
		
		for (int limite=0;limite<5;limite++) {
			System.out.println("Digite a cor: ");
			lista.add(leia.nextLine());
		}
		
		System.out.println("Listar as cores:"+lista);
		Collections.sort(lista);
		
		
		System.out.println("Ordenando as cores em ordem: "+lista);	
		
	
		
		
		

	}

}
