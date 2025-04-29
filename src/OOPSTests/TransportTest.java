package OOPSTests;

abstract class FlyingTransport {
    String model;
    int maxAltitude;

    FlyingTransport(String model, int maxAltitude) {
        this.model = model;
        this.maxAltitude = maxAltitude;
    }

    abstract void fly();

    abstract void land();

    void showInfo() {
        System.out.println("This model: " + model + "; Max altitude is: " + maxAltitude + " m d.MN");
    }
}

interface Electric {
    void chargeBattery();
}

class Airplane extends FlyingTransport {
    Airplane(String model, int maxAltitude) {
        super(model, maxAltitude);
    }

    @Override
    void fly() {
        System.out.println("The airplane is flying");
    }

    @Override
    void land() {
        System.out.println("Airplane is landing");
    }

}

class Drone extends FlyingTransport implements Electric {
    Drone(String model, int maxAltitude) {
        super(model, maxAltitude);

    }

    @Override
    void fly() {
        System.out.println("The drone is flying");
    }

    @Override
    void land() {
        System.out.println("Drone is lading");
    }

    @Override
    public void chargeBattery() {
        System.out.println("The drone us electricity");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("This model is of made in China");
    }
}

class Helicopter extends FlyingTransport {
    Helicopter(String model, int maxAltitude) {
        super(model, maxAltitude);
    }

    @Override
    void fly() {
        System.out.println("The helicopter is flying");
    }

    @Override
    void land() {
        System.out.println("Helicopter landing vertical");
    }
}

public class TransportTest {
    public static void main(String[] args) {
        FlyingTransport[] flyingTransports = {
                new Airplane("AirBuss", 3000),
                new Drone("Xiaomi", 150),
                new Helicopter("Transformer", 1000)
        };
        for (FlyingTransport flyingTransport : flyingTransports) {
            flyingTransport.showInfo();
            flyingTransport.fly();
            flyingTransport.land();

            if (flyingTransport instanceof Electric) {
                ((Electric) flyingTransport).chargeBattery();
            }
            System.out.println("-----------------");
        }
    }
}