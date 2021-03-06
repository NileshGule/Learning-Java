package com.newinjava8.lambda;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        //FileFilter filter = pathname -> pathname.getName().endsWith(".java");

        File dir = new File("C:\\Nilesh\\Learning Java\\src\\com\\newinjava8\\lambda");

        //File[] files = dir.listFiles(filter);

        File[] files = dir.listFiles(f -> f.getName().endsWith(".java"));

        for(File currentFile : files){
            System.out.println(currentFile.getName());
        }
    }
}
