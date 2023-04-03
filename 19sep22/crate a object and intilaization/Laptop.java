class Laptop
{
    String comp_name;
    String colour;
    double size;
    String sn_no;
    int product_number;


    public static void main(String []args)
    {
        Laptop a=new Laptop();
        a.coding();
        a.comp_name="dell";
        a.colour="black";
        a.size=120*300;
        a.sn_no="12snef485";
        a.product_number=54789;
        System.out.println(a);
         System.out.println(a.comp_name);
        System.out.println(a.colour);
        System.out.println(a.size);
        System.out.println(a.sn_no);
        System.out.println(a.product_number);
        System.out.println("==============================================");



       Laptop b=new Laptop();
        b.learning();
        b.comp_name="hewelt packward";
        b.colour="silver";
        b.size=120*400;
        b.sn_no="sne471";
        b.product_number=45879620;
        System.out.println(b);// address of memory
         System.out.println(b.comp_name);
        System.out.println(b.colour);
        System.out.println(b.size);
        System.out.println(b.sn_no);
        System.out.println(b.product_number);
        System.out.println("==============================================");




        Laptop c=new Laptop();
        c.game();
        c.comp_name="mac";
        c.colour="grey";
        c.size=50*100;
        c.sn_no="5ed1458";
        c.product_number=0012345;
        System.out.println(c); //for memory address you can create that object
         System.out.println(c.comp_name);
        System.out.println(c.colour);
        System.out.println(c.size);
        System.out.println(c.sn_no);
        System.out.println(c.product_number);
        System.out.println("==============================================");



    }
    public void coding()
    {
        System.out.println("with help of laptop we can do coding");
    }
    public void learning()
    {
        System.out.println("with help of laptop we can lean every thing");
    }
    public void game()
    {
        System.out.println("with help of laptop we can play a game");
    }


}