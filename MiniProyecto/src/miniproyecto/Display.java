/**
 * This class 'Display' contains the methods and parameters that will be displayed on the application screen
 */
package miniproyecto;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 
 * In the constructor you define the variables 'ledClock', 'ledAlarm' and 'ledSET' as type boolean
 * @author Miguel Sánchez Blanco
 */

public class Display {
    
    static boolean ledClock;
    static boolean ledAlarm;
    static boolean ledSET;
    
    /**
     * The 'showClock' method shows the current time
     */
    public static void showClock(){
        
        
    }
    
    /**
     * The 'showAlarm' method shows the alarm time
     */
    public static void showAlarm(){
        
    }
    
    /**
     * The 'showLeds' method shows the LEDs of the active functions
     * @param showClock
     * @param showAlarm
     * @param showSET 
     */
    public static void showLeds(boolean showClock,boolean showAlarm, boolean showSET){
        
        ledClock = showClock;
        ledAlarm = showAlarm;
        ledSET = showSET;
        
    }
    
}
