package Abstractia;

abstract class Instrument {
    String type;
    int price;

    Instrument(String type, int price) {
        this.type = type;
        this.price = price;
    }

    abstract void play();

    abstract void maintenance();

    void showInfo() {
        System.out.println("Type the instrument : " + type + " | its price : " + price + " USD");
    }

}

interface ElectricInstrument {
    void plugIn();
}

class Guitar extends Instrument implements ElectricInstrument {
    Guitar(String type, int price) {
        super(type, price);
    }

    @Override
    void play() {
        System.out.println("Guitar play solo rock");

    }

    @Override
    void maintenance() {
        System.out.println("Guitar must be tuned regularly");
    }

    @Override
    public void plugIn() {
        System.out.println("The guitar is connect to amplifier");
    }
}

class Drum extends Instrument {
    Drum(String type, int price) {
        super(type, price);
    }

    @Override
    void play() {
        System.out.println("The drum gives rhythm intensive");
    }

    @Override
    void maintenance() {
        System.out.println("The drum must be stretched out sometimes");
    }
}

class Violin extends Instrument {
    Violin(String type, int price) {
        super(type, price);
    }

    @Override
    void play() {
        System.out.println("Violin play beautiful");
    }

    @Override
    void maintenance() {
        System.out.println("The violin must be changing the strings");
    }

}

public class InstrumentTest {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar("Six Strings", 2000),
                new Drum("Bass", 5000),
                new Violin("Four Strings", 560)
        };
        for (Instrument instrument : instruments) {
            instrument.play();
            instrument.maintenance();
            instrument.showInfo();

            if (instrument instanceof ElectricInstrument) {
                ((ElectricInstrument) instrument).plugIn();
            }
            System.out.println("------------");
        }

    }
}