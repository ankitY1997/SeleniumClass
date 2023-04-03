package Abstratction;

abstract  class Car extends Viechle
{
	public static  final String name="this car";
	
	public abstract void engine();
	public abstract void door();
	
	public static void playMusic()
	{
		System.out.println("the car has a music system");
	}
	
}
