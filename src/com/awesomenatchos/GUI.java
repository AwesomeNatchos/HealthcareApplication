package com.awesomenatchos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Create frontend for log in
public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    private static JLabel logInfail;

    public static void main(String[] args) {

        //Frontend
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User Name: ");
        userLabel.setBounds(60,30,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(150,30,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(60,65,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(150,65,165,25);
        panel.add(passwordText);

        button = new JButton("Log In");
        button.setBounds(150,95,80,25);
        panel.add(button);
        button.addActionListener(new GUI());

        success = new JLabel();
        success.setBounds(100, 150, 1000, 25);

        logInfail = new JLabel();
        success.setBounds(100, 150, 1000, 25);

        frame.setVisible(true);


    }

    @Override
    //Executed whenever the button is clicked
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("n") && password.equals("m")){
            success.setText("Log in successfully!");
            System.out.println("Welcome " + user + " password: " + password);
        }else{
            logInfail.setText("Log In failed");
            System.out.println("Log In failed\n. Username or password incorrect!");
        }


    }
}
