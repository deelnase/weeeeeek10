package com.example.weeeeeek10;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/java/com/example/weeeeeek10/ex.txt");
        Scanner in = new Scanner(file);
        String names = in.nextLine();
        String[] namees = names.split(" ");
        ArrayList<String> namessort = new ArrayList<>(List.of(namees));
        System.out.println(namessort);
        Collections.sort(namessort);
        System.out.println(namessort);
    }
}
