import java.util.Iterator;

public class ResizingStack<Item> implements Iterable<Item> {
    private Item[] items = (Item[]) new Object[1];
    private int N = 0;
    public boolean isEmpty(){return N == 0;}
    public int size(){return N;}
    public void resize(int max){
        Item[] tmp = (Item[]) new Object[max];
        for (int i = 0;i<N;i++){
            tmp[i] = items[i];
        }
        items = tmp;
    }
    public void push(Item item){
        if(N==items.length) resize(2*items.length);
        items[N++] = item;
    }
    public Item pop(){
        if(N == items.length/4) resize(items.length/2);
        Item item = items[--N];
        items[N] = null;
        return item;
    }
    public Iterator<Item> iterator(){
        return new ResizingStackIterator();
    }
    //后进先出的迭代
    private class ResizingStackIterator implements Iterator<Item>{
        private int i = N;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return items[--i];
        }
        public void remove(){};
    }
}
