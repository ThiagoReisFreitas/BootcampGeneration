package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisSwitch2 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		String nome;
		int cargo;
		float salario;
		
		System.out.print("Nome do colaborador: ");
		nome = leia.nextLine();
		System.out.print("Cargo: ");
		cargo = leia.nextInt();
		System.out.print("Salário: ");
		salario = leia.nextFloat();
		
		switch(cargo)
		{
		case 1:
			System.out.printf("Nome do colaborador: %s\nCargo: Gerente\nSalário: %.2f",nome, salario + ((salario*10)/100));
			break;
		case 2:
			System.out.printf("Nome do colaborador: %s\nCargo: Vendedor\nSalário: %.2f",nome, salario + ((salario*7)/100));
			break;
		case 3:
			System.out.printf("Nome do colaborador: %s\nCargo: Supervisor\nSalário: %.2f",nome, salario + ((salario*9)/100));
			break;
		case 4:
			System.out.printf("Nome do colaborador: %s\nCargo: Motorista\nSalário: %.2f",nome, salario + ((salario*6)/100));
			break;
		case 5:
			System.out.printf("Nome do colaborador: %s\nCargo: Estoquista\nSalário: %.2f",nome, salario + ((salario*5)/100));
			break;
		case 6:
			System.out.printf("Nome do colaborador: %s\nCargo: Técnico de TI\nSalário: %.2f",nome, salario + ((salario*8)/100));
		default:
			System.out.println("Opção Inválida!");
		}
		
	}
}