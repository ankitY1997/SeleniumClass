class Fruit
{
    // here we can create object with help of class name and also intializing a non static key wor with making some object
    String name;
    String colour;
    String size;
    int id;
    Fruit x;
public static void main(String []args)
{
Fruit ft=new Fruit(); /*here we made an object with help of keyword new which create an empty space in heap area and constructor fill this empty area it will fill
all non static keyword and non static method. here new means keyword and constructor means=Fruit();*/
ft.mango();
ft.name="mango";//intilaization
ft.colour="yellow";
ft.size="big";
ft.id=121;
System.out.println(ft.name);
System.out.println(ft.colour);
System.out.println(ft.size);
System.out.println(ft.id);
System.out.println(ft);//adress 
System.out.println("=============================================");
System.out.println(ft.x);

Fruit nf=new Fruit();
nf.banana();
nf.name ="banana";//intilaization
nf.colour ="light yellow";
nf.size ="big";
nf.id =147;

System.out.println(nf.name);
System.out.println(nf.colour);
System.out.println(nf.size);
System.out.println(nf.id);
System.out.println(nf);//adress 
System.out.println("=============================================");

Fruit gh=new Fruit();
gh.apple();
gh.name="apple"; //intialization
gh.colour="red";
gh.size="medium";
gh.id=589;

System.out.println(gh.name);
System.out.println(gh.colour);
System.out.println(gh.size);
System.out.println(gh.id);
System.out.println(gh);//adress 
System.out.println("=============================================");
Fruit rl=new Fruit();
rl.papaya();
rl.name="papaya"; //intialization
rl.colour="dark yellow";
rl.size="too big";
rl.id=689;

System.out.println(rl.name);
System.out.println(rl.colour);
System.out.println(rl.size);
System.out.println(rl.id);
System.out.println(rl);//adress 
System.out.println("=============================================");//int his help get memory address
}
public void mango()
{
    System.out.println("mango is very sweet fruit this fruit is king of all fruit ");
}
public void banana()
{
    System.out.println("this fruit is very good for protien and is also good for digestion");

}
public void apple()
{
System.out.println("this is very good for health and its also reduce stress");
}
public void papaya()
{
    System.out.println("this is very good to increase your platlets");
}

}