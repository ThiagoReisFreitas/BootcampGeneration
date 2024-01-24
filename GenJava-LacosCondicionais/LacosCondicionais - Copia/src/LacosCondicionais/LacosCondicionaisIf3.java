package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisIf3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeira;
		
		System.out.print("Digite o Nome do doador: ");
		nome = ler.nextLine();
		System.out.print("Digite a idade do doador: ");
		idade = ler.nextInt();
		System.out.print("Primeira doação de sangue: ");
		primeira = ler.nextBoolean();
		
		if(idade >= 18 && idade <= 69)
		{
			if(idade >= 60 && idade <= 69)
			{
				if(primeira == true)
				{
					System.out.printf("%s não está apto para doar sangue!", nome);
				}
				else
				{
					System.out.printf("%s está apto para doar sangue!", nome);
				}
			}
			else
			{
				System.out.printf("%s está apto para doar sangue!", nome);
			}
		}
		else
		{
			System.out.printf("%s não está apto para doar sangue!", nome);
		}
	}

}
