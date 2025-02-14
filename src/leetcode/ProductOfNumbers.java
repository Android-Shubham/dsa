package leetcode;

import java.util.ArrayList;

class ProductOfNumbers {
    ArrayList<Integer> prod = new ArrayList<>();
    int size = 0;

    public ProductOfNumbers() {
        prod.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            prod = new ArrayList<>();
            size = 0;
            prod.add(1);
        } else {
            prod.add(prod.get(size) * num);
            size++;
        }
    }

    public int getProduct(int k) {
        if (k > size) {
            return 0;
        }
        return prod.get(size) / prod.get(size - k);
    }
}