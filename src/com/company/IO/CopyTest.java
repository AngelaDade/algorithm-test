package com.company.IO;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by lipeiyuan on 2018/5/3.
 */
public class CopyTest {
    public static void main(String[] args) {

        File file = new File("/Users/lipeiyuan/Desktop/aa.png");
        File fileDir = new File("/Users/lipeiyuan/Desktop/abcdDir");
        String upLoadPath = "/Users/lipeiyuan/apkFile/";
        String downLoadPath = "/apkFile/";
        File file1 = new File(upLoadPath);
        System.out.println(file1.getParentFile().getAbsolutePath());
        System.out.println(file1.getParentFile());

//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());
//        File parent = file.getParentFile();
//        String command = "cp "+file.getName()+" "+"copy—"+file.getName();
//        try {
//            Process process = Runtime.getRuntime().exec(command , null , parent);
//            try {
//                process.waitFor();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (!fileDir.exists()) {
//            System.out.println(fileDir.mkdirs());
//
//        }
//        System.out.println(parent);
//        System.out.println(file.getName());


    }


}
