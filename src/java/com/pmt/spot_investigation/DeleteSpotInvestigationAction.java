/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmt.spot_investigation;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Guinness
 */
public class DeleteSpotInvestigationAction extends ActionSupport {

    String spotId;

    public DeleteSpotInvestigationAction() {
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    @Override
    public String execute() throws Exception {

        SpotInvestigationBean.delete_spot_investigation_report(spotId);
        return "success";
    }

}
