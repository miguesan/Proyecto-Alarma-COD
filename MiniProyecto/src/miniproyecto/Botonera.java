/**
 * The 'Botonera' class contains the methods for all "buttons" to contain the program
 */
package miniproyecto;

import java.time.LocalTime;
import java.util.TimerTask;
import javax.swing.JOptionPane;
import static miniproyecto.Reloj.alarm;

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
        alarm = LocalTime.now().plusMinutes(1);
        System.out.println("Alarma Guardada: "+alarm.getMinute()+" : "+alarm.getSecond());
        TimerTask task = new TimerTask(){
            @Override
            public void run(){
                if(alarm.getMinute() == LocalTime.now().getMinute()){
                    System.out.println("¡¡¡es la hora!!!");
                }else {
                    System.out.println(LocalTime.now().getHour()+" : "+ LocalTime.now().getMinute()+" : "+LocalTime.now().getSecond());
                }
            }
        };
        
    }
    
    /**
     * The 'alarmaOFF' method turns off the alarm
     */
    public static void alarmaOFF(){
        
        Display.showLeds(false, false, false);
        JOptionPane.showMessageDialog(null,"Alarma OFF");
        
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
        Display.showLeds(true, false, false);
    }
    
    /**
     * The 'plusHR' method increments time
     */
    public static void plusHR(){
        
        Reloj.hrActive.plusHours(Integer.parseInt(JOptionPane.showInputDialog("Introduca la hora deseados")));
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
        System.out.println("Apagar Alarma");
        Altavoz.ringON();
    }
    
    
    
}
