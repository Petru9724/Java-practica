package Abstractia;

class Shape {
    void draw() {

    }

    void area() {

    }
}

class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Cercul are arie");
    }

    @Override
    void draw() {
        System.out.println("Cercul este rotund");
    }
}

class Rectale extends Shape {
    @Override
    void area() {
        System.out.println("Aria dreptunghiului este 10mp");
    }

    @Override
    void draw() {
        System.out.println("Dreptunghiul are doua laturi pare");
    }
}

class Triangle extends Shape {
    @Override
    void area() {
        System.out.println("Aria Triunghiului");
    }

    @Override
    void draw() {
        System.out.println("Triunghiul are toate 3 laturi egale");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Rectale(),
                new Triangle()
        };
        for (Shape shape : shapes) {
            shape.area();
            shape.draw();
            System.out.println("----------------------");
        }
    }
}