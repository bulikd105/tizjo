package tizjo;

public class CallBackTwoImp implements CallBackTwo
{
	private ResultInfo result;
	
	@Override
	public ResultInfo secondCall() 
	{
		return result;		
	}
	
	public CallBackTwoImp(ResultInfo result) 
	{
		super();
		this.result = result;
	}
}
