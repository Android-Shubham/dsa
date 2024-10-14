package algomap.io.HashMapsAndSets;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {
    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones("aA", "aaaAAAb"));
    }

    //HashSet solution
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int result = 0;
        for(char ch : jewels.toCharArray()){
            set.add(ch);
        }

        for(char ch : stones.toCharArray()){
            if(set.contains(ch)){
                result++;
            }
        }

        return result;

    }
}
