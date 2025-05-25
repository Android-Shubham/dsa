package leetcode;

import java.util.Arrays;

public class SImplifyPath {
    public static void main(String[] args) {
        String path = "/home//foo/";
        String[] strs = path.split("/");
        System.out.println(Arrays.toString(strs));
    }
}
