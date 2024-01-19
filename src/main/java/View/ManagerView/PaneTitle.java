package View.ManagerView;

import Controller.ManagerController.TitleController;

import javax.swing.*;
import java.awt.*;

public class PaneTitle extends JPanel {
    private JLabel textTitleTM = new JLabel("Bear homestay");
    private ImageIcon iconSisgnOutTM = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\icons8-sign-out-50.png");
    private ImageIcon iconTitleTM = new ImageIcon("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\img\\icons8-bear-footprint-50.png");
    private SpringLayout springLayoutTM = new SpringLayout();
    private Font fontRubik = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Rubik_Doodle_Triangles\\RubikDoodleTriangles-Regular.ttf");

    public PaneTitle(ManagerView managerView) {
        this.setPreferredSize(new Dimension(860,40));
        this.setBackground(new Color(224, 238, 238));
        this.setLayout(springLayoutTM);

        //set kich thuoc cho icon title
        Image titleImg = iconTitleTM.getImage();
        JLabel titleIconLastResizeTM = new JLabel(new ImageIcon(titleImg.getScaledInstance(40,40,Image.SCALE_SMOOTH)));

        //set kich thuoc cho icon Sign out
        Image iconSignOutIngTM = iconSisgnOutTM.getImage();
        JLabel iconSignOutLastResizeTM = new JLabel(new ImageIcon(iconSignOutIngTM.getScaledInstance(30,30,Image.SCALE_SMOOTH)));



        this.add(textTitleTM);
        this.add(titleIconLastResizeTM);
        this.add(iconSignOutLastResizeTM);


        textTitleTM.setFont(fontRubik);
        textTitleTM.setForeground(new Color(205, 133, 63));

        iconSignOutLastResizeTM.setCursor(new Cursor(Cursor.HAND_CURSOR));


        // chinh vi tri cua textTitleTM
        springLayoutTM.putConstraint(springLayoutTM.NORTH,textTitleTM,6,springLayoutTM.NORTH,this);
        springLayoutTM.putConstraint(springLayoutTM.WEST,textTitleTM,80,springLayoutTM.WEST,this);

        // chinh vi tri cua titleIconLastResizeTM
        springLayoutTM.putConstraint(springLayoutTM.NORTH,titleIconLastResizeTM,0,springLayoutTM.NORTH,this);
        springLayoutTM.putConstraint(springLayoutTM.WEST,titleIconLastResizeTM,30,springLayoutTM.WEST,this);

        // chinh vi tri cua iconSignOutLastResizeTM
        springLayoutTM.putConstraint(springLayoutTM.NORTH,iconSignOutLastResizeTM,5,springLayoutTM.NORTH,this);
        springLayoutTM.putConstraint(springLayoutTM.WEST,iconSignOutLastResizeTM,800,springLayoutTM.WEST,this);

        iconSignOutLastResizeTM.addMouseListener(new TitleController(managerView));
    }

    private static Font loadCustomFont(String fontPath) {
        Font customFont = null;
        try {
            // Load font từ tệp
            customFont = Font.createFont(Font.TRUETYPE_FONT, new java.io.File(fontPath));

            // Kích thước font mặc định
            customFont = customFont.deriveFont(24f);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return customFont;
    }

}
