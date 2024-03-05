package leetcode;

public class ExcelColumn {
    public static void main(String[] args) {
        System.out.println(convertToTitle(2147483647));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber>0){
            columnNumber--;
            char ch = (char) (columnNumber%26 + 'A');
            columnNumber/=26;
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}
