package views;

import javax.swing.*;
import java.awt.*;

public class V_gaji extends JFrame{
    //deklarasi semuanya
    JPanel panel = new JPanel();
    Font fTitle = new Font("SanSerif",Font.ITALIC,20);
    JLabel lTitle = new JLabel("APLIKASI PENGHITUNGAN GAJI PT. VETERAN JAYA");
    //button
    public JButton btnHome = new JButton("Home");
    public JButton btnGaji = new JButton("Gaji");
    public JButton btnData = new JButton("Data");
    public JButton btnPetunjuk = new JButton("Petunjuk");
    public JButton btnAdmin = new JButton("Admin");
    public JButton btnHitung = new JButton("Hitung");
    public JButton btnSimpan = new JButton("Simpan");
    Font fLabel = new Font("SanSerif",Font.BOLD,15);
    //inputan
    JLabel lId = new JLabel("ID Pegawai : ");
    JTextField tfId = new JTextField();
    JLabel lNama = new JLabel("Nama :");
    JTextField tfNama = new JTextField();
    JLabel lPosisi = new JLabel("Posisi :");
    String[] posisi = {"","Direktur","Manager","Programmer","Marketing","Surveyor"};
    public JComboBox cmbPosisi =new JComboBox(posisi);
    JLabel lAlamat = new JLabel("Alamat : ");
    JTextField tfAlamat = new JTextField();
    JLabel lNo = new JLabel("No HP : ");
    JTextField tfNo = new JTextField();
    JLabel lGaji = new JLabel("Gaji Pokok : ");
    JTextField tfGaji = new JTextField();
    JLabel lLembur = new JLabel("Jam Lembur : ");
    JTextField tfLembur = new JTextField();


    //hasil prses penghitungan
    JLabel lTunjangan = new JLabel("Tunjangan : ");
    public JTextField tfTunjangan = new JTextField();
    JLabel lPajak = new JLabel("Pajak : ");
    public JTextField tfPajak = new JTextField();
    JLabel lTotal = new JLabel("Total Gaji :");
    public JTextField tfTotal = new JTextField();
    public V_gaji(){
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        add(panel);
        panel.setLayout(null);

        //body
        panel.add(lId);
        lId.setBounds(160,70,100,25);
        lId.setFont(fLabel);
        panel.add(tfId);
        tfId.setBounds(260,70,300,25);
        tfId.setFont(fLabel);

        panel.add(lNama);
        lNama.setBounds(160,105,100,25);
        lNama.setFont(fLabel);
        panel.add(tfNama);
        tfNama.setBounds(260,105,300,25);
        tfNama.setFont(fLabel);

        panel.add(lPosisi);
        lPosisi.setBounds(160,140,100,25);
        lPosisi.setFont(fLabel);
        panel.add(cmbPosisi);
        cmbPosisi.setBounds(260,140,150,25);
        cmbPosisi.setFont(fLabel);

        panel.add(lAlamat);
        lAlamat.setBounds(160,175,100,25);
        lAlamat.setFont(fLabel);
        panel.add(tfAlamat);
        tfAlamat.setBounds(260,175,400,25);
        tfAlamat.setFont(fLabel);

        panel.add(lNo);
        lNo.setBounds(160,210,100,25);
        lNo.setFont(fLabel);
        panel.add(tfNo);
        tfNo.setBounds(260,210,200,25);
        tfNo.setFont(fLabel);

        panel.add(lGaji);
        lGaji.setBounds(160,245,100,25);
        lGaji.setFont(fLabel);
        panel.add(tfGaji);
        tfGaji.setBounds(260,245,200,25);
        tfGaji.setFont(fLabel);

        panel.add(lLembur);
        lLembur.setBounds(160,280,100,25);
        lLembur.setFont(fLabel);
        panel.add(tfLembur);
        tfLembur.setBounds(260,280,150,25);
        tfLembur.setFont(fLabel);

        //isi proses
        panel.add(lTunjangan);
        lTunjangan.setBounds(160,315,100,25);
        lTunjangan.setFont(fLabel);
        panel.add(tfTunjangan);
        tfTunjangan.setBounds(260,315,200,25);
        tfTunjangan.setFont(fLabel);

        panel.add(lPajak);
        lPajak.setBounds(160,350,100,25);
        lPajak.setFont(fLabel);
        panel.add(tfPajak);
        tfPajak.setBounds(260,350,200,25);
        tfPajak.setFont(fLabel);

        panel.add(lTotal);
        lTotal.setBounds(160,385,100,25);
        lTotal.setFont(fLabel);
        panel.add(tfTotal);
        tfTotal.setBounds(260,385,180,25);
        tfTotal.setFont(fLabel);


        //footer
        panel.add(lTitle);
        lTitle.setBounds(160,525,500,30);
        lTitle.setFont(fTitle);
        //tombol submenu
        //kiri
        panel.add(btnHome);
        btnHome.setBounds(0,0,150,100);
        panel.add(btnGaji);
        btnGaji.setBounds(0,105,150,100);
        panel.add(btnData);
        btnData.setBounds(0,210,150,100);
        panel.add(btnPetunjuk);
        btnPetunjuk.setBounds(0,315,150,100);
        //kanan
        panel.add(btnAdmin);
        btnAdmin.setBounds(630,0,150,100);
        panel.add(btnHitung);
        btnHitung.setBounds(630,315,150,100);
        panel.add(btnSimpan);
        btnSimpan.setBounds(630,420,150,100);

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
    public String getTfNama(){
        return tfNama.getText();
    }
    public String getTfAlamat(){
        return tfAlamat.getText();
    }
    public String getTfNo(){
        return tfNo.getText();
    }
    public String getTfGaji(){
        return tfGaji.getText();
    }
    public String getTfLembur(){
        return tfLembur.getText();
    }
//    tfNama tfAlamat tfNo tfGaji tfLembur

    public void setText(){
        tfId.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
        tfNo.setText("");
        tfGaji.setText("");
        tfLembur.setText("");
        tfTunjangan.setText("");
        tfPajak.setText("");
        tfTotal.setText("");
        cmbPosisi.setSelectedIndex(0);
    }


}
