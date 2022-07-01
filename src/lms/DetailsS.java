/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DetailsS {

    String uid="nill";
    String nme="";
    boolean success=false;
    
    public DetailsS(String text,boolean calac) {
        uid=text;
        if(calac)
            calculate();
    }

    private void calculate(){
        try {
            File dir = new File("student//"+uid);
            File filename=new File(dir,"name");
            if(!dir.exists())
            {
                success=false;
                return;
            }
            success=true;
            nme = new String(Files.readAllBytes(Paths.get(filename.toString())));
        } catch (IOException ex) {
            Logger.getLogger(DetailsS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean isSuccess() {
        return success;
    }

    String getName() {
        System.out.println(nme);
        return nme;
    }
    
    List<String> getDownloads()
    {
        File dir = new File("student//"+uid);
        File file=new File(dir,"downloads");
        List<String> dat=new LinkedList<>();
        if(!dir.exists())
        {
            return dat;
        }
        try {
            Scanner sc=new Scanner(file);
            while(sc.hasNext())
            {
                dat.add(sc.nextLine().trim());
            }
            sc.close();
        } catch (Exception ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dat;
    }
    
}
