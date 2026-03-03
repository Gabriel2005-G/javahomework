public static void main1(String[] args){
 class Main {

    public static void main(String[] args) {
        System.out.println("--- Building Houses ---");

        // Methodology 1: Building houses by specifying parameters individually
        House house1 = new House(
                3,              // rooms
                true,           // hasPorch
                2,              // bathrooms
                1,              // balconies
                125.5,          // livingAreaSize
                "123 Oak Street" // address
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

        // Methodology 2: Building a house by repeating parameters of another house (Copy Constructor)
        System.out.println("\n--- Creating House 3 based on House 1 ---");
        House house3 = new House(house1);

        // Verification of Independence:
        // Even though house3 was built based on house1, they are two separate objects.
        // Let's verify parameters are the same but objects are independent.
        System.out.println("House 1 Area: " + house1.getLivingAreaSize());
        System.out.println("House 3 Area: " + house3.getLivingAreaSize());
        
        // We can also check hashcodes to prove they are different objects in memory
        System.out.out.println("House 1 HashCode: " + house1.hashCode());
        System.out.println("House 3 HashCode: " + house3.hashCode());

        // Verification of Requirements
        System.out.println("\n--- Verification ---");
        
        // 1. Accessing parameters separately
        System.out.println("House 1 Rooms: " + house1.getNumberOfRooms());
        System.out.println("House 1 Porch: " + house1.hasPorch());
        System.out.println("House 1 Address: " + house1.getAddress());

        // 2. Attempting to change parameters (Demonstrating Immutability/Protection)
        // The following lines would cause a compile-time error because fields are private:
        // house1.address = "New Address"; // Error: address has private access
        // house1.hasPorch = false;        // Error: hasPorch has private access
        
        // There are no "setter" methods in the class, so the object state cannot be altered.
        System.out.println("Successfully verified that parameters are read-only (no setters available).");
    }
}

class House {
    // 1. Parameters protected from direct interference (private)
    // 2. Parameters cannot be changed (final)
    private final int numberOfRooms;
    private final boolean hasPorch;
    private final int numberOfBathrooms;
    private final int numberOfBalconies;
    private final double livingAreaSize;
    private final String address;

    /**
     * Methodology 1: Constructor using specific parameters.
     */
    public House(int numberOfRooms, boolean hasPorch, int numberOfBathrooms, 
                 int numberOfBalconies, double livingAreaSize, String address) {
        this.numberOfRooms = numberOfRooms;
        this.hasPorch = hasPorch;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfBalconies = numberOfBalconies;
        this.livingAreaSize = livingAreaSize;
        this.address = address;
    }

    /**
     * Methodology 2: Constructor repeating parameters of another house (Copy Constructor).
     * This creates an independent house with the same values.
     */
    public House(House otherHouse) {
        this.numberOfRooms = otherHouse.numberOfRooms;
        this.hasPorch = otherHouse.hasPorch;
        this.numberOfBathrooms = otherHouse.numberOfBathrooms;
        this.numberOfBalconies = otherHouse.numberOfBalconies;
        this.livingAreaSize = otherHouse.livingAreaSize;
        this.address = otherHouse.address; // String is immutable, so reference sharing is safe
    }

    // 3. Parameters can be taken separately (Getters only, no Setters)
    
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
}