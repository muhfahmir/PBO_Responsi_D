package views;

import javax.swing.*;
import java.awt.*;

public class V_update_A extends JFrame{
    JPanel panel = new JPanel();
    Font fTitle = new Font("SanSerif",Font.ITALIC,20);
    JLabel lTitle = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
    public JButton btnHome = new JButton("Home");
    public JButton btnTambah = new JButton("Tambah");
    public JButton btnData = new JButton("Data");
    public JButton btnPetunjuk = new JButton("Petunjuk");
    public JButton btnKaryawan = new JButton("Karyawan");
    public JButton btnUbah = new JButton("Ubah");

    JLabel lId = new JLabel("ID Pegawai : ");
    public JTextField tfId = new JTextField();
    JLabel lNama = new JLabel("Nama :");
    public JTextField tfNama = new JTextField();
    JLabel lPosisi = new JLabel("Posisi :");
    String[] posisi = {"","Direktur","Manager","Programmer","Marketing","Surveyor"};
    public JComboBox cmbPosisi =new JComboBox(posisi);
    JLabel lAlamat = new JLabel("Alamat : ");
    public JTextField tfAlamat = new JTextField();
    JLabel lNo = new JLabel("No HP : ");
    public JTextField tfNo = new JTextField();
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    public JTextField tfGaji = new JTextField();
    Font fLabel = new Font("SanSerif",Font.BOLD,15);
    public V_update_A(){
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        add(panel);
        panel.setLayout(null);

        //body
        panel.add(lId);
        lId.setBounds(200,70,100,30);
        lId.setFont(fLabel);
        panel.add(tfId);
        tfId.setBounds(300,70,200,30);
        tfId.setFont(fLabel);

        panel.add(lNama);
        lNama.setBounds(200,110,100,30);
        lNama.setFont(fLabel);
        panel.add(tfNama);
        tfNama.setBounds(300,110,400,30);
        tfNama.setFont(fLabel);


        panel.add(lPosisi);
        lPosisi.setBounds(200,260,100,30);
        lPosisi.setFont(fLabel);
        panel.add(cmbPosisi);
        cmbPosisi.setBounds(300,260,200,30);
        cmbPosisi.setFont(fLabel);

        panel.add(lAlamat);
        lAlamat.setBounds(200,160,100,30);
        lAlamat.setFont(fLabel);
        panel.add(tfAlamat);
        tfAlamat.setBounds(300,160,400,30);
        tfAlamat.setFont(fLabel);

        panel.add(lNo);
        lNo.setBounds(200,210,100,30);
        lNo.setFont(fLabel);
        panel.add(tfNo);
        tfNo.setBounds(300,210,200,30);
        tfNo.setFont(fLabel);

        panel.add(lGaji);
        lGaji.setBounds(200,310,100,30);
        lGaji.setFont(fLabel);
        panel.add(tfGaji);
        tfGaji.setBounds(300,310,200,30);
        tfGaji.setFont(fLabel);

        //footer
        panel.add(lTitle);
        lTitle.setBounds(160,500,525,30);
        lTitle.setFont(fTitle);
        //tombol submenu
        panel.add(btnHome);
        btnHome.setBounds(0,0,150,80);
        panel.add(btnTambah);
        btnTambah.setBounds(0,85,150,80);
        panel.add(btnData);
        btnData.setBounds(0,170,150,80);
        panel.add(btnPetunjuk);
        btnPetunjuk.setBounds(0,255,150,80);
        panel.add(btnKaryawan);
        btnKaryawan.setBounds(630,0,150,80);
        panel.add(btnUbah);
        btnUbah.setBounds(530,370,150,80);

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

    public String getTfNama() {
        return tfNama.getText();
    }

    public String getTfAlamat() {
        return tfAlamat.getText();
    }

    public String getTfNo() {
        return tfNo.getText();
    }

    public String getTfGaji() {
        return tfGaji.getText();
    }


}
