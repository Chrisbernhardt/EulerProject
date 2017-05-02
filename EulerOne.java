class EulerOne
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum = 0;
		for(int x = 1; x <= 1000; x ++)
		{
			if(x % 3 == 0 || x % 5 == 0)
				sum += x;
		}
		System.out.println("Euler One: " + sum);
	}
}
