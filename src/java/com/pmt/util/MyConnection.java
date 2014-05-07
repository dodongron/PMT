/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author i1
 */
public class MyConnection {

    private static MyConnection connection;

    private static void init() {
        if (connection == null) {
            connection = new MyConnection();
        }
    }
    private static Connection conn;

    public static Connection connect() {
        try {
            String host = System.getProperty("pool_host", "localhost:3306");
            String user = System.getProperty("pool_user", "root");
            String password = System.getProperty("pool_password", "password");
            String dbName = System.getProperty("mydb", "okidokta_mss");
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + host + "/" + dbName;
            try {
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                Logger.getLogger(MyConnection.class.getName()).
                        log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyConnection.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        connect();
    }

    public static String port;

    public static String getPort() {
        return port;
    }

    public static void setPort(String port) {
        MyConnection.port = port;
    }

}
