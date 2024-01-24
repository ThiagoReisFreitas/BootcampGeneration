package VariaveisOperadores;

import java.util.Scanner;

public class Ex02 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, nota4, media;
		
		System.out.print("Nota 1: ");
		nota1 = ler.nextFloat();
		System.out.print("Nota 2: ");
		nota2 = ler.nextFloat();
		System.out.print("Nota 3: ");
		nota3 = ler.nextFloat();
		System.out.print("Nota 4: ");
		nota4 = ler.nextFloat();
		
		media = (nota1+ nota2 + nota3 + nota4)/4;
		System.out.printf("Nota: %.1f", media);
	}

}
