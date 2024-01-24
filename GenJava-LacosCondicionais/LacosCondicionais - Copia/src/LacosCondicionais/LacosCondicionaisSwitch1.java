package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisSwitch1 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int codprod, quant;
		
		System.out.print("Codigo do produto: ");
		codprod = leia.nextInt();
		System.out.print("Quantidade: ");
		quant = leia.nextInt();
		
		switch(codprod)
		{
		case 1:
			System.out.printf("Produto: Cachorro Quente\nValor total: R$%.2f",10.0f*quant);
			break;
		case 2:
			System.out.printf("Produto: X-Salada\nValor total: R$%.2f",15.f*quant);
			break;
		case 3:
			System.out.printf("Produto: X-Bacon\nValor total: R$%.2f",18.0f*quant);
			break;
		case 4:
			System.out.printf("Produto: Bauru\nValor total: R$%.2f",12.0f*quant);
			break;
		case 5:
			System.out.printf("Produto: Refrigerante\nValor total: R$%.2f",8.0f*quant);
			break;
		case 6:
			System.out.printf("Produto: Suco de laranja\nValor total: R$%.2f",13.0f*quant);
		default:
			System.out.print("Opção Inválida!");

		}
	}

}
