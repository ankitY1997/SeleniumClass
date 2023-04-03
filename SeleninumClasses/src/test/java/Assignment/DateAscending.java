package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DateAscending {
	
	
	
	public static void main(String[] args) {
		
		
		
		List<String> tempList=new ArrayList<String>();
		tempList.add(" 1/1/2023");
		tempList.add(" 1/1/2023");
		tempList.add(" 1/1/2023");
		tempList.add(" 1/1/2023");
		tempList.add(" 12/14/2022");
		tempList.add(" 10/19/2022");
		tempList.add(" 9/19/2022");
		tempList.add(" 8/17/2022");
		tempList.add(" 8/14/2022");
		tempList.add(" 8/11/2022");
		
		Comparator<String>com=new SortinComp();
		Collections.sort(tempList,com);
		System.out.println(tempList);
		
		
		
		
	}

}
