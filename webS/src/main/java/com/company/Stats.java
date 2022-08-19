package com.company;


/** A class used to store the base stats of the Pokemon */
public class Stats {
    private String Hp;
    private String Att;
    private String Def;
    private String SAtt;
    private String SDeff;
    private String Spd;

    public String getHp() {
        return Hp;
    }

    public void setHp(String hp) {
        Hp = hp;
    }

    public String getAtt() {
        return Att;
    }

    public void setAtt(String att) {
        Att = att;
    }

    public String getDef() {
        return Def;
    }

    public void setDef(String def) {
        Def = def;
    }

    public String getSAtt() {
        return SAtt;
    }

    public void setSAtt(String SAtt) {
        this.SAtt = SAtt;
    }

    public String getSDeff() {
        return SDeff;
    }

    public void setSDeff(String SDeff) {
        this.SDeff = SDeff;
    }

    public String getSpd() {
        return Spd;
    }

    public void setSpd(String spd) {
        Spd = spd;
    }
}
