package VariaveisOperadores;

import java.util.Scanner;

public class Ex01 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float salario, abono, novoSalario;
		
		System.out.print("Digite o Salário: ");
		salario = ler.nextFloat();
		System.out.print("Digite o Abono: ");
		abono = ler.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: %.2f", novoSalario);
	}

}
