package models;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class M_admin extends M_pembantu {
    public void insertData(String id,String nama, String alamat,String no,String posisi,String gaji){
        try{
            String query = "INSERT INTO `data1`(`id`, `nama`, `alamat`, `no_hp`, `posisi`, `gaji`) VALUES" +
                    "('"+id+"','"+nama+"','"+alamat+"','"+no+"','"+posisi+"','"+gaji+"')";
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
            String query = "SELECT * FROM `data1`";
            String data[][] = new String[getBanyakData(query)][6];
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("alamat");
                data[jmlData][3] = resultSet.getString("no_hp");
                data[jmlData][4] = resultSet.getString("posisi");
                data[jmlData][5] = resultSet.getString("gaji");
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }

    public void hapusData(String id){
        try{

            String query = "DELETE FROM `data1` WHERE `id` = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Terhapus");

        }catch(SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    public void editData(String id,String nama, String alamat,String no,String posisi,String gaji){
        try{

            statement = koneksi.createStatement();

            String query = "UPDATE data1 set nama='"+nama+"', alamat='"+alamat+"',no_hp ='"+no+"',posisi='"+posisi+"'," +
                    "gaji='"+gaji+"' WHERE id = '"+id+"'";
            statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public String [][] readData(String id) {
        try{
            int jmlData=0;
            String query = "SELECT * FROM `data1` WHERE id='"+id+"'";
            String data[][] = new String[getBanyakData(query)][6];
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id");
                data[jmlData][1] = resultSet.getString("nama");
                data[jmlData][2] = resultSet.getString("alamat");
                data[jmlData][3] = resultSet.getString("no_hp");
                data[jmlData][4] = resultSet.getString("posisi");
                data[jmlData][5] = resultSet.getString("gaji");
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
