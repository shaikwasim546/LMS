
package lms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFaculty {
    
    private String NAME="#nill#";
    private int[] phno=new int[10];
    private String id="#sample-id#";
    
    public CreateFaculty(String name, String phone)throws Exception
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
        id=""+NAME.substring(0,NAME.length()/2)+phno[0]+phno[1]+phno[2]+phno[3];
        id=id.trim();
    }

    private void createDatabse()throws Exception {
        File dir = new File("faculty//"+id);//.mkdirs();
        dir.mkdirs();
        File filename=new File(dir,"name");
        File filephne=new File(dir,"phone");
        File filedown=new File(dir,"uploads");
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
