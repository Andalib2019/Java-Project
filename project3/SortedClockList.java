
public class SortedClockList extends ClockList {
    public SortedClockList() {//on its parent class constructor to initialize the variable
        super();//Sorted ClockList constructor
    }
    public void add(Clock c) {
        ClockNode newNode = new ClockNode(c);//new clock add to the list
        
        ClockNode nextNode=this.getFirst().next;//keep track of the next node
        ClockNode prevNode=this.getFirst();     //keep track of the previous node
        while(nextNode != null) {//keeps go through the list until there is no  more node
            if(nextNode.data.getHours() > newNode.data.getHours()) {//if the nextNode  hour is more than the new node than break 
                //newNode.next = nextNode;
               // prevNode.next = newNode;
                //return;
                break;
            }
            prevNode = prevNode.next;//move to the next node and keep track to the next node
            nextNode = nextNode.next;
        }
        //making a new list
        newNode.next= nextNode;
        prevNode.next=newNode;
        //length++;
        //this.append(c);
        return;      
    }

}
