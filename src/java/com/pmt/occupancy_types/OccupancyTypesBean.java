/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.occupancy_types;

import com.pmt.util.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mijzcx.synapse.desk.utils.Lg;
import mijzcx.synapse.desk.utils.SqlStringUtil;

/**
 *
 * @author Guinness
 */
public class OccupancyTypesBean {

    public static class to_maintenance_occupancy_types {

        public final int id;
        public final String occupancy;
        public final String occupancy_code;

        public to_maintenance_occupancy_types(int id, String occupancy, String occupancy_code) {
            this.id = id;
            this.occupancy = occupancy;
            this.occupancy_code = occupancy_code;
        }
    }

    public static void add_maintenance_occupancy_types(to_maintenance_occupancy_types to_maintenance_occupancy_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into maintenance_occupancy_types("
                    + "occupancy"
                    + ",occupancy_code"
                    + ")values("
                    + ":occupancy"
                    + ",:occupancy_code"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("occupancy", to_maintenance_occupancy_types.occupancy)
                    .setString("occupancy_code", to_maintenance_occupancy_types.occupancy_code)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(OccupancyTypesBean.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_maintenance_occupancy_types(to_maintenance_occupancy_types to_maintenance_occupancy_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update maintenance_occupancy_types set "
                    + "occupancy= :occupancy"
                    + ",occupancy_code= :occupancy_code"
                    + " where "
                    + " id ='" + to_maintenance_occupancy_types.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("occupancy", to_maintenance_occupancy_types.occupancy)
                    .setString("occupancy_code", to_maintenance_occupancy_types.occupancy_code)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(OccupancyTypesBean.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_maintenance_occupancy_types(to_maintenance_occupancy_types to_maintenance_occupancy_types) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from maintenance_occupancy_types where "
                    + " id ='" + to_maintenance_occupancy_types.id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(OccupancyTypesBean.class, "Successfully Deleted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_maintenance_occupancy_types> ret_data(String where) {
        List<to_maintenance_occupancy_types> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",occupancy"
                    + ",occupancy_code"
                    + " from maintenance_occupancy_types  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String occupancy = rs.getString(2);
                String occupancy_code = rs.getString(3);

                to_maintenance_occupancy_types to = new to_maintenance_occupancy_types(id, occupancy, occupancy_code);
                datas.add(to);
            }
            return datas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

}
