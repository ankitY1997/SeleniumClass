class Laptop
{
    //blue print of laptop
    String name;
    int Length;
    int id;
    String colour;

public void studentDetail(String a,int b,int c,String e)
{
    name=a;
    Length=b;
    id=c;
    colour=e;
}
public void printMethod()
{
    System.out.println("LAPTOP DETAILS");
    System.out.println("laptop name is:"+name);
    System.out.println("laptop length is: "+Length);
    System.out.println("laptop id is:"+id);
    System.out.println("laptop colour is :"+colour);
    System.out.println("=============================");
}
}