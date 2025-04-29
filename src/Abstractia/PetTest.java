package Abstractia;

class Pet {
    String name;
    int age;

    Pet (String name , int age){
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Face sunetul :");
    }

    void getDetails() {
        System.out.println("Animalul :" + name + " are virsta de " + age + " ani");
    }
}
class Dog extends Pet{
    Dog(String name, int age){
        super(name,age);
    }
    @Override
    void makeSound() {
        System.out.println("Canele face Ham ham");
    }
}
class Cat extends Pet{
    Cat(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Pisica face miu miu");
    }
}
class Parrot extends Pet{
    Parrot(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound() {
        System.out.println("Papagalul face cria cria");
    }
}
public class PetTest{
    public static void main(String[] args) {
       Pet[] pets = {
               new Dog("Scubi", 5),
               new Cat("Mona ", 2),
               new Parrot("Roscatul", 1)
       };
       for (Pet pet : pets){
           pet.getDetails();
           pet.makeSound();
           System.out.println("---------------------");
       }

    }

}