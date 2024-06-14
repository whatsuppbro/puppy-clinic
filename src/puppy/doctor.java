/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puppy;

/**
 *
 * @author DOM
 */
public class doctor {
    private String[] doctor = new String [2];
    private String date,time;
        String drName1 = "Dr.Somsak";
        String drName2 = "Dr.EiEi";
        String drName3 = "Dr.KamibSee";
        String drName4 = "Dr.Hatari";
        String drName5 = "Dr.Jukkruuu";
    
    public String[] loaddoctor() {
        return doctor;
}
        
    public doctor(String drOfficedate, String drOfficetime) {
        date = drOfficedate;
        time = drOfficetime;
        System.out.println(date+" "+time);
        // Monday
        if(date.equals("MON")) {
            if(time.equals("9:45") || time.equals("11:00") || time.equals("13:30")) {
                doctor[0] = drName1;
                doctor[1] = drName2;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
            if(time.equals("15:25") || time.equals("17:00")) {
                doctor[0] = drName3;
                doctor[1] = drName5;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
        }
            
        //Tuesday
        if(date.equals("TUE")) {
            if(time.equals("9:45") || time.equals("11:00")) {
                doctor[0] = drName2;
                doctor[1] = drName4;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
            if(time.equals("13:30") || time.equals("15:25") || time.equals("17:00")) {
                doctor[0] = drName1;
                doctor[1] = drName5;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
        }
        
        //Wednesday
        if(date.equals("WED")) {
            if(time.equals("9:45") || time.equals("15:25") || time.equals("13:30")) {
                doctor[0] = drName3;
                doctor[1] = drName4;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
            if(time.equals("11.00") || time.equals("17:00")) {
                doctor[0] = drName1;
                doctor[1] = drName2;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
        }
        
        //Thursday
        if(date.equals("THU")) {
            if(time.equals("9:45") || time.equals("11:00") || time.equals("13:30")) {
                doctor[0] = drName3;
                doctor[1] = drName5;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
            if(time.equals("15:25") || time.equals("17:00")) {
                doctor[0] = drName2;
                doctor[1] = drName4;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
        }
        
        //Friday
        if(date.equals("FRI")) {
            if(time.equals("9:45") || time.equals("11:00")) {
                doctor[0] = drName1;
                doctor[1] = drName3;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
            if(time.equals("13:30") || time.equals("15:25") || time.equals("17:00")) {
                doctor[0] = drName3;
                doctor[1] = drName5;
                System.out.println( doctor[0]+" "+doctor[1]);
            }
        }
    }
    
    
}
