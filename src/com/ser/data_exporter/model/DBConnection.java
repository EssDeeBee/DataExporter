package com.ser.data_exporter.model;
import java.sql.*;

public class DBConnection {

    public static void Connect () {


        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("jdbc драйвер успешно подключен");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Ошибка в подключении jdbc драйвера");
            e.printStackTrace();

        }

    }

}
