package edu.harbour.space.university.file.file;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(new File("/Users/sanekas/").isDirectory());
    }

    private static void testFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String s = null;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
    }
}
