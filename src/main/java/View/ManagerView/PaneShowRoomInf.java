package View.ManagerView;

import javax.swing.*;
import java.awt.*;

public class PaneShowRoomInf extends JFrame {
    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);
    private Font fontsans_serif = new Font(Font.SANS_SERIF , Font.BOLD | Font.PLAIN , 12);
    private JLabel idRoomSR= new JLabel("ID room:");
    private JLabel kindOfRoomSR= new JLabel("Kind of room:");
    private JLabel priceOfRoomSR= new JLabel("Price of room:");
    private JLabel nameOfRoomSR= new JLabel("Name of room:");
    private JLabel electricityNumberSR= new JLabel("Eletricity bill by number:");
    private JLabel waterBillByNumberSR= new JLabel("Water bill by number:");
    private JLabel statusRoomSR= new JLabel("Status room:");

    private JLabel idRoomInfSR= new JLabel("ID room information");
    private JLabel kindOfRoomInfSR= new JLabel("Kind of room information");
    private JLabel priceOfRoomInfSR= new JLabel("Price of room information");
    private JLabel nameOfRoomInfSR= new JLabel("Name of room information");
    private JLabel electricityNumberInfSR= new JLabel("Eletricity bill by number information");
    private JLabel waterBillByNumberInfSR= new JLabel("Water bill by number information");
    private JLabel statusRoomInfSR= new JLabel("Status room information");
    private  SpringLayout springLayout = new SpringLayout();


    public PaneShowRoomInf()  {
        super("Room information");
        init();
        this.setVisible(true);

    }
    public void init() {
        this.setSize(new Dimension(500,400));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(springLayout);

        this.add(idRoomSR);
        this.add(kindOfRoomSR);
        this.add(priceOfRoomSR);
        this.add(nameOfRoomSR);
        this.add(electricityNumberSR);
        this.add(waterBillByNumberSR);
        this.add(statusRoomSR);
        this.add(idRoomInfSR);
        this.add(kindOfRoomInfSR);
        this.add(priceOfRoomInfSR);
        this.add(nameOfRoomInfSR);
        this.add(electricityNumberInfSR);
        this.add(waterBillByNumberInfSR);
        this.add(statusRoomInfSR);

        idRoomSR.setFont(fontDialog);
        kindOfRoomSR.setFont(fontDialog);
        priceOfRoomSR.setFont(fontDialog);
        nameOfRoomSR.setFont(fontDialog);
        statusRoomSR.setFont(fontDialog);
        electricityNumberSR.setFont(fontDialog);
        waterBillByNumberSR.setFont(fontDialog);

        idRoomInfSR.setFont(fontsans_serif);
        kindOfRoomInfSR.setFont(fontsans_serif);
        priceOfRoomInfSR.setFont(fontsans_serif);
        nameOfRoomInfSR.setFont(fontsans_serif);
        statusRoomInfSR.setFont(fontsans_serif);
        electricityNumberInfSR.setFont(fontsans_serif);
        waterBillByNumberInfSR.setFont(fontsans_serif);

        idRoomInfSR.setForeground(new Color(80,85,85));
        kindOfRoomInfSR.setForeground(new Color(80,85,85));
        priceOfRoomInfSR.setForeground(new Color(80,85,85));
        nameOfRoomInfSR.setForeground(new Color(80,85,85));
        statusRoomInfSR.setForeground(new Color(80,85,85));
        electricityNumberInfSR.setForeground(new Color(80,85,85));
        waterBillByNumberInfSR.setForeground(new Color(80,85,85));


        springLayout.putConstraint(springLayout.NORTH,  idRoomSR,40,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  idRoomSR,  60,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  nameOfRoomSR,80,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  nameOfRoomSR,  60,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  kindOfRoomSR,120,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  kindOfRoomSR,  60,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  priceOfRoomSR,160,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  priceOfRoomSR,  60,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  electricityNumberSR,200,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  electricityNumberSR,  60,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  waterBillByNumberSR,240,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  waterBillByNumberSR,  60,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  statusRoomSR,280,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  statusRoomSR,  60,springLayout.WEST, this);

        // label Inf
        springLayout.putConstraint(springLayout.NORTH,  idRoomInfSR,43,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  idRoomInfSR,  280,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  nameOfRoomInfSR,83,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  nameOfRoomInfSR,  280,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  kindOfRoomInfSR,123,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  kindOfRoomInfSR,  280,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  priceOfRoomInfSR,163,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  priceOfRoomInfSR,  280,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  electricityNumberInfSR,203,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  electricityNumberInfSR,  280,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  waterBillByNumberInfSR,243,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  waterBillByNumberInfSR,  280,springLayout.WEST, this);

        springLayout.putConstraint(springLayout.NORTH,  statusRoomInfSR,283,  springLayout.NORTH, this);
        springLayout.putConstraint(springLayout.WEST,  statusRoomInfSR,  280,springLayout.WEST, this);

    }

    public JLabel getIdRoomInfSR() {
        return idRoomInfSR;
    }

    public JLabel getKindOfRoomInfSR() {
        return kindOfRoomInfSR;
    }

    public JLabel getPriceOfRoomInfSR() {
        return priceOfRoomInfSR;
    }

    public JLabel getNameOfRoomInfSR() {
        return nameOfRoomInfSR;
    }

    public JLabel getElectricityNumberInfSR() {
        return electricityNumberInfSR;
    }

    public JLabel getWaterBillByNumberInfSR() {
        return waterBillByNumberInfSR;
    }

    public JLabel getStatusRoomInfSR() {
        return statusRoomInfSR;
    }
}
