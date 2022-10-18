package abstr;
interface city
{
	public String areaname(String name);
	public void istastyfood(boolean istastyfood);
	public int noofpeoples(int noofpeoples);
	}
class madurai implements city
{
	public String areaname(String areaname)
	{
		return areaname;
	}
	public void istastyfood(boolean istastyfood)
	{
	if(istastyfood==true)
	{
		System.out.println("YES,it is");
	}
	else
		System.out.println("NO");
	}
	public int noofpeoples(int noofpeoples)
	{
		return noofpeoples;
	}
}

	
public class mainclass12
{
	public static void main(String[] args) {
		madurai m=new madurai();
		System.out.println(m.areaname("pudhur"));
		System.out.println(m.noofpeoples(250000));
		m.istastyfood(true);
	}

}
