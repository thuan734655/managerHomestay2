package View.ManagerView;

import Controller.ManagerController.FindRenterController;

import javax.swing.*;
import java.awt.*;

public class PaneFindRenter extends JPanel {
    private JLabel textEnterIdRenterFD = new JLabel("ID:");
    private JLabel textInputInformationFD = new JLabel("Update information:");
    private JLabel textEnterSurnameFD = new JLabel("Surname:");
    private JLabel textEnterMidlenameFD  = new JLabel("Middle name:");
    private JLabel textEnterNameFD  = new JLabel("Name:");
    private JLabel textEnterNumberPhoneFD  = new JLabel("Contact number:");
    private JLabel textEnterScccdFD = new JLabel("Citizen number:");
    private JLabel textEnterBirthFD  = new JLabel("Birth:");
    private JLabel textEnterGenderFD  = new JLabel("Gender:");
    private JLabel textEnternummberRoomFD  = new JLabel("Room number:");
    private JLabel textEmailFD  = new JLabel("Email:");

    private JLabel enterNameLabelFD = new JLabel("Enter name");
    private JLabel enterBirthLabelFD = new JLabel("Enter birth");
    private JLabel choseeIdLabelFD = new JLabel("Chosee ID");
    private  JLabel textDescriptionFD = new JLabel("Find by name or birth");
    private  JLabel textDescription1FD = new JLabel("Find By ID");




    private JLabel showSurnameFD  = new JLabel("Surname informationr");
    private JLabel  showMiddlenameFD  = new JLabel("Middle name information");
    private JLabel  showNameFD = new JLabel("Name information");
    private JLabel  showSdtFD  = new JLabel("Contact number information");
    private JLabel  showScccdFD  = new JLabel("Citizen number information");
    private JLabel  showBirthFD  = new JLabel("Birth information");
    private JLabel  showGenderFD  = new JLabel("Gender information");
    private JLabel  showIdRoomFD  = new JLabel("Id room information");
    private JLabel  showIDRenterFD  = new JLabel("Id renter information");
    private JLabel  showEmailFD  = new JLabel("Email information");
    private JLabel showSurname1FD  = new JLabel("Surname informationr");
    private JLabel  showMiddlename1FD  = new JLabel("Middle name information");
    private JLabel  showName1FD = new JLabel("Name information");
    private JLabel  showSdt1FD  = new JLabel("Contact number information");
    private JLabel  showScccd1FD  = new JLabel("Citizen number information");
    private JLabel  showBirth1FD  = new JLabel("Birth information");
    private JLabel  showGender1FD  = new JLabel("Gender information");
    private JLabel  showIdRoom1FD  = new JLabel("Id room information");
    private JLabel  showIDRenter1FD  = new JLabel("id renter information");
    private JLabel  showEmail1FD  = new JLabel("Email information");

    private JTextField resultNameSreachNameAndBirthFD = new JTextField();
    private JTextField resultBirthSreachNameAndBirthFD = new JTextField();
    private JTextField choseeIdFD = new JTextField();



    private JButton searchButtonFD = new JButton("Search");
    private JButton searchByIDButtonFD = new JButton("Search by ID");
    private JButton nextButtonFD = new JButton("Next");
    private JButton backButtonFD = new JButton("Back");

    private JSeparator separatorVerticalFD = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separatorVertical1FD = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separatorVertical2FD = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separatorVertical3FD = new JSeparator(SwingConstants.VERTICAL);
    private JSeparator separatorVertical4FD = new JSeparator(SwingConstants.VERTICAL);


    private JSeparator separatorHorizontal1FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal2FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal3FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal4FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal5FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal6FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal7FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal8FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal9FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal10FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal11FD = new JSeparator(SwingConstants.HORIZONTAL);
    private JSeparator separatorHorizontal12FD = new JSeparator(SwingConstants.HORIZONTAL);



    Dimension dimensionJTextFieldSearchFD = new Dimension(150,30);



    private SpringLayout springLayoutPanelFindFD = new SpringLayout();

    private Font fontDialog = new Font(Font.DIALOG,Font.PLAIN |Font.BOLD,16);
    private Font fontsans_serif = new Font(Font.SANS_SERIF , Font.BOLD | Font.PLAIN , 12);
    private Font fontFamily  = loadCustomFont("C:\\java\\workSpace\\QUANLIPHONGTROMaven\\font\\Anton\\Anton-Regular.ttf");
    private FindRenterController findRenterController = new FindRenterController(this);

    public PaneFindRenter() {

        this.setBackground(new Color(240, 255, 255));
        this.setLayout(springLayoutPanelFindFD);
        this.setPreferredSize(new Dimension(1100, 800));


        separatorVerticalFD.setPreferredSize(new Dimension(1, 460));
        separatorHorizontal1FD.setPreferredSize(new Dimension(230, 1));

        separatorVertical1FD.setPreferredSize(new Dimension(1, 460));
        separatorVertical2FD.setPreferredSize(new Dimension(1, 460));
        separatorVertical4FD.setPreferredSize(new Dimension(1, 460));
        separatorHorizontal2FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal3FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal4FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal5FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal6FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal7FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal8FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal9FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal10FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal11FD.setPreferredSize(new Dimension(630, 1));
        separatorHorizontal12FD.setPreferredSize(new Dimension(630, 1));




        // them thanh phan vao panelAddRenter
        this.add(separatorVerticalFD);
        this.add(separatorHorizontal1FD);
        this.add(separatorVertical1FD);
        this.add(separatorHorizontal2FD);
        this.add(separatorVertical2FD);
        this.add(separatorHorizontal3FD);
        this.add(separatorVertical3FD);
        this.add(separatorHorizontal4FD);
        this.add(separatorVertical4FD);
        this.add(separatorHorizontal5FD);
        this.add(separatorHorizontal6FD);
        this.add(separatorHorizontal7FD);
        this.add(separatorHorizontal8FD);
        this.add(separatorHorizontal9FD);
        this.add(separatorHorizontal10FD);
        this.add(separatorHorizontal11FD);
        this.add(separatorHorizontal12FD);
        this.add(searchByIDButtonFD);
        this.add(searchButtonFD);
        this.add(backButtonFD);
        this.add(nextButtonFD);
        this.add(enterNameLabelFD);
        this.add(enterBirthLabelFD);
        this.add(choseeIdFD);
        this.add(choseeIdLabelFD);
        this.add(resultBirthSreachNameAndBirthFD);
        this.add(resultNameSreachNameAndBirthFD);
        this.add(separatorHorizontal1FD);
        this.add(textDescriptionFD);
        this.add(textDescription1FD);
        this.add(textEnterIdRenterFD);
        this.add(showIDRenterFD);
        this.add(showIDRenter1FD);
        this.add(textEnterSurnameFD);
        this.add(showSurnameFD);
        this.add(showSurname1FD);
        this.add(textEnterMidlenameFD);
        this.add(showMiddlenameFD);
        this.add(showMiddlename1FD);
        this.add(textEnterNameFD);
        this.add(showNameFD);
        this.add(showName1FD);
        this.add(textEnterNumberPhoneFD);
        this.add(showSdtFD);
        this.add(showSdt1FD);
        this.add(textEnterScccdFD);
        this.add(showScccdFD);
        this.add(showScccd1FD);
        this.add(textEnterBirthFD);
        this.add(showBirthFD);
        this.add(showBirth1FD);
        this.add(textEnterGenderFD);
        this.add(showGenderFD);
        this.add(showGender1FD);
        this.add(textEnternummberRoomFD);
        this.add(showIdRoomFD);
        this.add(showIdRoom1FD);
        this.add(textEmailFD);
        this.add(showEmailFD);
        this.add(showEmail1FD);



        // chinh font chu
        textInputInformationFD.setFont(fontFamily);
        textEnterSurnameFD.setFont(fontDialog);
        textEnterMidlenameFD.setFont(fontDialog);
        textEnterNameFD.setFont(fontDialog);
        textEnterNumberPhoneFD.setFont(fontDialog);
        textEnterScccdFD.setFont(fontDialog);
        textEnterBirthFD.setFont(fontDialog);
        textEnterGenderFD.setFont(fontDialog);
        textEnternummberRoomFD.setFont(fontDialog);
        textEnterIdRenterFD.setFont(fontDialog);
        textEmailFD.setFont(fontDialog);
        enterBirthLabelFD.setFont(fontDialog);
        enterNameLabelFD.setFont(fontDialog);
        choseeIdLabelFD.setFont(fontDialog);
        textDescriptionFD.setFont(fontDialog);
        textDescription1FD.setFont(fontDialog);
        showSurnameFD.setFont(fontsans_serif);
        showMiddlenameFD.setFont(fontsans_serif);
        showNameFD.setFont(fontsans_serif);
        showSdtFD.setFont(fontsans_serif);
        showScccdFD.setFont(fontsans_serif);
        showBirthFD.setFont(fontsans_serif);
        showGenderFD.setFont(fontsans_serif);
        showIdRoom1FD.setFont(fontsans_serif);
        showIDRenter1FD.setFont(fontsans_serif);
        showEmail1FD.setFont(fontsans_serif);
        showSurname1FD.setFont(fontsans_serif);
        showMiddlename1FD.setFont(fontsans_serif);
        showName1FD.setFont(fontsans_serif);
        showSdt1FD.setFont(fontsans_serif);
        showScccd1FD.setFont(fontsans_serif);
        showBirth1FD.setFont(fontsans_serif);
        showGender1FD.setFont(fontsans_serif);
        showIdRoom1FD.setFont(fontsans_serif);
        showIDRenter1FD.setFont(fontsans_serif);
        showEmail1FD.setFont(fontsans_serif);

        // chinh mau cho jlabel
        textDescriptionFD.setForeground(new Color(244, 164, 96));
        textDescription1FD.setForeground(new Color(244, 164, 96));
        showIDRenterFD.setForeground(new Color(85, 85, 85));
        showSurnameFD.setForeground(new Color(85, 85, 85));
        showMiddlenameFD.setForeground(new Color(85, 85, 85));
        showNameFD.setForeground(new Color(85, 85, 85));
        showSdtFD.setForeground(new Color(85, 85, 85));
        showScccdFD.setForeground(new Color(85, 85, 85));
        showGenderFD.setForeground(new Color(85, 85, 85));
        showIdRoomFD.setForeground(new Color(85, 85, 85));
        showIDRenter1FD.setForeground(new Color(85, 85, 85));
        showEmail1FD.setForeground(new Color(85, 85, 85));
        showBirth1FD.setForeground(new Color(85, 85, 85));
        showSurname1FD.setForeground(new Color(85, 85, 85));
        showMiddlename1FD.setForeground(new Color(85, 85, 85));
        showName1FD.setForeground(new Color(85, 85, 85));
        showSdt1FD.setForeground(new Color(85, 85, 85));
        showScccd1FD.setForeground(new Color(85, 85, 85));
        showGender1FD.setForeground(new Color(85, 85, 85));
        showIdRoom1FD.setForeground(new Color(85, 85, 85));
        showIDRenter1FD.setForeground(new Color(85, 85, 85));
        showEmail1FD.setForeground(new Color(85, 85, 85));
        showBirth1FD.setForeground(new Color(85, 85, 85));

       //set kich thuoc cac JTextField
        resultBirthSreachNameAndBirthFD.setPreferredSize(dimensionJTextFieldSearchFD);
        resultNameSreachNameAndBirthFD.setPreferredSize(dimensionJTextFieldSearchFD);
        choseeIdFD.setPreferredSize(dimensionJTextFieldSearchFD);

        // bo goc cho jtextField
        resultBirthSreachNameAndBirthFD.setBorder(BorderFactory.createLineBorder(Color.gray));
        resultNameSreachNameAndBirthFD.setBorder(BorderFactory.createLineBorder(Color.gray));
        choseeIdFD.setBorder(BorderFactory.createLineBorder(Color.gray));

        // xet trong suot cho JTextField
        resultBirthSreachNameAndBirthFD.setOpaque(false);
        resultNameSreachNameAndBirthFD.setOpaque(false);
        choseeIdFD.setOpaque(false);


        // xoa vien trong chu cua button
        searchButtonFD.setFocusPainted(false);
        searchByIDButtonFD.setFocusPainted(false);
        nextButtonFD.setFocusPainted(false);
        backButtonFD.setFocusPainted(false);

        // chinh sua bieu tuong con chuot cua button
        searchButtonFD.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchByIDButtonFD.setCursor(new Cursor(Cursor.HAND_CURSOR));
        nextButtonFD.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButtonFD.setCursor(new Cursor(Cursor.HAND_CURSOR));

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorVerticalFD, 90, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, separatorVerticalFD, 680, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorVertical1FD, 90, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, separatorVertical1FD, 480, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorVertical2FD, 90, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, separatorVertical2FD, 880, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal1FD, 320, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, separatorHorizontal1FD, 250, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal2FD, 135, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal2FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal3FD, 180, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal3FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal4FD, 225, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal4FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal5FD, 270, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal5FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal6FD, 315, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal6FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal7FD, 360, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal7FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal8FD, 405, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal8FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal9FD, 450, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal9FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, separatorHorizontal10FD, 495, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.EAST, separatorHorizontal10FD, 10, springLayoutPanelFindFD.EAST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textDescriptionFD, 90, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textDescriptionFD, 270, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textDescription1FD, 330, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textDescription1FD, 270, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, enterNameLabelFD, 120, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, enterNameLabelFD, 285, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, resultNameSreachNameAndBirthFD, 145, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, resultNameSreachNameAndBirthFD, 275, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, enterBirthLabelFD, 200, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, enterBirthLabelFD, 285, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, resultBirthSreachNameAndBirthFD, 225, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, resultBirthSreachNameAndBirthFD, 275, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, searchButtonFD, 270, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, searchButtonFD, 310, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, choseeIdLabelFD, 360, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, choseeIdLabelFD, 285, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, choseeIdFD, 390, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, choseeIdFD, 275, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, searchByIDButtonFD, 440, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, searchByIDButtonFD, 296, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, nextButtonFD, 600, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, nextButtonFD, 770, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, backButtonFD, 600, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, backButtonFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showIDRenterFD, 115, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showIDRenterFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showIDRenter1FD, 115, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showIDRenter1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showSurnameFD, 160, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showSurnameFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showSurname1FD, 160, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showSurname1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showMiddlenameFD, 205, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showMiddlenameFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showMiddlename1FD, 205, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showMiddlename1FD, 890, springLayoutPanelFindFD.WEST, this);


        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showNameFD, 250, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showNameFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showName1FD, 250, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showName1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showSdtFD, 295, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showSdtFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showSdt1FD, 295, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showSdt1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showScccdFD, 340, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showScccdFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showScccd1FD, 340, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showScccd1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showBirthFD, 385, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showBirthFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showBirth1FD, 385, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showBirth1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showGenderFD, 430, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showGenderFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showGender1FD, 430, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showGender1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showIdRoomFD, 475, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showIdRoomFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showIdRoom1FD, 475, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showIdRoom1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showEmailFD, 520, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showEmailFD, 700, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, showEmail1FD, 520, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, showEmail1FD, 890, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterIdRenterFD, 110, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterIdRenterFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterSurnameFD, 155, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterSurnameFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterMidlenameFD, 200, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterMidlenameFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterNameFD, 245, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterNameFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterNumberPhoneFD, 290, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterNumberPhoneFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterScccdFD, 335, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterScccdFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterBirthFD, 380, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterBirthFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnterGenderFD, 425, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnterGenderFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEnternummberRoomFD, 470, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEnternummberRoomFD, 500, springLayoutPanelFindFD.WEST, this);

        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.NORTH, textEmailFD, 515, springLayoutPanelFindFD.NORTH, this);
        springLayoutPanelFindFD.putConstraint(springLayoutPanelFindFD.WEST, textEmailFD, 500, springLayoutPanelFindFD.WEST, this);

        // lang nghe su kien
            searchByIDButtonFD.addActionListener(findRenterController);
            searchButtonFD.addActionListener(findRenterController);
            backButtonFD.addActionListener(findRenterController);
            nextButtonFD.addActionListener(findRenterController);

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

    public JLabel getShowSurnameFD() {
        return showSurnameFD;
    }

    public JLabel getShowNameFD() {
        return showNameFD;
    }

    public JLabel getShowSdtFD() {
        return showSdtFD;
    }

    public JLabel getShowScccdFD() {
        return showScccdFD;
    }

    public JLabel getShowSurname1FD() {
        return showSurname1FD;
    }

    public JLabel getShowSdt1FD() {
        return showSdt1FD;
    }

    public JLabel getShowScccd1FD() {
        return showScccd1FD;
    }

    public JLabel getShowMiddlenameFD() {
        return showMiddlenameFD;
    }

    public JLabel getShowBirthFD() {
        return showBirthFD;
    }

    public JLabel getShowGenderFD() {
        return showGenderFD;
    }

    public JLabel getShowIdRoomFD() {
        return showIdRoomFD;
    }

    public JLabel getShowIDRenterFD() {
        return showIDRenterFD;
    }

    public JLabel getShowEmailFD() {
        return showEmailFD;
    }

    public JLabel getShowMiddlename1FD() {
        return showMiddlename1FD;
    }

    public JLabel getShowName1FD() {
        return showName1FD;
    }

    public JLabel getShowBirth1FD() {
        return showBirth1FD;
    }

    public JLabel getShowGender1FD() {
        return showGender1FD;
    }

    public JLabel getShowIdRoom1FD() {
        return showIdRoom1FD;
    }

    public JLabel getShowIDRenter1FD() {
        return showIDRenter1FD;
    }

    public JLabel getShowEmail1FD() {
        return showEmail1FD;
    }

    public JTextField getResultNameSreachNameAndBirthFD() {
        return resultNameSreachNameAndBirthFD;
    }

    public JTextField getResultBirthSreachNameAndBirthFD() {
        return resultBirthSreachNameAndBirthFD;
    }

    public JTextField getChoseeIdFD() {
        return choseeIdFD;
    }
}


