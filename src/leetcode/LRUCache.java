package leetcode;

import java.util.*;

class LRUCache {
    private class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> cache;
    private Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) return -1;
        Node node = cache.get(key);
        removeNode(node);
        addNode(node); // Move node to the front (most recently used)
        return node.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            removeNode(cache.get(key));
        } else if (cache.size() == capacity) {
            cache.remove(tail.prev.key);
            removeNode(tail.prev);
        }

        Node node = new Node(key, value);
        addNode(node);
        cache.put(key, node);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // Outputs 10
        cache.put(3, 30); // Evicts key 2
        System.out.println(cache.get(2)); // Outputs -1 (not found)
    }
}