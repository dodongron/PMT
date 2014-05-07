/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.spot_investigation;

import com.opensymphony.xwork2.ActionSupport;
import com.pmt.util.DateType;
import java.util.Date;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Guinness
 */
public class UpdateSpotInvestigationAction extends ActionSupport implements SessionAware {

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

    public UpdateSpotInvestigationAction() {
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

        Date d = DateType.slash3.parse(sir_datetime_of_occurence);
        sir_datetime_of_occurence = DateType.datetime.format(d);

        String sf = DateType.sf.format(d);
        sir_departure_time = sf + " " + sir_departure_time + ":00";
        sir_arrival_time = sf + " " + sir_arrival_time + ":00";
        sir_time_fire_started = sf + " " + sir_time_fire_started + ":00";
        sir_time_fire_out = sf + " " + sir_time_fire_out + ":00";
        sir_time_alarm_received = sf + " " + sir_time_alarm_received + ":00";
        SpotInvestigationBean.to_spot_investigation_report to = new SpotInvestigationBean.to_spot_investigation_report(
                spotId, sir_date, sir_datetime_of_occurence, sir_departure_time, sir_arrival_time, sir_type_of_occupancy, sir_name_of_establishment, sir_owner, sir_occupant, sir_casualty, sir_estimated_damage, sir_time_fire_started, sir_time_fire_out, sir_time_alarm_received, sir_details_of_investigation, sir_disposition, sir_investigator, sir_chief_of_the_investigation, sir_date_added, sir_date_modified, sir_added_by, sir_status, sir_approved_by_id, sir_approved_by_name, sir_approved_by_rank, sir_approved_by_position, sir_place_of_occurence);
        SpotInvestigationBean.edit_spot_investigation_report(to);
        return "success";
    }

}
