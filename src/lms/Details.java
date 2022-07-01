/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Details {

    String uid="nill";
    String nme="";
    String phn="";
    boolean success=false;
    
    public Details(String text)throws Exception {
        uid=text;
        calculate();
    }

    private void calculate()throws Exception {
        File dir = new File("faculty//"+uid);
        File filename=new File(dir,"name");
        File filephne=new File(dir,"phone");
        if(!dir.exists())
        {
            success=false;
            return;
        }
        success=true;
        nme = new String(Files.readAllBytes(Paths.get(filename.toString())));
        phn = new String(Files.readAllBytes(Paths.get(filephne.toString())));
    }

    boolean isSuccess() {
        return success;
    }

    String getName() {
        System.out.println(nme);
        return nme;
    }

    String getPhone() {
        System.out.println(phn);
        return phn;
    }
    
}
