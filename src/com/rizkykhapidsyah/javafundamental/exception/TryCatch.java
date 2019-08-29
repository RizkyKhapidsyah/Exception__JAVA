package com.rizkykhapidsyah.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        try {
            //Mencoba Membaca Berkas: latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);
            //Jika Berhasil, maka akan tampilkan pesan:
            System.out.println("Readfile berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
