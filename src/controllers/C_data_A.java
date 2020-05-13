package controllers;

import MVC.*;
import models.M_admin;
import views.V_data_A;
import views.V_update_A;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class C_data_A {
    M_admin m_admin;
    V_data_A v_data_a;
    V_update_A v_update_a;
    String posisi,id;
    int index;
    public C_data_A(V_data_A v_data_a, M_admin m_admin) {
        this.v_data_a = v_data_a;
        this.m_admin = m_admin;
        String query = "SELECT * FROM data1";

        v_data_a.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_a.dispose();
                VC_admin vc_admin = new VC_admin();
            }
        });
        v_data_a.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_a.dispose();
                MVC_tambah mvc_tambah = new MVC_tambah();

            }
        });

        v_data_a.btnData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_a.dispose();;
                MVC_data_A mvc_data_a = new MVC_data_A();
            }
        });
        v_data_a.btnKaryawan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v_data_a.dispose();
                VC_karyawan vc_karyawan = new VC_karyawan();
            }
        });
        v_data_a.btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (m_admin.getBanyakData(query)!=0){
                    updateTable();
                }
            }
        });

        v_data_a.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    id = v_data_a.getTfId();
                    if (!id.equals("")) {
                        m_admin.hapusData(id);
                    }else {
                        JOptionPane.showMessageDialog(null,"Masukkan ID terlebih dahulu");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        v_data_a.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    id = v_data_a.getTfId();
                    if (!id.equals("")) {
                        String [][]data = m_admin.readData(id);
                        if (data!=null){
                            String editID = data[0][0];
                            String editNama =data[0][1];
                            String editAlamat =data[0][2];
                            String editNo =data[0][3];
                            String editPosisi = data[0][4];
                            if (editPosisi.equals("Direktur")){
                                index= 1;
                            }else if (editPosisi.equals("Manager")){
                                index=2;
                            }else if (editPosisi.equals("Programmer")){
                                index = 3;
                            }else if (editPosisi.equals("Marketing")){
                                index = 4;
                            }else if (editPosisi.equals("Surveyor")){
                                index = 5;
                            }
                            String editGaji =data[0][5];
                            v_update_a= new V_update_A();
                            v_update_a.tfId.setText(editID);
                            v_update_a.tfNama.setText(editNama);
                            v_update_a.tfAlamat.setText(editAlamat);
                            v_update_a.tfNo.setText(editNo);
                            v_update_a.tfGaji.setText(editGaji);
                            v_update_a.cmbPosisi.setSelectedIndex(index);
                            v_update_a.cmbPosisi.addItemListener(new ItemListener() {
                                @Override
                                public void itemStateChanged(ItemEvent e) {
                                    if (v_update_a.cmbPosisi.getSelectedIndex()==1){
                                        posisi= "Direktur";
                                    }else if (v_update_a.cmbPosisi.getSelectedIndex()==2){
                                        posisi = "Manager";
                                    }else if (v_update_a.cmbPosisi.getSelectedIndex()==3){
                                        posisi = "Programmer";
                                    }else if (v_update_a.cmbPosisi.getSelectedIndex()==4){
                                        posisi = "Marketing";
                                    }else if (v_update_a.cmbPosisi.getSelectedIndex()==5){
                                        posisi = "Surveyor";
                                    }
                                    index= v_update_a.cmbPosisi.getSelectedIndex();
                                }
                            });
                            v_update_a.btnUbah.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (!id.equals("")){
                                        m_admin.editData(
                                                v_update_a.getTfId(),
                                                v_update_a.getTfNama(),
                                                v_update_a.getTfAlamat(),
                                                v_update_a.getTfNo(),
                                                posisi,
                                                v_update_a.getTfGaji()
                                        );

                                    }
                                }
                            });
                            v_update_a.btnHome.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    v_update_a.dispose();
                                    VC_admin vc_admin = new VC_admin();
                                }
                            });

                            v_update_a.btnTambah.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    v_update_a.dispose();
                                    MVC_tambah mvc_tambah = new MVC_tambah();

                                }
                            });

                            v_update_a.btnData.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    v_update_a.dispose();;
                                    MVC_data_A mvc_data_a = new MVC_data_A();
                                }
                            });

                            v_update_a.btnPetunjuk.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    v_update_a.dispose();
                                    VC_petunjuk_A vc_petunjuk_a = new VC_petunjuk_A();
                                }
                            });
                            v_update_a.btnKaryawan.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    v_update_a.dispose();
                                    VC_karyawan vc_karyawan = new VC_karyawan();
                                }
                            });
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Masukkan ID terlebih dahulu");
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });
    }

    //method update table
    private void updateTable() {
        String dataKaryawan[][] = m_admin.readData();
        v_data_a.tabel.setModel(new JTable(dataKaryawan, v_data_a.namaKolom).getModel());
    }
}
