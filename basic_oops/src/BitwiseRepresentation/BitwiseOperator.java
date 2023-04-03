package BitwiseRepresentation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class BitwiseOperator {

	public static void main(String[] args) throws IOException {

		/*
		 * int a=8;int b=64; System.out.println(a&b); System.out.println(a|b);
		 * System.out.println(a^b); System.out.println(~b);
		 * 
		 * System.out.println((int)'.');
		 * 
		 * int x=recheck(154.55825805664062);
		 * 
		 * System.out.println("x value is"+x);
		 * 
		 * 
		 * File file=new File("E:\\ankit.txt"); if(file.exists()) { file.deleteOnExit();
		 * System.out.println("file is deleted"); } FileWriter fis= new
		 * FileWriter(file);
		 * 
		 * fis.write("ankit yadav is very happy today"); file.setWritable(false);
		 * fis.close();
		 */
   /*  	//amazon ,facebook,vmware
    * 
		String[] arr = { "vikram", "vnjdadn", "vmhdsu", "v122" };
		String word = findLongestprefix(arr);
		String output=word.trim().length()>0?"this array  has a common prefix =>"+word:"this array has no common prefix=> -1";
		System.out.println(output);*/
		
		
		removeFirstletterInEveryWord();
		
	System.out.println(romanNumberToInteger(3));
	
	
//	quest();
	
	//find the distance between two words
	//amazon ,linkeding
	String [] S = {"geeks", "for", "geeks", "contribute", 
    "practice"};
	System.out.println(findDistanceBetweenWords(S,"geeks","practice"));
	//quest();
	
	String s = "@#$%^^&*ab@#&*#%@!acd255kik5*&lk()989";
	 swapping(s,'a','k');
	 main();
	
	}

	public static int recheck(Double actual_Value) {
		double new_Value = actual_Value;
		boolean flag = false;
		String newStr = actual_Value.toString();
		Integer newInt = 0;
		int count = 0;
		for (int i = 0; i < newStr.length(); i++) {
			char c = newStr.charAt(i);
			if (c == 46) {
				flag = true;
			} else if (flag == true && c != 42 && count <= 2) {
				Integer tempInt = Integer.parseInt(String.valueOf(c));
				newInt = newInt * 10 + tempInt;
				count++;
			}

		}
		return newInt > 50 ? ((int) new_Value) + 1 : (int) new_Value;

	}

	//amazon ,facebook,vmware
	public static String findLongestprefix(String[] arr) {
		String prefix = "";
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				arr[i] = prefix;
			}
			if (i < arr.length - 1) {
				prefix = "";
			}
			for (int j = 0; j < arr[i].length(); j++) {
				try {
					char c = arr[i].charAt(j);
					char d = arr[i + 1].charAt(j);
					if (c == d) {
						prefix = prefix + c;
					}
				} catch (IndexOutOfBoundsException e) {
					break;
				}
			}
		}
		return prefix;
	}
	
	public static void removeFirstletterInEveryWord()
	{
       String mrcValue="$79.55";
		String newStr="";
		for(int i=0;i<mrcValue.length();i++)
		{
			char c=mrcValue.charAt(i);
			if((c>=48&&c<=57)||(c==46))
			{
			   newStr=newStr+c;	
			}
		}
		Double val=Double.parseDouble(newStr);
		System.out.println("double value "+val);
		System.out.println("ciel value "+(int)Math.ceil(val));
		
	}
	
	public static String romanNumberToInteger(Integer val)
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		   map.put(1,"|");
		   map.put(2,"||");
		   map.put(3,"|||");
		   
		  return map.get(val);
	}

	//amazon ,linkeding
	public static int findDistanceBetweenWords(String [] givenStr,String firstStr,String secondStr)
	{
		int first_count = 0;
		int second_count = 0;
		for (int i = 0; i < givenStr.length; i++) {
			String arr = givenStr[i];
			if (arr.equals(firstStr)) {
				first_count = i;
			} else if (arr.equals(secondStr)) {
				second_count = i;
			}
		}
		return (second_count - first_count);
	}
	
	/*public static void quest()
	{
		String s = "@#$%^^&*ab@#&*#%@!cd255kik5*&lk()989";
		StringBuffer newStr=new StringBuffer(s).reverse();
		System.out.println(newStr);
		String firstChar="";
		String secondChar="";
		int firstVal=0;
		int secondVal=0;
		boolean flag = false;
		for (int i = firstVal; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				firstChar = String.valueOf(c);
				firstVal = i;
				for (int j = secondVal; j < newStr.length(); j++) {
					char d = newStr.charAt(j);
					if ((d >= 65 && d <= 90) || (d >= 97 && d <= 122)) {
						secondChar = String.valueOf(d);
						secondVal = j+1;
						s=s.replace(firstChar,secondChar);
						break;
					}
				}
			}


		}
		System.out.println(s);

	}*/
	
	public static void swapping(String string,Character firstChar,Character secondChar)
	{
	       
		boolean flag = false;
		int count = 0;
		StringBuffer sb=new StringBuffer(string);
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c == firstChar) {
				sb.setCharAt(i, secondChar);
				c=string.charAt(i+1);
				count++;
			} else if (c == secondChar) {
				sb.setCharAt(i, firstChar);
				System.out.println("string =>"+sb);
				count++;
			}
			if (count == 2) {
				
				break;
			}
		}
         System.out.println("string =>"+sb);
	}

	public static void main()
	{
		
		ArrayList<String> ar=new ArrayList<String>();
		
		String s="&*&^%$%^ab";
		
		for(int i=0;i<s.length();i++)
		{
			Character c=s.charAt(i);
			
			if((c>=65&&c<=90)||(c>=97&&c<=122))
			{
				ar.add(String.valueOf(c));
			}
		}
		System.out.println(ar);
		System.out.println(ar.size());
	}

	
}
