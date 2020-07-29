import java.awt.Container;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class EditMenuHandler implements ActionListener {
    ClockGUI gui;
    private String str;
    public EditMenuHandler(ClockGUI gui) {//constructor 
        this.gui=gui;
    }//end constructor
    
    public void actionPerformed(ActionEvent event) {
        //finding source of action
        String menuName=event.getActionCommand();
        if(menuName.equals("Search")) {//if search is selected a jOptionPane object is instantiated,for user input
            try {
                //attempts to create clock object with string , throws exception if a character is a non-digit
                str= JOptionPane.showInputDialog(null,"Enter a  new hours with the formate hh:mm:ss,all digits");
                for (int i=0;i<str.length();i++) {
                    
                    if(Character.isDigit(str.charAt(i))==false)
                        throw new IllegalClockException("character entered invalid, try again.");
                }//end for
                int n=Integer.parseInt(str);//it convert string input to an integer that means number
                if(n>23||n<0)//if the number is less than 0 or greater than 23 it will throw
                    throw new IllegalClockException("character entered invalid, try again.");
                gui.displayBelowHour(n);//it will display hour into gui
                //Clock c=new Clock(str);
               // gui.addClock(c);
            }//end try
            catch(IllegalClockException e) {//it will catch if any exception that means unusual data
                System.out.println(e);
            }//end catch
           // gui.displayBelowHour(n);
            
        }//end if
           
       
       
        } //end actionPerformed
    

}//end class
