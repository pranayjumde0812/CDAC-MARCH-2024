/* 16)	Game interface and chess and checkers classes:
Create an interface called Game that has two abstract methods:
play() and getRules(). Then create two classes called Chess and Checkers that
implement the Game interface. The Chess class should have an instance variable
for the number of pieces, and the Checkers class should have an instance variable
for the size of the board. Implement the play() and getRules() methods for each class.
 */

interface Game{
    void play();
    void getRules();
}
class Chess implements Game{
    int numOfPiece;

    @Override
    public void play() {

    }

    @Override
    public void getRules() {

    }
}
class Checkers implements Game{
    int SizeOfBoard;

    @Override
    public void play() {

    }

    @Override
    public void getRules() {

    }
}
public class GameInterface15 {
    public static void main(String[] args) {

        Chess c=new Chess();
        c.play();
        c.getRules();

        Checkers ch=new Checkers();
        ch.play();
        ch.getRules();
    }
}
