import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> numbers = new HashMap<String, Integer>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);

        String [] split = s.split("");
        int result = 0;
        String a= "";

        for(int i = 0; i < split.length; i++) {
            if(i+1 <= split.length-1){
                a = split[i] + split[i+1];
                switch(a) {
                    case "IV" : result+=4; i++; break;
                    case "IX" : result+=9; i++; break;
                    case "XL" : result+=40; i++; break;
                    case "XC" : result+=90; i++; break;
                    case "CD" : result+=400; i++; break;
                    case "CM" : result+=900; i++; break;
                    default :
                        a=split[i];
                        for(String key : numbers.keySet()) {
                            if(key.equals(a)){
                                result+= numbers.get(key) ;
                            }
                        }
                }

            }
            else {
                a=split[i];
                for(String key : numbers.keySet()) {
                    if(key.equals(a)) {
                        result +=numbers.get(a);
                    }
                }
            }
        }
        return result ;



    }
}

