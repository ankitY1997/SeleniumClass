package object_intialization_by_using_constructor;

 class Employe_driver
 {
	//static String t="ultratech cement";
	 public static void main(String []args)
	 {
	  
	 	Employe x=new Employe("kamalaKant yadav","Sr.loco pilot","loco","1aug1968","O+",4160,54,45000);
	 		x.showValue();	
	 		System.out.println(x.t); 
	 		Employe v=new Employe("ankit yadav","Software engineer","It","24 jan 1997","O+",4570,25,27000);
	 		v.showValue();
	 }
}
