package projetojava;

import java.util.Scanner;

public class laçowhilw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int idade; 
         int menorIdade = 0;
		 int maiorCinquenta = 0; 
		 Scanner leia = new Scanner(System.in);
		 System.out.println("Digite a sua idade: ");
		 idade = leia.nextInt();
		 while(idade > 0){
        	 if(idade < 21) {
     			menorIdade = menorIdade+1;
     			System.out.println("menor: "+ menorIdade);
     			
     			
     		}else if(idade > 50) {
     			maiorCinquenta = maiorCinquenta+1;
     			System.out.println("maior: "+ maiorCinquenta);
     			
     		}
    
        
        	 
        	 System.out.println("Digite a sua idade: ");
     		idade = leia.nextInt();
         }
         System.out.println("Total de pessoas menores de 21 anos: "+ menorIdade);
         System.out.println("Total de pessoas maior de 50 anos: "+ maiorCinquenta);
	
	}

}
