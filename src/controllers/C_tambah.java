package controllers;

import MVC.*;
import models.M_admin;
import views.V_tambah;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class C_tambah {
    V_tambah v_tambah;
    M_admin m_admin;
    String posisi,id,nama,alamat,no,gaji;
    int index;
    public C_tambah(V_tambah v_tambah, M_admin m_admin) {
        this.v_tambah=v_tambah;
        this.m_admin = m_admin;
        v_tambah.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_tambah.dispose();
                VC_admin vc_admin = new VC_admin();
            }
        });

        v_tambah.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_tambah.dispose();
                MVC_tambah mvc_tambah = new MVC_tambah();

            }
        });

        v_tambah.btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_tambah.dispose();;
                MVC_data_A mvc_data_a = new MVC_data_A();
            }
        });

        v_tambah.btnPetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_tambah.dispose();
                VC_petunjuk_A vc_petunjuk_a = new VC_petunjuk_A();
            }
        });
        v_tambah.btnKaryawan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_tambah.dispose();
                VC_karyawan vc_karyawan = new VC_karyawan();
            }
        });
        v_tambah.cmbPosisi.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (v_tambah.cmbPosisi.getSelectedIndex()==1){
                    posisi= "Direktur";
                }else if (v_tambah.cmbPosisi.getSelectedIndex()==2){
                    posisi = "Manager";
                }else if (v_tambah.cmbPosisi.getSelectedIndex()==3){
                    posisi = "Programmer";
                }else if (v_tambah.cmbPosisi.getSelectedIndex()==4){
                    posisi = "Marketing";
                }else if (v_tambah.cmbPosisi.getSelectedIndex()==5){
                    posisi = "Surveyor";
                }
                index= v_tambah.cmbPosisi.getSelectedIndex();

            }
        });

        v_tambah.btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = v_tambah.getTfId();
                nama = v_tambah.getTfNama();
                alamat = v_tambah.getTfAlamat();
                no = v_tambah.getTfNo();
                gaji = v_tambah.getTfGaji();
                if (id.equals("")
                        ||nama.equals("")
                        ||alamat.equals("")
                        ||no.equals("")
                        ||gaji.equals("")
                        ||index==0
                ){
                    JOptionPane.showMessageDialog(null,"Masih ada data yang kosong");
                }else {
                    m_admin.insertData(id,nama,alamat,no,posisi,gaji);
                    v_tambah.setText();
                }
            }
        });
    }
}
