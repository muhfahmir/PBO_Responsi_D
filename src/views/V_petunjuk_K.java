package views;

import javax.swing.*;
import java.awt.*;

public class V_petunjuk_K extends JFrame{
    JPanel panel = new JPanel();
    Font fTitle = new Font("SanSerif",Font.ITALIC,20);
    JLabel lTitle = new JLabel("Petunjuk Karyawan");
    JLabel lGaji = new JLabel("Klik tombol gaji untuk menghitung gaji anda");
    JLabel lData = new JLabel("Klik tombol data untuk melihat data sudah ");
    JLabel lData2 = new JLabel("Masuk atau belum ");
    public JButton btnHome = new JButton("Home");
    Font fLabel = new Font("SanSerif",Font.BOLD,15);
    public V_petunjuk_K(){
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,400);
        add(panel);
        panel.setLayout(null);
        //footer
        panel.add(lTitle);
        lTitle.setBounds(300,10,525,30);
        lTitle.setFont(fTitle);

        panel.add(lGaji);
        lGaji.setBounds(160,100,525,30);
        lGaji.setFont(fTitle);

        panel.add(lData);
        lData.setBounds(160,150,525,30);
        lData.setFont(fTitle);
        panel.add(lData2);
        lData2.setBounds(160,180,525,30);
        lData2.setFont(fTitle);

        //tombol submenu
        panel.add(btnHome);
        btnHome.setBounds(350,250,100,20);

        //layar ditengah
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

    }

}
