/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;


public class LMS extends JFrame implements ActionListener{

    JButton stdt=new JButton("STUDENT");
    JButton facty=new JButton("FACULTY");
    
    LMS()
    {
        initContents();
    }

    public static void main(String[] args) throws Exception {
        new LMS().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if(src==stdt)
        {
            dispose();
            StudentMainScreen.main(new String[1]);
        }
        else
        {
            try {
                dispose();
                FacultyMainScreen.main(new String[1]);
            } catch (Exception ex) {
                Logger.getLogger(LMS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void initContents() {
        stdt.setBounds(80, 80, 180, 30);
        stdt.addActionListener(this);
        facty.setBounds(80,120,180,30);
        facty.addActionListener(this);
        setTitle("GRAY LMS LAUNCHER");
        add(stdt);
        add(facty);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400,400);
        setLocation(500,300);
        setContentPane(getContentPane());
    }
    
}
