package Model;

import java.util.Date;

public class Renter {
    private int idRenter;
    private int rentedRoom;
    private String surnameOfRenter;
    private String middlenameOfRenter;
    private String nameOfRenter;
    private String  numberOfPhone;
    private Date birth;
    private String gender;
    private String citizenIdentificationCard;
    private String email;

    public Renter() {
    }

    public Renter(int idRenter, int rentedRoom, String surnameOfRenter, String middlenameOfRenter, String nameOfRenter, String numberOfPhone, Date birth, String gender, String citizenIdentificationCard,String email) {
        this.idRenter = idRenter;
        this.rentedRoom = rentedRoom;
        this.surnameOfRenter = surnameOfRenter;
        this.middlenameOfRenter = middlenameOfRenter;
        this.nameOfRenter = nameOfRenter;
        this.numberOfPhone = numberOfPhone;
        this.birth = birth;
        this.gender = gender;
        this.citizenIdentificationCard = citizenIdentificationCard;
        this.email = email;
    }

    public Renter(int rentedRoom, String surnameOfRenter, String middlenameOfRenter, String nameOfRenter, String numberOfPhone, Date birth, String gender, String citizenIdentificationCard) {
        this.rentedRoom = rentedRoom;
        this.surnameOfRenter = surnameOfRenter;
        this.middlenameOfRenter = middlenameOfRenter;
        this.nameOfRenter = nameOfRenter;
        this.numberOfPhone = numberOfPhone;
        this.birth = birth;
        this.gender = gender;
        this.citizenIdentificationCard = citizenIdentificationCard;
    }

    public String getSurnameOfRenter() {
        return surnameOfRenter;
    }

    public void setSurnameOfRenter(String surnameOfRenter) {
        this.surnameOfRenter = surnameOfRenter;
    }

    public String getMiddlenameOfRenter() {
        return middlenameOfRenter;
    }

    public void setMiddlenameOfRenter(String middlenameOfRenter) {
        this.middlenameOfRenter = middlenameOfRenter;
    }

    public int getIdRenter() {
        return idRenter;
    }

    public void setIdRenter(int idRente) {
        this.idRenter = idRente;
    }

    public int getRentedRoom() {
        return rentedRoom;
    }

    public void setRentedRoom(int rentedRoom) {
        this.rentedRoom = rentedRoom;
    }

    public String getNameOfRenter() {
        return nameOfRenter;
    }

    public void setNameOfRenter(String nameOfRenter) {
        this.nameOfRenter = nameOfRenter;
    }

    public String getNumberOfPhone() {
        return numberOfPhone;
    }

    public void setNumberOfPhone(String numberOfPhone) {
        this.numberOfPhone = numberOfPhone;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getCitizenIdentificationCard() {
        return citizenIdentificationCard;
    }

    public void setCitizenIdentificationCard(String citizenIdentificationCard) {
        this.citizenIdentificationCard = citizenIdentificationCard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Renter{" + "idRenter='" + idRenter + '\'' + ", rentedRoom='" + rentedRoom + '\'' + ", surnameOfRenter='" + surnameOfRenter + '\'' + ", middlenameOfRenter='" + middlenameOfRenter + '\'' + ", nameOfRenter='" + nameOfRenter + '\'' + ", numberOfPhone='" + numberOfPhone + '\'' + ", birth=" + birth + ", gender='" + gender + '\'' + ", citizenIdentificationCard='" + citizenIdentificationCard + '\'' + '}';
    }
}
