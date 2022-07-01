/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateStudent {
    
    private String NAME="#nill#";
    private int[] phno=new int[10];
    private String id="#sample-id#";
    
    public CreateStudent(String name, String phone)throws Exception
    {
        NAME=name;
        int[] phn=new int[10];
        for(int i=0;i<phone.length();i++)
            phn[i]=Integer.parseInt(""+phone.charAt(i));
        phno=phn;
        createId();
        createDatabse();
    }

    private void createId() {
        id=""+NAME.substring(NAME.length()/2)+phno[6]+phno[7]+phno[8]+phno[9];
        id=id.trim();
    }

    private void createDatabse()throws Exception {
        File dir = new File("student//"+id);
        dir.mkdirs();
        File filename=new File(dir,"name");
        File filephne=new File(dir,"phone");
        File filedown=new File(dir,"downloads");
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(NAME);
            fw.close();
        } catch (IOException err) { }
        try (FileWriter fw = new FileWriter(filephne)) {
            fw.write(phno.toString());
            fw.close();
        } catch (IOException err) { }
        try (FileWriter fw = new FileWriter(filedown)) {
            fw.write("");
            fw.close();
        } catch (IOException err) { }
    }

    String getId() {
        return id;
    }
    
}
