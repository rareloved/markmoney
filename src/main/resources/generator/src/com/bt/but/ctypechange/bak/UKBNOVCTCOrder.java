package com.bt.but.ctypechange.mapper;

import java.util.Date;

public class UKBNOVCTCOrder {
    private String id;

    private String requestid;

    private String status;

    private Date startingdate;

    private String losingbac;

    private String onebillaccount;

    private String gainingcugid;

    private String gaininglecode;

    private String gaininglename;

    private String gainingbacname;

    private String effectivedate;

    private String billingaddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid == null ? null : requestid.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getStartingdate() {
        return startingdate;
    }

    public void setStartingdate(Date startingdate) {
        this.startingdate = startingdate;
    }

    public String getLosingbac() {
        return losingbac;
    }

    public void setLosingbac(String losingbac) {
        this.losingbac = losingbac == null ? null : losingbac.trim();
    }

    public String getOnebillaccount() {
        return onebillaccount;
    }

    public void setOnebillaccount(String onebillaccount) {
        this.onebillaccount = onebillaccount == null ? null : onebillaccount.trim();
    }

    public String getGainingcugid() {
        return gainingcugid;
    }

    public void setGainingcugid(String gainingcugid) {
        this.gainingcugid = gainingcugid == null ? null : gainingcugid.trim();
    }

    public String getGaininglecode() {
        return gaininglecode;
    }

    public void setGaininglecode(String gaininglecode) {
        this.gaininglecode = gaininglecode == null ? null : gaininglecode.trim();
    }

    public String getGaininglename() {
        return gaininglename;
    }

    public void setGaininglename(String gaininglename) {
        this.gaininglename = gaininglename == null ? null : gaininglename.trim();
    }

    public String getGainingbacname() {
        return gainingbacname;
    }

    public void setGainingbacname(String gainingbacname) {
        this.gainingbacname = gainingbacname == null ? null : gainingbacname.trim();
    }

    public String getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate == null ? null : effectivedate.trim();
    }

    public String getBillingaddress() {
        return billingaddress;
    }

    public void setBillingaddress(String billingaddress) {
        this.billingaddress = billingaddress == null ? null : billingaddress.trim();
    }
}