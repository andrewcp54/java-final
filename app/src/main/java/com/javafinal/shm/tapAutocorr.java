package com.javafinal.shm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class tapAutocorr {
    public static void main(String[] args){
        Map< String, String> dict = new HashMap< String, String>();
        dict.put("hl","hello");
        File file = new File("dict.txt");
        try{
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(scanner.hasNextLine()) {
                    String line2 = scanner.nextLine();
                    dict.put(line, line2);
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Set< Map.Entry< String, String> > st = dict.entrySet();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();
            for(Map.Entry< String,String> me:st){
                if(text.equals(me.getKey())){
                    System.out.println(me.getValue());
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
