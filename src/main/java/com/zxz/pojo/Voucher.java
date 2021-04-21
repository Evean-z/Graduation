package com.zxz.pojo;

public class Voucher {//凭证
    private Integer pzbh;//凭证编号
    private String pztjr;//凭证提交人
    private String bxbh;//报销单编号
    private String pznr1;//凭证内容1
    private String pznr2;//凭证内容2
    private String pznr3;//凭证内容3

    public Integer getPzbh() {
        return pzbh;
    }

    public void setPzbh(Integer pzbh) {
        this.pzbh = pzbh;
    }

    public String getPztjr() {
        return pztjr;
    }

    public void setPztjr(String pztjr) {
        this.pztjr = pztjr;
    }

    public String getBxbh() {
        return bxbh;
    }

    public void setBxbh(String bxbh) {
        this.bxbh = bxbh;
    }

    public String getPznr1() {
        return pznr1;
    }

    public void setPznr1(String pznr1) {
        this.pznr1 = pznr1;
    }

    public String getPznr2() {
        return pznr2;
    }

    public void setPznr2(String pznr2) {
        this.pznr2 = pznr2;
    }

    public String getPznr3() {
        return pznr3;
    }

    public void setPznr3(String pznr3) {
        this.pznr3 = pznr3;
    }
}
