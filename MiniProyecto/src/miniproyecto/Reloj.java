
package miniproyecto;

import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Sánchez Blanco
 */

public class Reloj {

    Display display = new Display();
    Altavoz altavoz = new Altavoz();
    Botonera botonera = new Botonera();   
    
    LocalTime hrActive;
    LocalTime alarm;
    
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