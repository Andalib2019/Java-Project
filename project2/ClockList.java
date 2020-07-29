
public abstract class ClockList {
   
    private ClockNode first,last;//instance variable of ClockList
    private int length;//instance variable of clockList
    
    public ClockList(){//default constructor of ClockList and create an empty list
        first=new ClockNode(null);
        last=first;
        length=0;
        
    }
    public ClockNode getFirst() {
        return first;
    }
    public ClockNode getLast() {
        return last;
    }
    public int getLength() {//get the length and return length
        return length;
    }
    public void append(Clock c) {//add clockNode with the clockList,c a clock object with hour,minutes,seconds
        ClockNode node = new ClockNode(c);
        last.next=node;
        last=last.next;
        length++;    
    }
    
    public String toString() {//clockList as a string representation
        String list="";
        ClockNode node=first.next;
        while(node!=null) {//until the node is null
            list+=(node.data).toString()+" ";
            node=node.next;
            
        }
        return list;        
    }


}




    










