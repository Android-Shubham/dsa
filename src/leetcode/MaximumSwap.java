package leetcode;
//https://leetcode.com/problems/maximum-swap/?envType=daily-question&envId=2024-10-17
public class MaximumSwap {


    public int maximumSwap_bruteforce(int num) {
        int res = num;
        char[] arr = String.valueOf(num).toCharArray();
        char[] temp =  String.valueOf(num).toCharArray();
        for(int i=0;i<arr.length-1;i++){
            int max = arr[i];
            int pos = -1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] >= max){
                    max = arr[j];
                    pos = j;
                }
            }
            if(pos!=-1){
                char cur = temp[i];
                temp[i] = temp[pos];
                temp[pos] = cur;
                res = Math.max(Integer.parseInt(String.valueOf(temp)),res);
            }
            temp =  String.valueOf(num).toCharArray();
        }
        return res;
    }

}
