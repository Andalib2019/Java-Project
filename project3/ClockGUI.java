import java.awt.GridLayout;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.*;

public class ClockGUI extends JFrame{
   //treemap 
    //uns
    //create an objectmenu of Jmenu and menuBar of JmenuBar
    JMenu menu;
    JMenuBar menuBar;
    //create two objects item1 and item2 of JMenuItem
    JMenuItem item1,item2;
    //a constructor of ClockGUI class
    ClockGUI()
    {
        //create an object jf of JFrame and set the title Clock GUI
         jf=new JFrame("Clock GUI");
        //create an object bar of JMenubar
        JMenuBar bar=new JMenuBar();
        //set the Jmenu as File
        menu= new JMenu("File");
        //create an object fmh of the class
        //FileMenuHandler willhandle the events of file
        FileMenuHandler fmh=new FileMenuHandler(this);
        //set the item open
        item1=new JMenuItem("Open");
        //call the ActionListener of open
        item1.addActionListener(fmh);
        menu.add(item1);//add the open to the menu
        
        //set the item Quit
        item2=new JMenuItem("Quit");
        item2.addActionListener(fmh);
        menu.add(item2);
        //add the bar to the menu
        bar.add(menu);
        jf.setJMenuBar(bar); //add the bar to the frame and  invoke the condition
        jf.setSize(700,700);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        
    }
    
  
    //adding another JFrame
    static JFrame jf;
    //static Container cPane;
    static JTextArea sorted;
    static JTextArea unsorted;
    
 


      
    
    public static void initialize(SortedClockList sortedList, UnsortedClockList unsortedList) {//treemap
      
       
       
       jf.setLocation(200, 200);//invoke the condition to the JFrame
       jf.setTitle("Clocks");
       jf.setLayout(new GridLayout(1, 2));//create layout for multiple component
       sorted = new JTextArea();
       unsorted = new JTextArea();
       Container con=jf.getContentPane();
       con.add(unsorted);
       con.add(sorted);
       
      //empty string of unsorted and sorted
        String s = "";
        String uns = "";
        
        ClockNode i = sortedList.getFirst().next;
        ClockNode it = unsortedList.getFirst().next;
        
        while(i != null) { //until null 
            s += i.data.toString() + "\n";
            uns += it.data.toString() + "\n";
            
            i = i.next;
            it = it.next;
        }

        
        
//        for(int i=0;i<sortedList.getLength();i++) {//getting sorted and unsorted list from the to string
//            s+= sortedList.get(i).toString() + "\n";
//            uns += unsortedList.get(i).toString() + "\n";
//        }
        sorted.append(s); //add sorted and unsorted to JText Area
        unsorted.append(uns);
        
        jf.setVisible(true);
        
    }
    
}   
       
    
    


   
  


