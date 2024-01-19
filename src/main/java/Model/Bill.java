package Model;

import java.util.Date;

public class Bill {
    private int idBill;
    private int idRenter;
    private int idRoom;
    private Date dateCreateBill ;
    private int numberOfCubicWater;
    private int numberOfElectricity;
    private int moneyToPay;
    private String statusBill;


    public Bill(int idBill, int idRenter, int idRoom, Date dateCreateBill, int numberOfCubicWater, int numberOfElectricity, int moneyToPay, String statusBill) {
        this.idBill = idBill;
        this.idRenter = idRenter;
        this.idRoom = idRoom;
        this.dateCreateBill = dateCreateBill;
        this.numberOfCubicWater = numberOfCubicWater;
        this.numberOfElectricity = numberOfElectricity;
        this.moneyToPay = moneyToPay;
        this.statusBill = statusBill;
    }

    public int getMoneyToPay() {
        return moneyToPay;
    }

    public int getIdBill() {
        return idBill;
    }

    public int getIdRenter() {
        return idRenter;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public Date getDateCreateBill() {
        return dateCreateBill;
    }

    public int getNumberOfCubicWater() {
        return numberOfCubicWater;
    }

    public int getNumberOfElectricity() {
        return numberOfElectricity;
    }

    public String getStatusBill() {
        return statusBill;
    }



    @Override
    public String toString() {
        return "Bill{" +
                "idBill=" + idBill +
                ", idRenter=" + idRenter +
                ", idRoom=" + idRoom +
                ", dateCreateBill=" + dateCreateBill +
                ", numberOfCubicWater=" + numberOfCubicWater +
                ", numberOfElectricity=" + numberOfElectricity +
                ", statusBill='" + statusBill + '\'' +
                '}';
    }
}
