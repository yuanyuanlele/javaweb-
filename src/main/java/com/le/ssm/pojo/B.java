package com.le.ssm.pojo;
//收费员
public class B {
    private Integer Bid;
    private String Bname;
    private String Bpassword;
    private String Bphone;

    @Override
    public String toString() {
        return "B{" +
                "Bid=" + Bid +
                ", Bname='" + Bname + '\'' +
                ", Bpassword='" + Bpassword + '\'' +
                ", Bphone='" + Bphone + '\'' +
                '}';
    }

    public Integer getBid() {
        return Bid;
    }

    public void setBid(Integer bid) {
        Bid = bid;
    }

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public String getBpassword() {
        return Bpassword;
    }

    public void setBpassword(String bpassword) {
        Bpassword = bpassword;
    }

    public String getBphone() {
        return Bphone;
    }

    public void setBphone(String bphone) {
        Bphone = bphone;
    }

    public B(Integer bid, String bname, String bpassword, String bphone) {
        Bid = bid;
        Bname = bname;
        Bpassword = bpassword;
        Bphone = bphone;
    }

    public B() {
    }
}
