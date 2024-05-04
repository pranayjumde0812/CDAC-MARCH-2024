/*
8)Sports interface and basketball and football classes:
Create an interface called Sports that has two abstract methods:
playGame() and getEquipment(). Then create two classes called Basketball
and Football that implement the Sports interface. The Basketball class should
have an instance variable for the ball's size, and the Football class should
have an instance variable for the football's shape. Implement the playGame()
and getEquipment() methods for each class.
 */

interface Sports{
    void playGame();
    void getEquipment();
}
class Basketball implements Sports{
    int ball_size;
    @Override
    public void playGame() {

    }

    @Override
    public void getEquipment() {

    }
}

class Football implements Sports{
    String football_shape;
    @Override
    public void playGame() {

    }

    @Override
    public void getEquipment() {

    }
}
public class SportsInterface8 {
    public static void main(String[] args) {

    }
}
