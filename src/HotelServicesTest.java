import java.util.Scanner;

abstract class Room {
    int roomNumber;
    double priceRoom;
    boolean isAvailable;

    Room(int roomNumber, double priceRoom) {
        this.roomNumber = roomNumber;
        this.priceRoom = priceRoom;
        this.isAvailable = true;
    }

    abstract void showInfo();

    void reserveRoom() {
        if (!isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " is reserve");
        } else System.out.println(" Room " + roomNumber + "is already free.");
    }

    void releaseRoom() {
        if (isAvailable) {
            isAvailable = true;
            System.out.println("Room " + roomNumber + " was released");
        } else System.out.println(" Room " + roomNumber + "is released");

    }

}

interface LuxuryRoom {
    void showLuxuryServices();
}

class SingleRoom extends Room {
    SingleRoom(int roomNumber, double priceRoom) {
        super(roomNumber, priceRoom);
    }

    @Override
    void showInfo() {
        System.out.println(" Single Room - Number :" + roomNumber + " Price room : $" + priceRoom + " is available" + isAvailable);
    }
}

class DobleRoom extends Room {
    DobleRoom(int roomNumber, double priceRoom) {
        super(roomNumber, priceRoom);
    }

    @Override
    void showInfo() {
        System.out.println(" Double Room - Number :" + roomNumber + " Price room : $" + priceRoom + " is available" + isAvailable);
    }

}

class SuiteRoom extends Room implements LuxuryRoom {
    SuiteRoom(int roomNumber, double priceRoom) {
        super(roomNumber, priceRoom);
    }

    @Override
    void showInfo() {
        System.out.println("Suite Room - Number :" + roomNumber + " Price room : $" + priceRoom + " is available" + isAvailable);
    }

    @Override
    public void showLuxuryServices() {
        System.out.println("Luxury Services: SPA, jacuzzi, massage");
    }
}

public class HotelServicesTest {
    public static void main(String[] args) {
        Room[] rooms = {
                new SingleRoom(100, 150),
                new DobleRoom(101, 250),
                new SuiteRoom(103, 500)
        };
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Show the room");
            System.out.println("2. Reserve the room");
            System.out.println("3. Clear the room");
            System.out.println("4. Exit");
            System.out.println("Choose the option");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    for (Room room : rooms) {
                        room.showInfo();
                        if (room instanceof LuxuryRoom) {
                            ((LuxuryRoom) room).showLuxuryServices();
                        }
                        System.out.println("----------");
                    }
                    break;
                case 2:
                    System.out.println("Enter the reserved room number: ");
                    int reserveRoom = sc.nextInt();
                    for (Room room : rooms) {
                        if (room.roomNumber == reserveRoom) {
                            room.reserveRoom();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the release room number: ");
                    int releaseNumber = sc.nextInt();
                    for (Room room : rooms) {
                        if (room.roomNumber == releaseNumber) {
                            room.releaseRoom();
                        }
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Default option");
            }
        }
        sc.close();
    }
}