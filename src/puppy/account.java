/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puppy;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author DOM
 */
        
public class account {
    private boolean verifyUser;
    private boolean registration;
    private String[] arrAcc = new String[8];
    private JFrame frame;
    private String User_ , Password_;

 
    account(String User_) throws FileNotFoundException, IOException {
        BufferedReader Read = new BufferedReader(new FileReader("src\\account\\"+User_+".txt"));
            for(int i = 0 ; i < arrAcc.length ; i ++){
                arrAcc[i] = Read.readLine();
                System.out.println("account BufferReader Readerline complete!");
            }
    }

    public String[] mainload() {
        return arrAcc;
}
    
    public boolean getverify(){return verifyUser;}
    public boolean registration(){return registration;}
    
    account(String User, String Name, String Password, String Phone, String gender, String hbd , String vip, String usevip) {
        String User_ = User;
        String Password_ = Password;
        String Name_ = Name;
        String gender_ = gender;
        String Phone_ = Phone;
        String hbd_ = hbd;
        String vip_ = vip;
        String usevip_ = usevip;
        
            if( User_ != "" && Password != "" ){     
                String create = "";
                create = create + User_+ "\n";
                create = create + Password_ + "\n";
                create = create + Name_ + "\n";
                create = create + gender_ + "\n";
                create = create + Phone_ + "\n";
                create = create + hbd_ + "\n";          
                create = create + vip_ + "\n";
                create = create + usevip_ + "\n";

                try {
                    BufferedReader Read = new BufferedReader(new FileReader("src\\account\\"+User_+".txt"));            
                    if(Read.readLine().equals(null)){             
                            try {
                                FileWriter Register = new FileWriter("src\\account\\"+User_+".txt");        
                                Register.write(create);
                                Register.close();
                                 } catch (IOException ex) { }  	                
                        }else {                  
                                frame = new JFrame("Exit");
                                JOptionPane.showMessageDialog(frame,"This User is not available.","Alert",JOptionPane.WARNING_MESSAGE);                                      
                        }            
                } catch (FileNotFoundException ex) {
                    FileWriter Register = null; 
                    try {
                        Register = new FileWriter("src\\account\\"+User_+".txt");
                    } catch (IOException ex1) {}                    
                    try {
                        Register.write(create);
                    } catch (IOException ex1) {} 
                    try {
                        Register.close();
                    } catch (IOException ex1) {}
                    frame = new JFrame("Exit");
                    JOptionPane.showMessageDialog(frame, "Register complete.","Complete",JOptionPane.PLAIN_MESSAGE);  
                    registration = true;    
                } catch (IOException ex) {}                                
            } else {
                    frame = new JFrame("Exit");
                    JOptionPane.showMessageDialog(frame, "Please complete the information.","Warning!",JOptionPane.PLAIN_MESSAGE);                
            }
    }

    account(String User, String Password) {
        User_ = User;
        Password_ = Password;
        
        System.out.println("User = " + User + "password = " + Password_);
        System.out.println("account active");

        try {
            System.out.println("account create complete !");

            BufferedReader name = new BufferedReader(new FileReader("src\\account\\"+User_+".txt"));
            
            for(int i = 0 ; i < arrAcc.length ; i ++){
                arrAcc[i] = name.readLine();
            }
            
            for(int i = 0 ; i < arrAcc.length ; i ++){
                System.out.println( "("+(i+1)+")"+" " +arrAcc[i]);
            }
            
            if(Password.equals(arrAcc[1])) {
                verifyUser = true;
                
            } else {verifyUser = false; }
             }catch(Exception e){
            }
    }
}
