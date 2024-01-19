package Model;

import java.util.Date;

public class RentalStatus {
    private int idRenter;
    private int  idRoom;
    private Date rentalDay;
    private String rentalStatus;
    private String payForRoom;
    private int checkCreateBll = 0;
    private Date newRentalDay = null;


    public RentalStatus(int idRenter, int idRoom, Date rentalDay, String rentalStatus, String payForRoom) {
        this.idRenter = idRenter;
        this.idRoom = idRoom;
        this.rentalDay = rentalDay;
        this.rentalStatus = rentalStatus;
        this.payForRoom = payForRoom;
    }


    public RentalStatus(int idRenter, int idRoom, Date rentalDay, String rentalStatus, String payForRoom, int checkCreateBll) {
        this.idRenter = idRenter;
        this.idRoom = idRoom;
        this.rentalDay = rentalDay;
        this.rentalStatus = rentalStatus;
        this.payForRoom = payForRoom;
        this.checkCreateBll = checkCreateBll;
    }

    public RentalStatus(int idRenter, int idRoom, Date rentalDay, String rentalStatus, String payForRoom, int checkCreateBll, Date newRentalDay) {
        this.idRenter = idRenter;
        this.idRoom = idRoom;
        this.rentalDay = rentalDay;
        this.rentalStatus = rentalStatus;
        this.payForRoom = payForRoom;
        this.checkCreateBll = checkCreateBll;
        this.newRentalDay = newRentalDay;
    }

    public int getIdRenter() {
        return idRenter;
    }


    public int getIdRoom() {
        return idRoom;
    }


    public Date getRentalDay() {
        return rentalDay;
    }



    public String getRentalStatus() {
        return rentalStatus;
    }



    public String getPayForRoom() {
        return payForRoom;
    }

    public void setPayForRoom(String payForRoom) {
        this.payForRoom = payForRoom;
    }

    public int getCheckCreateBll() {
        return checkCreateBll;
    }

    public Date getNewRentalDay() {
        return newRentalDay;
    }

    @Override
    public String toString() {
        return "RentalStatus{" +
                "idRenter='" + idRenter + '\'' +
                ", idRoom='" + idRoom + '\'' +
                ", rentalDay=" + rentalDay +
                ", rentalStatus='" + rentalStatus + '\'' +
                ", payForRoom='" + payForRoom + '\'' +
                '}';
    }
}
