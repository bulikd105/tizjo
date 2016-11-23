package tizjo;

import java.util.Scanner;

public class CallBackImpl implements CallBack
{
	@Override
	public String methodToCallBack(CallBack callBack)
	{
		String[] str = callBackToMainApp();
		Scanner scan = new Scanner(System.in);
		
		String option = "";
		String path = "";
		
		boolean flag = true;
		
		if(str[4].equals("1"))
		{
			while(flag)
			{
				System.out.println("Chcesz zmienic sciezkie pliku?\n1 - Tak\n2 - Nie");
				option = scan.nextLine();
				switch(option)
				{
					case "1" :	System.out.println("Wybrales zmiane sciezki.\nPodaj nowa sciezke:");
								System.out.println("Poprzednie ustawienia:");
								System.out.println("Sciezka: " + str[0] + "\nNapis poprawny: " + str[1] + "\nNapis niepoprawny: " + str[0]);
								path = scan.nextLine();
								if(path.endsWith(".txt"))
								{
									System.out.println("Plik zostal zapisany w nowej sciezce: " + path);
									flag = false;
								}
								else
								{
									System.out.println("Plik w podanej sciezce nie ma rozszerzenia txt");
								}					
								break;
					case "2" :	System.out.println("Wybrales zachowanie aktualniej sciezki. Zegnaj");
								flag = false;
								break;
					default  :  flag = false;
								break;
							
				}
			}
		}
		else
		{
			System.out.println("plik nie zostal zapisany");
		}
		
		return path;
	}

	@Override
	public String[] callBackToMainApp() 
	{
		boolean wynik = false;
		String[] userData = new String[4];
			
		
		if(wynik)
		{
			userData[3] = "1";
		}
		else
		{
			userData[3] = "0";
		}
		
		
		return userData;
	}
}
