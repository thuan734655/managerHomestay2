package Model;

public class Room {
    private int iDRoom;
    private String kindOfRoom;
    private int priceOfRoom;
    private String nameOfRoom;
    private int  eletricityBillByNumber;
    private int   waterBillByNumber;
    private String statusRoom;

    public Room() {
    }

    public Room(int iDRoom, String kindOfRoom, int priceOfRoom, String nameOfRoom, int eletricityBillByNumber, int waterBillByNumber, String statusRoom) {
        this.iDRoom = iDRoom;
        this.kindOfRoom = kindOfRoom;
        this.priceOfRoom = priceOfRoom;
        this.nameOfRoom = nameOfRoom;
        this.eletricityBillByNumber = eletricityBillByNumber;
        this.waterBillByNumber = waterBillByNumber;
        this.statusRoom = statusRoom;
    }

    public int getiDRoom() {
        return iDRoom;
    }

    public void setiDRoom(int iDRoom) {
        this.iDRoom = iDRoom;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getPriceOfRoom() {
        return priceOfRoom;
    }

    public void setPriceOfRoom(int priceOfRoom) {
        this.priceOfRoom = priceOfRoom;
    }

    public String getNameOfRoom() {
        return nameOfRoom;
    }

    public void setNameOfRoom(String nameOfRoom) {
        this.nameOfRoom = nameOfRoom;
    }

    public int getEletricityBillByNumber() {
        return eletricityBillByNumber;
    }

    public void setEletricityBillByNumber(int eletricityBillByNumber) {
        this.eletricityBillByNumber = eletricityBillByNumber;
    }

    public int getWaterBillByNumber() {
        return waterBillByNumber;
    }

    public void setWaterBillByNumber(int waterBillByNumber) {
        this.waterBillByNumber = waterBillByNumber;
    }

    public String getStatusRoom() {
        return statusRoom;
    }

    public void setStatusRoom(String statusRoom) {
        this.statusRoom = statusRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "iDRoom='" + iDRoom + '\'' +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", priceOfRoom=" + priceOfRoom +
                ", nameOfRoom='" + nameOfRoom + '\'' +
                ", eletricityBillByNumber=" + eletricityBillByNumber +
                ", waterBillByNumber=" + waterBillByNumber +
                ", statusRoom='" + statusRoom + '\'' +
                '}';
    }
}
