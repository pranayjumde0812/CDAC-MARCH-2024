class ShiftRight2Position
{
  public static void main(String [] args)
 {
  int arr[]={1,2,3,4,5,6,7};

  int temp1=arr[arr.length-1];
  int temp2=arr[arr.length-2];

  int narr[]=new int[arr.length];

  for(int i=2; i<arr.length; i++)
  {
    narr[i]=arr[i-2];
  }

  narr[1]=temp1;
  narr[0]=temp2;

  for(int i=0; i<narr.length; i++)
  {
	 System.out.print(narr[i]+" ");
  }
 }
}