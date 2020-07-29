import javax.swing.*;
import java.awt.*;
import java.util.*;

public class ClockGUI{
   
   //static TextFileInput inFile;
   //static String inFileName = "lab12.txt";
   static JFrame myFrame;
   //static Container cPane;
   static JTextArea sorted;
   static JTextArea unsorted;
   
//   public static void main(String[] args) {
//      initialize();
//      readNumbersFromFile(inFileName);
//      
//   }   
   public static void initialize(ArrayList<Clock> sortedList, ArrayList<Clock> unsortedList) {
      sorted = new JTextArea();
      unsorted = new JTextArea();
      myFrame=new JFrame(); //create JFrame
      myFrame.setSize(700,700);
      myFrame.setLocation(200, 200);
      myFrame.setTitle("Clocks");
      myFrame.setLayout(new GridLayout(1, 2));//create layout for multiple component
      //JLabel label = new JLabel("Clock:");
     // myFrame.getContentPane().add(label);
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//add closing window event
       for(int i=0;i<sortedList.size();i++) {//checking the sorted list
           System.out.println("sortedList"+sortedList);
       }
       for(int i=0;i<unsortedList.size();i++) {//checking the unsorted list
           System.out.println("unsortedList"+unsortedList);
           
       }
   
   //public void displayArray() {
       String s = "";
       String uns = "";
       
       for(int i=0;i<sortedList.size();i++) {//getting sorted and unsorted list from the to string
           s+= sortedList.get(i).toString() + "\n";
           uns += unsortedList.get(i).toString() + "\n";
       }
       sorted.append(s); //add sorted and unsorted to JText Area
       unsorted.append(uns);
       
//       cPane.add(sorted);
//       cPane.add(unsorted);
//       myFrame.setContentPane(cPane);
       myFrame.add(sorted);  //add components to the container
       myFrame.add(unsorted);
       
      // myFrame.pack();
       myFrame.setSize(400,300);//invoke setSize and setVisible to show components
       
       myFrame.setVisible(true);
       
   }
   
   
      
   
   
   
} //class

