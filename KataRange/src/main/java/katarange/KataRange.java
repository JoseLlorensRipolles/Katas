package katarange;

/**
 * Created by josellorens on 1/07/16.
 */
public class KataRange {

    public boolean contain(String s, String s1) {
        int[] mainRange = parseRange(s);
        if(s1.charAt(0)=='{'){
            for(int i = 1; i<s1.length()-1;i=i+2){
                int num = Integer.parseInt(s1.charAt(i)+"");
                if(num<mainRange[0] || num>mainRange[1]){
                    return false;
                }
            }
        }else{
            int[] auxRange = parseRange(s1);
            if(auxRange[0]<mainRange[0] || auxRange[1]>mainRange[1]){
                return false;
            }
        }
        return true;
    }

    private int[] parseRange(String s) {
        int[] range = new int [2];
        int start = Integer.parseInt(s.charAt(1)+"");
        int finalNumber = Integer.parseInt(s.charAt(3)+"");
        if(s.charAt(0)=='('){
            start++;
        }
        if(s.charAt(4)==')'){
            finalNumber--;
        }
        range[0]=start;
        range[1]=finalNumber;;
        return range;
    }
}
