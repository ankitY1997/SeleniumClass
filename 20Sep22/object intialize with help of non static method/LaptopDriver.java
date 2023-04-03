class LaptopDriver
{
    public static void main(String []args)
    {
        Laptop s=new Laptop();
        System.out.println("addres of s object is: "+s);
        s.studentDetail("dell",120*60,45781,"black");
        s.printMethod();
        Laptop v=new Laptop();
        System.out.println("addres of s object is: "+v);
        v.studentDetail("mac book",147*241,458470,"white");
        v.printMethod();

        Laptop f=new Laptop();
        System.out.println("addres of s object is: "+f);
        f.studentDetail("hewelt packyard",241*45,458250,"silver");
        f.printMethod();

    }
}