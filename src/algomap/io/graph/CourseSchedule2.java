package algomap.io.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] indegree = new int[numCourses];
        for (int[] pair : prerequisites) {
            int course = pair[0];
            int pre = pair[1];
            if (adj[pre] == null) {
                adj[pre] = new ArrayList<>();
            }
            adj[pre].add(course);
            indegree[course]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            ans.add(cur);
            if (adj[cur] != null) {
                for (int next : adj[cur]) {
                    indegree[next]--;
                    if (indegree[next] == 0) {
                        queue.offer(next);
                    }
                }
            }
        }
        if (ans.size() != numCourses) {
            return new int[]{};
        }
        int[] seq = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            seq[i] = ans.get(i);
        }
        return seq;
    }
}
