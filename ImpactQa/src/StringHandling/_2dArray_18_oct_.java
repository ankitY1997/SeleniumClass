package StringHandling;

public class _2dArray_18_oct_ 
{
public static void main(String[] args)
{
	//2D-array means you have two rows and two column
	
/*Syntax:-datatyppe [] [] varname=new datatype[][];
 * 
 * []-first array is  for rows 
 * []-second array is for column
 * 
 * 
 */
	String[][]data=new String[3][3];
	data[0][0]="first name";
	data[0][1]="last name";
	//data[0][2]="address";
	data[1][0]="sagar";
	data[2][0]="ankit";
	                     //RIGHT PROCESS
    data[1][1]="bisla";
    data[2][1]="dhonchak";
    int count=0;
    //System.out.println(data[0].length);
  
	//data[2][0]="vishnu";
	//data[2][1]="bisla";
	//data[2][2]="dhonchak";
	//data[2][1]="parsad";  WRONG PROCESS
	/*data[0][2]="faridabad";
	data[1][2]="rohini";
	data[2][2]="ashok nagar";*/
	
	//System.out.println(data.length);//this show the length of rows
	
	//if you want to know the length of column than you take a reference of row [0]
	//System.out.println(data[0].length); 
	
	for(int i=0, j=0;i<data[0].length;i++,j++)
	{ 
		count++;
		
		if(count==3)
		{
		i=1;
		System.out.println(data[i][j]);
		}
		else if(count<=2)
			{
			if(count<=2)
				{
				j=0;
				System.out.print(data[i][j]+" ");
				}
		//System.out.print(data[i][j]+" ");
		else if(count==2)
		{
			count++;
			j=0;
			//System.out.println(count);
		}
			}
		
	}
	
}
}
