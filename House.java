public class House {

    private int roomsCount;
    private boolean hasEntrance;
    private int bathroomsCount;
    private int balconiesCount;
    private double livingArea;
    private String address;

    // 1️⃣ Սովորական կոնստրուկտոր
    public House(int roomsCount,
                 boolean hasEntrance,
                 int bathroomsCount,
                 int balconiesCount,
                 double livingArea,
                 String address) {

        this.roomsCount = roomsCount;
        this.hasEntrance = hasEntrance;
        this.bathroomsCount = bathroomsCount;
        this.balconiesCount = balconiesCount;
        this.livingArea = livingArea;
        this.address = address;
    }

    // 2️⃣ Copy constructor
    public House(House other) {
        this.roomsCount = other.roomsCount;
        this.hasEntrance = other.hasEntrance;
        this.bathroomsCount = other.bathroomsCount;
        this.balconiesCount = other.balconiesCount;
        this.livingArea = other.livingArea;
        this.address = other.address;
    }

    // GETTERS
    public int getRoomsCount() {
        return roomsCount;
    }

    public boolean hasEntrance() {
        return hasEntrance;
    }

    public int getBathroomsCount() {
        return bathroomsCount;
    }

    public int getBalconiesCount() {
        return balconiesCount;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public String getAddress() {
        return address;
    }

    // SETTERS (չկան address և hasEntrance-ի համար)
    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public void setBathroomsCount(int bathroomsCount) {
        this.bathroomsCount = bathroomsCount;
    }

    public void setBalconiesCount(int balconiesCount) {
        this.balconiesCount = balconiesCount;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }
}