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
		CallBackImpl callBack = new CallBackImpl();
		String str[] = GetData();
		SecMet(str, callBack);
		
	}
	
	public static String[] GetData()
	{
		String str[] = new String[4];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Podaj nazwe pliku");
		str[1] = scan.nextLine();
		System.out.println("Podaj str1");
		str[2] = scan.nextLine();
		System.out.println("Podaj str2");
		str[3] = scan.nextLine();
	
		
		return str;
	}
	
	public static void SecMet(String[] str, CallBackImpl callBack)
	{
		boolean flag = false;
		try
		{
			File filee = new File(str[1]);
			FileWriter fw = new FileWriter(filee);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write(hello);
			bw.close();
			flag = true;
			
			System.out.println("result : " + str[2]);
			
		}
		catch(IOException e)
		{
			System.out.println("result : " +str[3]);
			flag = false;
			e.printStackTrace();
			
		}	
		
		callBack.methodToCallBack(flag);
	}
}



