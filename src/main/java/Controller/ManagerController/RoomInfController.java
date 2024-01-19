package Controller.ManagerController;

import Controller.Feature.Feature;
import DAO.RoomDAO;
import Model.Room;
import View.ManagerView.PaneRoomInf;
import View.ManagerView.PaneShowRoomInf;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RoomInfController extends MouseAdapter   {
    RoomDAO roomDAO = new RoomDAO();
    Feature feature  = new Feature();
    PaneRoomInf paneRoomInf;
    public RoomInfController(PaneRoomInf paneRoomInf) {
        this.paneRoomInf = paneRoomInf;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JLabel lable = (JLabel) e.getSource();
        switch (lable.getText()) {
            case "Room 1" : {
                Room room = roomDAO.selectByID(1);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());

                break;
            }
            case "Room 2" : {
                Room room = roomDAO.selectByID(2);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());

                break;
            }
            case "Room 3" : {
                Room room = roomDAO.selectByID(3);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());

                break;
            }
            case "Room 4" : {
                Room room = roomDAO.selectByID(4);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());

                break;
            }
            case "Room 5" : {
                Room room = roomDAO.selectByID(5);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());
                break;
            }
            case "Room 6" : {
                Room room = roomDAO.selectByID(6);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());

                break;
            }
            case "Room 7" : {
                Room room = roomDAO.selectByID(7);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());

                break;
            }
            case "Room 8" : {
                Room room = roomDAO.selectByID(8);
                PaneShowRoomInf paneShowRoomInf = new PaneShowRoomInf();

                paneShowRoomInf.getIdRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getiDRoom()+"");
                paneShowRoomInf.getNameOfRoomInfSR().setText(room.getNameOfRoom());
                paneShowRoomInf.getKindOfRoomInfSR().setText(room.getKindOfRoom());
                paneShowRoomInf.getPriceOfRoomInfSR().setText(getPriceRoom(room));
                paneShowRoomInf.getElectricityNumberInfSR().setText(getPriceElectricity(room));
                paneShowRoomInf.getWaterBillByNumberInfSR().setText(getPriceWater(room));
                paneShowRoomInf.getStatusRoomInfSR().setText(room.getStatusRoom());
                break;
            }

        }
    }

    @Override
    public void mouseEntered (MouseEvent e) {
        JLabel lable = (JLabel) e.getSource();
        switch (lable.getText()) {
            case "Room 1": {
                lable.setForeground(new Color(137,	137,	137));

                break;
            }
            case "Room 2": {
                lable.setForeground(new Color(137,137,137));
                break;
            }
            case "Room 3": {
                lable.setForeground(new Color(137,	137,	137));
                break;
            }
            case "Room 4": {
                lable.setForeground(new Color(137,	137,	137));
                break;
            }
            case "Room 5": {
                lable.setForeground(new Color(137,	137,	137));
                break;
            }
            case "Room 6": {
                lable.setForeground(new Color(137,	137,	137));
                break;
            }
            case "Room 7": {
                lable.setForeground(new Color(137,	137,	137));
                break;
            }
            case "Room 8": {
                lable.setForeground(new Color(137,	137,	137));
                break;
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JLabel lable = (JLabel) e.getSource();
        switch (lable.getText()) {
            case "Room 1": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 2": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 3": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 4": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 5": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 6": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 7": {
                lable.setForeground(Color.BLACK);

                break;
            }
            case "Room 8": {
                lable.setForeground(Color.BLACK);

                break;
            }
        }
    }

    public String getPriceRoom(Room room) {
        String price = room.getPriceOfRoom()+"";
        int lenght = price.length();
        while (lenght > 3) {
            lenght -= 3;
            price =  feature.insertString(price,".",lenght);
        }
        return price+"VND";
    }

    public String getPriceElectricity(Room room) {
        String price = room.getEletricityBillByNumber()+"";
        int lenght = price.length();
        while (lenght > 3) {
            lenght -= 3;
            price =  feature.insertString(price,".",lenght);
        }
        return price+"VND";
    }

    public String getPriceWater(Room room) {
        String price = room.getWaterBillByNumber()+"";
        int lenght = price.length();
        while (lenght > 3) {
            lenght -= 3;
            price =  feature.insertString(price,".",lenght);
        }
        return price+"VND";
    }



}
