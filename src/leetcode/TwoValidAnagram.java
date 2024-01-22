package leetcode;

class TwoValidAnagram {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("tkPAdxpMfJiltOerItiv"));
    }
    public static boolean halvesAreAlike(String s) {

        char[] str = s.toCharArray();
        int vowFirst= 0;
        int vowSecond= 0;
        for(int i=0;i<str.length/2;i++){
            switch(str[i]){
                case 'a':{
                   vowFirst++;
                   break;
                }
                case 'A' :{
                    vowFirst++;
                    break;
                }
                case 'e':{
                    vowFirst++;
                    break;
                }
                case 'E' :{
                    vowFirst++;
                    break;
                }
                case 'i' :{
                    vowFirst++;
                    break;
                }
                case 'I' :{
                    vowFirst++;
                    break;
                }
                case 'o' :{
                    vowFirst++;
                    break;
                }
                case 'O' :{
                    vowFirst++;
                    break;
                }
                case 'u'  :{
                    vowFirst++;
                    break;
                }
                case 'U' :{
                    vowFirst++;
                    break;
                }
            }
            switch(str[str.length-i-1]){
                case 'a':{
                    vowSecond++;
                    break;
                }
                case 'A' :{
                    vowSecond++;
                    break;
                }
                case 'e':{
                    vowSecond++;
                    break;
                }
                case 'E' :{
                    vowSecond++;
                    break;
                }
                case 'i' :{
                    vowSecond++;
                    break;
                }
                case 'I' :{
                    vowSecond++;
                    break;
                }
                case 'o' :{
                    vowSecond++;
                    break;
                }
                case 'O' :{
                    vowSecond++;
                    break;
                }
                case 'u'  :{
                    vowSecond++;
                    break;
                }
                case 'U' :{
                    vowSecond++;
                    break;
                }
            }
        }
        return vowFirst==vowSecond;
    }
}