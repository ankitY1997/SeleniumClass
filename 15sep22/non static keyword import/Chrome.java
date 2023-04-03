class Chrome
{
    String flie_name="text";
    Chrome chrome_size;
    String chrome_colour;
    String chrome_data_base_name;
    public void search()
    {
        System.out.println("chrome is able to searching every thing");
    }
    public void music()
    {
        
        System.out.println("chrome is able to play every music");
    
    }
    public void video()
    {
        System.out.println("chrome is able to play or show a video");
    }
    public void place()
    {
        System.out.println("chrome helps u can wandering every place in the world in virtual medium");
    }
    public void information()
    {
        System.out.println("chrome provides whole world information");
    }
    public void request()
    {
        System.out.println("chrome helps u can send a request and directly communicate to the server");
    }
    public static void main(String []args)
    {
        Chrome cc=new Chrome(); // create an object
        
        cc.search();
    cc.music();
   System.out.println(cc.chrome_colour);
   System.out.println(cc.chrome_data_base_name);
   System.out.println(cc.chrome_size);
   System.out.println(cc.flie_name);
   cc.place();
   System.out.println(cc.chrome_size);

   

    }
}