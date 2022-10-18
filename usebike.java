package abstr;
abstract class bike{
	public String brand(String brand)
	{
		return brand;
	}
	public int price(int price)
	{
		return price;
	}
	abstract int speed(int speed);
	
}
class Sportsbike extends bike{
public int speed(int speed)
{
return speed;	
}
}
public class usebike
{
	public static void main(String[] args) 
	{
		Sportsbike s=new Sportsbike();
		System.out.println(s.brand("YAMAHA"));
		System.out.println(s.price(500000));
		System.out.println(s.speed(250));
		
	}

}
