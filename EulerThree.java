class EulerThree
{
 public static void main (String[] args) throws java.lang.Exception
 {
   long sum = 0L;
   long numToDivide = 600851475143L;
   for(long x = 0L; x < (600851475143L / 2L) + 1L; x ++)
   {
     for(long y = 0L; y >= x + 1L; y ++)
     {
       if( x % y == 0L)
         break;
       else if( numToDivide % y == 0 )
         sum = y;
     }
  }
  System.out.println("Euler Three: " + sum);
  }
}
