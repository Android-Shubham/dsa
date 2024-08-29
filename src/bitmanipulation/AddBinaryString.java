package bitmanipulation;

public class AddBinaryString {

    public String addBinary(String a, String b) {
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 && j >= 0) {
            int first = Integer.parseInt(String.valueOf(a.charAt(i--)));
            int second = Integer.parseInt(String.valueOf(b.charAt(j--)));
            int res = first + second + carry;
            carry = 0;
            if (res == 3) {
                carry = 1;
                sb.insert(0, 1);
            } else if(res==2){
                carry = 1;
                sb.insert(0, 0);
            }else {
                sb.insert(0, res);
            }
        }

        while (i >= 0) {
            int first = Integer.parseInt(String.valueOf(a.charAt(i--)));
            int res = first + carry;
            if (res > 1) {
                carry = 1;
                sb.insert(0, 0);
            } else {
                carry = 0;
                sb.insert(0, res);
            }
        }

        while (j >= 0) {
            int first = Integer.parseInt(String.valueOf(b.charAt(j--)));
            int res = first + carry;
            if (res > 1) {
                carry = 1;
                sb.insert(0, 0);
            } else {
                carry = 0;
                sb.insert(0, res);
            }
        }
        if (carry != 0) {
            sb.insert(0, 1);
        }

        return sb.toString();
    }
}
