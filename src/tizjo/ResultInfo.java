package tizjo;

public class ResultInfo 
{
	private String fileName;
	private String correctMsg;
	private String incorrectMsg;
	private boolean success;

	public ResultInfo() 
	{
		
	}

	public ResultInfo(String[] str, boolean success) 
	{
		super();
		this.fileName = str[0];
		this.correctMsg = str[1];
		this.incorrectMsg = str[2];
		this.success = success;
	}

	public String getFileName() 
	{
		return fileName;
	}

	public String getCorrectMsg() 
	{
		return correctMsg;
	}

	public String getIncorrectMsg() 
	{
		return incorrectMsg;
	}

	public boolean isSuccess() 
	{
		return success;
	}
}
