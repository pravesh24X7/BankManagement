package org.management.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends javax.swing.JFrame implements ActionListener {

    private javax.swing.JLabel welcomeMsg, cardNo, pinNo;
    private javax.swing.JPasswordField pinPassword;
    private javax.swing.JTextField inputCardNo;
    private JButton signIn, clear, register;


    public Login() {

        super("Bank Management System");

        welcomeMsg = new JLabel("Welcome to Bank Management".toUpperCase());
        welcomeMsg.setForeground(Color.WHITE);
        welcomeMsg.setFont(new Font("Monospaced", Font.BOLD, 25));
        welcomeMsg.setBounds(230, 125, 450, 40);
        add(welcomeMsg);


        cardNo = new JLabel("CARD NO");
        cardNo.setForeground(Color.WHITE);
        cardNo.setFont(new Font("Courier", Font.BOLD, 20));
        cardNo.setBounds(150, 190, 375, 30);
        add(cardNo);

        inputCardNo = new JTextField(20);
        inputCardNo.setBounds(325, 190, 230, 30);
        inputCardNo.setFont(new Font("Ubuntu Mono", Font.BOLD, 20));
        add(inputCardNo);


        pinNo = new JLabel("PIN");
        pinNo.setForeground(Color.WHITE);
        pinNo.setFont(new Font("Courier", Font.BOLD, 20));
        pinNo.setBounds(150, 250, 375, 30);
        add(pinNo);

        pinPassword = new JPasswordField(20);
        pinPassword.setBounds(325, 250, 230, 20);
        pinPassword.setFont(new Font("Ubuntu Mono", Font.BOLD, 20));
        add(pinPassword);

        signIn = new JButton("Login");
        signIn.setFont(new Font("Courier", Font.BOLD, 10));
        signIn.setBackground(Color.WHITE);
        signIn.setForeground(Color.BLACK);
        signIn.setBounds(250, 300, 100, 30);
        signIn.addActionListener(this);
        add(signIn);


        clear = new JButton("Clear");
        clear.setFont(new Font("Courier", Font.BOLD, 10));
        clear.setBackground(Color.WHITE);
        clear.setForeground(Color.BLACK);
        clear.setBounds(375, 300, 100, 30);
        clear.addActionListener(this);

        add(clear);


        register = new JButton("Register");
        register.setFont(new Font("Courier", Font.BOLD, 10));
        register.setBackground(Color.WHITE);
        register.setForeground(Color.BLACK);
        register.setBounds(500, 300, 100, 30);
        register.addActionListener(this);

        add(register);

        ImageIcon fetchIcon = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image backgroundImage = fetchIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon backgroundIcon = new ImageIcon(backgroundImage);

        javax.swing.JLabel imageLabel = new JLabel(backgroundIcon);
        imageLabel.setBounds(350, 10, 100, 100);
        add(imageLabel);

        ImageIcon fetchIcon2 = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image backgroundImage2 = fetchIcon2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon backgroundIcon2 = new ImageIcon(backgroundImage2);

        javax.swing.JLabel imageLabel2 = new JLabel(backgroundIcon2);
        imageLabel2.setBounds(630, 300, 100, 100);
        add(imageLabel2);

        ImageIcon fetchBackgroundIcon = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image bgIcon = fetchBackgroundIcon.getImage().getScaledInstance(850, 450, Image.SCALE_DEFAULT);
        ImageIcon backbgIcon = new ImageIcon(bgIcon);

        javax.swing.JLabel labelOfBg = new JLabel(backbgIcon);
        labelOfBg.setBounds(0, 0, 850, 450);
        add(labelOfBg);

        setLayout(null);

        setSize(850, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {
            if (event.getSource() == signIn) {
                // signin functions

                new Main(pinPassword.getText());
//
//                Conn c = new Conn();
//                String cardno = inputCardNo.getText();
//                String pin = pinPassword.getText();
//                String q = "select * from login where card_no='"+cardno+"';";
//                ResultSet resultSet = c.statement.executeQuery(q);
//
//
////                System.out.println(cardno +  " " + pin);
////
////                System.out.println(resultSet.toString());
//
//                if (!resultSet.next()){
////                    System.out.println(resultSet.next());
//                    String val = resultSet.getString("pin");
//                    System.out.println("val: "+ val);
//
//                    if (val.equals(pin)) {
//                        new Main(pin);
////                        System.out.println("comparing");
//                    }
//                    else {
////                        System.out.println("executed else after comparison");
//                        JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
//                    }
                setVisible(false);

//                }else {
////                    System.out.println("from signinbutton else block");
//                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
//                }


            }
            else if (event.getSource() == clear) {
                // clear functions
                pinPassword.setText("");
                inputCardNo.setText("");
            }
            else if (event.getSource() == register) {
                // register

                new Register();
                setVisible(false);
            }
        } catch (Exception exception) {

        }
    }



    public static void main(String[] args) {
        new Login();
    }

}
