package com.intro;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WbsiteDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the web site name");
		String name=sc.nextLine();
	    Websites web=new Websites();
	    web.web(name);
	

	}

}
