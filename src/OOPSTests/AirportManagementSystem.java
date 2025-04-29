package OOPSTests;
abstract class FlyingMachine {
    String model;
    int maxSpeed;

    FlyingMachine ( String model, int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    abstract void fly();
    void land() {
        System.out.println(model+ " is landing normally");
    }
    void land(boolean emergency){
        if (emergency){
            System.out.println(model + " is performing an EMERGENCY landing");
        } else {
            land();
        }
    }


    void showInfo(){
        System.out.println("This is model: " + model + "| This has maximum speed: " + maxSpeed + " km/h");
    }

}
interface ElectricPower{
    void chargeBattery();
    int batteryLevel();
}
class Jet extends FlyingMachine{
    Jet(String model, int maxSpeed){
        super(model, maxSpeed);
    }

    @Override
    void fly() {
        System.out.println(model + "The jet is flying using fuel");
    }

}
class ElectricDrone extends FlyingMachine implements ElectricPower{
    ElectricDrone(String model, int maxSpeed){
        super(model, maxSpeed);
    }

    @Override
    void fly() {
        System.out.println(model + " Electric drone is flyingwitch electricity");
    }


    @Override
    public void chargeBattery() {
        System.out.println(model + " is charging its battery");
    }

    @Override
    public int batteryLevel() {
        return (int)(Math.random() * 101);

    }
}
class HybridHelicopter extends FlyingMachine implements ElectricPower{
    HybridHelicopter(String model, int maxSpeed){
        super(model, maxSpeed);
    }

    @Override
    void fly() {
        System.out.println(model + "Hybrid Helicopter is flying using hybrid system");
    }

    @Override
    public void chargeBattery() {
        System.out.println(model + " Hybrid Helicopter is charging its electric module");
    }

    @Override
    public int batteryLevel() {
        return (int)(Math.random() * 101);

    }
}
public class AirportManagementSystem {
    public static void main(String[] args) {
        FlyingMachine[]flyingMachines = {
                new Jet("Jet001", 300),
                new ElectricDrone("Xiaomi", 100),
                new Jet("Jet002", 400),
                new HybridHelicopter("Helicop01",200),
                new ElectricDrone("Xiaomi 02", 150)
        };
        for (FlyingMachine flyingMachine: flyingMachines) {
            flyingMachine.showInfo();
            flyingMachine.fly();
            flyingMachine.land(Math.random() > 0.8);
            if ( flyingMachine instanceof ElectricPower) {
                ((ElectricPower) flyingMachine).chargeBattery();
                int battery = ((ElectricPower) flyingMachine).batteryLevel();
                System.out.println("Battery level: " + battery + "%");
            }
            System.out.println("----------------");
        }
    }
}

