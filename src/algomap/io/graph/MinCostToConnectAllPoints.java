package algomap.io.graph;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.offer(new int[]{0,0,0});
        int cost = 0;
        int n = points.length;
        Set<Integer> visited = new HashSet<>();
        while(!pq.isEmpty() && visited.size()<n){
            int[] cur = pq.poll();
            int end = cur[1];
            int dist = cur[2];
            if(visited.contains(end)) continue;

            cost+=dist;
            visited.add(end);
            for(int i=0;i<n;i++){
                if(!visited.contains(i)){
                    pq.offer(new int[]{end,i,distance(points,end,i)});
                }
            }
        }
        return cost;
    }

    private int distance(int[][] points,int start,int end){
        return Math.abs(points[start][0]-points[end][0]) + Math.abs(points[start][1]-points[end][1]);
    }
}
