package com.zxz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Analysis {//费用分析
    private Integer fxbh;//费用分析编号
    private Integer bxbh;//报销单编号
    private String sbr;// 申报人
    private String fxnr;//分析内容
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date fxsj;//分析时间
    private String yssj;//预算数据
    private String sjsj;//实际预算
    private String zxqk;//执行情况

    public Integer getFxbh() {
        return fxbh;
    }

    public void setFxbh(Integer fxbh) {
        this.fxbh = fxbh;
    }

    public Integer getBxbh() {
        return bxbh;
    }

    public void setBxbh(Integer bxbh) {
        this.bxbh = bxbh;
    }

    public String getSbr() {
        return sbr;
    }

    public void setSbr(String sbr) {
        this.sbr = sbr;
    }

    public String getFxnr() {
        return fxnr;
    }

    public void setFxnr(String fxnr) {
        this.fxnr = fxnr;
    }

    public Date getFxsj() {
        return fxsj;
    }

    public void setFxsj(Date fxsj) {
        this.fxsj = fxsj;
    }

    public String getYssj() {
        return yssj;
    }

    public void setYssj(String yssj) {
        this.yssj = yssj;
    }

    public String getSjsj() {
        return sjsj;
    }

    public void setSjsj(String sjsj) {
        this.sjsj = sjsj;
    }

    public String getZxqk() {
        return zxqk;
    }

    public void setZxqk(String zxqk) {
        this.zxqk = zxqk;
    }
}
