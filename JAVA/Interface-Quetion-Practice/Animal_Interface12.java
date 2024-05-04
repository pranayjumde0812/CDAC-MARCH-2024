/*
12)	Animal interface and cat and dog classes:
Create an interface called Animal that has two abstract methods:
makeSound() and move(). Then create two classes called Cat and Dog that
implement the Animal interface. The Cat class should have an instance variable
for the cat's breed, and the Dog class should have an instance variable for the
dog's weight. Implement the makeSound() and move() methods for each class.
 */


import java.util.Scanner;

interface Animal2{
    void makeSound(String s);
    void move(String s);

    void makeSound(int dWeight);
    void move(int dWeight);
}

class cat implements Animal2 {

    String breed;
    @Override
    public void makeSound(String s) {
     breed=s;

        System.out.println(breed+" Cat making sound");
    }

    @Override
    public void move(String s) {
        breed=s;
        System.out.println(breed+" Cat moving to australia with owner");
    }

    @Override
    public void makeSound(int dWeight) {}

    @Override
    public void move(int dWeight) {}
}

class dog implements Animal2{
    int weight;
    @Override
    public void makeSound(String s) {}

    @Override
    public void move(String s) {}

    @Override
    public void makeSound(int dWeight) {
     weight=dWeight;
        System.out.println("Dog weight "+weight+" is making sound bhau bhau...");
    }

    @Override
    public void move(int dWeight) {
        weight=dWeight;
        System.out.println("Dog weight "+weight+" is moving in the garden");
    }
}
public class Animal_Interface12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cats breed's name: ");
        String CatBreed=sc.nextLine();
        System.out.println("Enter the dog weight: ");
        int dgWeight=sc.nextInt();

        cat ct=new cat();
        ct.makeSound(CatBreed);
        ct.move(CatBreed);

        dog dg=new dog();
        dg.makeSound(dgWeight);
        dg.move(dgWeight);
    }
}
