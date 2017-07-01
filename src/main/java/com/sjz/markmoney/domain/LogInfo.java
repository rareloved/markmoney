package com.sjz.markmoney.domain;

import java.util.Date;

public class LogInfo {
    private String id;

    private String loginfo;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginfo() {
        return loginfo;
    }

    public void setLoginfo(String loginfo) {
        this.loginfo = loginfo == null ? null : loginfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}