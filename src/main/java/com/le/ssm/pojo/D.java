package com.le.ssm.pojo;

public class D {
    private Integer Did;
    private Integer Dbalance;
    private Boolean Dbool;
    private Integer Aid;

    public Integer getDid() {
        return Did;
    }

    public void setDid(Integer did) {
        Did = did;
    }

    public Integer getDbalance() {
        return Dbalance;
    }

    public void setDbalance(Integer DBalance) {
        this.Dbalance = DBalance;
    }

    public Boolean getDbool() {
        return Dbool;
    }

    public void setDbool(Boolean dbool) {
        Dbool = dbool;
    }

    public Integer getAid() {
        return Aid;
    }

    public void setAid(Integer aid) {
        Aid = aid;
    }


    public D(Integer did, Integer Dbalance, Boolean dbool, Integer aid) {
        Did = did;
        this.Dbalance = Dbalance;
        Dbool = dbool;
        Aid = aid;
    }

    public D() {
    }
}
