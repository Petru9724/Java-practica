package Abstractia;

abstract class Animal {
    abstract void MakeSound();

    abstract void move();

    abstract void sleep();

    abstract void eat();
    int age;

    Animal (int age){
        this.age = age;
    }
    void showAge (){
        System.out.println("Virsta animalului: " + age + " Ani ");
    }
}

class birdAnimal extends Animal {
    birdAnimal(int age){
        super(age);
    }

    @Override
    void MakeSound() {
        System.out.println("Pasarea face sunet specific");
    }

    @Override
    void move() {
        System.out.println("Pasarea zboara");

    }

    @Override
    void sleep() {
        System.out.println("Pasarea doarme noaptea");

    }

    @Override
    void eat() {
        System.out.println("Pasarea maninca boabe");

    }
}

class FishAnimal extends Animal {
    FishAnimal(int age){
        super(age);
    }
    @Override
    void MakeSound() {
        System.out.println("Pestele nu face sunet");

    }

    @Override
    void sleep()
    {
        System.out.println("Pestele nu doarme");
    }

    @Override
    void eat() {
        System.out.println("Pestele maninca mancare specifica");

    }

    @Override
    void move() {
        System.out.println("Pestele inaoata in apa");

    }
}
class MamalAnimal extends Animal{
    MamalAnimal(int age){
        super(age);
    }
    @Override
    void move() {
        System.out.println("Mamiferul se misca pe pamint ");

    }

    @Override
    void MakeSound() {
        System.out.println("Mamiferul face sunete speficice");

    }

    @Override
    void eat() {
        System.out.println("Mamiferul maninca iarba");

    }

    @Override
    void sleep() {
        System.out.println("Mamiferul doarme noaptea");

    }
}
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animal = {
                new birdAnimal(5),
                new FishAnimal(6),
                new MamalAnimal(6)

        };
              for (Animal animal1 : animal){
                  animal1.eat();
                  animal1.move();
                  animal1.MakeSound();
                  animal1.sleep();
                  animal1.showAge();
              }

    }
}
