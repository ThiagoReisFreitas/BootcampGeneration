package LacoRepeticaoFOR;

import java.util.Scanner;

public class Ex02 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numero, x, par=0, impar=0;
		for(x = 1; x <= 10; x++)
		{
			System.out.printf("\nDigite o %dº número: ", x);
			numero = leia.nextInt();
			
			if(numero%2==0)
			{
				par ++;
			}
			else
			{
				impar++;
			}
		}
		System.out.printf("\nTotal de número pares: %d\nTotal de números ímpares: %d", par, impar);
	}
}