package ObjectClass;

public class Equals_Method 
{

	String companyname;
	String empname;
	int empid;
	
	Equals_Method(String companyname,String empname,int empid )
	{
		this.companyname=companyname;
		this.empname=empname;
		this.empid=empid;
	}
	
	@Override
	
	public boolean equals(Object v)
	{
		
		Driver f=(Driver)v;
		
		
		
		return this.companyname.equals(f.compname)&&this.empname.equals(f.empname)&&this.empid==f.empid;
	}
	
	
}
