package LacoRepeticaoWHILE;

import java.util.Scanner;

public class Ex03 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int idade=0, maior=0, menor=0;
		
		while(idade >= 0)
		{
			System.out.print("\nDigite uma idade: ");
			idade = leia.nextInt();
			if(idade >= 0)
			{
				if(idade < 21)
				{
					menor++;
				}
				else if(idade > 50)
				{
					maior++;
				}
			}
		}
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d\nTotal de pessoas maiores de 50 anos: %d", menor, maior);
	}
}
