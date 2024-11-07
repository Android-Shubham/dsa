package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQcheck {
    public static void main(String[] args) {
//        PriorityQueue<Integer>min = new PriorityQueue<>();
//        min.offer(1);
//        min.offer(2);
//        min.offer(4);
//        min.offer(3);
//        while(!min.isEmpty()){
//            System.out.print(min.peek()+"--");
//            System.out.println(min.poll());
//        }
//        System.out.println();
//        //max heap
//        PriorityQueue<Integer>max = new PriorityQueue<>(Collections.reverseOrder());
//        max.offer(1);
//        max.offer(2);
//        max.offer(4);
//        max.offer(3);
//        while(!max.isEmpty()){
//            System.out.print(max.peek()+"--");
//            System.out.println(max.poll());
//        }

//        PriorityQueue<Pairs>minPair = new PriorityQueue<>(Comparator.comparingInt(a -> a.first));
//        minPair.offer(new Pairs(1,1));
//        minPair.offer(new Pairs(2,2));
//        minPair.offer(new Pairs(3,3));
//        minPair.offer(new Pairs(4,4));
//        while (!minPair.isEmpty()){
//            System.out.println(minPair.poll());
//        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if(p1.num==p2.num){
                    return Integer.compare(p1.index,p2.index);
                }
                return Integer.compare(p1.num,p2.num);
            }
        });

        PriorityQueue<Pairs>maxPair = new PriorityQueue<>((a,b)->Integer.compare(b.second,a.second));
        maxPair.offer(new Pairs(1,1));
        maxPair.offer(new Pairs(2,2));
        maxPair.offer(new Pairs(3,3));
        maxPair.offer(new Pairs(4,4));
        while (!maxPair.isEmpty()){
            System.out.println(maxPair.poll());
        }
        int a = (int) Math.sqrt(1);

        kClosest(new int[][]{{1,3},{-2,2}}, 1);
    }


    public static int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            double c = Math.pow(a[0], 2);
            double d = Math.pow(a[1], 2);
            double first = Math.sqrt(c + d);

            double x = Math.pow(b[0], 2);
            double y = Math.pow(b[1], 2);
            double second = Math.sqrt(x + y);

            return Double.compare(first, second);
        });
        for(int[] point : points){
            minHeap.offer(point);
        }
        while(k>0){
            ans[k-1] = minHeap.poll();
            k--;
        }
        return ans;
    }
}

class Pairs{
    int first;
    int second;
    public Pairs(int first,int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first+"--"+second;
    }
}
