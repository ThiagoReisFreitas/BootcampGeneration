package VariaveisOperadores;

import java.util.Scanner;

public class Ex03 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float salarioBruto, adcionalNoturno, horasExtra, descontos, salarioLiquido;
		
		System.out.print("Salário Bruto: ");
		salarioBruto = ler.nextFloat();
		System.out.print("Adcional Noturno: ");
		adcionalNoturno = ler.nextFloat();
		System.out.print("Horas Extras: ");
		horasExtra = ler.nextFloat();
		System.out.print("Descontos");
		descontos = ler.nextFloat();
		
		salarioLiquido = salarioBruto + adcionalNoturno + (horasExtra * 5) - descontos;
		System.out.printf("Salário Líquido: %.2f", salarioLiquido);
	}

}
