import java.util.Iterator;

public class NodeStack<Item> implements Iterable<Item>{
    private Node<Item> first;
    private int N;
    public boolean isEmpty() {return first == null;}
    public int size(){return N;}
    public void push(Item item){
        Node oldfirst = first;
        first = new Node<Item>(item);
        first.next = oldfirst;
        N++;
    }
    public Item pop(){
        Item item = first.item;
        first = first.next;
        N--;
        return item;
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
