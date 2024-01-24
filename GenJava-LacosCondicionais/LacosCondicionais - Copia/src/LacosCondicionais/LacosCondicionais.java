package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionais 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int operacao;
		float saldo = 1000.00f, valor = 0;
		
		System.out.print("Escolha uma operação:\n\t1 - Saldo\n\t2 - Saque\n\t3 - Depósito\nOperação: ");
		operacao = ler.nextInt();
		
		if(operacao > 1 && operacao <= 3)
		{
			System.out.print("Valor: ");
			valor = ler.nextFloat();
		}
		
		switch(operacao)
		{
		case 1:
			System.out.printf("Operação - Saldo\n\tSaldo: R$%.2f", saldo);
			break;
		case 2:
			
			if(valor > saldo)
			{
				System.out.print("Operação - Saque\n\tSaldo Insuficiente!");
			}
			else
			{
				System.out.printf("Operação - Saque\n\tNovo Saldo: R$%.2f", saldo-valor);
			}
			break;
		case 3:
			System.out.printf("Operação - Deposito\n\tNovo Saldo: R$%.2f", saldo+valor);
			break;
		default:
			System.out.print("Operação invalida!");
		}
	}

}
