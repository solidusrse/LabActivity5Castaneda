package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkLeapYear();
            }
        });

        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    checkLeapYear();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leap_year = new LeapYearGUI();
        leap_year.setContentPane(leap_year.panel1);
        leap_year.setSize(500, 700);
        leap_year.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leap_year.setVisible(true);
    }

    public void checkLeapYear() {
        int year = 0;
        try {
            year = Integer.parseInt(tfYear.getText());
            if(year < 0){
                JOptionPane.showMessageDialog(panel1, "Year cannot be negative.", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (year % 4 == 0) {
                JOptionPane.showMessageDialog(null, "Leap year");
            } else
                JOptionPane.showMessageDialog(null, "Not a leap year");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel1, "Input must be a number.", "Warning", JOptionPane.WARNING_MESSAGE);
            throw new NumberFormatException(e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel1, "How did we get here?", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
