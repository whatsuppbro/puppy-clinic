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

public class reserve {
    
    reserve() {}
    
    private String time_;
    private int queue;
    private int vip_;
    String loadfile = ("src\\Reserved\\reserve.txt");
    
    

    reserve(String time, int vip) {
        time_ = time;
        vip_ = vip;
        
       if(time_.equals("9:45")) queue=1;
       if(time_.equals("11:00")) queue=2;
       if(time_.equals("13:30")) queue=3;
       if(time_.equals("15:25")) queue=4;
       if(time_.equals("17:00")) queue=5;
        
       if(vip == 1) queue=queue=+1;
       if(queue == 1) this.time_ = "9:45";
       if(queue == 2) this.time_ = "11:00";   
       if(queue == 3) this.time_ = "13:30";
       if(queue == 4) this.time_ = "15:25";
       if(queue == 5) this.time_ = "17:00";
       if(queue == 6) this.time_ = "18:25";   
    }

    private String[] date = new String [] {"MON","TUE","WED","THU","FRI"};
    public String[] dateload() {return date;}
    
    private String[] drname= new String [] {"Dr.Somsak","Dr.EiEi","Dr.KamibSee","Dr.Hatari","Dr.Jukkruuu"};
    public String[] drnameload() {return drname;}
    
    public String timeload() {return this.time_;}

    reserve(String User, String Name, String Password, String Phone, String gender, String hbd , String vip, String usevip) {
        String User_ = User;
        String Password_ = Password;
        String Name_ = Name;
        String gender_ = gender;
        String Phone_ = Phone;
        String hbd_ = hbd;
        String vip_ = vip;
        String usevip_ = usevip;
        
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
                    FileWriter Register = new FileWriter("src\\account\\"+User_+".txt");        
                    Register.write(create);
                    Register.close();
                    
                } catch (IOException ex) {JOptionPane.showMessageDialog(null, "Error","Warning!",JOptionPane.PLAIN_MESSAGE);  }
                
            }                                
}
    
