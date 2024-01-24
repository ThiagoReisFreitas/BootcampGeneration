package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisIf 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		
		if(a+b > c)
		{
			System.out.printf("%d + %d = %d > %d\n", a, b, a+b, c);
			System.out.println("A soma de A + B é Maior do que C");
		}
		else if(a+b < c)
		{
			System.out.printf("%d + %d = %d < %d\n", a, b, a+b, c);
			System.out.println("A soma de A + B é menor do que C");
		}
		else
		{
			System.out.printf("%d + %d = %d == %d\n", a, b, a+b, c);
			System.out.println("A soma de A + B é igual a C");
		}
	}

}
