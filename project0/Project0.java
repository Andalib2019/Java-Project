import javax.swing.*;

public class Project0 {

	public static void main(String[] args) {

	      while(true){//this is a infinite loop which will stop when the user inputs "stop" regardless of case		
			
	           String inputWord = JOptionPane.showInputDialog( null,"Enter a Sentence :");//it's taking the inputWord from the user with text inputWord
               int LowerE=0; 
               int UpperE=0;
               String S="Stop";
             
               if(S.equalsIgnoreCase(inputWord)){//checking if the inputWord in the top
                 System.exit(0);}
               else{
                  for(int i=0;i<inputWord.length();i++){ //to check inputWord in the array
                     if(inputWord.charAt(i)=='e'){ //it's checking  the  lower E
                      LowerE++;} //it's increasing the number of lower E
                     else if(inputWord.charAt(i)=='E'){ //it's checking the upper E
                      UpperE++;} //it's increasing the number of upper E
                  }//end for
               }//end else										
		        JOptionPane.showMessageDialog(null, "Number of lower case e:"+LowerE+" \nNumber of upper case e:"+UpperE);//it's checking the output how many upper and lower E is there
		  }//end while
   } //main
}//class

