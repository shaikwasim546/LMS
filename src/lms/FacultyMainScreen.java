/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Popup;
import javax.swing.PopupFactory;


public class FacultyMainScreen extends javax.swing.JFrame {


    public FacultyMainScreen()throws Exception {
        initComponents();
    }
                       
    private void initComponents()throws Exception {

        exisulab = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        uidsep = new javax.swing.JSeparator();
        login = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        newulab = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        namsp = new javax.swing.JSeparator();
        phone = new javax.swing.JTextField();
        phnsp = new javax.swing.JSeparator();
        signup = new javax.swing.JButton();
        meslab = new javax.swing.JLabel();
        exisulab1 = new javax.swing.JLabel();
        uid1 = new javax.swing.JTextField();
        uidsep1 = new javax.swing.JSeparator();
        login1 = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        backgrnd = new javax.swing.JLabel();

        exisulab.setBackground(new java.awt.Color(51, 62, 129));
        exisulab.setFont(new java.awt.Font("Courier 10 Pitch", 0, 24)); // NOI18N
        exisulab.setForeground(new java.awt.Color(204, 255, 204));
        exisulab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exisulab.setText("LOGIN");
        exisulab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exisulab.setIconTextGap(0);
        exisulab.setRequestFocusEnabled(false);
        exisulab.setVerifyInputWhenFocusTarget(false);

        uid.setBackground(new java.awt.Color(51, 62, 129));
        uid.setForeground(new java.awt.Color(204, 255, 204));
        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uid.setText("--UID HERE--");
        uid.setBorder(null);
        uid.setCaretColor(java.awt.Color.blue);
        uid.setOpaque(false);
        uid.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        uid.setSelectionColor(new java.awt.Color(0, 0, 0));

        uidsep.setBackground(new java.awt.Color(14, 14, 14));


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LMS");
        setLocation(new java.awt.Point(500, 300));
        setMinimumSize(new java.awt.Dimension(700, 490));
        setUndecorated(true);
        setOpacity(0.8F);
        setPreferredSize(new java.awt.Dimension(700, 490));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        mainPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 12, 27, 24));

        newulab.setBackground(new java.awt.Color(14, 14, 14));
        newulab.setFont(new java.awt.Font("Courier 10 Pitch", 0, 24)); // NOI18N
        newulab.setForeground(new java.awt.Color(204, 255, 204));
        newulab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newulab.setText("SIGN UP");
        mainPanel.add(newulab, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 219, 63));

        name.setBackground(new java.awt.Color(14, 14, 14));
        name.setForeground(new java.awt.Color(204, 255, 204));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("--NAME HERE--");
        name.setBorder(null);
        name.setCaretColor(java.awt.Color.blue);
        name.setOpaque(false);
        name.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        name.setSelectionColor(new java.awt.Color(0, 0, 0));
        mainPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 190, 34));

        namsp.setBackground(new java.awt.Color(51, 62, 129));
        mainPanel.add(namsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 190, 5));

        phone.setBackground(new java.awt.Color(14, 14, 14));
        phone.setForeground(new java.awt.Color(204, 255, 204));
        phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phone.setText("--PHONE NUMBER--");
        phone.setBorder(null);
        phone.setCaretColor(java.awt.Color.blue);
        phone.setOpaque(false);
        phone.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        phone.setSelectionColor(new java.awt.Color(0, 0, 0));
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        mainPanel.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 190, 34));

        phnsp.setBackground(new java.awt.Color(51, 62, 129));
        mainPanel.add(phnsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 190, 5));

        signup.setBackground(new java.awt.Color(126, 81, 229));
        signup.setFont(new java.awt.Font("Chilanka", 0, 18)); // NOI18N
        signup.setText("SIGN UP");
        signup.setBorder(null);
        signup.setBorderPainted(false);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }

            private void signupMouseClicked(MouseEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        mainPanel.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 228, 39));

        meslab.setBackground(new java.awt.Color(51, 51, 51));
        meslab.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        meslab.setForeground(new java.awt.Color(102, 102, 102));
        meslab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meslab.setText("SIGN IN TO USE THE SOFTWARE");
        meslab.setDoubleBuffered(true);
        meslab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mainPanel.add(meslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 370, 270, 40));

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        mainPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 12, 27, 24));

        uid1.setBackground(new java.awt.Color(51, 62, 129));
        uid1.setForeground(new java.awt.Color(204, 255, 204));
        uid1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uid1.setText("--UID HERE--");
        uid1.setBorder(null);
        uid1.setCaretColor(java.awt.Color.blue);
        uid1.setOpaque(false);
        uid1.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        uid1.setSelectionColor(new java.awt.Color(0, 0, 0));
        mainPanel.add(uid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 228, 34));

        uidsep1.setBackground(new java.awt.Color(14, 14, 14));
        mainPanel.add(uidsep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 195, 228, 5));

        login1.setBackground(new java.awt.Color(14, 14, 14));
        login1.setFont(new java.awt.Font("Chilanka", 0, 18)); // NOI18N
        login1.setForeground(new java.awt.Color(204, 255, 204));
        login1.setText("LOGIN");
        login1.setBorder(null);
        login1.setBorderPainted(false);
        login1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    login1MouseClicked(evt);
                } catch (Exception ex) {
                    Logger.getLogger(FacultyMainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    login1ActionPerformed(evt);
                } catch (Exception ex) {
                    Logger.getLogger(FacultyMainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        mainPanel.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 228, 39));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(153, 255, 204));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("FACULTY");
        mainPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 270, 70));
        
        backgrnd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        backgrnd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lms/bck.jpg"))); // NOI18N
        mainPanel.add(backgrnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 490));

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }                                                       

    private void login1MouseClicked(java.awt.event.MouseEvent evt)throws Exception {                                    
        String nme="";
        String phn="";
        Details ob=new Details(uid1.getText());
        if(!ob.isSuccess())
            return;
        nme=ob.getName();
        phn=ob.getPhone();
        String inp[]=new String[2];
        inp[0]=nme;
        inp[1]=phn;
        FacultyScreen.main(inp);
        this.dispose();
    }                                   

    private void login1ActionPerformed(java.awt.event.ActionEvent evt)throws Exception {                                       
        String nme="";
        String phn="";
        Details ob=new Details(uid1.getText());
        if(!ob.isSuccess())
            return;
        nme=ob.getName();
        phn=ob.getPhone();
        String inp[]=new String[2];
        inp[0]=nme;
        inp[1]=phn;
        FacultyScreen.main(inp);
        this.dispose();
    }                                                                      

    Popup p;
    boolean actp=false;
    
    private void signupActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try{
            CreateFaculty ob=new CreateFaculty(name.getText(),phone.getText());
            String id=ob.getId();
            javax.swing.JLabel mssg=new javax.swing.JLabel("FACULTY CREATED : "+id);
            p=(new PopupFactory()).getPopup(this, mssg, 500, 300);
            p.show();
            actp=true;
        }
        catch(Exception e)
        {
            ;
        }
    }
    
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {                                  
        this.dispose();
        System.exit(0);
    }                                 

    int xp=0,yp=0;
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        xp = evt.getX();
        yp = evt.getY();
        if(actp)
        {
            p.hide();
            actp=false;
        }
    }                                 

    private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
        this.setLocation(evt.getXOnScreen() - xp, evt.getYOnScreen() - yp);
    }     
    
    private void exitMouseEntered(java.awt.event.MouseEvent evt) {                                  
        exit.setForeground(new java.awt.Color(255, 0, 0));
    }                                 

    private void exitMouseExited(java.awt.event.MouseEvent evt) {                                 
        exit.setForeground(new java.awt.Color(255, 255, 255));
    }

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {                                  
        String phne=phone.getText();
        String tmp="";
        for(int i=0;i<phne.length();i++)
        {
            char ch=phne.charAt(i);
            if(Character.isDigit(ch))
            {
                tmp+=ch;
            }
        }
        if(tmp.equals(""))
        {
           phone.setText("--PHONE NUMBER--");
        }
        else
        {
            String tmpp="";
            for(int i=0;i<tmp.length()&&i<10;i++)
                tmpp+=tmp.charAt(i);
            phone.setText(tmpp);
        }
    }


    public static void main(String args[])throws Exception {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FacultyMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FacultyMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FacultyMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FacultyMainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                try {
                    new FacultyMainScreen().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(FacultyMainScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel backgrnd;
    private javax.swing.JLabel exisulab;
    private javax.swing.JLabel exisulab1;
    private javax.swing.JLabel exit;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel meslab;
    private javax.swing.JTextField name;
    private javax.swing.JSeparator namsp;
    private javax.swing.JLabel newulab;
    private javax.swing.JSeparator phnsp;
    private javax.swing.JTextField phone;
    private javax.swing.JButton signup;
    private javax.swing.JTextField uid;
    private javax.swing.JTextField uid1;
    private javax.swing.JSeparator uidsep;
    private javax.swing.JSeparator uidsep1;
    private javax.swing.JLabel title;
    // End of variables declaration                   
}
