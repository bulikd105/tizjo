package tizjo;

import java.util.Scanner;

public class Lab1 extends Second
{
	public static void main(String[] args)
	{
		CallBackOneImpl callBack = new CallBackOneImpl();
		String str[] = new String[3];
		str = GetData();
		
		SecMet(str, callBack);
	}
	
	// Pobieranie danych od usera
	public static String[] GetData()
	{
		String userData[] = new String[3];
		
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Podaj nazwe pliku");
			userData[0] = scan.nextLine();
			if(userData[0].endsWith(".txt"))
			{
				break;
			}
			else
			{
				System.out.println("Podaj œcie¿kê do pliku o rozszerzeniu '.txt'");
			}
		}

		System.out.println("Podaj 'poprawny' ciag znakow");
		userData[1] = scan.nextLine();
		
		System.out.println("Podaj 'niepoprawny' ciag znakow");
		userData[2] = scan.nextLine();
	
		return userData;
	}
}