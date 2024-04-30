import java.util.*;

public class SingleNumber {

    // This is bruteforce algorithm
    public int getSingleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
        // TC: O(n)  SC: O(n)
    }
    //////////////////////////////////////////////////////////////

    public int singleNumber(int[] nums) {

        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            answer = answer ^ nums[i];
        }
        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SingleNumber singleNumber = new SingleNumber();

        try {
            System.out.print("Enter the range of an Array: ");
            int range = sc.nextInt();

            int[] array = new int[range];
            System.out.println("Enter the elements in the array: ");

            for (int i = 0; i < range; i++) {
                array[i] = sc.nextInt();
            }

            int result = singleNumber.getSingleNumber(array);
            System.out.println("The single numbers in array is: " + result);

            ///////////////////////////////////////////////////

            int res = singleNumber.singleNumber(array);
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


    }

}
