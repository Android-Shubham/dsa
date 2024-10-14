package algomap.io.HashMapsAndSets;

import java.util.HashMap;

//https://leetcode.com/problems/maximum-number-of-balloons/
public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        MaximumNumberOfBalloons maximumNumberOfBalloons = new MaximumNumberOfBalloons();
        System.out.println(maximumNumberOfBalloons.maxNumberOfBalloons_bruteForce("nlaebolko"));
        System.out.println(maximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon"));
    }

    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char ch : text.toCharArray()) {
            switch (ch) {
                case 'b':
                    ++b;
                    break;
                case 'a':
                    ++a;
                    break;
                case 'l':
                    ++l;
                    break;
                case 'o':
                    ++o;
                    break;
                case 'n':
                    ++n;
                    break;

            }
        }
        return Math.min(Math.min(o / 2, l / 2), Math.min(Math.min(b, a), n));
    }

    public int maxNumberOfBalloons_better(String text) {
        int[] map = new int[26];
        for (char ch : text.toCharArray()) {
            map[ch-'a']++;
        }
        int loons = Integer.MAX_VALUE;
        for (char ch : "balon".toCharArray()){
            if(ch=='l' || ch=='o'){
                loons = Math.min(loons,map[ch-'a']/2);
            }else {
                loons = Math.min(loons,map[ch-'a']);
            }
        }
        return loons;
    }

    public int maxNumberOfBalloons_bruteForce(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for (char ch : text.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        int loons = Integer.MAX_VALUE;

        if (map.get('b') > 0) {
            loons = Math.min(loons, map.get('b'));
            if (map.get('a') > 0) {
                loons = Math.min(loons, map.get('a'));
                if (map.get('l') > 1) {
                    loons = Math.min(loons, map.get('l') / 2);
                    if (map.get('o') > 1) {
                        loons = Math.min(loons, map.get('o') / 2);
                        if (map.get('n') > 0) {
                            loons = Math.min(loons, map.get('n'));
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }

        return loons;
    }
}
