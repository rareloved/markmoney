package com.sjz.markmoney.domain;

import java.util.Date;

public class MarkInfo {
    private String id;

    private String userid;

    private Integer consumerType;

    private String markNote;

    private Integer money;

    private Boolean markInOut;

    private Date markDate;

    private Date createDate;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public Integer getConsumerType() {
        return consumerType;
    }

    public void setConsumerType(Integer consumerType) {
        this.consumerType = consumerType;
    }

    public String getMarkNote() {
        return markNote;
    }

    public void setMarkNote(String markNote) {
        this.markNote = markNote == null ? null : markNote.trim();
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Boolean getMarkInOut() {
        return markInOut;
    }

    public void setMarkInOut(Boolean markInOut) {
        this.markInOut = markInOut;
    }

    public Date getMarkDate() {
        return markDate;
    }

    public void setMarkDate(Date markDate) {
        this.markDate = markDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}