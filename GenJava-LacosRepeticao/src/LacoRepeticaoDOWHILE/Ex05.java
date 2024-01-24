package LacoRepeticaoDOWHILE;

import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		int numeros, soma=0;
		do
		{
			System.out.print("Digite um número: ");
			numeros = leia.nextInt();
			if(numeros > 0)
			{
				soma += numeros;
			}
		}while(numeros != 0);
		System.out.printf("A soma dos números positivos é: %d", soma);
	}
}
