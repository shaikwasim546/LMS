/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


class Download {

    static void add(String path, String uid) {
        File dir = new File("student//"+uid);
        dir.mkdirs();
        File filedown=new File(dir,"downloads");
        try (FileWriter fw = new FileWriter(filedown,true)) {
            fw.append(path+"\n");
            fw.close();
        } catch (IOException err) { }
    }
    
}
