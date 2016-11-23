package tizjo;

public class CallBackTwoImp implements CallBackTwo
{
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
