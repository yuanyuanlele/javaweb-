package com.le.ssm.pojo;
//车主类
public class A {
    private Integer Aid;
    private String Aname;
    private String Apassword;
    private Integer Ahid;
    private String Atype;
    private String Acptype;
    private Integer Acpid;
    private String Actype;
    private String Acname;
    private String Aphone;

    @Override
    public String toString() {
        return "A{" +
                "Aid=" + Aid +
                ", Aname='" + Aname + '\'' +
                ", Apassword='" + Apassword + '\'' +
                ", Ahid=" + Ahid +
                ", Atype='" + Atype + '\'' +
                ", Acptype='" + Acptype + '\'' +
                ", Acpid=" + Acpid +
                ", Actype='" + Actype + '\'' +
                ", Acname='" + Acname + '\'' +
                ", Aphone='" + Aphone + '\'' +
                '}';
    }

    public A(Integer aid, String aname, String apassword, Integer ahid, String atype, String acptype, Integer acpid, String actype, String acname, String aphone) {
        Aid = aid;
        Aname = aname;
        Apassword = apassword;
        Ahid = ahid;
        Atype = atype;
        Acptype = acptype;
        Acpid = acpid;
        Actype = actype;
        Acname = acname;
        Aphone = aphone;
    }

    public String getApassword() {
        return Apassword;
    }

    public void setApassword(String apassword) {
        Apassword = apassword;
    }

    public A() {
    }

    public A(Integer aid, String aname, Integer ahid, String atype, String acptype, Integer acpid, String actype, String acname, String aphone) {
        Aid = aid;
        Aname = aname;
        Ahid = ahid;
        Atype = atype;
        Acptype = acptype;
        Acpid = acpid;
        Actype = actype;
        Acname = acname;
        Aphone = aphone;
    }

    public Integer getAid() {
        return Aid;
    }

    public void setAid(Integer aid) {
        Aid = aid;
    }

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public Integer getAhid() {
        return Ahid;
    }

    public void setAhid(Integer ahid) {
        Ahid = ahid;
    }

    public String getAtype() {
        return Atype;
    }

    public void setAtype(String atype) {
        Atype = atype;
    }

    public String getAcptype() {
        return Acptype;
    }

    public void setAcptype(String acptype) {
        Acptype = acptype;
    }

    public Integer getAcpid() {
        return Acpid;
    }

    public void setAcpid(Integer acpid) {
        Acpid = acpid;
    }

    public String getActype() {
        return Actype;
    }

    public void setActype(String actype) {
        Actype = actype;
    }

    public String getAcname() {
        return Acname;
    }

    public void setAcname(String acname) {
        Acname = acname;
    }

    public String getAphone() {
        return Aphone;
    }

    public void setAphone(String aphone) {
        Aphone = aphone;
    }
}
