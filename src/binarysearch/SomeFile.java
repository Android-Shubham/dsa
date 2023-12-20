package binarysearch;

import java.util.Arrays;

//
public class SomeFile {
    public static void main(String[] args) {
        String str = "SHUBHAM";
        //a = 1 b = 2
        Character[] temp = new Character[str.length()];
        //traverse and divisible by 2 replace by * or just leave the character
        for(int i=0;i<str.length();i++){
            if((((int) str.charAt(i)+1) - ((int) 'A'))%2==0){
                temp[i] = '*';
            }else {
                temp[i] = str.charAt(i);
            }
        }
        str = Arrays.toString(temp);
        System.out.println(str);
    }


}
