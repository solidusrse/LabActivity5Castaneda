package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public  LeapYearChecker() {

    }

    public static void main(String[] args) {
        LeapYearGUI leap_year = new LeapYearGUI();
        leap_year.setContentPane(leap_year.panel1);
        leap_year.setSize(500, 700);
        leap_year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leap_year.setVisible(true);
    }
}
