package projetojava;

import java.util.Scanner;

public class Laçocond2 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner (System.in);
		int op;
		
		float saldo, valor, saldoatual;
		
		saldo = 1000;
		
		System.out.println("Insira a Operação");
		op = leia.nextInt();
		
		switch (op) {
		
		case 1: 
		System.out.println("\nOperação - Saldo"+"\n Saldo: R$"+saldo);
		break;
		
		case 2:
		System.out.println("\nColoque o Valor:");
		valor = leia.nextFloat();
		if (saldo-valor>0) {
		saldoatual = saldo-valor;
		System.out.println("\nOperação - Saque"+"\n Saldo: R$"+saldoatual);
		}
		else {
		System.out.println("\nSaldo Insuficiente!");
		}
		break;
		
		case 3:
		System.out.println("\nColoque o Valor:");
		valor = leia.nextFloat();
		saldoatual = saldo+valor;
		System.out.println("\nOperação - Saque"+"\n Saldo: R$"+saldoatual);
		break;
		
		default:
			System.out.println("\nOperação Inválida");
		
		}
	}

}
