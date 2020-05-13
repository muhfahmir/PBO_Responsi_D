package models;

import javax.swing.*;
import java.sql.*;

public abstract class M_pembantu {
    //mengkoneksikan ke database. model berisi query2
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/responsi_pbo?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";//nama database
    static final String USER = "root";
    static final String PASS = "";

    Connection koneksi;
    Statement statement; //untuk penggunaan query

    public M_pembantu(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public int getBanyakData(String query2){ //menghitung jumlah baris yg ada
        int jmlData = 0; //nilai awal 0
        try{
            statement = koneksi.createStatement();
            String query = query2;
            ResultSet resultSet = statement.executeQuery(query); //pengambilan data dalam java dari database
            while(resultSet.next()){ //ambil nilai dari baris ke 0 sampai baris akhir
                jmlData++;
            }
            return jmlData;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }

}
