package OverRiding;

public class Player {

	public static void main(String[] args) {
		
		StartGame p=new StartGame();
		Game v=p.pressButton();
		v.use();
		System.out.println(v);
		
		
		
		

	}

}
