/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.spot_investigation;

import com.opensymphony.xwork2.ActionSupport;
import com.pmt.test.Srpt_acknowledgement_receipt;
import com.pmt.util.DateType;
import com.pmt.util.MyConnection;
import com.pmt.util.MyDate;
import java.util.Date;
import java.util.Map;
import mijzcx.synapse.desk.utils.FitIn;
import net.sf.jasperreports.engine.JasperPrint;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Guinness
 */
public class PrintSpotInvestigationAction extends ActionSupport implements SessionAware {

    private Map session;
    int spotId;
    String sir_date;
    String sir_datetime_of_occurence;
    String sir_departure_time;
    String sir_arrival_time;
    String sir_type_of_occupancy;
    String sir_name_of_establishment;
    String sir_owner;
    String sir_occupant;
    String sir_casualty;
    double sir_estimated_damage;
    String sir_time_fire_started;
    String sir_time_fire_out;
    String sir_time_alarm_received;
    String sir_details_of_investigation;
    String sir_disposition;
    String sir_investigator;
    String sir_chief_of_the_investigation;
    String sir_date_added;
    String sir_date_modified;
    String sir_added_by;

    int sir_status;
    String sir_approved_by_id;
    String sir_approved_by_name;
    String sir_approved_by_rank;
    String sir_approved_by_position;
    String sir_place_of_occurence;

    public PrintSpotInvestigationAction() {
    }

    public Map getSession() {
        return session;
    }

    @Override
    public void setSession(Map session) {
        this.session = session;
    }

    public int getSpotId() {
        return spotId;
    }

    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }

    public String getSir_date() {
        return sir_date;
    }

    public void setSir_date(String sir_date) {
        this.sir_date = sir_date;
    }

    public String getSir_datetime_of_occurence() {
        return sir_datetime_of_occurence;
    }

    public void setSir_datetime_of_occurence(String sir_datetime_of_occurence) {
        this.sir_datetime_of_occurence = sir_datetime_of_occurence;
    }

    public String getSir_departure_time() {
        return sir_departure_time;
    }

    public void setSir_departure_time(String sir_departure_time) {
        this.sir_departure_time = sir_departure_time;
    }

    public String getSir_arrival_time() {
        return sir_arrival_time;
    }

    public void setSir_arrival_time(String sir_arrival_time) {
        this.sir_arrival_time = sir_arrival_time;
    }

    public String getSir_type_of_occupancy() {
        return sir_type_of_occupancy;
    }

    public void setSir_type_of_occupancy(String sir_type_of_occupancy) {
        this.sir_type_of_occupancy = sir_type_of_occupancy;
    }

    public String getSir_name_of_establishment() {
        return sir_name_of_establishment;
    }

    public void setSir_name_of_establishment(String sir_name_of_establishment) {
        this.sir_name_of_establishment = sir_name_of_establishment;
    }

    public String getSir_owner() {
        return sir_owner;
    }

    public void setSir_owner(String sir_owner) {
        this.sir_owner = sir_owner;
    }

    public String getSir_occupant() {
        return sir_occupant;
    }

    public void setSir_occupant(String sir_occupant) {
        this.sir_occupant = sir_occupant;
    }

    public String getSir_casualty() {
        return sir_casualty;
    }

    public void setSir_casualty(String sir_casualty) {
        this.sir_casualty = sir_casualty;
    }

    public double getSir_estimated_damage() {
        return sir_estimated_damage;
    }

    public void setSir_estimated_damage(double sir_estimated_damage) {
        this.sir_estimated_damage = sir_estimated_damage;
    }

    public String getSir_time_fire_started() {
        return sir_time_fire_started;
    }

    public void setSir_time_fire_started(String sir_time_fire_started) {
        this.sir_time_fire_started = sir_time_fire_started;
    }

    public String getSir_time_fire_out() {
        return sir_time_fire_out;
    }

    public void setSir_time_fire_out(String sir_time_fire_out) {
        this.sir_time_fire_out = sir_time_fire_out;
    }

    public String getSir_time_alarm_received() {
        return sir_time_alarm_received;
    }

    public void setSir_time_alarm_received(String sir_time_alarm_received) {
        this.sir_time_alarm_received = sir_time_alarm_received;
    }

    public String getSir_details_of_investigation() {
        return sir_details_of_investigation;
    }

    public void setSir_details_of_investigation(String sir_details_of_investigation) {
        this.sir_details_of_investigation = sir_details_of_investigation;
    }

    public String getSir_disposition() {
        return sir_disposition;
    }

    public void setSir_disposition(String sir_disposition) {
        this.sir_disposition = sir_disposition;
    }

    public String getSir_investigator() {
        return sir_investigator;
    }

    public void setSir_investigator(String sir_investigator) {
        this.sir_investigator = sir_investigator;
    }

    public String getSir_chief_of_the_investigation() {
        return sir_chief_of_the_investigation;
    }

    public void setSir_chief_of_the_investigation(String sir_chief_of_the_investigation) {
        this.sir_chief_of_the_investigation = sir_chief_of_the_investigation;
    }

    public String getSir_date_added() {
        return sir_date_added;
    }

    public void setSir_date_added(String sir_date_added) {
        this.sir_date_added = sir_date_added;
    }

    public String getSir_date_modified() {
        return sir_date_modified;
    }

    public void setSir_date_modified(String sir_date_modified) {
        this.sir_date_modified = sir_date_modified;
    }

    public String getSir_added_by() {
        return sir_added_by;
    }

    public void setSir_added_by(String sir_added_by) {
        this.sir_added_by = sir_added_by;
    }

    public int getSir_status() {
        return sir_status;
    }

    public void setSir_status(int sir_status) {
        this.sir_status = sir_status;
    }

    public String getSir_approved_by_id() {
        return sir_approved_by_id;
    }

    public void setSir_approved_by_id(String sir_approved_by_id) {
        this.sir_approved_by_id = sir_approved_by_id;
    }

    public String getSir_approved_by_name() {
        return sir_approved_by_name;
    }

    public void setSir_approved_by_name(String sir_approved_by_name) {
        this.sir_approved_by_name = sir_approved_by_name;
    }

    public String getSir_approved_by_rank() {
        return sir_approved_by_rank;
    }

    public void setSir_approved_by_rank(String sir_approved_by_rank) {
        this.sir_approved_by_rank = sir_approved_by_rank;
    }

    public String getSir_approved_by_position() {
        return sir_approved_by_position;
    }

    public void setSir_approved_by_position(String sir_approved_by_position) {
        this.sir_approved_by_position = sir_approved_by_position;
    }

    public String getSir_place_of_occurence() {
        return sir_place_of_occurence;
    }

    public void setSir_place_of_occurence(String sir_place_of_occurence) {
        this.sir_place_of_occurence = sir_place_of_occurence;
    }

    @Override
    public String execute() throws Exception {

        Date d = DateType.datetime.parse(sir_datetime_of_occurence);
        sir_datetime_of_occurence = DateType.slash3.format(d);

        String sf = DateType.sf.format(d);
        sir_departure_time = MyDate.parse_to_time(sir_departure_time);
        sir_arrival_time = MyDate.parse_to_time(sir_arrival_time);
        sir_time_fire_started = MyDate.parse_to_time(sir_time_fire_started);
        sir_time_fire_out = MyDate.parse_to_time(sir_time_fire_out);
        sir_time_alarm_received = MyDate.parse_to_time(sir_time_alarm_received);

        String img_path = "http://localhost:" + MyConnection.getPort() + "/FIRE/images/";
        String for_name = sir_name_of_establishment;
        String date = DateType.month_date.format(new Date());
        String occurence = sir_datetime_of_occurence;
        String departure = sir_departure_time;
        String arrival_time = sir_arrival_time;
        String occupancy = sir_type_of_occupancy;
        String establishment = sir_name_of_establishment;
        String owner = sir_owner;
        String occupant = sir_occupant;
        String casualty_fatality = sir_casualty;
        String casualty_injured = sir_casualty;
        String estimated_damage = FitIn.fmt_wc_0(sir_estimated_damage);
        String time_fire_started = sir_time_fire_started;
        String time_fire_out = sir_time_fire_out;
        String alarm = sir_time_alarm_received;
        String details = sir_details_of_investigation;
        String disposition = sir_disposition;
        String noted_name = "";
        String noted_rank = "";
        String noted_position = "";
        String approved_name = "";
        String approved_rank = "";
        String approved_position = "";

        Srpt_spot_investigation rpt = new Srpt_spot_investigation(img_path, for_name, date, occurence, departure, arrival_time, occupancy, establishment, owner, occupant, casualty_fatality, casualty_injured, estimated_damage, time_fire_started, time_fire_out, alarm, details, disposition, noted_name, noted_rank, noted_position, approved_name, approved_rank, approved_position);
        Srpt_acknowledgement_receipt.print();

        return "success";
    }
    static JasperPrint jasperPrint = null;
}
