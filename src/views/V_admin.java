package views;

import javax.swing.*;
import java.awt.*;

public class V_admin extends JFrame{
    //deklrasi atribut yang dibutuhkan
    JPanel panel = new JPanel();
    Font fTitle = new Font("SanSerif",Font.ITALIC,20);
    JLabel lTitle = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
    public JButton btnHome = new JButton("Home");
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnData = new JButton("Data");
    public JButton btnPetunjuk = new JButton("Petunjuk");
    public JButton btnKaryawan = new JButton("Karyawan");
    JTextArea textArea = new JTextArea("Selamat Datang Admin,\nSilahkan Masuk Ke menu Tambah,\nuntuk memasukkan Data Baru,\n" +
            "Jika mengalami kesulitan,\nKlik Menu Petunjuk");
    Font fArea = new Font("SanSerif",Font.BOLD,20);

    public V_admin(){
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        add(panel);
        panel.setLayout(null);

        //body
        panel.add(textArea);
        textArea.setBounds(180,100,400,200);
        textArea.setFont(fArea);

        //footer
        panel.add(lTitle);
        lTitle.setBounds(160,500,525,30);
        lTitle.setFont(fTitle);
        //tombol submenu
        panel.add(btnHome);
        btnHome.setBounds(0,0,150,100);
        panel.add(btnTambah);
        btnTambah.setBounds(0,105,150,100);
        panel.add(btnData);
        btnData.setBounds(0,210,150,100);
        panel.add(btnPetunjuk);
        btnPetunjuk.setBounds(0,315,150,100);
        panel.add(btnKaryawan);
        btnKaryawan.setBounds(630,0,150,100);

        //layar ditengah
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);

    }

}
