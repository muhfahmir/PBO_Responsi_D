package controllers;

import MVC.*;
import models.M_admin;
import views.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class C_admin {
    V_admin v_admin;
    M_admin m_admin;
    public C_admin(V_admin v_admin) {
        this.v_admin = v_admin;

        v_admin.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_admin.dispose();
                VC_admin vc_admin = new VC_admin();
            }
        });

        v_admin.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_admin.dispose();
                MVC_tambah mvc_tambah = new MVC_tambah();

            }
        });

        v_admin.btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_admin.dispose();;
                MVC_data_A mvc_data_a = new MVC_data_A();
            }
        });

        v_admin.btnPetunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_admin.dispose();
                VC_petunjuk_A vc_petunjuk_a = new VC_petunjuk_A();
            }
        });
        v_admin.btnKaryawan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_admin.dispose();
                VC_karyawan vc_karyawan = new VC_karyawan();
            }
        });
    }
    V_petunjuk_A v_petunjuk_a;
    public C_admin(V_petunjuk_A v_petunjuk_a){
        this.v_petunjuk_a=v_petunjuk_a;

        v_petunjuk_a.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_petunjuk_a.dispose();
                VC_admin vc_admin = new VC_admin();
            }
        });
    }

}
