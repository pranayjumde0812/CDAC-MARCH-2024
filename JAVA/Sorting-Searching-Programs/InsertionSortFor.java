import java.util.Scanner;

public class InsertionSortFor {

        static int [] insertionSortMethod(int arr[]) {
            int key, pre;
            for (int i = 1; i < arr.length; i++) {
                key = arr[i];
                pre = i - 1;
                for (int j = 0; j < arr.length; j++) {
                    if(pre>=0 && arr[pre] > key){
                        arr[pre+1]=arr[pre];
                        pre--;
                    }
                    else
                        arr[pre+1]=key;
                }

            }
            return arr;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size = sc.nextInt();
            int arr[] = new int[size];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int res[] = insertionSortMethod(arr);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(res[i] + " ");
            }
        }
}
