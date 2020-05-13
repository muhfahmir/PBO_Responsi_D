package controllers;

import MVC.*;
import models.M_karyawan;
import views.V_gaji;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class C_gaji {
    M_karyawan m_karyawan;
    V_gaji v_gaji;
    String id,nama,posisi,alamat,no,gaji,lembur;
    int lembur2,gaji2;
    int tunjangan,pajak,total=0;
    String tunjangan2,pajak2,total2;
    int index;
    public C_gaji(V_gaji v_gaji, M_karyawan m_karyawan){
        this.v_gaji= v_gaji;
        this.m_karyawan= m_karyawan;
        v_gaji.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_gaji.dispose();
                VC_karyawan mvc_karyawan = new VC_karyawan();
            }
        });

        v_gaji.btnGaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_gaji.dispose();
                MVC_gaji mvc_gaji = new MVC_gaji();
            }
        });

        v_gaji.btnPetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_gaji.dispose();
                VC_petunjuk_k vc_petunjuk_k = new VC_petunjuk_k();
            }
        });

        v_gaji.btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_gaji.dispose();
                VC_login vc_login= new VC_login();
            }
        });

        v_gaji.btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_gaji.dispose();
                MVC_data_K mvc_data_K = new MVC_data_K();
            }
        });

        v_gaji.cmbPosisi.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (v_gaji.cmbPosisi.getSelectedIndex()==1){
                    posisi= "Direktur";
                }else if (v_gaji.cmbPosisi.getSelectedIndex()==2){
                    posisi = "Manager";
                }else if (v_gaji.cmbPosisi.getSelectedIndex()==3){
                    posisi = "Programmer";
                }else if (v_gaji.cmbPosisi.getSelectedIndex()==4){
                    posisi = "Marketing";
                }else if (v_gaji.cmbPosisi.getSelectedIndex()==5){
                    posisi = "Surveyor";
                }
                index= v_gaji.cmbPosisi.getSelectedIndex();

            }
        });

//        System.out.println(posisi);

        v_gaji.btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (id.equals("")
                        ||nama.equals("")
                        ||alamat.equals("")
                        ||no.equals("")
                        ||gaji.equals("")
                        ||lembur.equals("")
                        ||index==0
                        ||total==0
                ){
                    JOptionPane.showMessageDialog(null,"Masih Ada data yang kosong!");
                }else {
                    m_karyawan.insertData(id,nama,posisi,gaji,lembur,tunjangan2,pajak2,total2);
                    v_gaji.setText();
                }
            }
        });

        v_gaji.btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = v_gaji.getTfId();
                nama =v_gaji.getTfNama();
                alamat = v_gaji.getTfAlamat();
                no = v_gaji.getTfNo();
                gaji = v_gaji.getTfGaji();
                lembur = v_gaji.getTfLembur();
                if (id.equals("")
                        ||nama.equals("")
                        ||alamat.equals("")
                        ||no.equals("")
                        ||gaji.equals("")
                        ||lembur.equals("")
                        ||index==0
                ){
                    JOptionPane.showMessageDialog(null,"Masih Ada data yang kosong!");
                }else {
                    gaji2= Integer.parseInt(gaji);
                    lembur2 = Integer.parseInt(lembur);
                    tunjangan = lembur2*15000;
                    pajak = gaji2/100*1;
                    total = gaji2-pajak+tunjangan;
                    tunjangan2 = Integer.toString(tunjangan);
                    pajak2 = Integer.toString(pajak);
                    total2 = Integer.toString(total);
                    //set text yang v utama
                    v_gaji.tfTunjangan.setText(tunjangan2);
                    v_gaji.tfPajak.setText(pajak2);
                    v_gaji.tfTotal.setText(total2);
                }
            }
        });
    }
}
