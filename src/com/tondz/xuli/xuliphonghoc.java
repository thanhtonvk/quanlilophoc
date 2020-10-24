package com.tondz.xuli;

import com.tondz.hienthi.hienthiphonghoc;
import com.tondz.nhapthongtin.nhapphonghoc;
import com.tondz.object.phonghoc;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class xuliphonghoc {
    //sửa, xóa, tìm kiếm, sắp xếp

    public void suaphonghoc(ArrayList<phonghoc>phonghocArrayList,String keyword){
        nhapphonghoc nhapphonghoc = new nhapphonghoc();
        boolean kt = false;
        for (int i = 0; i < phonghocArrayList.size(); i++) {
            if(keyword.equalsIgnoreCase(phonghocArrayList.get(i).getMaphong())){
                kt = true;
                System.out.println("Có tìm thấy thông tin");
                phonghocArrayList.set(i,new phonghoc(nhapphonghoc.maphong(),nhapphonghoc.suchua(),nhapphonghoc.cosovatchat(),nhapphonghoc.vitri()));
            }
        }
        if(kt==false) System.out.println("Không tìm thấy");
    }
    public void xoaphonghoc(ArrayList<phonghoc>phonghocArrayList,String keyword){
        boolean kt = false;
        for (int i = 0; i < phonghocArrayList.size(); i++) {
            if(keyword.equalsIgnoreCase(phonghocArrayList.get(i).getMaphong())){
                kt = true;
                System.out.println("xóa thành công "+phonghocArrayList.get(i).getMaphong());
                phonghocArrayList.remove(i);
            }
        }
        if(kt== false) System.out.println("Không tìm thấy");
    }
    public void timkiemphonghoc(ArrayList<phonghoc>phonghocArrayList,String keyword){
        boolean kt = false;
        for (phonghoc phonghoc:phonghocArrayList
             ) {
            if(keyword.equalsIgnoreCase(phonghoc.getMaphong())){
                System.out.println("Tìm kiếm thành công");
                hienthiphonghoc hienthiphonghoc = new hienthiphonghoc();
                hienthiphonghoc.Hien(phonghoc);
                kt = true;
            }
        }
        if(kt == false) System.out.println("Không tìm thấy");
    }
    public void sapxeptheosucchuatuLondenBe(ArrayList<phonghoc>phonghocArrayList){
        Collections.sort(phonghocArrayList, new Comparator<phonghoc>() {
            @Override
            public int compare(phonghoc o1, phonghoc o2) {
                if(o1.getSucchua()<o2.getSucchua()) return -1;
                return  1;
            }
        });
    }
    public void sapxeptheoAdenZ(ArrayList<phonghoc>phonghocArrayList){
        Collections.sort(phonghocArrayList, new Comparator<phonghoc>() {
            @Override
            public int compare(phonghoc o1, phonghoc o2) {
                if(o1.getMaphong().compareToIgnoreCase(o2.getMaphong())==1) return 1;
                else return -1;
            }
        });
    }
}
