public class Main {
    public static void main(String[] args) {

        String str = "AZBYCXMN";

        char[] chars = str.toUpperCase().toCharArray();

        String string = convertString(chars);
        System.out.println(str);
        System.out.println(string);
    }

    public static String convertString(char[] ch) {
        StringBuilder nStr = new StringBuilder();

        for (char value : ch) {

            int c = 78 - value;

            nStr.append((char) (c + 77));
        }

        return nStr.toString();
    }
}