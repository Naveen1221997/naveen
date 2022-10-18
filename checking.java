package abstr;
class nave{
	 protected int rate=11;
	protected int getRate() {
		return rate;
	}
	protected void setRate(int rate) {
		this.rate = rate;
	}

	private String name;
	 private String value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	nave( String value,String name)
	 {
	 this.rate=rate;
	 this.name=name;
	 this.value=value;
	 }
	nave(int rate)
	{
		this.rate=rate;
	}
}


public class checking
{
	public static void main(String[] args)
	{
		nave n=new nave("a","b");
		System.out.println(n.getName());
		System.out.println(n.getRate());
		
	}
}
