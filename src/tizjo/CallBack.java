package tizjo;

public interface CallBack 
{
	String methodToCallBack(CallBack callBack);
	String callBackToMainApp(boolean wynik, String userData);
}
