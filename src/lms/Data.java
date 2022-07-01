/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Data {

    List<Map<String, String>> files=new LinkedList<>();
    boolean present=false;
    
    public Data() {
        doSort();
    }

    private void doSort() {
        File dir = new File("data//material");
        File file=new File(dir,"uploaded");
        List<String> dat=new LinkedList<>();
        if(!dir.exists())
        {
            present=false;
            return;
        }
        else
            present=true;
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNext())
            {
                dat.add(sc.nextLine());
            }
            for(int i=0;i<dat.size()-2;i+=3)
            {
                Map<String,String> m=new LinkedHashMap<>();
                m.put("file",dat.get(i));
                m.put("topic",dat.get(i+1));
                m.put("author",dat.get(i+2));
                files.add(m);
            }
            sc.close();
        } catch (Exception ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    List<Map<String,String>> getData() {
        return files;
    }

    boolean isSuccess() {
        return present;
    }
    
    
}
