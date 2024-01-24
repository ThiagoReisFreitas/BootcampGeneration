package LacosCondicionais;

import java.util.Scanner;

public class LacosCondicionaisIf4 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		String palavra1, palavra2, palavra3;
		
		System.out.print("Escolha entre Vertebrado[1] ou Invertebrado[2]: ");
		palavra1 = ler.nextLine();
		if(palavra1.equals("1"))
		{
			palavra1 = "Vertebrado";
			System.out.println("Escolha entre Ave[1] ou Mamífero[2]: ");
			palavra2 = ler.nextLine();
			if(palavra2.equals("1"))
			{
				palavra2 = "Ave";
				System.out.print("Escolha entre Carnívoro[1] ou Onívoro[2]: ");
				palavra3 = ler.nextLine();
				if(palavra3.equals("1"))
				{
					palavra3 = "Carnívoro";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Águia");
				}
				else if(palavra3.equals("2"))
				{
					palavra3 = "Onívoro";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Pomba");
				}
			}
			else if(palavra2.equals("2"))
			{
				palavra2 = "Mamífero";
				System.out.print("Escolha entre Onívoro[1] ou Herbírovo[2]: ");
				palavra3 = ler.nextLine();
				
				if(palavra3.equals("1"))
				{
					palavra3 = "Onívoro";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu o Homem");
				}
				else if(palavra3.equals("2"))
				{
					palavra3 = "Herbívoro";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Vaca");
				}
			}
		}
		
		else if(palavra1.equals("2"))
		{
			palavra1 = "Invertebrado";
			System.out.println("Escolha entre Inseto[1] ou Anelídeo[2]: ");
			palavra2 = ler.nextLine();
			
			if(palavra2.equals("1"))
			{
				palavra2 = "Inseto";
				System.out.print("Escolha entre Hematófago[1] ou Herbívoro[2]: ");
				palavra3 = ler.nextLine();
				if(palavra3.equals("1"))
				{
					palavra3 = "Hematófago";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Pulga");
				}
				else if(palavra3.equals("2"))
				{
					palavra3 = "Herbívoro";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Lagarta");
				}
				
				
			}
			else if(palavra2.equals("2"))
			{
				palavra2 = "Anelídeo";
				System.out.print("Escolha entre Hematófago[1] ou Onívoro[2]: ");
				palavra3 = ler.nextLine();
				if(palavra3.equals("1"))
				{
					palavra3 = "Hematófago";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Sanguessuga");
				}
				else if(palavra3.equals("2"))
				{
					palavra3 = "Onívoro";
					System.out.printf("%s, %s, %s", palavra1, palavra2, palavra3);
					System.out.print("\nVocê escolheu a Minhoca");
				}
			}
		}
	}

}
