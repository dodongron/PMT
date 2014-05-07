/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.spot_investigation;

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
public class SpotInvestigationBean {

    public static class to_spot_investigation_report {

        public final int id;
        public final String sir_date;
        public final String sir_datetime_of_occurence;
        public final String sir_departure_time;
        public final String sir_arrival_time;
        public final String sir_type_of_occupancy;
        public final String sir_name_of_establishment;
        public final String sir_owner;
        public final String sir_occupant;
        public final String sir_casualty;
        public final double sir_estimated_damage;
        public final String sir_time_fire_started;
        public final String sir_time_fire_out;
        public final String sir_time_alarm_received;
        public final String sir_details_of_investigation;
        public final String sir_disposition;
        public final String sir_investigator;
        public final String sir_chief_of_the_investigation;
        public final String sir_date_added;
        public final String sir_date_modified;
        public final String sir_added_by;
        public final int sir_status;
        public final String sir_approved_by_id;
        public final String sir_approved_by_name;
        public final String sir_approved_by_rank;
        public final String sir_approved_by_position;
        public final String sir_place_of_occurence;

        public to_spot_investigation_report(int id, String sir_date, String sir_datetime_of_occurence, String sir_departure_time, String sir_arrival_time, String sir_type_of_occupancy, String sir_name_of_establishment, String sir_owner, String sir_occupant, String sir_casualty, double sir_estimated_damage, String sir_time_fire_started, String sir_time_fire_out, String sir_time_alarm_received, String sir_details_of_investigation, String sir_disposition, String sir_investigator, String sir_chief_of_the_investigation, String sir_date_added, String sir_date_modified, String sir_added_by, int sir_status, String sir_approved_by_id, String sir_approved_by_name, String sir_approved_by_rank, String sir_approved_by_position, String sir_place_of_occurence) {
            this.id = id;
            this.sir_date = sir_date;
            this.sir_datetime_of_occurence = sir_datetime_of_occurence;
            this.sir_departure_time = sir_departure_time;
            this.sir_arrival_time = sir_arrival_time;
            this.sir_type_of_occupancy = sir_type_of_occupancy;
            this.sir_name_of_establishment = sir_name_of_establishment;
            this.sir_owner = sir_owner;
            this.sir_occupant = sir_occupant;
            this.sir_casualty = sir_casualty;
            this.sir_estimated_damage = sir_estimated_damage;
            this.sir_time_fire_started = sir_time_fire_started;
            this.sir_time_fire_out = sir_time_fire_out;
            this.sir_time_alarm_received = sir_time_alarm_received;
            this.sir_details_of_investigation = sir_details_of_investigation;
            this.sir_disposition = sir_disposition;
            this.sir_investigator = sir_investigator;
            this.sir_chief_of_the_investigation = sir_chief_of_the_investigation;
            this.sir_date_added = sir_date_added;
            this.sir_date_modified = sir_date_modified;
            this.sir_added_by = sir_added_by;
            this.sir_status = sir_status;
            this.sir_approved_by_id = sir_approved_by_id;
            this.sir_approved_by_name = sir_approved_by_name;
            this.sir_approved_by_rank = sir_approved_by_rank;
            this.sir_approved_by_position = sir_approved_by_position;
            this.sir_place_of_occurence = sir_place_of_occurence;
        }
    }

    public static void add_spot_investigation_report(to_spot_investigation_report to_spot_investigation_report) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "insert into spot_investigation_report("
                    + "sir_date"
                    + ",sir_datetime_of_occurence"
                    + ",sir_departure_time"
                    + ",sir_arrival_time"
                    + ",sir_type_of_occupancy"
                    + ",sir_name_of_establishment"
                    + ",sir_owner"
                    + ",sir_occupant"
                    + ",sir_casualty"
                    + ",sir_estimated_damage"
                    + ",sir_time_fire_started"
                    + ",sir_time_fire_out"
                    + ",sir_time_alarm_received"
                    + ",sir_details_of_investigation"
                    + ",sir_disposition"
                    + ",sir_investigator"
                    + ",sir_chief_of_the_investigation"
                    + ",sir_date_added"
                    + ",sir_date_modified"
                    + ",sir_added_by"
                    + ",sir_status"
                    + ",sir_approved_by_id"
                    + ",sir_approved_by_name"
                    + ",sir_approved_by_rank"
                    + ",sir_approved_by_position"
                    + ",sir_place_of_occurence"
                    + ")values("
                    + ":sir_date"
                    + ",:sir_datetime_of_occurence"
                    + ",:sir_departure_time"
                    + ",:sir_arrival_time"
                    + ",:sir_type_of_occupancy"
                    + ",:sir_name_of_establishment"
                    + ",:sir_owner"
                    + ",:sir_occupant"
                    + ",:sir_casualty"
                    + ",:sir_estimated_damage"
                    + ",:sir_time_fire_started"
                    + ",:sir_time_fire_out"
                    + ",:sir_time_alarm_received"
                    + ",:sir_details_of_investigation"
                    + ",:sir_disposition"
                    + ",:sir_investigator"
                    + ",:sir_chief_of_the_investigation"
                    + ",:sir_date_added"
                    + ",:sir_date_modified"
                    + ",:sir_added_by"
                    + ",:sir_status"
                    + ",:sir_approved_by_id"
                    + ",:sir_approved_by_name"
                    + ",:sir_approved_by_rank"
                    + ",:sir_approved_by_position"
                    + ",:sir_place_of_occurence"
                    + ")";

            s0 = SqlStringUtil.parse(s0)
                    .setString("sir_date", to_spot_investigation_report.sir_date)
                    .setString("sir_datetime_of_occurence", to_spot_investigation_report.sir_datetime_of_occurence)
                    .setString("sir_departure_time", to_spot_investigation_report.sir_departure_time)
                    .setString("sir_arrival_time", to_spot_investigation_report.sir_arrival_time)
                    .setString("sir_type_of_occupancy", to_spot_investigation_report.sir_type_of_occupancy)
                    .setString("sir_name_of_establishment", to_spot_investigation_report.sir_name_of_establishment)
                    .setString("sir_owner", to_spot_investigation_report.sir_owner)
                    .setString("sir_occupant", to_spot_investigation_report.sir_occupant)
                    .setString("sir_casualty", to_spot_investigation_report.sir_casualty)
                    .setNumber("sir_estimated_damage", to_spot_investigation_report.sir_estimated_damage)
                    .setString("sir_time_fire_started", to_spot_investigation_report.sir_time_fire_started)
                    .setString("sir_time_fire_out", to_spot_investigation_report.sir_time_fire_out)
                    .setString("sir_time_alarm_received", to_spot_investigation_report.sir_time_alarm_received)
                    .setString("sir_details_of_investigation", to_spot_investigation_report.sir_details_of_investigation)
                    .setString("sir_disposition", to_spot_investigation_report.sir_disposition)
                    .setString("sir_investigator", to_spot_investigation_report.sir_investigator)
                    .setString("sir_chief_of_the_investigation", to_spot_investigation_report.sir_chief_of_the_investigation)
                    .setString("sir_date_added", to_spot_investigation_report.sir_date_added)
                    .setString("sir_date_modified", to_spot_investigation_report.sir_date_modified)
                    .setString("sir_added_by", to_spot_investigation_report.sir_added_by)
                    .setNumber("sir_status", to_spot_investigation_report.sir_status)
                    .setString("sir_approved_by_id", to_spot_investigation_report.sir_approved_by_id)
                    .setString("sir_approved_by_name", to_spot_investigation_report.sir_approved_by_name)
                    .setString("sir_approved_by_rank", to_spot_investigation_report.sir_approved_by_rank)
                    .setString("sir_approved_by_position", to_spot_investigation_report.sir_approved_by_position)
                    .setString("sir_place_of_occurence", to_spot_investigation_report.sir_place_of_occurence)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(SpotInvestigationBean.class, "Successfully Added");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void edit_spot_investigation_report(to_spot_investigation_report to_spot_investigation_report) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "update spot_investigation_report set "
                    + "sir_date= :sir_date"
                    + ",sir_datetime_of_occurence= :sir_datetime_of_occurence"
                    + ",sir_departure_time= :sir_departure_time"
                    + ",sir_arrival_time= :sir_arrival_time"
                    + ",sir_type_of_occupancy= :sir_type_of_occupancy"
                    + ",sir_name_of_establishment= :sir_name_of_establishment"
                    + ",sir_owner= :sir_owner"
                    + ",sir_occupant= :sir_occupant"
                    + ",sir_casualty= :sir_casualty"
                    + ",sir_estimated_damage= :sir_estimated_damage"
                    + ",sir_time_fire_started= :sir_time_fire_started"
                    + ",sir_time_fire_out= :sir_time_fire_out"
                    + ",sir_time_alarm_received= :sir_time_alarm_received"
                    + ",sir_details_of_investigation= :sir_details_of_investigation"
                    + ",sir_disposition= :sir_disposition"
                    + ",sir_investigator= :sir_investigator"
                    + ",sir_chief_of_the_investigation= :sir_chief_of_the_investigation"
                    + ",sir_date_added= :sir_date_added"
                    + ",sir_date_modified= :sir_date_modified"
                    + ",sir_added_by= :sir_added_by"
                    + ",sir_status= :sir_status"
                    + ",sir_approved_by_id= :sir_approved_by_id"
                    + ",sir_approved_by_name= :sir_approved_by_name"
                    + ",sir_approved_by_rank= :sir_approved_by_rank"
                    + ",sir_approved_by_position= :sir_approved_by_position"
                    + ",sir_place_of_occurence= :sir_place_of_occurence"
                    + " where "
                    + " id ='" + to_spot_investigation_report.id + "' "
                    + " ";

            s0 = SqlStringUtil.parse(s0)
                    .setString("sir_date", to_spot_investigation_report.sir_date)
                    .setString("sir_datetime_of_occurence", to_spot_investigation_report.sir_datetime_of_occurence)
                    .setString("sir_departure_time", to_spot_investigation_report.sir_departure_time)
                    .setString("sir_arrival_time", to_spot_investigation_report.sir_arrival_time)
                    .setString("sir_type_of_occupancy", to_spot_investigation_report.sir_type_of_occupancy)
                    .setString("sir_name_of_establishment", to_spot_investigation_report.sir_name_of_establishment)
                    .setString("sir_owner", to_spot_investigation_report.sir_owner)
                    .setString("sir_occupant", to_spot_investigation_report.sir_occupant)
                    .setString("sir_casualty", to_spot_investigation_report.sir_casualty)
                    .setNumber("sir_estimated_damage", to_spot_investigation_report.sir_estimated_damage)
                    .setString("sir_time_fire_started", to_spot_investigation_report.sir_time_fire_started)
                    .setString("sir_time_fire_out", to_spot_investigation_report.sir_time_fire_out)
                    .setString("sir_time_alarm_received", to_spot_investigation_report.sir_time_alarm_received)
                    .setString("sir_details_of_investigation", to_spot_investigation_report.sir_details_of_investigation)
                    .setString("sir_disposition", to_spot_investigation_report.sir_disposition)
                    .setString("sir_investigator", to_spot_investigation_report.sir_investigator)
                    .setString("sir_chief_of_the_investigation", to_spot_investigation_report.sir_chief_of_the_investigation)
                    .setString("sir_date_added", to_spot_investigation_report.sir_date_added)
                    .setString("sir_date_modified", to_spot_investigation_report.sir_date_modified)
                    .setString("sir_added_by", to_spot_investigation_report.sir_added_by)
                    .setNumber("sir_status", to_spot_investigation_report.sir_status)
                    .setString("sir_approved_by_id", to_spot_investigation_report.sir_approved_by_id)
                    .setString("sir_approved_by_name", to_spot_investigation_report.sir_approved_by_name)
                    .setString("sir_approved_by_rank", to_spot_investigation_report.sir_approved_by_rank)
                    .setString("sir_approved_by_position", to_spot_investigation_report.sir_approved_by_position)
                    .setString("sir_place_of_occurence", to_spot_investigation_report.sir_place_of_occurence)
                    .ok();

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(SpotInvestigationBean.class, "Successfully Updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static void delete_spot_investigation_report(String id) {
        try {
            Connection conn = MyConnection.connect();
            String s0 = "delete from spot_investigation_report where "
                    + " id ='" + id + "' "
                    + " ";

            PreparedStatement stmt = conn.prepareStatement(s0);
            stmt.execute();
            Lg.s(SpotInvestigationBean.class, "Successfully Deleted: "+id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            MyConnection.close();
        }
    }

    public static List<to_spot_investigation_report> ret_data(String where) {
        List<to_spot_investigation_report> datas = new ArrayList();

        try {
            Connection conn = MyConnection.connect();
            String s0 = "select "
                    + "id"
                    + ",sir_date"
                    + ",sir_datetime_of_occurence"
                    + ",sir_departure_time"
                    + ",sir_arrival_time"
                    + ",sir_type_of_occupancy"
                    + ",sir_name_of_establishment"
                    + ",sir_owner"
                    + ",sir_occupant"
                    + ",sir_casualty"
                    + ",sir_estimated_damage"
                    + ",sir_time_fire_started"
                    + ",sir_time_fire_out"
                    + ",sir_time_alarm_received"
                    + ",sir_details_of_investigation"
                    + ",sir_disposition"
                    + ",sir_investigator"
                    + ",sir_chief_of_the_investigation"
                    + ",sir_date_added"
                    + ",sir_date_modified"
                    + ",sir_added_by"
                    + ",sir_status"
                    + ",sir_approved_by_id"
                    + ",sir_approved_by_name"
                    + ",sir_approved_by_rank"
                    + ",sir_approved_by_position"
                    + ",sir_place_of_occurence"
                    + " from spot_investigation_report  "
                    + " " + where;

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(s0);
            while (rs.next()) {
                int id = rs.getInt(1);
                String sir_date = rs.getString(2);
                String sir_datetime_of_occurence = rs.getString(3);
                String sir_departure_time = rs.getString(4);
                String sir_arrival_time = rs.getString(5);
                String sir_type_of_occupancy = rs.getString(6);
                String sir_name_of_establishment = rs.getString(7);
                String sir_owner = rs.getString(8);
                String sir_occupant = rs.getString(9);
                String sir_casualty = rs.getString(10);
                double sir_estimated_damage = rs.getDouble(11);
                String sir_time_fire_started = rs.getString(12);
                String sir_time_fire_out = rs.getString(13);
                String sir_time_alarm_received = rs.getString(14);
                String sir_details_of_investigation = rs.getString(15);
                String sir_disposition = rs.getString(16);
                String sir_investigator = rs.getString(17);
                String sir_chief_of_the_investigation = rs.getString(18);
                String sir_date_added = rs.getString(19);
                String sir_date_modified = rs.getString(20);
                String sir_added_by = rs.getString(21);
                int sir_status = rs.getInt(22);
                String sir_approved_by_id = rs.getString(23);
                String sir_approved_by_name = rs.getString(24);
                String sir_approved_by_rank = rs.getString(25);
                String sir_approved_by_position = rs.getString(26);
                String sir_place_of_occurence = rs.getString(27);
                to_spot_investigation_report to = new to_spot_investigation_report(id, sir_date, sir_datetime_of_occurence, sir_departure_time, sir_arrival_time, sir_type_of_occupancy, sir_name_of_establishment, sir_owner, sir_occupant, sir_casualty, sir_estimated_damage, sir_time_fire_started, sir_time_fire_out, sir_time_alarm_received, sir_details_of_investigation, sir_disposition, sir_investigator, sir_chief_of_the_investigation, sir_date_added, sir_date_modified, sir_added_by, sir_status, sir_approved_by_id, sir_approved_by_name, sir_approved_by_rank, sir_approved_by_position, sir_place_of_occurence);
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
