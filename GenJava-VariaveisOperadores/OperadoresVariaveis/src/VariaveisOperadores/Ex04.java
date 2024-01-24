package VariaveisOperadores;

import java.util.Scanner;

public class Ex04 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float num1, num2, num3, num4, diferenca;
		
		System.out.print("Numero 1: ");
		num1 = ler.nextFloat();
		System.out.print("Numero 2: ");
		num2 = ler.nextFloat();
		System.out.print("Numero 3: ");
		num3 = ler.nextFloat();
		System.out.print("Numero 4: ");
		num4 = ler.nextFloat();
		
		diferenca = (num1 * num2) - (num3 * num4);
		System.out.printf("Diferença: %.1f", diferenca);
	}

}
