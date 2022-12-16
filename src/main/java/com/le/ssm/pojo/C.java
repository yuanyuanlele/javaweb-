package com.le.ssm.pojo;

public class C {
    private Integer Cid;
    private String Cname;
    private String Cpassword;

    @Override
    public String toString() {
        return "C{" +
                "Cid=" + Cid +
                ", Cname='" + Cname + '\'' +
                ", Cpassword='" + Cpassword + '\'' +
                '}';
    }

    public Integer getCid() {
        return Cid;
    }

    public void setCid(Integer cid) {
        Cid = cid;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public String getCpassword() {
        return Cpassword;
    }

    public void setCpassword(String cpassword) {
        Cpassword = cpassword;
    }

    public C(Integer cid, String cname, String cpassword) {
        Cid = cid;
        Cname = cname;
        Cpassword = cpassword;
    }

    public C() {
    }
}
