package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class V_data_K extends JFrame{
    //deklrasi atribut yang dibutuhkan
    JPanel panel = new JPanel();
    Font fTitle = new Font("SanSerif",Font.ITALIC,20);
    JLabel lTitle = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
    public JButton btnHome = new JButton("Home");
    public JButton btnGaji = new JButton("Gaji");
    public JButton btnData = new JButton("Data");
    public JButton btnPetunjuk = new JButton("Petunjuk");
    public JButton btnAdmin = new JButton("Admin");
    public JButton btnShow = new JButton("Show");

    public JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object[] namaKolom = {"ID","Nama","Posisi","Gaji Pokok","Jam Lembur","Tunjangan","Total Gaji"};

    public V_data_K() {

        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);

        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        add(panel);
        panel.setLayout(null);

        //body
        panel.add(scrollPane);
        scrollPane.setBounds(160, 130, 600, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //footer
        panel.add(lTitle);
        lTitle.setBounds(160,525,525,30);
        lTitle.setFont(fTitle);
        //tombol submenu
        panel.add(btnHome);
        btnHome.setBounds(0,0,150,100);
        panel.add(btnGaji);
        btnGaji.setBounds(0,105,150,100);
        panel.add(btnData);
        btnData.setBounds(0,210,150,100);
        panel.add(btnPetunjuk);
        btnPetunjuk.setBounds(0,315,150,100);
        panel.add(btnAdmin);
        btnAdmin.setBounds(630,0,150,100);
        panel.add(btnShow);
        btnShow.setBounds(340,440,150,80);

        //layar ditengah
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);



    }

}
