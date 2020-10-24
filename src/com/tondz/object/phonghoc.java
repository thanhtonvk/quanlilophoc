package com.tondz.object;

public class phonghoc {
    private String maphong;
    private int succhua;
    private String cosovatchat;
    private String vitri;

    public phonghoc(String maphong, int succhua, String cosovatchat, String vitri) {
        this.maphong = maphong;
        this.succhua = succhua;
        this.cosovatchat = cosovatchat;
        this.vitri = vitri;
    }
    public phonghoc(){

    }
    @Override
    public String toString(){
        return maphong+"#"+succhua+"#"+cosovatchat+"#"+vitri;
        //123#23#diennuoc#tang3
    }
    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public int getSucchua() {
        return succhua;
    }

    public void setSucchua(int succhua) {
        this.succhua = succhua;
    }

    public String getCosovatchat() {
        return cosovatchat;
    }

    public void setCosovatchat(String cosovatchat) {
        this.cosovatchat = cosovatchat;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
}
