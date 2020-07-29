import java.util.ArrayList;
import java.util.StringTokenizer;

public class Project1 {
    
    public static void main(String[] args) {

        TextFileInput in = new TextFileInput("project1.txt");//making a object in
        
        //int size=0;
        String line=in.readLine(); //reading line from from project1.text
        
        ArrayList<Clock> unsorted = new ArrayList<>(); // unsorted array list
        ArrayList<Clock> sorted = new ArrayList<>();  //sorted array list
        
        while(line != null) { //until the line will be null it will read the line
            
            StringTokenizer st = new StringTokenizer(line,":"); //using stringTokenize breaks the string into tokens
            if (st.countTokens() != 3) {//count tokens
                System.out.println(line);
                line = in.readLine();
                continue;
                
            }
            int [] arr = new int [3];
            for (int i=0; i<3; i++) { //integer array
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Clock c = new Clock(arr[0], arr[1], arr[2]);
            
            unsorted.add(c);
            sorted.add(c);
            
            line = in.readLine();
        }
        in.close();
        
        sort(sorted);
        
        ClockGUI.initialize(sorted, unsorted);//initializing clock GUI
        
        
        
        
        
        
        
        
    }
    //selection sort
    public static void sort(ArrayList<Clock> arr){
       for(int i=0;i<arr.size()-1;i++) { //it will start for the first element
          int minIndex = i;
          for(int j=i+1;j<arr.size();j++) {//it is for the second element in the array size
              if (arr.get(j).getHours() < arr.get(minIndex).getHours()) minIndex = j;
              
          }
          if(arr.get(i).getHours() > arr.get(minIndex).getHours()) {//it will swap the value until no more elements 
              Clock temp = arr.get(i);                            //in remaining list
              arr.set(i, arr.get(minIndex));
              arr.set(minIndex, temp);
          }
       }
       
    }
    
    

}//class
