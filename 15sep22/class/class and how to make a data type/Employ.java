class Employ
/*java is not 100 percent object oriented language because in java we have primitive data type and int this data type we dont need to create a object because
is already pre defined and also non primitive data type we have to create an object
2.in oops concept we deal class an object class is blue print and object is define by class .class doesnt occuipied space  because its blue print 
but object occuipied space 

class will have two characterstics
1.states=it shows the properties of object and class
2.behaviour=behaviour of a class is the action prformed by object*/
{
static String name;
static int age;
static double salary;
static int employ_id;
public static void main(String []args)
{
    work();
    eat();
    sleep();
}
public  void work()
{
    System.out.println("employe is working");


}
public  void eat()
{
     System.out.println("employe is eating");
}
public  void sleep()
{
   System.out.println("employes  is sleeping"); 
}
}

