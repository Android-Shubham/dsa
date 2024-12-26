package algomap.io.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class NetworkDelay {
    public static void main(String[] args) {
        NetworkDelay networkDelay = new NetworkDelay();
        System.out.println(networkDelay.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2));
        System.out.println(networkDelay.networkDelayTime(new int[][]{{1,2,1},{2,1,3}}, 2, 2));
        System.out.println(networkDelay.networkDelayTime(new int[][]{{1,2,1}}, 2, 1));
        System.out.println(networkDelay.networkDelayTime(new int[][]{{1,2,1}}, 2, 2));


    }
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<Pair>> adj = new HashMap<>();
        for(int[] time : times){
            int from = time[0];
            int to = time[1];
            int cost = time[2];
            if(!adj.containsKey(from)){
                adj.put(from,new ArrayList<>());
            }
            adj.get(from).add(new Pair(to,cost));
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(p->p[1]));
        pq.offer(new int[]{k,0});
        int[] dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k] = 0;
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int start = cur[0];
            int cost = cur[1];
            if(dist[start] < cost) continue;
            if(adj.containsKey(start)){
                for(Pair pair : adj.get(start)){
                    int newDist = cost + pair.cost;
                    if(newDist<dist[pair.dest]){
                        dist[pair.dest] = newDist;
                        pq.offer(new int[]{pair.dest,newDist});
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            max = Math.max(max,dist[i]);
        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }
}
class Pair{
    int dest;
    int cost;
    public Pair(int dest,int cost){
        this.dest = dest;
        this.cost = cost;
    }
}

