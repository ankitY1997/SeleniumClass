class Employe
{
    String name; // properties
    int age;
    double salary;
    int employe_id;
    public void work() //action perfomed by object-employe (behaviour)
    {
        System.out.println("employe is working");
    }
    public void eat()
    {
        System.out.println("employe is eating");
    }
    public void sleep()
    {
        System.out.println("employe is sleeping");
    }
    public static void main(String[] args)
    {
        Employe sc=new Employe(); //if u wanted to see non static variable and mehod  then u create an object so let us see
        // always take a class name then varable name = new variable(); example Employe vc=new Employe();

        System.out.println(sc.name);
        sc.work();
    }
}