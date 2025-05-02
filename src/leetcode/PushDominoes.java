package leetcode;

public class PushDominoes {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] forces = new int[n];
        char[] arr = dominoes.toCharArray();
        StringBuilder sb = new StringBuilder();
        int force = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == 'L'){
                force = 0;
            }else if(arr[i] == 'R'){
                force = n;
            }else{
                force = Math.max(force-1,0);
            }
            forces[i]+=force;
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i] == 'L'){
                force = n;
            }else if(arr[i] == 'R'){
                force = 0;
            }else{
                force = Math.max(force-1,0);
            }
            forces[i]-=force;
        }
        for(int f : forces){
            if(f>0){
                sb.append('R');
            }else if(f<0){
                sb.append('L');
            }else{
                sb.append('.');
            }
        }
        return sb.toString();
    }
}
