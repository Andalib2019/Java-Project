import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer;

public class FileMenuHandler implements ActionListener{
    ClockGUI gui;
    public FileMenuHandler(ClockGUI gui) {//constructor 
        this.gui=gui;
    }
   
   
       
    
    public void actionPerformed(ActionEvent event) {
        //finding source of action
        String menuName=event.getActionCommand();
        if(menuName.equals("Open")) {
            open();
        }
        else if (menuName.equals("Quit")) {
            System.exit(0);
            
        }
        } 
    
    void open() {
        int fch;
        //create an object jfc of JFileChooser
        
        JFileChooser jfc = new JFileChooser();
       // JPanel gui=new Jpanel(new BorderLayout());
        fch = jfc.showOpenDialog(null);
        //if chosen file exists then read and display the file
        //if(fch==JFileChoser.Approve_Option) {
            File  fileSelected =jfc.getSelectedFile();//getting selected file
            System.out.println("File selected"+fileSelected.getAbsolutePath());
            TextFileInput in= new TextFileInput(fileSelected.getAbsolutePath());//making object in
            String line=in.readLine();//reading line from text
            UnsortedClockList ulist= new UnsortedClockList();//making new object
            SortedClockList slist= new SortedClockList();//making new object//treemap[
            while(line != null) {//until the line will be null it will read the line
                System.out.println("hi");
                StringTokenizer st=new StringTokenizer(line,":");//using string tokinizer breaks the string into tokens
                if(st.countTokens()!=3) {//count tokens
                    System.out.println(line);
                    line=in.readLine();
                    continue;
                }
                int[] arr=new int [3];
                for(int i=0;i<3;i++) {//integer array
                    arr[i]=Integer.parseInt(st.nextToken());
                    
                }
                try {//  it will take invalid data
                    Clock c=new Clock(arr[0],arr[1],arr[2]);
                    
                    ulist.add(c);
                    slist.add(c);//treemap.put method
                }
                catch(IllegalClockException e) {//it will show the message for invalid data
                    System.out.println(e.getMessage());
                }
                    
                
               // Clock c=new Clock(arr[0],arr[1],arr[2]);
                
               // ulist.add(c);
                //slist.add(c);
                line=in.readLine();
            }
            in.close();
            //sort(sorted);
            //ClockNode i=slist.getFirst().next;
            ClockNode it=ulist.getFirst().next;
            while(it!=null) {//until null it will print
                //System.out.println(i.toString());
                System.out.println(it.data.toString());
                //i=i.next;
                it=it.next;
            }
            //ClockGUI.initialize(slist,ulist);//initializing clock GUI
            gui.initialize(slist,ulist);//initializing clock GUI//treemap
            
            
 }
        //Selection sort
        public static void sort(ArrayList<Clock>arr) {
            for(int i=0;i<arr.size()-1;i++) {//it is start for the first element
                int minIndex=i;
                for(int j=i+1;j<arr.size();j++) {//it is for the second element in the array
                    if(arr.get(j).getHours()>arr.get(minIndex).getHours()) minIndex=j;
                }
                if(arr.get(i).getHours()>arr.get(minIndex).getHours()) {//it will swap the value until no more elemenmts
                    Clock temp=arr.get(i);
                    arr.set(i,arr.get(minIndex));
                    arr.set(minIndex, temp);
                }
            }
            
        
       
        }
            
            
}
    
    

    











