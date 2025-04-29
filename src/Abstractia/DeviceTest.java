package Abstractia;

interface Device {
    void turnOn();
    void turnOff();
}
class Laptop implements Device{
    @Override
    public void turnOn() {
        System.out.println("Laptopul se aprinde");

    }

    @Override
    public void turnOff() {
        System.out.println("Laptopul se stinge");
    }
}
class Smartphone implements Device{
    @Override
    public void turnOn() {
        System.out.println("Telefonul se aprinde");
    }

    @Override
    public void turnOff() {
        System.out.println("Telefonul se stinge");

    }
}
class Tablet implements Device{
    @Override
    public void turnOn() {
        System.out.println("Tableta se aprinde");

    }

    @Override
    public void turnOff() {
        System.out.println("Tableta se stinge");

    }
}
public class DeviceTest {
    public static void main(String[] args) {
        Device[]  devices = {
                new Laptop(),
                new Smartphone(),
                new Tablet()
        };
        for (Device device : devices){
            device.turnOn();
            device.turnOff();
            System.out.println("-------------------------");
        }
    }
}