package algomap.io.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule4 {
    public static void main(String[] args) {
        CourseSchedule4 courseSchedule4 = new CourseSchedule4();
        System.out.println(courseSchedule4.checkIfPrerequisite(4, new int[][]{{1,2},{1,2},{2,0},{2,3}}, new int[][]{{1,3}}));
    }
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        List<Integer>[] adjList = new List[numCourses];
        int[] indegree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            int pre = prerequisite[0];
            int course = prerequisite[1];
            if (adjList[pre] == null) {
                adjList[pre] = new ArrayList<>();
            }
            adjList[pre].add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            if (adjList[node] != null) {

                for (int adj : adjList[node]) {
                    if (!map.containsKey(adj)) {
                        map.put(adj, new HashSet<>());
                    }
                    map.get(adj).add(node);
                    for (int prev : map.getOrDefault(node, new HashSet<>())) {
                        map.get(adj).add(prev);
                    }
                    indegree[adj]--;
                    if (indegree[adj] == 0) {
                        q.offer(adj);
                    }
                }
            }
        }

        List<Boolean> ans = new ArrayList<>();
        for (int[] query : queries) {
            if (map.containsKey(query[1]) && map.get(query[1]).contains(query[0])) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
