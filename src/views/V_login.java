package views;

import javax.swing.*;
import java.awt.*;

public class V_login extends JFrame {

    Font fontt = new Font("SanSerif", Font.PLAIN, 20);
    JLabel lusername = new JLabel("Username :");
    private JTextField tfusername = new JTextField();
    JLabel lpassword = new JLabel("Password :");
    private JPasswordField tfpassword = new JPasswordField();
    public JButton btnLogin = new JButton("LOGIN");
    JLabel label = new JLabel("LOGIN ADMIN");
    public JButton btnExit = new JButton("BACK");

    public V_login() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setVisible(true);
        setLayout(null);
        setSize(700, 400);
        add(label);
        label.setFont(fontt);
        label.setBounds(260, 100, 250, 20);

        add(lusername);
        lusername.setBounds(200, 160, 90, 30);
        add(tfusername);
        tfusername.setBounds(290, 160, 150, 30);

        add(lpassword);
        lpassword.setBounds(200, 210, 90, 30);
        add(tfpassword);
        tfpassword.setBounds(290, 210, 150, 30);

        add(btnLogin);
        btnLogin.setBounds(220, 250, 90, 20);
        btnLogin.setBackground(Color.BLUE);
        btnLogin.setForeground(Color.WHITE);

        add(btnExit);
        btnExit.setBounds(330,250,90,20);
        btnExit.setBackground(Color.RED);
        btnExit.setForeground(Color.WHITE);

        //layar ditengah
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);
    }
    public void setTfusername(){
        tfusername.setText("");
    }
    public void setTfpassword(){
        tfpassword.setText("");
    }

    public String getUsername() {
        return tfusername.getText();
    }

    public String getPassword() {
        return tfpassword.getText();
    }



}
