package February_1;

public class SmallestAndLongestWordInString {

    public static void main(String[] args) {


        String string = "My name is Anthony Gonsalways";

        String[] s = string.split(" ");

        String largestWord = "";
        String smallestWord = s[0];

        for (String str : s) {

            if (str.length() > largestWord.length()) {
                largestWord = null;
                largestWord = str;
            }

            if (smallestWord.length() > str.length()) {
                smallestWord = null;
                smallestWord = str;
            }

        }
        System.out.println(largestWord);
        System.out.println(smallestWord);

    }


}
