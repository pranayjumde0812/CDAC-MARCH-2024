public class NumberTable {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 8; j++) {
//                System.out.print(j + "x" + i + "=" + j * i + ", ");
//            }
//            System.out.println();
//        }


        /////////////////////////////////////////////////////////////
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 8) {
                System.out.print(j + "x" + i + "=" + j * i + ", ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
