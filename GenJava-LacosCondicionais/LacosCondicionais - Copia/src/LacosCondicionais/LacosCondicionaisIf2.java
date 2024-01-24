package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisIf2 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if(num > 0)
		{
			if(num%2 == 0)
			{
				System.out.printf("O Número %d é par e positivo!", num);
			}
			else
			{
				System.out.printf("O Número %d é impar e positivo!", num);
			}
		}
		else if(num < 0)
		{
			if(num%2 == 0)
			{
				System.out.printf("O Número %d é par e negativo!", num);
			}
			else
			{
				System.out.printf("O Número %d é impar e negativo", num);
			}
		}
	}

}
