/*2) Animal interface and dog and cat classes:
Create an interface called Animal that has two abstract methods: makeSound()
and move(). Then create two classes called Dog and Cat that implement the
Animal interface. The Dog class should have an instance variable for the dog's
breed, and the Cat class should have an instance variable for the cat's name.
Implement the makeSound() and move() methods for each class.*/

import java.util.Scanner;

interface Animal{
 void makeSound(String s);
 void move(String s);
}

class Dog implements Animal{
    String dogBreed;
    @Override
    public void makeSound(String s) {
        dogBreed=s;
        System.out.println(dogBreed+" is barking bhau bhau....");
    }

    @Override
    public void move(String s) {
        dogBreed=s;
        System.out.println(dogBreed+" is moving to the left");
    }
}
class Cat implements Animal{
    String catName;
    @Override
    public void makeSound(String s) {
     catName=s;
     System.out.println(catName+" is making sound maow maow");
    }

    @Override
    public void move(String s) {
        catName=s;
        System.out.println(catName+" is moving in the garden");
    }
}
public class AnimalInterface2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dog breed's name: ");
        String DgBreed=sc.nextLine();
        System.out.println("Enter the cat name: ");
        String CtNam=sc.nextLine();

        Dog dg=new Dog();
        dg.makeSound(DgBreed);
        dg.move(DgBreed);

        Cat ct=new Cat();
        ct.makeSound(CtNam);
        ct.move(CtNam);
    }
}
