package Upcasting;

public class D extends C{

	public static void main(String[] args) {
		
		// so this is the concept of up casting and down casting 
		A v1=new B();
		
		/*so at the time of up casting b create a new object and fill the property
		*now B class has a three properties like i and j and k but A class that means 
		 * parent class only one states is i so at time of upcasting we will only call parent 
		 * reference variable that means i we won't be able to call j and k 
		 * so lets see*/
		
		System.out.println(v1.i);
		//System.out.println(v1.j);//so see here it is thorwing an error while it is present inside B class
		//System.out.println(v1.k);//
		
	/*	if you want to call  all property so we can do down casting like that*/
		
		B s1=(B)v1;//this is down casting now we will able to fetch the all data
		System.out.println(s1.i);
		System.out.println(s1.j);
		System.out.println(s1.k);
		
		//next we will take c
		
		B m1=new C();
		
		// In class c we have a 6 property three is declared (l,m,o) and three is inherited (i,j,k)
		
		//so we will only call which is present in B class see
		
		System.out.println(m1.i);
		System.out.println(m1.j);
		System.out.println(m1.k);
		
		//but we won't be able to call c property
		
		/*System.out.println(m1.l);//so see its throwing an error while its present inside the class
		System.out.println(m1.m);
		System.out.println(m1.n); */
		
	// this is the down casting now we will also callC class states 	
		
	C t1=(C)m1;
	System.out.println(t1.l);
	System.out.println(t1.m);
	System.out.println(t1.n);
		
	}

}
