package com.javafinal.shm;

import java.io.File;
import java.io.FileNotFoundException;
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
                //dict.put(line,"test");
                //System.out.println(line);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Set< Map.Entry< String, String> > st = dict.entrySet();
        for(Map.Entry< String,String> me:st){
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue());
        }
    }

}
