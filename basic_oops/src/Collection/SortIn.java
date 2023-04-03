package Collection;

import java.util.Comparator;

public class SortIn  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		if((Integer)o1>(Integer)o2)
		{
			return 1;
		}
		return -1;
	}

	


	

}
