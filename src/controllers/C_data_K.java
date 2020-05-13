package controllers;

import MVC.*;
import models.M_karyawan;
import views.V_data_K;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_data_K {
    M_karyawan m_karyawan;
    V_data_K v_data_k;
    public C_data_K(V_data_K v_data_k, M_karyawan m_karyawan) {
        this.v_data_k = v_data_k;
        this.m_karyawan= m_karyawan;
        String query = "SELECT * FROM pegawai";
        v_data_k.btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (m_karyawan.getBanyakData(query)!=0){
                    updateTable();
                }else {
                    JOptionPane.showMessageDialog(null,"Data Masih Kosong");
                }
            }
        });
        v_data_k.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_k.dispose();
                VC_karyawan vc_karyawan = new VC_karyawan();
            }
        });

        v_data_k.btnGaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_k.dispose();
                MVC_gaji mvc_gaji = new MVC_gaji();
            }
        });

        v_data_k.btnPetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_k.dispose();
                VC_petunjuk_k vc_petunjuk_k = new VC_petunjuk_k();
            }
        });

        v_data_k.btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_k.dispose();
                VC_login vc_login= new VC_login();
            }
        });

        v_data_k.btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_k.dispose();
                MVC_data_K mvc_data_K = new MVC_data_K();
            }
        });

    }

    private void updateTable() {
        String dataKaryawan[][] = m_karyawan.readData();
        v_data_k.tabel.setModel(new JTable(dataKaryawan, v_data_k.namaKolom).getModel());
    }
}
