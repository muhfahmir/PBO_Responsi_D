package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class V_data_A extends JFrame {
    //deklrasi atribut yang dibutuhkan
    JPanel panel = new JPanel();
    Font fTitle = new Font("SanSerif",Font.ITALIC,20);
    JLabel lTitle = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
    JLabel lId = new JLabel("ID Pegawai :");
    JTextField tfId = new JTextField();
    public JButton btnHome = new JButton("Home");
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnData = new JButton("Data");
    public JButton btnKaryawan = new JButton("Karyawan");
    public JButton btnShow = new JButton("Show");
    public JButton btnUpdate = new JButton("Update");
    public JButton btnDelete = new JButton("Delete");

    public JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object[] namaKolom = {"ID","Nama","Alamat","NO HP ","Posisi ","Gaji Pokok"};

    public V_data_A() {

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
        scrollPane.setBounds(160, 110, 600, 290);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        //footer
        panel.add(lTitle);
        lTitle.setBounds(160,525,525,30);
        lTitle.setFont(fTitle);
        //tombol submenu
        panel.add(btnHome);
        btnHome.setBounds(0,105,150,100);
        panel.add(btnTambah);
        btnTambah.setBounds(0,210,150,100);
        panel.add(btnData);
        btnData.setBounds(0,315,150,100);
        panel.add(btnKaryawan);
        btnKaryawan.setBounds(630,0,150,100);

        panel.add(lId);
        lId.setBounds(290,400,100,20);
        panel.add(tfId);
        tfId.setBounds(395,400,100,20);
        panel.add(btnUpdate);
        btnUpdate.setBounds(290,440,150,80);
        panel.add(btnShow);
        btnShow.setBounds(445,440,150,80);
        panel.add(btnDelete);
        btnDelete.setBounds(600,440,150,80);

        //layar ditengah
        // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();
        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;
        this.setLocation(x, y);



    }

    public String getTfId() {
        return tfId.getText();
    }


}
