package projetojava;

import java.util.Scanner;

public class laçoderepetição1 {
public static void main(String[] args) {
	 int primeironumero,ultimonumero,x;
	 
	 Scanner leia = new Scanner(System.in);
	  
	 System.out.println("Entre com o primeiro numero: ");
	  primeironumero = leia.nextInt();
	  System.out.println("Entre com o primeiro numero: ");
	  ultimonumero = leia.nextInt();
	  
	  if(primeironumero < ultimonumero) {
		  for (x=primeironumero; x<ultimonumero; x++) {
			  if (x % 3 == 0 && x % 5 == 0) {
				  System.out.println(x+" multiplo de 3 e 5");
				 
			  }
			  
		  }
	  }else {
		  System.out.println("invalido");
		  
		  
			  
			  }
		  }
		  
		  
		  		
		  
	  
	  
	  
}

