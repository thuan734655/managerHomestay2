package View.ManagerView;

import Controller.ManagerController.RoomInfController;

import javax.swing.*;
import java.awt.*;

public class PaneRoomInf extends JPanel {
    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);

    private ImageIcon iconRoomRI= new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\icons8-house-100.png");

    // chinh sua kich thuoc cua iconRoom
    Image iconRoomImgRI = iconRoomRI.getImage();
    ImageIcon resizeIconRoomRI = new ImageIcon(iconRoomImgRI.getScaledInstance(100,100,Image.SCALE_SMOOTH));

    private JLabel iconRoom1LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom2LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom3LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom4LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom5LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom6LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom7LabelRI= new JLabel(resizeIconRoomRI);
    private JLabel iconRoom8LabelRI= new JLabel(resizeIconRoomRI);

    private JLabel room1RI = new JLabel("Room 1");
    private JLabel room2RI = new JLabel("Room 2");
    private JLabel room3RI = new JLabel("Room 3");
    private JLabel room4RI = new JLabel("Room 4");
    private JLabel room5RI = new JLabel("Room 5");
    private JLabel room6RI = new JLabel("Room 6");
    private JLabel room7RI = new JLabel("Room 7");
    private JLabel room8RI = new JLabel("Room 8");

    private RoomInfController roomInfController = new RoomInfController(this);

    private SpringLayout springLayout = new SpringLayout();

    public PaneRoomInf() {
        this.setPreferredSize(new Dimension(1100,800));
        this.setBackground(new Color(240,255,255));
        this.setLayout(springLayout);

        this.add(iconRoom1LabelRI);
        this.add(iconRoom2LabelRI);
        this.add(iconRoom3LabelRI);
        this.add(iconRoom4LabelRI);
        this.add(iconRoom5LabelRI);
        this.add(iconRoom6LabelRI);
        this.add(iconRoom7LabelRI);
        this.add(iconRoom8LabelRI);
        this.add(room1RI);
        this.add(room2RI);
        this.add(room3RI);
        this.add(room4RI);
        this.add(room5RI);
        this.add(room6RI);
        this.add(room7RI);
        this.add(room8RI);

        room1RI.setFont(fontDialog);
        room2RI.setFont(fontDialog);
        room3RI.setFont(fontDialog);
        room4RI.setFont(fontDialog);
        room5RI.setFont(fontDialog);
        room6RI.setFont(fontDialog);
        room7RI.setFont(fontDialog);
        room8RI.setFont(fontDialog);

        room1RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room2RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room3RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room4RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room5RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room6RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room7RI.setCursor(new Cursor(Cursor.HAND_CURSOR));
        room8RI.setCursor(new Cursor(Cursor.HAND_CURSOR));

        springLayout.putConstraint(springLayout.NORTH, iconRoom1LabelRI , 100, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom1LabelRI , 380, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom2LabelRI , 100, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom2LabelRI , 610, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom3LabelRI , 100, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom3LabelRI , 850, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom4LabelRI , 280, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom4LabelRI , 380, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom5LabelRI , 280, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom5LabelRI , 610, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom6LabelRI , 280, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom6LabelRI , 850, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom7LabelRI , 460, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom7LabelRI , 380, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, iconRoom8LabelRI , 460, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, iconRoom8LabelRI , 610, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room1RI , 205, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room1RI , 405, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room2RI , 205, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room2RI , 635, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room3RI , 205, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room3RI , 875, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room4RI , 385, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room4RI , 405, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room5RI , 385, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room5RI , 635, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room6RI , 385, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room6RI , 875, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room7RI , 560, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room7RI , 405, springLayout.WEST,this);

        springLayout.putConstraint(springLayout.NORTH, room8RI , 560, springLayout.NORTH,this);
        springLayout.putConstraint(springLayout.WEST, room8RI , 635, springLayout.WEST,this);

        room1RI.addMouseListener(roomInfController);
        room2RI.addMouseListener(roomInfController);
        room3RI.addMouseListener(roomInfController);
        room4RI.addMouseListener(roomInfController);
        room5RI.addMouseListener(roomInfController);
        room6RI.addMouseListener(roomInfController);
        room7RI.addMouseListener(roomInfController);
        room8RI.addMouseListener(roomInfController);

    }


}
