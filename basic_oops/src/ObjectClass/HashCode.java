package ObjectClass;

public class HashCode 
{
	
	int id=5012;
	public  HashCode c;
	
	public String v=getClass1();
	
public static void main(String[] args) {
	
	HashCode c=new HashCode();
	
	System.out.println(c.hashCode());
	
	System.out.println(c.toString());
}

@Override

public int hashCode()
{
	
	return id;
}

@Override

public String toString()
{
	
	return this.v+"@"+Integer.toHexString(id);
}


public String getClass1()
{
	String m="HashCode";
	return m;
}



}
