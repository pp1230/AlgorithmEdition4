public class StackBagQueue {
    public static void main(String[] args){
        ResizingStack<Integer> stack1 = new ResizingStack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.pop();
        stack1.push(3);
        stack1.push(4);
        NodeStack<Integer> stack2 = new NodeStack<Integer>();
        stack2.push(1);
        stack2.push(2);
        stack2.pop();
        stack2.push(3);
        stack2.push(4);
        NodeQueue<Integer> queue = new NodeQueue<Integer>();
        queue.add(1);
        queue.add(2);
        queue.remove();
        queue.add(3);
        queue.add(4);
        NodeBag<String> nodeBag = new NodeBag<String>();
        nodeBag.push("A");
        nodeBag.push("B");
        nodeBag.push("C");

        for(int i : stack1){
            System.out.print(i);
        }
        System.out.println();
        for(int i : stack2){
            System.out.print(i);
        }
        System.out.println();
        for(int j : queue){
            System.out.print(j);
        }
        System.out.println();
        for(String k : nodeBag){
            System.out.print(k);
        }
    }
}
