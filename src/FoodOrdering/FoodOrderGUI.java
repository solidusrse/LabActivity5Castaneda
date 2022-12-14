package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private double pizzaPrice = 0;
    private double burgerPrice = 0;
    private double friesPrice = 0;
    private double softDrinksPrice = 0;
    private double teaPrice = 0;
    private double sundaePrice = 0;
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    public FoodOrderGUI() {
        cPizza.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cPizza.isSelected())
                    pizzaPrice=100;
                else
                    pizzaPrice=0;
            }
        });
        cBurger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cBurger.isSelected())
                    burgerPrice=80;
                else
                    burgerPrice=0;
            }
        });
        cFries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cFries.isSelected())
                    friesPrice=65;
                else
                    burgerPrice=0;
            }
        });
        cSoftDrinks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cSoftDrinks.isSelected())
                    softDrinksPrice=55;
                else
                    burgerPrice=0;
            }
        });
        cTea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cTea.isSelected())
                    teaPrice=50;
                else
                    teaPrice=0;
            }
        });
        cSundae.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cSundae.isSelected())
                    sundaePrice=40;
                else
                    teaPrice=0;
            }
        });
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = totalPrice();
                if(rb5.isSelected())
                    total = total - total * 0.05;
                else if(rb10.isSelected())
                    total = total - total * 0.10;
                else if(rb15.isSelected())
                    total = total - total * 0.15;
                JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", total));
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.panel1);
        order.setSize(500, 700);
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setVisible(true);
    }

    public double totalPrice() {
        return pizzaPrice + burgerPrice + friesPrice + softDrinksPrice + teaPrice + sundaePrice;
    }
}


