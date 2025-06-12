package leetcode;

public class LatestMinute {
    public String maximumTime(String time) {
        char[] timeArr = time.toCharArray();
        if(timeArr[0] == '?'){
            if(timeArr[1]=='?'){
                timeArr[0] = '2';
                timeArr[1] = '3';
            }else if(timeArr[1]<'4'){
                timeArr[0] = '2';
            }else{
                timeArr[0] = '1';
            }
        }
        if(timeArr[1] == '?'){
            if(timeArr[0]=='2'){
                timeArr[1] = '3';
            }else{
                timeArr[1] = '9';
            }
        }

        if(timeArr[3]=='?'){
            if(timeArr[4]=='?'){
                timeArr[3] = '9';
            }
            timeArr[3] = '5';
        }
        if(timeArr[4]=='?'){
            timeArr[4] = '9';
        }

        return new String(timeArr);
    }
}
