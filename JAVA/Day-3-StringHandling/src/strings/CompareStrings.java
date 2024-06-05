package strings;

import java.util.Arrays;

public class CompareStrings {

	public static void main(String[] args) {
		String[] names = { "Anish", "Rutva", "Amiti", "Rutuj", "Mihir", "Amiti" };

		System.out.println(names[0].compareTo(names[1]));// <0
		System.out.println(names[2].compareTo(names[0]));// <0
		System.out.println(names[1].compareTo(names[3]));// > 0
		System.out.println(names[2].compareTo(names[5])); // 0
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
//		System.out.println(names.toString());
		findName(names);
	}

	public static void findName(String[] str) {

		boolean flag = false;
		for (String s : str) {
			if (s.contains("Rutva")) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Name is present");
		}else {
			System.out.println("Name is not present");
		}
	}

}
