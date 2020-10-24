package com.tondz.nhapthongtin;

import com.tondz.object.hocsinh;

import java.util.ArrayList;
import java.util.Scanner;

public class nhaphocsinh {
    static Scanner scanner = new Scanner(System.in);
    public void Nhaphocsinh(ArrayList<hocsinh>hocsinhArrayList){
        hocsinhArrayList.add(new hocsinh(masv(),tensv(),tuoi(),maphong(),gioitinh(),ngaysinh(),diachi()));
    }
    public String masv(){
        System.out.println("Nhập mã sinh viên: ");
        String str = scanner.nextLine();
        return  str;
    }
    public String tensv(){
        System.out.println("Nhập tên sinh viên: ");
        String str = scanner.nextLine();
        return  str;
    }
    public int tuoi(){
        System.out.println("Nhập tuổi sinh viên: ");
        int str = Integer.parseInt(scanner.nextLine());
        return  str;
    }
    public String maphong(){
        System.out.println("Nhập mã phòng học: ");
        String str = scanner.nextLine();
        return  str;
    }
    public String gioitinh(){
        System.out.println("Nhập giới tính sinh viên: ");
        String str = scanner.nextLine();
        return  str;
    }
    public String ngaysinh(){
        System.out.println("Nhập ngày tháng năm sinh: ");
        String str = scanner.nextLine();
        return  str;
    }
    public String diachi(){
        System.out.println("Nhập địa chỉ sinh viên: ");
        String str = scanner.nextLine();
        return  str;
    }
}
