package com.intro;
import java.util.Scanner;

public class UrlChild {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the webside");
		String name=sc.nextLine();
		OpeningUrlParent cd=new OpeningUrlParent();
		cd.url(name);
		
	}

}
