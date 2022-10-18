package abstr;
abstract class movie
{
	public abstract String heroname(String heroname);
	public String herionename(String herionename)
	{
		return herionename;
	}
	public boolean isblockbuster()
	{
		return false;
	}
	public boolean isdoubleact()
	{
		return false;
	}
	}
class manmadhan extends movie{
public String heroname(String heroname)
{
return heroname;	
}
}


public class mainclass11 
{
	public static void main(String[] args) 
	{
		manmadhan m=new manmadhan();
		System.out.println(m.heroname("STR"));
		System.out.println(m.herionename("jyothika"));
		System.out.println(m.isblockbuster());
		System.out.println(m.isdoubleact());
	}

}
