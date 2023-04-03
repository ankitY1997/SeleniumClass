package StringClass;

public class Practice {
	
	
	//distance between two string
	
	
	public static int distanceOfString(String firstWord, String secondWord) {
		String[] a = { "ankit", "shree", "nikii", "raju" };
		int first_indexNum = 0;
		int second_indexNum = 0;
		int count = 1;
		int distance_ofString;
		for (int i = 0; i < a.length; i++) {

			if (a[i].equals(firstWord)) {
				first_indexNum = count;
			}
			if (a[i].equals(secondWord)) {
				second_indexNum = count;

			}
			count++;
		}
		if (first_indexNum >= second_indexNum) {
			distance_ofString = first_indexNum - second_indexNum;
		} else {
			distance_ofString = second_indexNum - first_indexNum;
		}

		return distance_ofString;
	}

	public static void main(String[] args) {

		System.out.println(distanceOfString("nikii", "nikii"));
		
		System.out.println(countOfCloseBrackets("(((())))("));
		int A[] = {2,4,6,8,9,10,12,13};
		int B[] = {2,4,6,8,10,12,9};
		System.out.println("missing number=>"+findExtra(A,B));
	}
	
	//question 2
	
	public static int countOfCloseBrackets(String brackets)
	{
	   int i=0;
		while((brackets.indexOf("()",i)!=-1))
		{
			i++;
		}
		
		return i;
	}
	
	//question 3
	
	public static int findExtra(int a[],int b[])
	{
		int count = 0;
		int missingNum = -1;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			  count=0;
		      flag=false;
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				} else if (flag == false && count == b.length - 1) {
					missingNum = a[i];
				}
				count++;
			}
		}
		return missingNum;
	}

}
