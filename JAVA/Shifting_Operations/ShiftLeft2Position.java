class ShiftLeft2Position
{
  public static void main(String [] args)
 {
  int arr[]={1,2,3,4,5,6,7};
  int temp1=arr[0];
  int temp2=arr[1];

  int narr[]=new int[arr.length];

  for(int i=0; i<arr.length-2; i++)
  {
    narr[i]=arr[i+2];
  }

  narr[narr.length-2]=temp1;
  narr[narr.length-1]=temp2;

  for(int i=0; i<narr.length; i++)
  {
	 System.out.print(narr[i]+" ");
  }
 }
}