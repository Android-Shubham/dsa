package algomap.io.linkedlist;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fast = head.next;
        while(head!=fast){
            if(fast == null || fast.next == null){
                return false;
            }
            fast = fast.next.next;
            head = head.next;
        }

        return true;
    }
}


