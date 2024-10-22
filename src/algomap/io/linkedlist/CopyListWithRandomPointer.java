package algomap.io.linkedlist;

import java.util.HashMap;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
