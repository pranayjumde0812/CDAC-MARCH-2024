/*WAP to find first biggest element and second biggest elements*/

class FstBigSecBig
{

	     static int [] sort(int arr[])
		 {
			 for(int i=0; i<arr.length; i++)
			 {
				for(int j=i+1; j<arr.length; j++)
				{
					if(arr[i]>arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			 }
			 return arr;
	     }


  public static void main(String [] args)
  {
    int arr[]={10,20,52,91,55,66,88};

    sort(arr);
    int fbig=arr[arr.length-1];
    int sbig=arr[arr.length-2];



	System.out.println("First biggest elements = "+fbig);
	System.out.println("Second biggest elements = "+sbig);
  }
}