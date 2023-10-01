public class LL implements MyList{
    private Node head;
    private Node tail;
    private int size;
    @Override
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertRec(int val, int index){
//        insertRec(val,index,head);
        head = insertRecKK(val,index,head);
    }

    private Node insertRecKK(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val);
            temp.next = node;
            size++;
            return temp;
        }
        node.next = insertRecKK(val,index-1,node.next);
        return node;
    }
//    Method which I implemented using recursion with void return type
    private void insertRec(int val, int index, Node node){
        if(index <= 1){
            Node temp = new Node(val);
            if(node == head){
                temp.next = node;
                head = temp;
                size++;
                return;
            }
            temp.next = node.next;
            node.next = temp;
            size++;
            return;
        }
        insertRec(val,index-1,node.next);
    }
    @Override
    public void insertLast(int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public void insert(int val, int index) {

    }

    @Override
    public void display() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node{
        int val;
        Node next;

        Node(){}
        Node(int val){
            this.val = val;
        }
        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
