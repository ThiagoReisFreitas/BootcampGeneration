package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisSwitch3 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float num1, num2;
		int operacao;
		System.out.print("Digite o 1º número: ");
		num1 = ler.nextFloat();
		System.out.print("Digite o 2º número: ");
		num2 = ler.nextFloat();
		System.out.println("Escolha entre:\n\t1 - Soma\n\t2 - Subtração\n\t3 - Multiplicação\n\t4 - Divisão");
		System.out.print("Operação: ");
		operacao = ler.nextInt();
		
		switch(operacao)
		{
		case 1:
			System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1+num2);
			break;
		case 2:
			System.out.printf("%.1f - %.1f = %.1f", num1, num2, num1-num2);
			break;
		case 3:
			System.out.printf("%.1f * %.1f = %.1f", num1, num2, num1*num2);
			break;
		case 4:
			System.out.printf("%.1f / %.1f = %.1f", num1, num2, num1/num2);
			break;
		default:
			System.out.print("Opção Inválida");
		}
	}

}
