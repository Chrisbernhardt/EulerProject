class EulerSix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int squareNat = 0;
		int sumNat = 0;
		for(int x = 1; x <= 100; x ++)
		{
			squareNat += (x * x);
			sumNat += x;
		}
		sumNat = sumNat * sumNat;
		System.out.println("Euler Six: " + (sumNat - squareNat));
	}
}
