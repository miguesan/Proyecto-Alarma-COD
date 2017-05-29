/**
 * This class 'Reloj' contains the 'main', the definition of the objects of the classes and the menu of the program
 */
package miniproyecto;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 * In the constructor you define the objects of the classes and the variables 'hrActive' and 'alarm' as type LocalTime of the class
 * @author Miguel Sánchez Blanco
 */

public class Reloj {

    Display display = new Display();
    Altavoz altavoz = new Altavoz();
    Botonera botonera = new Botonera();   
    
    static public LocalTime hrActive;
    static public LocalTime alarm;
    
    /**
     * Contains the application menu with options for running
     * @param args 
     */
    public static void main(String[] args) {
        int opciones1, opciones2;
        do{
            opciones1=Integer.parseInt(JOptionPane.showInputDialog("1) Configurar y Mostrar Hora\n 2) Incrementar Hora \n3) Incrementar Minutos  \n0) Salir "));
                switch(opciones1){
                    case 1:
                        Botonera.confHR();
                        break;
                    case 2:
                        Botonera.confHR();
                        Botonera.plusHR();
                        Botonera.plusMin();
                        break;
                    case 3:
                        Botonera.confAlarma();
                        Botonera.plusHR();
                        Botonera.plusMin();
                        break;
                    case 4:
                        do{
                            opciones2=Integer.parseInt(JOptionPane.showInputDialog("1) Encender Alarma \n2) Apagar Alarma \n0) Volver"));
                            switch(opciones2){
                                case 1:
                                    Botonera.alarmaON();
                                break;
                                case 2:
                                    Botonera.alarmaOFF();
                                break;
                            }
                        }while(opciones2!=0);
                        break;
                    case 5:
                        Botonera.stopAlarm();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Salir");
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Error");
                }
            }while(opciones1!=0);
    }
    
}