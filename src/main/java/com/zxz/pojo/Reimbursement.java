package com.zxz.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Reimbursement {//报销单
    private Integer bxdbh;//报销单编号
    private Integer fyfxbh;//费用分析编号
    private String yhm;//用户名
    private Double bxje;//报销金额
    private String yhmc;//银行名称
    private String yhkh;//银行卡号
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date bxrq;//报销日期
    private String bxlx;//报销类型
    private String bxnr;//报销内容
    private Integer bxzt;//报销状态
    private String ztStr;//状态字符串展示

    public Integer getBxdbh() {
        return bxdbh;
    }

    public void setBxdbh(Integer bxdbh) {
        this.bxdbh = bxdbh;
    }

    public Integer getFyfxbh() {
        return fyfxbh;
    }

    public void setFyfxbh(Integer fyfxbh) {
        this.fyfxbh = fyfxbh;
    }

    public Double getBxje() {
        return bxje;
    }

    public void setBxje(Double bxje) {
        this.bxje = bxje;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getYhmc() {
        return yhmc;
    }

    public void setYhmc(String yhmc) {
        this.yhmc = yhmc;
    }

    public String getYhkh() {
        return yhkh;
    }

    public void setYhkh(String yhkh) {
        this.yhkh = yhkh;
    }

    public Date getBxrq() {
        return bxrq;
    }

    public void setBxrq(Date bxrq) {
        this.bxrq = bxrq;
    }

    public String getBxlx() {
        return bxlx;
    }

    public void setBxlx(String bxlx) {
        this.bxlx = bxlx;
    }

    public String getBxnr() {
        return bxnr;
    }

    public void setBxnr(String bxnr) {
        this.bxnr = bxnr;
    }

    public Integer getBxzt() {
        return bxzt;
    }

    public void setBxzt(Integer bxzt) {
        this.bxzt = bxzt;
    }

    public String getZtStr() {
        if (bxzt != null){
            if (bxzt == 0)
                ztStr = "待审核";
            if (bxzt == 1)
                ztStr = "审核通过";
            if (bxzt == 2)
                ztStr = "审核未通过";
        }
        return ztStr;
    }

    public void setZtStr(String ztStr) {
        this.ztStr = ztStr;
    }
}
