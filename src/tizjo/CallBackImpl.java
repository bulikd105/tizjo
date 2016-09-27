package tizjo;

import java.util.Scanner;

public class CallBackImpl implements CallBack
{
	@Override
	
	public String methodToCallBack(boolean wynik) 
	{
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		if(wynik)
		{
			System.out.println("wanna change your path Y/N?");
			userInput = scan.nextLine();
			if(userInput.equals("Y"))
			{
				System.out.println("Write a new Path");
				userInput = scan.nextLine();
			}
			else 
			{
				System.out.println("nie wybrales opcji zmiany sciezki");
			}
		}
		else if(!wynik)
		{
			System.out.println("plik nie zostal zapisany");
		}
		
		return userInput;
	}
}
