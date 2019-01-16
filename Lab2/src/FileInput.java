package com.journaldev.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInput {

    private static void writeUsingFileWriter(String data) {
        File file = new File("/home/student/Desktop/FileWriter.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String args[]) {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to be input into the file FileWriter.txt\n");
        String data = sc.nextLine();
        writeUsingFileWriter(data);
    }
}
