package tizjo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab1 
{
	static String hello = "hello world";
	
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
	
		try
		{
			File filee = new File("dane.txt");
			FileWriter fw = new FileWriter(filee);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(hello);
			bw.close();
			
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		return str;
	}
	
	public static void SecMet(String[] str)
	{
		
		
	}
	
	
}



