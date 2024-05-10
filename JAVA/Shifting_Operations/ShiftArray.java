import java.util.Scanner;

class ShiftArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array : ");
		int len=sc.nextInt();
		int arr[]=new int[len];
		int tem[]=new int[len-1];
		System.out.println("Enter the Elements an array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int num=arr[0];
		for(int i=0;i<tem.length;i++)
		{
			tem[i]=arr[i+1];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i!=(len-1))
			{
				arr[i]=tem[i];
			}
			else
				arr[i]=num;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
}

/*WAP in java to left rotate array by 1 position*/
