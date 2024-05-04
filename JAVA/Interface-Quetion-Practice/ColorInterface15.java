/*15)	Color interface and red, green, and blue classes:
Create an interface called Color that has one abstract method: getColorCode().
Then create three classes called Red, Green, and Blue that implement the Color interface.
Each class should have an instance variable for its corresponding color code (e.g., "FF0000" for red).
Implement the getColorCode() method for each class.
 */

interface Color{
    void getColorCode(String code);

}

class Red implements Color{
    String rCode;
    @Override
    public void getColorCode(String code) {

    }
}
class Green implements Color{
    String gCode;
    @Override
    public void getColorCode(String code) {

    }
}
class Blue implements Color{
    String bCode;
    @Override
    public void getColorCode(String code) {

    }
}
public class ColorInterface15 {
    public static void main(String[] args) {

    }
}
