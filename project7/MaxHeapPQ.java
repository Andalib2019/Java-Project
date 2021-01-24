import java.util.Iterator;
import java.util.ArrayList;
public class MaxHeapPQ <K extends Comparable<K>>implements MaxPriorityQueue<K> {
    private K data[];
    private int size;
    private int capacity;
    private K min;

    // constructors
    public MaxHeapPQ() {
       capacity = 100;
       size = 0;
       data = (K[]) new Comparable[capacity];
       min=null;
    }

    public MaxHeapPQ(int c) {
       capacity = c;
       size = 0;
       data = (K[]) new Comparable[capacity];
       min=null;
    }

    // required priority queue methods
    public boolean isEmpty(){ //ADD CODE
     return size==0;
  }

    public void add(K x) throws Exception {
       //ADD CODE
       //if the heap is full
       if(size==capacity) {throw new Exception("Heap is Full");}
       data[size]=x;
       size++;
       if(min==null) {
           min=x;}
       else if(x.compareTo(min)<0) {
           min=x;
       }
           bubbleUp(size-1);
       
          //throw new Exception("Heap is Full");
          
          
       //insert the data and update the min
            //data[size]=x;
           // size++;
           // if(min==null){
                
             // min=x;
             //bubbleUp(size-1);//bubbleUp to maintain the heap property
 }
    
 //}
   // }

    public K removeMax() throws Exception {
       if (size <= 0)
          throw new Exception("Priority Queue Empty");
       //ADD CODE
       K max=data[0];// the max in a variable
       swapData(0,size-1);//swap the max with the last element
       size--;//decrese the size of heap by 1
       bubbleDown(0);//heapify the heap
       return max;
    }

    // auxiliary utility methods
    private void swapData(int n, int m) {
       K temp = data[n];
       data[n] = data[m];
       data[m] = temp;
    }

    private void bubbleUp(int n) {
       if (n <= 0)
          return; // at root
       K dn = data[n];
       K dp = data[(n - 1) / 2]; // parent data
       //ADD CODE
       //if parent is smaller than current index, then swap and heapify above
       if(dn.compareTo(dp)>0){
         swapData(n,(n-1)/2);
         bubbleUp((n-1)/2);
 }
    }

    public void bubbleDown(int n) {
       if (2 * n + 1 >= size)
          return; // at leaf
       K dn = data[n];
       K dl = data[2 * n + 1]; // left child
       K dr = dl;
       //ADD CODE
       K max=dn;
       int max_ind=n;
       //find out the max of the two Childs and swap the max with the parent
       if(max.compareTo(dl)<0){
          max=dl;
          max_ind=2*n+1;
 }
       //if right child exist then, update the value of the variable dr
       if(2*n+2<size)
         dr=data[2*n+2];
       if(max.compareTo(dr)<0){
          max=dr;
          max_ind=2*n+2;
 }
        //if left or right child is greater than current
        if(max_ind!=n){
          swapData(max_ind,n);
          bubbleDown(max_ind);
 }

    }

    // heap creation
    public void heapify(Iterator<K> x) throws Exception {
       while (x.hasNext()) {
          if (size + 1 == capacity)
             break;
          data[size++] = x.next();
       }
       int n = size / 2;
       while (--n >= 0)
          bubbleDown(n);
       if (x.hasNext())
          throw new Exception("Heap is Full");
    }
    
    /* Add a min() method to find the minimum. Your implementation should use constant time and constant extra space.
     * Hint: add an extra instance variable that points to the minimum item. Update it after each call to add(K x).
     * Return null if the heap is empty.
     */
    public K min(){
        //ADD CODE
       //return the minimum
        return min;
    }

    public static void main(String[] args){
        MaxHeapPQ<String> heap = new MaxHeapPQ<String>();
        try{
         heap.add("q");
         heap.add("w");
         heap.add("e");
         heap.add("r");
         heap.add("t");
         heap.add("y");
         System.out.println(heap.min()); // the output would be e
         while (!heap.isEmpty()) System.out.print(heap.removeMax()); // the printout would be ywtrqe
         System.out.println();
        } catch (Exception e){System.out.println("Error " + e.toString()); }

    }
 }



