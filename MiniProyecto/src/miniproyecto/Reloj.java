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
    
    LocalTime hrActive;
    LocalTime alarm;
    
    /**
     * Contains the application menu with options for running
     * @param args 
     */
    public static void main(String[] args) {
        int opciones;
        do{
            opciones=Integer.parseInt(JOptionPane.showInputDialog(" "));
                switch(opciones){
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }
            }while(opciones!=0);
    }
    
}