package com.zxz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Message {
    private Integer xxbh;//公告信息编号
    private String xxbt;//信息标题
    private String xxnr;//信息内容
    private String fbr;//发布人
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date fbsj;//发布时间

    public Integer getXxbh() {
        return xxbh;
    }

    public void setXxbh(Integer xxbh) {
        this.xxbh = xxbh;
    }

    public String getXxbt() {
        return xxbt;
    }

    public void setXxbt(String xxbt) {
        this.xxbt = xxbt;
    }

    public String getXxnr() {
        return xxnr;
    }

    public void setXxnr(String xxnr) {
        this.xxnr = xxnr;
    }

    public String getFbr() {
        return fbr;
    }

    public void setFbr(String fbr) {
        this.fbr = fbr;
    }

    public Date getFbsj() {
        return fbsj;
    }

    public void setFbsj(Date fbsj) {
        this.fbsj = fbsj;
    }
}
