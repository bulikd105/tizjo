package tizjo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args)
	{
		CallBackImpl callBack = new CallBackImpl();
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
	
	public static void SecMet(String[] str, CallBackImpl callBack)
	{
		boolean flag = false;
		String hello = "Hello World!";
		do
		{
			try
			{
				File filee = new File(str[0]);
				FileWriter fw = new FileWriter(filee);
				BufferedWriter bw = new BufferedWriter(fw);
				
				bw.write(hello);
				bw.close();
				flag = true;
				
				System.out.println("result : " + str[1]);
				
			}
			catch(IOException e)
			{
				System.out.println("result : " +str[2]);
				flag = false;
				e.printStackTrace();
				
			}	
		}while(!callBack.methodToCallBack(flag).equals(""));
		
	}
}



