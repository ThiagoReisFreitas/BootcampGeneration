package LacoRepeticaoWHILE;

import java.util.Scanner;

public class Ex04 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int idade=0, sexo=0, categoria=0, backend=0, mfrontend=0, hmobile40=0, mfullstack30=0;
		String continuar = "s";
		
		while(!continuar.equals("n"))
		{
			System.out.print("\nDigite a Idade: ");
			idade = leia.nextInt();
			leia.nextLine();
			
			System.out.print("\n1- Masculino\n2 - Feminino\n3 - Outros\nDigite o Sexo: ");
			sexo = leia.nextInt();
			leia.nextLine();
			
			System.out.print("\n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - Fullstack\nDigite a Categoria: ");
			categoria = leia.nextInt();
			leia.nextLine();
			
			switch(categoria)
			{
			case 1:
				backend++;
				break;
			case 2:
				if(sexo == 2)
				{
					mfrontend++;
				}
				break;
			case 3:
				if(idade > 40 && sexo == 1)
				{
					hmobile40++;
				}
				break;
			case 4:
				if(sexo == 2 && idade < 30)
				{
					mfullstack30++;
				}
				break;
			}
				
			System.out.print("\nDeseja continuar? [S/N] ");
			continuar = leia.nextLine();
			
			
		}
		System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d\nTotal de mulheres desenvolvedoras Frontend: %d\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d", backend, mfrontend, hmobile40, mfullstack30);
	}
}
