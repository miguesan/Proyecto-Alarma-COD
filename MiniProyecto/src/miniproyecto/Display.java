/**
 * This class 'Display' contains the methods and parameters that will be displayed on the application screen
 */
package miniproyecto;

/** 
 * In the constructor you define the variables 'ledClock', 'ledAlarm' and 'ledSET' as type boolean
 * @author Miguel Sánchez Blanco
 */

public class Display {
    
    boolean ledClock;
    boolean ledAlarm;
    boolean ledSET;
    
    /**
     * The method 'showClock' shows the current time
     */
    public void showClock(){
        
    }
    
    /**
     * The method 'showAlarm' shows the alarm time
     */
    public void showAlarm(){
        
    }
    
    /**
     * The method 'showLeds' shows the LEDs of the active functions
     * @param showClock
     * @param showAlarm
     * @param showSET 
     */
    public void showLeds(boolean showClock,boolean showAlarm, boolean showSET){
        
        ledClock = showClock;
        ledAlarm = showAlarm;
        ledSET = showSET;
        
    }
    
}
