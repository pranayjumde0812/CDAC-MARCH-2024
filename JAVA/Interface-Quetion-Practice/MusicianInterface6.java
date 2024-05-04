/*
6)	Musician interface and guitar and drums classes:
Create an interface called Musician that has two abstract methods: playInstrument() and sing().
 Then create two classes called Guitarist and Drummer that implement the Musician interface.
 The Guitarist class should have an instance variable for the guitar's brand, and the Drummer
 class should have an instance variable for the drum's size. Implement the playInstrument()
 and sing() methods for each class.
 */

interface Musician{
    void playInstrument();
    void sing();
}

 class Guitarist implements Musician{
    @Override
     public void playInstrument(){
        System.out.println(" Guitarist play Guitar");
    }
    @Override
     public void sing(){
        System.out.println(" Guitarist singing ");
    }
 }

 class Drummer implements Musician{
    @Override
     public void playInstrument(){
        System.out.println("Drummer play drum");
    }
    @Override
     public void sing(){
        System.out.println("Drummer sings ");
    }
 }
public class MusicianInterface6 {
    public static void main(String[] args) {
        Guitarist gt=new Guitarist();
        gt.playInstrument();
        gt.sing();

        Drummer dm=new Drummer();
        dm.playInstrument();
        dm.sing();
    }
}
