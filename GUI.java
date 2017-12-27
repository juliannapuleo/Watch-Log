import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
/**
 * Write a description of class GUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GUI extends JPanel implements ActionListener
{
    JFrame mainFrame;
    
    
    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
       createGUI(); 
    }
    
    public void createGUI(){
        mainFrame = new JFrame();
        //mainFrame.
        mainFrame.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(10,5,510,700);
        mainFrame.getContentPane().setLayout(new BorderLayout());
        mainFrame.setResizable(false);
        mainFrame.setTitle("Assembly Read & Writer");
    }

    public void actionPerformed(ActionEvent e){
        
    }
    
    public void setText(String text){
        
    }
    
    public void setFileNameLabel(String fileName){
        
    }
}
