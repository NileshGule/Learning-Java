package com.company;

import java.io.File;
import java.io.FileFilter;

public class Main {

    public static void main(String[] args) {
        FileFilter filter = pathname -> pathname.getName().endsWith(".java");

        File dir = new File("C:\\Nilesh\\Learning Java\\src\\com\\company");

        File[] files = dir.listFiles(filter);

        for(File currentFile : files){
            System.out.println(currentFile.getName());
        }
    }
}
