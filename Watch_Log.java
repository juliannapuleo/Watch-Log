import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class Main here.
 * 
 * Julianna Puleo
 */
public class Watch_Log extends JPanel implements ActionListener
{
    GUI gui = new GUI();

    /**
     * Constructor for objects of class Main
     */
    public Watch_Log()
    {
        
    }
    
    public static void main(){
        Watch_Log main = new Watch_Log();
        main.callGUI();
    }
    
    public void callGUI(){
        gui.createGUI();
    }
    public void actionPerformed(ActionEvent e){
        
    }

}
