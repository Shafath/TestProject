import java.sql.Array;

public class MergedTwoLists {
     public static class ListNode {
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
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if(list1 != null) {
            tail.next = list1;
        } else if(list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode n3 = new ListNode(10, null);
        ListNode n2 = new ListNode(3, n3);
        ListNode n1 = new ListNode(1, n2);
        ListNode L1 = n1;

        ListNode m3 = new ListNode(5, null);
        ListNode m2 = new ListNode(2, m3);
        ListNode m1 = new ListNode(4, m2);
        ListNode L2 = m1;

        MergedTwoLists.mergeTwoLists(L1, L2);
    }
}
