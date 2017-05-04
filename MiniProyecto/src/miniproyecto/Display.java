
package miniproyecto;

/**
 *
 * @author Miguel Sánchez Blanco
 */
public class Display {
    
    boolean ledClock;
    boolean ledAlarm;
    boolean ledSET;
    
    public void showClock(){
        
    }
    
    public void showAlarm(){
        
    }
    
    public void showLeds(boolean showClock,boolean showAlarm, boolean showSET){
        
        ledClock = showClock;
        ledAlarm = showAlarm;
        ledSET = showSET;
        
    }
    
}
