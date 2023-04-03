package Static_keyword;

class StaticVariable {
	/*global static variable u can access easily inside in this class because where global variable persent
		so here we can acess easily*/	
		static int i=20;
		static int j=40;
		int l;//this is non static keyword here we can make an object if u want to acess
		public static void main(String []args)
		{
			StaticVariable k=new StaticVariable();//this is object
			System.out.println(i);
			System.out.println(j);
			System.out.println(k.l);
			System.out.println(m);
			
		}
		static String m;
		/*this is the first point what we have seen now next point i you want to access static variable in another class so u have to use class name.variable name
		 * example like-  (Static_variable.j) ok lets see in Static_variabledriver program
		 */

}
