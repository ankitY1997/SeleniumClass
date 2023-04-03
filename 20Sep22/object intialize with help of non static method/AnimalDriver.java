class AnimalDriver
{
    public static void main(String []args)
    {
        Animal x=new Animal();
        x.animalDetail("dog","black",4,38);
        x.printMethod();
        Animal v=new Animal();
        v.animalDetail("camel","dusky brown",55,140);
        v.printMethod();
        Animal c=new Animal();
        c.animalDetail("cow","light yellow",24,100);
        c.printMethod();
    }
}