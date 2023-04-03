class Animal
{
    String name;
    String colour;
    int age;
    int weight;

    public void animalDetail(String n,String c,int a,int w )
    {
        name=n;
        colour=c;
        age= a;
        weight=w;
    } 
    public void printMethod()
    {
        System.out.println("animal details");
        System.out.println("name of a animal is :"+name);
        System.out.println("colour of animal is : "+colour);
        System.out.println("age of animal is :"+age);
        System.out.println("weight of animal is :"+weight);
        System.out.println("=================================");
    }
}