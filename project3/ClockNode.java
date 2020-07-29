
public class ClockNode {
    protected Clock data; //instance variable for ClockNode
    protected ClockNode next;//instance variable for clockNode
    
    
    public ClockNode() { //default constructor
        data=null;       //for a clockNode will be set equal to null
        next=null;
    }
    
    public ClockNode(Clock c) { //one argument constructor
        data=c;
        next=null;
}
}
