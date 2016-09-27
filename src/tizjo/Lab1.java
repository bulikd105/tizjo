package tizjo;

import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args)
	{

		String str[] = GetData();
		SecMet(str);
		
	}
	
	public static String[] GetData()
	{
		String str[] = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj nazwe pliku");
		str[1] = scan.nextLine();
		System.out.println("Podaj str1");
		str[2] = scan.nextLine();
		System.out.println("Podaj str2");
		str[3] = scan.nextLine();
		
		return str;
	}
	
	public static void SecMet(String[] str)
	{
		
	}
	
	
}



