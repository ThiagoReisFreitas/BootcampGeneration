package LacoRepeticaoFOR;

import java.util.Scanner;

public class Ex01 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int primeiro = 0, ultimo = 0;
		
		System.out.print("Digite o primeiro número do intervalo: ");
		primeiro = leia.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		ultimo = leia.nextInt();
		
		if(primeiro < ultimo)
		{
			for(int x = primeiro; x <= ultimo; x++)
			{
				if(x % 3 == 0 && x % 5 == 0) 
				{
					System.out.printf("%d é múltiplo de 3 e 5\n", x);
				}
			}
		}
		else
		{
			System.out.println("Intervalo inválido!");
		}
	}
}