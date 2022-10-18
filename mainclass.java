package abstr;
interface course
{
	public String courseid(int id);
	public String coursename(String name);
	public String courseTrainer(String trainer);
	public void coursefees(String name);
	
}
class Onlinecourse implements course
{public String courseid(int id)
	{
	return "123";
	
	}
public String coursename(String name)
{
	return "JAVA";
}
public String courseTrainer(String trainer)
{
	return "Nandeesh";
}
public void coursefees(String name) {

 if(name.equals("JAVA"))
{
System.out.println("Course fees is 20000");	
}
 else if(name.equals("PYTHON"))
{
System.out.println("Course fees is 10000");
}
 else if(name.equals("SQL"))
 {
 System.out.println("Course fees is 15000");
 }
 else
 {
	 System.out.println("invalid input");
}

}
public String showUrlLink(String urllink)
{
	return"http//::qsp.in";	
}	
}

public class mainclass {
	public static void main(String[] args) {
	
		Onlinecourse o=new Onlinecourse();
		System.out.println(o.courseid(1));
		System.out.println(o.coursename("m"));
		System.out.println(o.courseTrainer("e"));
		o.coursefees("JAVA");
		System.out.println(o.showUrlLink("1"));
	}
	
	

}
