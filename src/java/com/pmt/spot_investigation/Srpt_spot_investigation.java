/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.spot_investigation;

import com.pmt.test.Srpt_acknowledgement_receipt;
import com.pmt.util.MyConnection;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Guinness
 */
public class Srpt_spot_investigation {

    public final String img_path;
    public final String for_name;
    public final String date;
    public final String occurence;
    public final String departure;
    public final String arrival_time;
    public final String occupancy;
    public final String establishment;
    public final String owner;
    public final String occupant;
    public final String casualty_fatality;
    public final String casualty_injured;
    public final String estimated_damage;
    public final String time_fire_started;
    public final String time_fire_out;
    public final String alarm;
    public final String details;
    public final String disposition;
    public final String noted_name;
    public final String noted_rank;
    public final String noted_position;
    public final String approved_name;
    public final String approved_rank;
    public final String approved_position;

    public Srpt_spot_investigation(String img_path, String for_name, String date, String occurence, String departure, String arrival_time, String occupancy, String establishment, String owner, String occupant, String casualty_fatality, String casualty_injured, String estimated_damage, String time_fire_started, String time_fire_out, String alarm, String details, String disposition, String noted_name, String noted_rank, String noted_position, String approved_name, String approved_rank, String approved_position) {
        this.img_path = img_path;
        this.for_name = for_name;
        this.date = date;
        this.occurence = occurence;
        this.departure = departure;
        this.arrival_time = arrival_time;
        this.occupancy = occupancy;
        this.establishment = establishment;
        this.owner = owner;
        this.occupant = occupant;
        this.casualty_fatality = casualty_fatality;
        this.casualty_injured = casualty_injured;
        this.estimated_damage = estimated_damage;
        this.time_fire_started = time_fire_started;
        this.time_fire_out = time_fire_out;
        this.alarm = alarm;
        this.details = details;
        this.disposition = disposition;
        this.noted_name = noted_name;
        this.noted_rank = noted_rank;
        this.noted_position = noted_position;
        this.approved_name = approved_name;
        this.approved_rank = approved_rank;
        this.approved_position = approved_position;
    }

    public static void print(Srpt_spot_investigation rpt) {
        String jrxml = "rpt_spot_investigation_1.jrxml";

        try {
            InputStream is = Srpt_spot_investigation.class.getResourceAsStream(jrxml);
            JasperReport jasperReport;
            jasperReport = JasperCompileManager.compileReport(is);
            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                    setParameter(rpt), JasperUtil.emptyDatasource());
            JasperPrintManager.printReport(jasperPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(Srpt_spot_investigation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void print2() {
        String jrxml = "rpt_spot_investigation_1.jrxml";
        String img_path = "http://localhost:" + MyConnection.getPort() + "/FIRE/images/";
        String for_name = "";
        String date = "";
        String occurence = "";
        String departure = "";
        String arrival_time = "";
        String occupancy = "";
        String establishment = "";
        String owner = "";
        String occupant = "";
        String casualty_fatality = "";
        String casualty_injured = "";
        String estimated_damage = "";
        String time_fire_started = "";
        String time_fire_out = "";
        String alarm = "";
        String details = "";
        String disposition = "";
        String noted_name = "";
        String noted_rank = "";
        String noted_position = "";
        String approved_name = "";
        String approved_rank = "";
        String approved_position = "";
        Srpt_spot_investigation rpt = new Srpt_spot_investigation(img_path, for_name, date, occurence, departure, arrival_time, occupancy, establishment, owner, occupant, casualty_fatality, casualty_injured, estimated_damage, time_fire_started, time_fire_out, alarm, details, disposition, noted_name, noted_rank, noted_position, approved_name, approved_rank, approved_position);

        try {
            InputStream is = Srpt_spot_investigation.class.getResourceAsStream(jrxml);
            JasperReport jasperReport;
            jasperReport = JasperCompileManager.compileReport(is);
            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                    setParameter(rpt), JasperUtil.emptyDatasource());
            JasperPrintManager.printReport(jasperPrint, false);
        } catch (JRException ex) {
            Logger.getLogger(Srpt_spot_investigation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    static JasperPrint jasperPrint = null;

    public static void main(String[] args) {
        print2();
    }

    public static void pdf_view(Srpt_spot_investigation to) {
//        JasperUtil.pdfViewer(
//                compileJasper2(),
//                JasperUtil.setParameter(to),
//                JasperUtil.emptyDatasource());

        JasperPrint jasperPrint = null;
        try {
            JRExporter exporter = new JRPdfExporter();

            InputStream is = Srpt_spot_investigation.class.getResourceAsStream("rpt_spot_investigation.jrxml");
            JasperReport jasperReport = JasperCompileManager.compileReport(is);
            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                    setParameter(to), JasperUtil.emptyDatasource());
            JasperExportManager.exportReportToPdfFile(
                    jasperPrint, "reports/simple_report.pdf");

            exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
                                  is);
            exporter.setParameter(JRExporterParameter.JASPER_PRINT,
                                  jasperPrint);
            exporter.exportReport();
        } catch (JRException ex) {
            Logger.getLogger(Srpt_spot_investigation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static JRViewer get_viewer(Srpt_spot_investigation to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_spot_investigation_1.jrxml";
            InputStream is = Srpt_spot_investigation.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static JasperReport compileJasper2() {
        try {
            String jrxml = "rpt_spot_investigation_1.jrxml";
            InputStream is = Srpt_spot_investigation.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }
}
