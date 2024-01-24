package LacoRepeticaoDOWHILE;

import java.util.Scanner;

public class Ex06 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numeros, soma=0, contador=0;

		do
		{
			System.out.print("Digite o número: ");
			numeros = leia.nextInt();
			
			if(numeros % 3 == 0 && numeros != 0)
			{
				soma += numeros;
				contador++;
			}
			
		}while(numeros != 0);
		float media = (float)soma/contador;
		System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
	}
}
