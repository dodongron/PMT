/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.test;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mijzcx.synapse.desk.utils.Application;
import mijzcx.synapse.desk.utils.DigitToWord;
import mijzcx.synapse.desk.utils.FitIn;
import mijzcx.synapse.desk.utils.JasperUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ronald
 */
public class Srpt_acknowledgement_receipt {

    public final String or_no;
    public final String date;
    public final String parishioner;
    public final String contact_no;
    public final String particular;
    public final double amount;
    public final String amount_in_words;
    public final String received_by;
    public final String bank;
    public final String check_no;

    public Srpt_acknowledgement_receipt(String or_no, String date, String parishioner, String contact_no, String particular, double amount, String amount_in_words, String received_by, String bank, String check_no) {
        this.or_no = or_no;
        this.date = date;
        this.parishioner = parishioner;
        this.contact_no = contact_no;
        this.particular = particular;
        this.amount = amount;
        this.amount_in_words = amount_in_words;
        this.received_by = received_by;
        this.bank = bank;
        this.check_no = check_no;
    }

    public static void main2(String[] args) {

        String or_no = "000000000001";
        String date = "03/07/2014 10:00PM";
        String parishioner = "Juan dela Cruz";
        String contact_no = "09261625529";
        String particular = "Boxes";
        double amount = 500;
        String amount_in_words = "FIVE HUNDRED PESOS ONLY";
        String received_by = "Ronald Pascua";
        String bank = "Bank: BPI";
        String check_no = "Check No: 00000011223";
        Srpt_acknowledgement_receipt rpt = new Srpt_acknowledgement_receipt(or_no, date, parishioner, contact_no, particular, amount, amount_in_words, received_by, bank, check_no);

        JRViewer viewer = Srpt_acknowledgement_receipt.get_viewer(rpt);
        JFrame f = Application.launchMainFrame3(viewer, "Sample", true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void pdf_view(Srpt_acknowledgement_receipt to) {

        JasperUtil.pdfViewer(
                JasperUtil.getJasper(Srpt_acknowledgement_receipt.class),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());
    }

    public static JRViewer get_viewer(Srpt_acknowledgement_receipt to) {

        return JasperUtil.getJasperViewer(
                compileJasper(),
                JasperUtil.setParameter(to),
                JasperUtil.emptyDatasource());

    }

    public static JasperReport compileJasper() {
        try {
            String jrxml = "rpt_acknowledgement_receipt.jrxml";
            InputStream is = Srpt_acknowledgement_receipt.class.getResourceAsStream(jrxml);
            JasperReport jasper = JasperCompileManager.compileReport(is);

            return jasper;
        } catch (JRException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        print();
    }

    public static void print() {
        String label = "Change";
        String set = FitIn.fmt_wc_0(100);
        String trans = "trans";
        System.out.println("Transaction: " + trans);
        trans = trans.substring(0, trans.length() - 1);
        try {
            String jrxml = "rpt_acknowledgement_receipt.jrxml";
            String or_no1 = "";
            String date = "";
            String parishioner1 = "";
            String contact_no = "";
            String particular = trans;
            double amount = 0;
            String amount_in_words = DigitToWord.convertToWordsIn(amount);
            amount_in_words = amount_in_words.toUpperCase();
            String received_by = "";
            Srpt_acknowledgement_receipt rpt = new Srpt_acknowledgement_receipt(or_no1, date, parishioner1, contact_no, particular, amount, amount_in_words, received_by, "", "");
            InputStream is = Srpt_acknowledgement_receipt.class.getResourceAsStream(jrxml);
            JasperReport jasperReport = JasperCompileManager.compileReport(is);
            jasperPrint = JasperFillManager.fillReport(jasperReport, JasperUtil.
                    setParameter(rpt), JasperUtil.emptyDatasource());
            JasperPrintManager.printReport(jasperPrint, false);

        } catch (JRException ex) {
            Logger.getLogger(Srpt_acknowledgement_receipt.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }
    static JasperPrint jasperPrint = null;
}
