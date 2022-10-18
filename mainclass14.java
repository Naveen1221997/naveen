package abstr;

interface electronics
{
public String price(int price);
public boolean iswarranty(boolean iswarranty);
}

abstract class laptop 
{
abstract public String model(String model);
public String price(int price)
{
return "";	
}}

class gaminglaptop extends laptop implements electronics
{
public String model(String model)
{
	return model;
}
public boolean iswarranty(boolean iswarranty)
{
	return iswarranty;
}
}

public class mainclass14
{
	public static void main(String[] args) 
	{
		gaminglaptop g=new gaminglaptop();
		System.out.println(g.model("slim3"));
		System.out.println(g.price(200000));
		System.out.println(g.iswarranty(true));
		
		
		
	}

}
