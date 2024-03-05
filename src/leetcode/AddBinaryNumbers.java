package leetcode;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        System.out.println(addBinary("11","1"));
        System.out.println(addBinary("1010","1011"));
    }

    private static String addBinary(String first, String second) {
        int i = first.length() - 1;
        int j = second.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i>=0 || j>=0){
            int sum = carry;
            if(i>=0)sum+=first.charAt(i) - '0'; //2
            if(j>=0)sum+=second.charAt(j) - '0';
            sb.append(sum%2); //2%2 == 0
            carry = sum/2;   // 2/2 = 1;
            i--;
            j--;
        }

        if(carry!=0) sb.append(carry);

        return sb.reverse().toString();
    }
}
