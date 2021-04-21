package com.zxz.pojo;

public class Admin {//管理员
    private Integer aid;//管理员编号
    private String aname;//管理员账号
    private String apsd;//登录密码

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApsd() {
        return apsd;
    }

    public void setApsd(String apsd) {
        this.apsd = apsd;
    }
}
