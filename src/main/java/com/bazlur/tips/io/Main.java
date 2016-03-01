package com.bazlur.tips.io;

import java.io.*;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            doFileCopy();
            doInternetFileCopy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doInternetFileCopy() throws IOException {
        String lipsum = "http://www.lipsum.com/feed/html";
        URL url = new URL(lipsum);
        System.out.println("Opening connection to " + lipsum + "...");
        InputStream in = url.openStream();
        FileOutputStream out = new FileOutputStream("lipsum.txt");


        FileCopier fileCopier = new FileCopier();
        try {
            fileCopier.copy(in, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doFileCopy() throws FileNotFoundException {
        FileInputStream in = new FileInputStream("hello-in.txt");
        FileOutputStream out = new FileOutputStream("hello-out.txt");

        FileCopier fileCopier = new FileCopier();
        try {
            fileCopier.copy(in, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
