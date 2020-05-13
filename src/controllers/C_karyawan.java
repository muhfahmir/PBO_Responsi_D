package controllers;

import MVC.*;
import models.M_karyawan;
import views.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_karyawan {
    V_karyawan v_karyawan;
    M_karyawan m_karyawan;
    
    public C_karyawan(V_karyawan v_karyawan) {
        this.v_karyawan = v_karyawan;// deklarasi v_karyawan pada kelas ini
        //jika tombol diklik sesuai dengan nama masing masing
        v_karyawan.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_karyawan.dispose();//ketika membuka fitur baru maka halaman sebelumnya tertutup
                VC_karyawan vc_karyawan = new VC_karyawan(); // pembuatan objek baru
            }
        });

        v_karyawan.btnGaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_karyawan.dispose();//ketika membuka fitur baru maka halaman sebelumnya tertutup
                MVC_gaji mvc_gaji = new MVC_gaji();// pembuatan objek baru
            }
        });

        v_karyawan.btnPetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_karyawan.dispose();//ketika membuka fitur baru maka halaman sebelumnya tertutup
                VC_petunjuk_k vc_petunjuk_k = new VC_petunjuk_k();// pembuatan objek baru
            }
        });

        v_karyawan.btnAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_karyawan.dispose();//ketika membuka fitur baru maka halaman sebelumnya tertutup
                VC_login vc_login= new VC_login();// pembuatan objek baru
            }
        });

        v_karyawan.btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_karyawan.dispose();//ketika membuka fitur baru maka halaman sebelumnya tertutup
                MVC_data_K mvc_data_K = new MVC_data_K();// pembuatan objek baru
            }
        });

    }

    V_petunjuk_K v_petunjuk_k;
    public C_karyawan(V_petunjuk_K v_petunjuk_k){
        this.v_petunjuk_k=v_petunjuk_k;

        v_petunjuk_k.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_petunjuk_k.dispose();//ketika membuka fitur baru maka halaman sebelumnya tertutup
                VC_karyawan mvc_karyawan = new VC_karyawan();// pembuatan objek baru
            }
        });
    }



}
