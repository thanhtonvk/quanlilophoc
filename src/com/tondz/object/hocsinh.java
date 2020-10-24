package com.tondz.object;

public class hocsinh {
    private String masv;
    private String tensv;
    private int tuoi;
    private String maphong;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;

    public hocsinh(String masv, String tensv, int tuoi, String maphong, String gioitinh, String ngaysinh, String diachi) {
        this.masv = masv;
        this.tensv = tensv;
        this.tuoi = tuoi;
        this.maphong = maphong;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public hocsinh(){

    }
    @Override
    public String toString(){
        return masv+"#"+tensv+"#"+tuoi+"#"+maphong+"#"+gioitinh+"#"+ngaysinh+"#"+diachi;
    }
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
