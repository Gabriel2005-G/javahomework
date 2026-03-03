

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Building Houses ---");


        House house1 = new House(
                3,
                true,
                2,
                1,
                125.5,
                "123 Oak Street"
        );

        House house2 = new House(
                5,
                false,
                3,
                2,
                250.0,
                "456 Maple Avenue"
        );

        System.out.println("House 1 created at: " + house1.getAddress());
        System.out.println("House 2 created at: " + house2.getAddress());


        System.out.println("\n--- Creating House 3 based on House 1 ---");
        House house3 = new House(house1);


        System.out.println("House 1 Area: " + house1.getLivingAreaSize());
        System.out.println("House 3 Area: " + house3.getLivingAreaSize());


        System.out.println("House 1 HashCode: " + house1.hashCode());
        System.out.println("House 3 HashCode: " + house3.hashCode());


        System.out.println("\n--- Verification ---");


        System.out.println("House 1 Rooms: " + house1.getNumberOfRooms());
        System.out.println("House 1 Porch: " + house1.hasPorch());
        System.out.println("House 1 Address: " + house1.getAddress());



        System.out.println("Successfully verified that parameters are read-only (no setters available).");
    }
}

class House {

    private final int numberOfRooms;
    private final boolean hasPorch;
    private final int numberOfBathrooms;
    private final int numberOfBalconies;
    private final double livingAreaSize;
    private final String address;

    public House(int numberOfRooms, boolean hasPorch, int numberOfBathrooms,
                 int numberOfBalconies, double livingAreaSize, String address) {
        this.numberOfRooms = numberOfRooms;
        this.hasPorch = hasPorch;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBalconies = numberOfBalconies;
        this.livingAreaSize = livingAreaSize;
        this.address = address;
    }

    
    public House(House otherHouse) {
        this.numberOfRooms = otherHouse.numberOfRooms;
        this.hasPorch = otherHouse.hasPorch;
        this.numberOfBathrooms = otherHouse.numberOfBathrooms;
        this.numberOfBalconies = otherHouse.numberOfBalconies;
        this.livingAreaSize = otherHouse.livingAreaSize;
        this.address = otherHouse.address; // String is immutable, so reference sharing is safe
    }



    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean hasPorch() {
        return hasPorch;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfBalconies() {
        return numberOfBalconies;
    }

    public double getLivingAreaSize() {
        return livingAreaSize;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    }
}




