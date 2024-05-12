class Patterns2_25feb
{
 public static void main(String [] args)
 {
   int k=65;
  for(int i=0;i<5;i++)
    {
  	  for(int j=0;j<5;j++)
  	  {
  		System.out.print((char)(j+k));
  	  }
       k=k+5;
  	  System.out.println();
  }
 }
}

                   /*             ABCDE
                                  FGHIJ
                                  KLMNO
                                  PQRST
                                  UVWXY            */