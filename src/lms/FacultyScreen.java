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
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.PopupFactory;


public class FacultyScreen extends JFrame implements ActionListener, MouseListener{
    
    String name="#nill#";
    String phon="#nill#";
    JButton upload=new JButton("UPLOAD");
    JLabel Atopic=new JLabel("TOPIC");
    JTextField topic=new JTextField("PYTHON");
    JButton selFile=new JButton("SELECT FILE");
    String filepathtoupload="";
    
    public FacultyScreen(String nme,String phno)
    {
        System.out.println("FacultyScreen");
        name=nme;
        phon=phno;
        initContent();
    }
    
    public static void main(String args[])
    {
        System.out.println("MAIN");
        new FacultyScreen(args[0],args[1]).setVisible(true);
    }

    private void initContent() {
        System.out.println("initContent");
        Atopic.setBounds(40,40,40,20);
        topic.setBounds(100, 40, 100, 30);
        selFile.setBounds(60, 80, 160, 40);
        upload.setBounds(50,140,80,40);
        selFile.addActionListener(this);
        upload.addActionListener(this);
        add(Atopic);
        add(topic);
        add(selFile);
        add(upload);
        setTitle(name);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(500,300);
        setSize(400, 400);
        setLayout(null);
        pack();
        addMouseListener(this);
    }

    Popup p;
    boolean actp=false;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if(src==upload)
        {
            if(topic.getText().trim().equals(""))
                return;
            if(filepathtoupload.trim().equals(""))
                return;
            Upload ob=new Upload(filepathtoupload,topic.getText(),name);
            if(ob.isSuccessful())
            {
                JLabel mssg=new JLabel("UPLOADED");
                p=(new PopupFactory()).getPopup(this, mssg, 500, 300);
                p.show();
                actp=true;
            }
        }
        else if(src==selFile)
        {
            JFileChooser j = new JFileChooser();
            int r = j.showSaveDialog(null);
            if (r == JFileChooser.APPROVE_OPTION)
            {
                filepathtoupload=j.getSelectedFile().getAbsolutePath();
                selFile.setText(filepathtoupload);
            }
            else
            {
                filepathtoupload="";
                selFile.setText("SELECT FILE");
            }
        }
    }

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
}