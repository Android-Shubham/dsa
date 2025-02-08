package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

class NumberContainers {
    HashMap<Integer, Integer> index_map = new HashMap<>();
    HashMap<Integer, PriorityQueue<Integer>> value = new HashMap<>();

    public NumberContainers() {

    }

    public static void main(String[] args) {
        NumberContainers numberContainers = new NumberContainers();
        numberContainers.change(1,10);
        numberContainers.change(1,10);
        System.out.println(numberContainers.find(10));
        numberContainers.change(1,20);
        System.out.println(numberContainers.find(10));
    }

    public void change(int index, int number) {
        if (index_map.containsKey(index)) {
            int oldNumber = index_map.get(index);
            if (oldNumber != number) {
                value.get(oldNumber).remove(index);
                if (value.get(oldNumber).isEmpty()) {
                    value.remove(oldNumber);
                }
            }else{
                return;
            }
        }
        index_map.put(index, number);
        value.putIfAbsent(number, new PriorityQueue<>());
        value.get(number).add(index);
    }

    public int find(int number) {
        if (!value.containsKey(number) || value.get(number).isEmpty()) {
            return -1;
        }
        return value.get(number).peek();
    }
}