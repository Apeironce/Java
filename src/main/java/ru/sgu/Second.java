package src.main.java.ru.sgu;

import java.io.*;
import java.util.ArrayList;
import java.util.zip.*;
import java.io.File;
import java.util.Scanner;

public class Second {
    static String search = "";
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        String directory = input.next();
        File dir = new File(directory);
        search = input.next();
        showFiles(dir.listFiles());
        zipPacker(list);
    }

    public static void showFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                showFiles(file.listFiles());
            } else if (file.getPath().contains(search) ) {
                list.add(file.getPath());
            }
        }
    }

    public static void zipPacker(ArrayList<String> list){
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("out.zip"));)
        {
            for (String filename : list) {
                System.out.println(filename);
                FileInputStream fis= new FileInputStream(filename);
                ZipEntry entry1=new ZipEntry(filename);
                zout.putNextEntry(entry1);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                zout.write(buffer);
            }
            zout.closeEntry();

        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}

