public class BinaryToDecimal {
    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int exp = -1;
        while (temp != null) {
            exp++;
            temp = temp.next;
        }
        temp = head;
        int n = 0;
        while (temp != null) {
            n += temp.val * Math.pow(2, exp);
            exp--;
            temp = temp.next;
        }
        return n;
    }
}