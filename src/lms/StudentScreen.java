/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Popup;
import javax.swing.PopupFactory;


public class StudentScreen extends JFrame implements ActionListener, MouseListener{
    
    String name="#nill#";
    List<JButton> download=new LinkedList<>();
    List<JLabel> Atopic=new LinkedList<>();
    List<String> filepath=new LinkedList<>();
    JPanel cont=new JPanel();
    JScrollPane scrl;
    String uid="";
    List<Map<String,String>> data;
    
    public StudentScreen(String nme,String id)
    {
        System.out.println("FacultyScreen");
        name=nme;
        uid=id;
        initContent();
        
    }
    
    public static void main(String args,String id)
    {
        System.out.println("MAIN");
        new StudentScreen(args,id).setVisible(true);
    }

    private void initContent() {
        System.out.println("initContent");
        Data dat=new Data();
        if(dat.isSuccess())
        {
            int y=50;
            data = sort(dat.getData());
            for(Map<String,String> dta:data)
            {
                JButton down=new JButton(getNameFile(""+dta.get("file")));
                System.out.println("JBUTTON ADDED");
                down.setBounds(40, y, 200, 30);
                down.addActionListener(this);
                JLabel top=new JLabel(""+dta.get("topic")+" : By - "+dta.get("author"));
                top.setBounds(260,y,200,30);
                System.out.println("JLABEL ADDED");
                download.add(down);
                Atopic.add(top);
                y+=50;
            }
            for(int i=0;i<download.size();i++)
            {
                cont.add(download.get(i));
                cont.add(Atopic.get(i));
            }
            scrl=new JScrollPane(cont,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            setContentPane(cont);
        }
        else
        {
            JLabel mssg=new JLabel("NO MATERIAL UPLOADED BY FACULTY YET");
            p=(new PopupFactory()).getPopup(this, mssg, 500, 300);
            p.show();
            actp=true;
        }
        setTitle(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,300);
        setSize(800, 800);
        setLayout(null);
        pack();
        addMouseListener(this);
    }

    Popup p;
    boolean actp=false;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton but=(JButton)e.getSource();
        String path=""+data.get(download.indexOf(e.getSource())).get("file");
        String top=""+data.get(download.indexOf(e.getSource())).get("topic");
        System.out.println(path);
        Download.add(top,uid);
        try {
            Process p = Runtime.getRuntime().exec(new String[] {path});
        } catch (IOException exp) {
            try {
                Runtime.getRuntime().exec("explorer.exe /select," + path);
                exp.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(StudentScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    // \ to //
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if(actp)
        {
            p.hide();
            actp=false;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    private List<Map<String,String>> sort(List<Map<String,String>> data) {
        try {
            List<Map<String,String>> out=new LinkedList<>();
            DetailsS ob=new DetailsS(uid,false);
            List<String> down=ob.getDownloads();
            if(down.size()<1)
                return data;
            String recent=down.get(down.size()-1);
            for(int i=0;i<data.size();i++)
            {
                String top=""+(data.get(i)).get("topic");
                if(top.equalsIgnoreCase(recent))
                {
                    List<Map<String,String>> tmp=out;
                    out=new LinkedList<>();
                    out.add(data.get(i));
                    out.addAll(tmp);
                }
                else
                    out.add(data.get(i));
            }
            return out;
        } catch (Exception ex) {
            Logger.getLogger(StudentScreen.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR");
            ex.printStackTrace();
            return null;
        }
    }

    private String getNameFile(String string) {
        String name="";
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)=='\\')
            {
                name="";
            }
            else
                name+=string.charAt(i);
        }
        return name;
    }
}