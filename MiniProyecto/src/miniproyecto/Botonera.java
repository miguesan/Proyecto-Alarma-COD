/**
 * The 'Botonera' class contains the methods for all "buttons" to contain the program
 */
package miniproyecto;

import java.time.LocalTime;

/**
 * The constructor defines the 'alarmActive', 'setHR' and 'setAlarm' variables as type boolean
 * @author Miguel Sánchez Blanco
 */
public class Botonera {
    
    static boolean alarmActive;
    static boolean setHR;
    static boolean setAlarm;
    
    
    /**
     * The 'alarmaON' method turns on the alarm
     */
    public static void alarmaON(){
        
        Display.showLeds(true, false, false);
        Display.showClock();
        
    }
    
    /**
     * The 'alarmaOFF' method turns off the alarm
     */
    public static void alarmaOFF(){
        
        Display.showLeds(false, false, false);
        
    }
    
    /**
     * The 'confHR' method sets the time
     */
    public static void confHR(){
        Display.showLeds(true, false, true);
        Display.showClock();
    }
    
    /**
     * The 'confAlarma' method sets the alarm time
     */
    public static void confAlarma(){
        
    }
    
    /**
     * The 'plusHR' method increments time
     */
    public static void plusHR(){
        
        Reloj.hrActive.plusHours(1);
        Display.showClock();
        
    }
    
    /**
     * The 'plusMin' method increases minutes
     */
    public static void plusMin(){
        
        Reloj.hrActive.plusMinutes(1);
        Display.showClock();
        
    }
    
    /**
     * The 'stopAlarm' method stops the alarm
     */
    public static void stopAlarm(){
        
    }
    
    
    
}
