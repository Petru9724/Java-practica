package Abstractia;

abstract class Transport {

    abstract void Drive();

    abstract void Fuel();

    String model;
    int speed;

    Transport (String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    void ShowInfo(){
        System.out.println("Masina de marca : " + model + " | Merge cu viteza :" + speed + " km/h");
    }

}

interface Electric {
    void ChargingElectricity();

}

class Car extends Transport {
    Car(String model, int speed){
        super(model, speed);
    }

    @Override
    void Drive() {
        System.out.println("Masina merge pe 4 roti");
    }

    @Override
    void Fuel() {
        System.out.println("Masina se incarca cu combustibil");
    }

}

class Bike extends Transport implements Electric{
    Bike(String model, int speed){
        super(model, speed);
    }
    @Override
    void Drive() {
        System.out.println("Motocicleta merge pe 2 roti");
    }

    @Override
    void Fuel() {
    }

    @Override
    public void ChargingElectricity() {
        System.out.println("Motocicleta merge pe electricitate");
    }
}

class Scoter extends Transport {
  Scoter(String model, int speed){
      super(model, speed);
  }

    @Override
    void Drive() {
        System.out.println("Scuterul merge pe 2 roti");
    }

    @Override
    void Fuel() {
        System.out.println("Scuterul se incarca cu conbustibil");
    }
}

public class TransportTest {
    public static void main(String[] args) {
        Transport[] transports = {
                new Car("Mazerati", 100),
                new Bike("Kawasaki", 120),
                new Scoter("Delphi", 60)
        };
        for (Transport transport : transports) {
            transport.Drive();
            transport.Fuel();
            transport.ShowInfo();

            if (transport instanceof Electric){
                ((Electric) transport).ChargingElectricity();
            }
            System.out.println("--------------------");
        }

    }
}