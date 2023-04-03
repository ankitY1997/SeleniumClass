package StringClass;

public class String_Mtehods {

	public static void main(String[] args) {
		method1();

		System.out.println("**********this is equals method*********** ");
		method2();
		System.out.println("*****************************");
		method3();
		System.out.println("*************this is intern method********************");
		method4();
		System.out.println("*********this is concat method ***************");
		method5();
		System.out.println("*************this is toUpperCase() method**********");
		method6();
		System.out.println("*********this is compare to method ");
		method7();
		System.out.println("**********this is index position character  method **********");
		method8();
		System.out.println("******this is String index position method************ ");
		method9();
		System.out.println("******this is split method ********* ");
		method10();
		System.out.println("******this is ends with method ********* ");
		method11();
		
		
	}

	public static void method1() {

		// isEmpty()=> this is the method which is used to findout the string
		// is empty or not and gives a result in boolean form
		// if there is a space so it will count that space.

		String s = "ankit";
		String s2 = " ";
		String s3 = "";

		System.out.println(s.isEmpty());// false
		System.out.println(s2.isEmpty());// false(there is a space so it will count
		System.out.println(s3.isEmpty());// true

		System.out.println("=====================================");

		// isBlank()=>is blank method is also check weather string is empty or not but
		// there is one difference it doesn't count space but in isEmpty method counts a
		// space also
		// lets see

		String s4 = "ankit";
		String s5 = " ";
		String s6 = "";

		System.out.println(s4.isBlank());// false
		System.out.println(s5.isBlank());// true //why but there is a space so its also a one string
		// yes you are right but is Blank method doesnot count a spaces so here it will
		// give a result true

		System.out.println(s6.isBlank());// true

//	String word=" ";
//	System.out.println(isThere(word));

	}

	/*
	 * public static boolean isThere(String l) { String s=l; char []
	 * m=s.toCharArray(); boolean flag=false; for (char c :m) { if(!(c==32)) {
	 * flag=true; } } return flag;
	 * 
	 * }
	 */

	// equals(String)=>equals method is used to compare the content of two string .
	// and its return type is boolean if two string is same then it will give
	// result true other wise it will print false

	public static void method2() {
		String name = "ankit";
		String name1 = "ankit";
		String name2 = "Ankit";

		System.out.println(name.equals(name2));// here it will print false
		// because it will in upper case so its not match
		System.out.println(name.equals(name1));// here it will print true
	}

	// equalsIgnoreCase(String)=>it will also compare two string .but it will not
	// consider a case

	public static void method3() {

		String name = "ankit";
		String name1 = "Ankit";

		System.out.println("equlasIgnoreCase method reuslt is :=>" + name.equalsIgnoreCase(name1));
		// here it will print the result true but why its different because case is
		// different
		// one is upper case another one is lower case so why it will give true
		// because here we can compare through equalsIgnoreCase thatswhy it will pint
		// true/

	}

	public static void method4() {

		// intern()=>this method is used to create an one object in s.c.p area supposed

		// if you write like this String s=new String("mohan");=>if you create instance
		// like this

//so it creates instance in heap area and also scp area but if you
// u use intern method so it will create object in  only scp area 

		String s6 = new String("mohan");
		String s7 = new String("mohan");

		System.out.println(s6.equals(s7));// true

		System.out.println(s6 == s7);// false

		System.out.println("======================");

		// now i am using intern method see result will be change

		String s8 = new String("sohan").intern();
		String s9 = new String("sohan").intern();

		// See both cases result will be a true because now both object present in scp
		// area both
		// are targeted in one object because content are same
		System.out.println(s8.equals(s9));
		System.out.println(s8 == s9);

		System.out.println("condition no 3");

		String s1 = new String("kamal");
		String s2 = new String("kamal");

		s1.intern();
		s2.intern();

		System.out.println(s1 == s2);// false//
		System.out.println(s1.equals(s2));// true

	}

	// concat(String)=>concat is a method of a string class which is used to concat
	// the word

	public static void method5() {
		String s1 = new String("mohan is");

		s1.concat(" happy");// now we don't have a reference of this is happy
		System.out.println(s1);

	}

	public static void method6() {
		// to upper case()=>it is a method which is used to convert lower case to upper
		// case .

		String s1 = "ankit";

		s1 = s1.toUpperCase();
		System.out.println(s1);

		System.out.println("this is lower case method ");
		System.out.println(s1.toLowerCase());

	}

	public static void method7() {

		// compareTO()=>this is the method which is used to compare two string
		// lexiCographically.

		String s = "Ankit";// 65
							// difference of first word is 32
		String s1 = "ankit";// 97
		System.out.println(s.compareTo(s1));// -32

		System.out.println("condition no 2");
		String s2 = "Mohan";
		String s3 = "Moh";
		System.out.println(s2.compareTo(s3));// 2

		String s4 = "Orders";
		String s5 = "Linking";
		System.out.println("this is compare to" + s5.compareTo(s4));
		// here it will give result 2 because in this case those string letters are same
		// at that time we will get different result because at that time it will
		// compare the length

	}

	public static void method8() {
		// indexOf(char)=>this method is used to identify the number and here you will
		// put
		// the character then it will show the index number of this character what
		// character is present
		// in this index .if character is not there then it will give the output -1

		String s1 = " ankit is very happy";

		System.out.println(s1.indexOf('a'));// 0
		System.out.println(s1.indexOf("e"));// -1(doesn't have a E character in this string

		System.out.println("condition no 2");

		// now if you want to give the condition like
		System.out.println(s1.indexOf('a', 8));
		// System.out.println(s1.trim());

	}

	public static void method9() {

		// now if you want to findout the string index number so we have an another
		// method

		String s2 = "ankit yadav yadav";

		System.out.println(s2.indexOf("ya"));

		System.out.println(s2.indexOf("ya", 8));
		// this means ya string after 8 index value

	}

	/**split(argument)=>this is the split method which is used to split the word according to pass the argument
	 *             and its split  in array format.
	 */
	public static void method10()
	{
		String s1="ankit yadav";
		
		String[] arr=s1.split(" ");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}
	/**
	 * endsWith(argument)=>its a method which is used to check a suffix its return type is boolean.
	 */
	
	public static void method11()
	{
		String s1="ankit ankit";
		
		System.out.println(s1.endsWith("ankit"));
	}
	
	
}
