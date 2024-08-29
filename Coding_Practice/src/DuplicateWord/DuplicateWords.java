package DuplicateWord;

public class DuplicateWords {

    public static void main(String[] args) {

        String string = "Big black bug bit a big black dog on his big black nose";

        int count;

        string = string.toLowerCase();

        String[] s = string.split(" ");

        System.out.println("Duplicates words are ");

        for (int i = 0; i < s.length; i++) {
            count = 1;
            for (int j = i + 1; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    count++;
                    s[j] = "0";
                }
            }

            if (count > 1 && s[i] != "0") {
                System.out.println(s[i]);
            }
        }
    }
}
