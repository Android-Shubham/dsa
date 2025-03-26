package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        HashMap<Node,Node> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        map.put(node,new Node(node.val));
        q.offer(node);
        while(!q.isEmpty()){
            Node curOrig = q.poll();
            Node curCopy = map.get(curOrig);
            if(curOrig.neighbors!=null){
                for(Node neighbor : curOrig.neighbors){
                    if(!map.containsKey(neighbor)){
                        map.put(neighbor,new Node(neighbor.val));
                        q.offer(neighbor);
                    }
                    curCopy.neighbors.add(map.get(neighbor));
                }
            }
        }
        return map.get(node);
    }
}
