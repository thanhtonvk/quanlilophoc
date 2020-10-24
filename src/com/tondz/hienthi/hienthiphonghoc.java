package com.tondz.hienthi;

import com.tondz.object.phonghoc;

import java.util.ArrayList;

public class hienthiphonghoc {
//    private String maphong;
//    private int succhua;
//    private String cosovatchat;
//    private String vitri;
    public void Hien(phonghoc phonghoc){
        System.out.printf("|%10s|20%s|%20s|%20s\n",phonghoc.getMaphong(),phonghoc.getSucchua(),phonghoc.getCosovatchat(),phonghoc.getVitri());
    }
    public void HienAll(ArrayList<phonghoc>phonghocArrayList){
        //duyệt for(<kiểu dữ liệu> tên biến: mảng)
        System.out.printf("|%10s|20%s|%20s|%20s\n","Mã phòng","Sức chứa","Cơ sở vật chất","Vị trí");
        for (phonghoc phonghoc:phonghocArrayList
             ) {
            Hien(phonghoc);
        }
    }
}
