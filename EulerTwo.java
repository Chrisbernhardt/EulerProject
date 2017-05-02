import java.util.*;
class EulerTwo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1); ls.add(2); int sum = 2;
		for(int x = 1; ls.get(ls.size() - 1) <= 4000000; x ++)
		{
			ls.add(ls.get(x) + ls.get(x-1));
			if(ls.get(x + 1) % 2 == 0)
				sum += ls.get(x+1);
		}
		System.out.println("Euler Two: " + sum);
	}
}
