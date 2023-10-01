public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertLast(3);
        list.insertFirst(1);
        list.display();
        list.insertRec(0,0);
        list.insertRec(-1,0);
        list.display();
    }
}
