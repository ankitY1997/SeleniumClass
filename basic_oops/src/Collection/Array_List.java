package Collection;

public class Array_List {
	
	
	/* ArrayList is class which implements List interface and now we have all list method and also collection methods and it is 
	 * also implements RandomAccess interface 
	 * 
	 *  
	 *  Properties of ArrayList =>
	 *  
	 *  1)In array list we also  store a group of  object at individual place
	 *  
	 *  2)In ArrayList we are using a dynamic array as a data structure  to store a data which is available in shrink from and it's also 
	 *   keep growing and shrinking according to conditions 
	 *   
	 *  3)Insertion order will be maintained 
	 *  
	 *  4)we can add a multiple duplicate value 
	 *  
	 *   5)In ArrayList  we have continuous memory block 
	 *   
	 *   6)ArrayList already has 10 size by default 
	 *   
	 *   7)ArrayList we have an indexing so we can also perform multiple operation through an indexing
	 *   
	 *   
	 * Constructor Of ArrayList =>  
	 *   
	 * 1)  ArrayList arr=new ArrayList();
	 *   
	 *   by this constructor we can add or removed a object and the size of ArrayList is not fixed   by default its size is 
	 *   10.
	 *   
	 *   but there is a one concept of load factor 
	 *   
	 *   
	 *   if we can fill above the 70 percent of space in memory block so it will automatically increase it size up to 50 percent  
	 *   
	 *  Load factor =Old ArrayList Size *70/100;
	 *  
	 *  if we fill the load factor 
	 *  
	 *  so at that time size will be =(OldArraySize)+(oldArraySize*50/100+1);
	 *  
	 *  
	 *  2)ArrayList arr=new ArrayList(10)
	 *  
	 *  this constructor we can also give a size of array list at initial stage 
	 *  
	 *  
	 *  3)ArrayList arr=new ArrayList(Collection c)
	 *  
	 *  
	 * this constructor helps  we can also add collection 
	 *   
	 * 
	 * 
	 * 
	 * =========================================================================
	 * 
	 * Q)what is the reason why Array is faster then ArrayList?
	 * 
	 * => because in ArrayList we can't fixed the size of array . if Load factor is increased it will increased it's size also and  
	 *  all previous data copied at new Array and it's very slow process so its take a too time but in case of array  array size 
	 *  is fixed and we can't increased its size so that's why array become faster rather than ArrayList.
	 *  
	 *  
	 *  advantage of ArrayList =>
	 *  
	 *  1)we can prefer ArrayList when we have to perform searching and access operations
	 *  
	 *  
	 *  Disadvantage of Array_List=>
	 *  
	 *  1)we can't use ArrayList when you have to perform adding or removing operations because  its taking a too time 
	 *  its shift bit wise 
	 *  
	 *    
	 *   
	 *   
	 */
	
	

}
