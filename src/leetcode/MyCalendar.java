package leetcode;

import java.util.TreeMap;

class MyCalendar {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.book(10,20);
        myCalendar.book(11,19);
        myCalendar.book(15,25);
        myCalendar.book(22,30);
        myCalendar.book(1,12);
    }
    TreeMap<Integer, Integer> calendar;

    MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer prev = calendar.floorKey(start),
                next = calendar.ceilingKey(start);
        if ((prev == null || calendar.get(prev) <= start) &&
                (next == null || end <= next)) {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}