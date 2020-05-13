package models;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M_karyawan extends M_pembantu{
    public void insertData(String id, String nama, String posisi, String gaji, String lembur, String tunjangan2, String pajak2, String total2){
        try{
            String query = "INSERT INTO `pegawai`(`id`, `nama`, `posisi`, `gaji_pokok`, `pajak`, `jam_lembur`, `tunjangan_lembur`, `total_gaji`) " +
                    "VALUES('"+id+"','"+nama+"','"+posisi+"','"+gaji+"','"+pajak2+"','"+lembur+"','"+tunjangan2+"','"+total2+"')";
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query);//Mengubah isi tabel
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }
        catch(Exception sql){
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

    public String[][] readData(){
        try{
            int jmlData=0;
            String query = "SELECT * FROM `pegawai`";
            String data[][] = new String[getBanyakData(query)][7];
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("posisi");
                data[jmlData][3] = resultSet.getString("gaji_pokok");
                data[jmlData][4] = resultSet.getString("jam_lembur");
                data[jmlData][5] = resultSet.getString("tunjangan_lembur");
                data[jmlData][6] = resultSet.getString("total_gaji");
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
}
