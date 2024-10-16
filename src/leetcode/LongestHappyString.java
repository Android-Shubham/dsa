package leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongestHappyString {
    public static void main(String[] args) {
        longestDiverseString(1, 1, 7);
    }
    public static String longestDiverseString(int a, int b, int c) {
        PriorityQueue<NewPair> q = new PriorityQueue<>(new Comparator<NewPair>() {
            @Override
            public int compare(NewPair a,NewPair b) {
                return b.count - a.count;
            }
        });

        if(a>0){
            q.offer(new NewPair('a',a));
        }
        if(b>0){
            q.offer(new NewPair('b',b));
        }
        if(c>0){
            q.offer(new NewPair('c',c));
        }

        StringBuilder sb = new StringBuilder();

        while(!q.isEmpty()){
            NewPair cur = q.poll();
            int count = cur.count;
            char ch = cur.ch;
            int n = sb.length();
            if(n >= 2 && sb.charAt(n-1)==ch && sb.charAt(n-2)==ch){
                if(q.isEmpty()) break;
                NewPair temp = q.poll();
                //if(temp.count>0){
                sb.append(temp.ch);
                //}
                if(temp.count-1 > 0){
                    q.offer(new NewPair(temp.ch,temp.count-1));
                }
            }else{
                count--;
                sb.append(ch);
            }

            if(count>0){
                q.offer(new NewPair(ch,count));
            }
        }

        return sb.toString();
    }
}

class NewPair {
    char ch;
    int count;

    public NewPair(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }
}