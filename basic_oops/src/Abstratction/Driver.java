package Abstratction;

public class Driver {

	public static void main(String[] args) {
		
		Viechle v=new Body();
		
		//viechle only shows his method which is available inside the child class
		v.colour();
		v.name();
		Viechle.gear();
		
		//but car has a all method because abstract car class extends ViechleClass
		//so thats why we are able to call all this method which is present both class
		//so lets see
		Car c=new Body();
		c.colour();
		c.door();
		c.engine();
		c.gear();
		c.name();
		c.playMusic();
		
		//see we will do it 
		
	}

}
