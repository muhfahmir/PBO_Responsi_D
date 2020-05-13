package controllers;

import MVC.VC_admin;
import MVC.VC_karyawan;
import views.V_login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C_login {
    V_login v_login;
    public C_login(V_login v_login){
        this.v_login = v_login;
        v_login.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (v_login.getUsername().equals("admin") && v_login.getPassword().equals("admin")){
                    v_login.dispose();
                    VC_admin vc_admin = new VC_admin();
                }else {
                    JOptionPane.showMessageDialog(null,"Username atau password Salah!");
                }
            }
        });
        v_login.btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_login.dispose();
                VC_karyawan vc_karyawan =new VC_karyawan();
            }
        });
    }
}
