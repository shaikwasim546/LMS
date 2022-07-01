/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Upload {

    String filepath="";
    String topic="";
    String name="";
    boolean isSuccess=false;
    
    public Upload(String filepathtoupload, String topc, String nam) {
        filepath=filepathtoupload;
        topic=topc;
        name=nam;
        upload();
    }

    boolean isSuccessful() {
        return isSuccess;
    }

    private void upload() {
        File dir = new File("data//material");//.mkdirs();
        dir.mkdirs();
        String data=filepath+"\n"+topic+"\n"+name+"\n";
        File file=new File(dir,"uploaded");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.append(data);
            fw.close();
            isSuccess=true;
        } catch (IOException err) {
        isSuccess=false;
        }
    }
    
}