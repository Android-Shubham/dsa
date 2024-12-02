package algomap.io.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule {
    //kahn's Algorithm

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adj = new List[numCourses];
        int[] indegree = new int[numCourses];
        List<Integer> ans = new ArrayList<>();

        for (int[] prere : prerequisites) {
            int course = prere[0];
            int pre = prere[1];
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
        return ans.size() == numCourses;
    }
}
