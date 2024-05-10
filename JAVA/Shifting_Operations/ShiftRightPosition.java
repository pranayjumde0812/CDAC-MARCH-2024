class ShiftRightPosition
{
  public static void main(String [] args)
 {
  int arr[]={1,2,3,4,5,6,7};

  int temp1=arr[arr.length-1];

  int narr[]=new int[arr.length];

  for(int i=1; i<arr.length; i++)
  {
    narr[i]=arr[i-1];
  }

  narr[0]=temp1;

  for(int i=0; i<narr.length; i++)
  {
	 System.out.print(narr[i]+" ");
  }
 }
}