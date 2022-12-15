package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JLabel lblResult;
    private JTextField tfResult;

    public SimpleCalcGUI() {
        cbOperations.addItem('+');
        cbOperations.addItem('-');
        cbOperations.addItem('*');
        cbOperations.addItem('/');
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tfNumber1.getText()!=null && tfNumber2.getText()!=null)
                    tfResult.setText(String.valueOf(calculate()));
            }
        });

        btnCompute.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    if(tfNumber1.getText()!=null && tfNumber2.getText()!=null)
                        tfResult.setText(String.valueOf(calculate()));
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.panel1);
        calc.setSize(500, 700);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

    public long calculate() {
        try {
            long num1 = Long.parseLong(tfNumber1.getText()), num2 = Long.parseLong(tfNumber2.getText());

            if (cbOperations.getSelectedIndex() == 0) {
                return num1 + num2;
            }
            if (cbOperations.getSelectedIndex() == 1) {
                return num1 - num2;
            }
            if (cbOperations.getSelectedIndex() == 2) {
                return num1 * num2;
            }
            if (cbOperations.getSelectedIndex() == 3) {
                return num1 / num2;
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(panel1, new NumberFormatException(e.getMessage()), "Please input numbers", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }
}
