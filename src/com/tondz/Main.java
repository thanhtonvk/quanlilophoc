package com.tondz;

import com.tondz.file.xulifile;
import com.tondz.hienthi.hienthiphonghoc;
import com.tondz.nhapthongtin.nhapphonghoc;
import com.tondz.object.phonghoc;
import com.tondz.xuli.xuliphonghoc;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Menu(ArrayList<phonghoc> phonghocArrayList, phonghoc phonghoc, nhapphonghoc nhapphonghoc, xuliphonghoc xuliphonghoc, xulifile xulifile) throws IOException {
        System.out.println("1.Thêm phòng học\n2.Sửa phòng\n3.Xóa\n4.Sắp xếp theo sức chứa\nSắp xếp theo A-Z\nNhập 0 đến kết thúc");
        Scanner scanner = new Scanner(System.in);
        int chon;
        while (true){
            chon = Integer.parseInt(scanner.nextLine());
            if(chon==0) break;
            switch (chon){
                case 1:
                    nhapphonghoc.Nhapphong(phonghocArrayList);
                    xulifile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 2:
                    String tk = scanner.nextLine();
                    xuliphonghoc.suaphonghoc(phonghocArrayList,tk);
                    xulifile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 3:
                    String tkxoa = scanner.nextLine();
                    xuliphonghoc.xoaphonghoc(phonghocArrayList,tkxoa);
                    xulifile.ghifilephonghoc(phonghocArrayList);
                    break;
                case 4:
                    xuliphonghoc.sapxeptheosucchuatuLondenBe(phonghocArrayList);
                    break;
                case 5:
                    xuliphonghoc.sapxeptheoAdenZ(phonghocArrayList);
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        }
    }
    public static void main(String[] args) throws IOException {
	// write your code here
        ArrayList<phonghoc>phonghocArrayList = new ArrayList<>();
        phonghoc phonghoc = new phonghoc();
        nhapphonghoc nhapphonghoc = new nhapphonghoc();
        hienthiphonghoc hienthiphonghoc = new hienthiphonghoc();
        xulifile xulifile = new xulifile();
        xuliphonghoc xuliphonghoc = new xuliphonghoc();
        xulifile.docfilephonghoc(phonghocArrayList);
        Menu(phonghocArrayList,phonghoc,nhapphonghoc,xuliphonghoc,xulifile);
    }
}
