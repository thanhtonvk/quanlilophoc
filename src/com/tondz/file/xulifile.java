package com.tondz.file;

import com.tondz.object.phonghoc;

import java.io.*;
import java.util.ArrayList;

public class xulifile {
    static File file = new File("phonghoc.txt");
    public void ghifilephonghoc(ArrayList<phonghoc>phonghocArrayList) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (phonghoc phonghoc:phonghocArrayList
             ) {
            fileWriter.write(phonghoc.toString());
        }
        fileWriter.close();
    }
    //1
    //2
    //3
    public void docfilephonghoc(ArrayList<phonghoc>phonghocArrayList) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            phonghocArrayList.add(new phonghoc(line.split("#")[0],Integer.parseInt(line.split("#")[1]),line.split("#")[2],line.split("#")[3]));
        }
        bufferedReader.close();
        fileReader.close();
    }
}
