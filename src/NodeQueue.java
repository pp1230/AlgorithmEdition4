import java.util.Iterator;

public class NodeQueue<Item> implements Iterable<Item>{
    private Node<Item> first;
    private Node<Item> last;
    private int N;
    public boolean isEmpty(){return first == null;}
    public int size(){return N;}
    public void add(Item item){
        if(isEmpty()){
            first = new Node<Item>(item);
            last = first;
            N++;
        }
        else {
            Node<Item> oldlast = last;
            last = new Node<Item>(item);
            oldlast.next = last;
            N++;
        }
    }
    public Item remove(){
        if(isEmpty()) return null;
        else {
            Item item = first.item;
            first = first.next;
            N--;
            return item;
        }
    }
    @Override
    public Iterator<Item> iterator() {
        return new ResizingStackIterator();
    }
    private class ResizingStackIterator implements Iterator<Item>{
        private Node<Item> start = first;
        @Override
        public Item next() {
            Item item = start.item;
            start = start.next;
            return item;
        }
        @Override
        public boolean hasNext() {
            return start != null;
        }
        @Override
        public void remove() {
        }
    }
}
