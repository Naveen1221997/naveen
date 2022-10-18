package abstr;
interface vehicle
{
public int speed(int speed);
public int getmilage(int milage);
}
abstract class car implements vehicle
{
String brand="bmw";
String colour="red";
public int speed(int speed) {
	return speed;
}
public abstract int showengine(int cc);

}
class SportsCar extends car
{
	public int getmilage(int milage)
	{
		return milage;
	}
	public int showengine(int cc)
	{
		return cc;
	}
	
	
}
public class mainclass13 {
public static void main(String[] args)
{
	SportsCar s=new SportsCar();
	s.brand="asd";
	System.out.println(s.brand);
	System.out.println(s.colour);
	System.out.println(s.getmilage(60));
	System.out.println(s.showengine(155));
	System.out.println(s.speed(65));
	
}
}
