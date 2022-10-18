package abstr;
interface SmartPhone
{
	public String  isVideoCall();
	public boolean isVoiceCall();
	public boolean connectivity();
	public void CameraFunction(String tapping);
	
}
class Vivo implements SmartPhone
{
	public String isVideoCall() {
		return "it contaains videocall";
	}
	public boolean isVoiceCall()
	{
		return true;
	}
	public boolean connectivity()
	{return false;}
	public void CameraFunction(String tapping)
	{
		switch (tapping) {
		case "singletap": System.out.println("taking picture");
		break;
		case "doubletap":System.out.println("Zooming");
		break;
		case "continuos tap":System.out.println("Continuous shots");
		break;
		default:System.out.println("invalid input");
		
		}
	
}}

public class MAINCLASS1 
{
	public static void main(String[] args)

{
		Vivo v=new Vivo();
		v.CameraFunction("singletap");
		v.CameraFunction("");
		
		
		System.out.println("\"\"");
	
}

}
