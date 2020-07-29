import java.awt.Container;
import java.util.TreeMap;
import java.awt.GridLayout;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class ClockGUI  extends JFrame{
   private  TreeMap sorted ;
    private UnsortedClockList ulist;
    //create an objectmenu of Jmenu and menuBar of JmenuBar
    JMenu menu,editmenu;
    JMenuBar menuBar;
    //create two objects item1 and item2 of JMenuItem
    JMenuItem item1,item2,item3;
    //a constructor of ClockGUI class
    ClockGUI()
    {
        //create an object jf of JFrame and set the title Clock GUI
         jf=new JFrame("Clock GUI");
        //create an object bar of JMenubar
        JMenuBar bar=new JMenuBar();
        //set the Jmenu as File,Edit
        jf.setJMenuBar(bar); 
        menu= new JMenu("File");
        editmenu=new JMenu("Edit");
        //create an object fmh,emh of the class
        //FileMenuHandler willhandle the events of file
        FileMenuHandler fmh=new FileMenuHandler(this);
        EditMenuHandler emh=new EditMenuHandler(this);
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
        //bar.add(menu);
        //set the item search
        item3=new JMenuItem("Search");
        item3.addActionListener(emh);
        editmenu.add(item3);
        //add the bar to the menu
        bar.add(menu);
        bar.add(editmenu);
        //jf.setJMenuBar(bar); //add the bar to the frame and  invoke the condition
        jf.setSize(700,700);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        
        
        
    }// end clockGUI
    
  
    //adding another JFrame
    static JFrame jf;
    //static Container cPane;
    static JTextArea treemap;
    //static JTextArea sorted;
    static JTextArea unsorted;
    
 


      
    
    public  void initialize(TreeMap sorted, UnsortedClockList ulist) {//initialize the variables
        
        this.ulist=ulist;
        this.sorted=sorted;
      //empty string of unsorted and sorted
        String s = "";
        String uns = "";
        Set<Clock> set=sorted.keySet();//return a set view of the keys contained in the map
        Iterator i=set.iterator();//Iterator is used to traverser the collection
       // Map.Entry<Clock,String>me;
        while(i.hasNext()) {
           Clock key =(Clock)i.next();//return the next element in the iteration
          //concatenating the string with key and toString
           s= s.concat(key.toString()+"\n");
           
          
       }//end while
       
       jf.setLocation(200, 200);//invoke the condition to the JFrame
       jf.setTitle("Clocks");
       jf.setLayout(new GridLayout(1, 2));//create layout for multiple component
       treemap=new JTextArea();
       //sorted = new JTextArea();
       unsorted = new JTextArea();
       Container con=jf.getContentPane();
       con.add(unsorted);
       con.add(treemap);
       //con.add(sorted);
       
     
        ClockNode it = ulist.getFirst().next;
        
        while(it != null) { //until null 
           // s += i.data.toString() + "\n";
            uns += it.data.toString() + "\n";
            
           // i = i.next;
            it = it.next;
        }//end while

        
        

        treemap.append(s);
        //sorted.append(s); //add sorted and unsorted to JText Area
        unsorted.append(uns);
        
        jf.setVisible(true);
        
    }//end initialize
   
    public void displayBelowHour(int hour) {//display method  for input hour
        
        
      //empty string of unsorted and sorted
        String s = "";
        String uns = "";
        Set<Clock> set=sorted.keySet();//return a set view of the keys contained in the map
        Iterator i=set.iterator();//Iterator is used to traverser the collection
       // Map.Entry<Clock,String>me;
        while(i.hasNext()) {
           Clock key =(Clock)i.next();//return the next element in the iteration
          //input hour is less than key value then it will not check the remaining and will break
           if(hour<key.getHours())break;
           
           if(hour>=key.getHours())//it will check the input hour with key value 
          s= s.concat(key.toString()+"\n");//it will concatenating the key value with our input in the toString
         
         
           
          
       }//end while
       
     
        ClockNode it = ulist.getFirst().next;
        
        while(it != null) { //until null 
           // s += i.data.toString() + "\n";
            if(hour>=it.data.getHours())
            uns += it.data.toString() + "\n";
            
           // i = i.next;
            it = it.next;
        }//end while

        
        

        treemap.setText("");
        unsorted.setText("");
        treemap.append(s);//add  treemap to JText area
        //sorted.append(s); //add sorted and unsorted to JText area
        unsorted.append(uns);//add unsorted to JText Area
        
        jf.setVisible(true);
        
    }//end displayBelowHour
   
    
} //end class  
       
    
    


   
  





