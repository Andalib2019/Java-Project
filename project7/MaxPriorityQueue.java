
public interface MaxPriorityQueue<K extends Comparable<K>> {
    public void add(K x) throws Exception;
    public K removeMax() throws Exception;
    public boolean isEmpty();

}
