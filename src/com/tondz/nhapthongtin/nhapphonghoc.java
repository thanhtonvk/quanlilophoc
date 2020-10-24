package com.tondz.nhapthongtin;
import com.tondz.object.phonghoc;

import java.util.ArrayList;
import java.util.Scanner;

public class nhapphonghoc {
    static Scanner scanner = new Scanner(System.in);
    public void Nhapphong(ArrayList<phonghoc>phonghocArrayList){
        phonghocArrayList.add(new phonghoc(maphong(),suchua(),cosovatchat(),vitri()));
    }
    //String maphong, int succhua, String cosovatchat, String vitri
    public String maphong(){
        System.out.println("Nhập mã phòng: ");
        String maphong = scanner.nextLine();
        return maphong;
    }
    public int suchua(){
        System.out.println("Nhập sức chứa: ");
        int succhua = Integer.parseInt(scanner.nextLine());
        return  succhua;
    }
    public String cosovatchat(){
        System.out.println("Nhập cơ sở vật chất: ");
        String csvc = scanner.nextLine();
        return csvc;
    }
    public String vitri(){
        System.out.println("Nhập vị trí phòng: ");
        String vitri = scanner.nextLine();
        return vitri;
    }
}
