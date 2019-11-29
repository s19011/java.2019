import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class Ex4{

	public int [] ex4_1(int [] a){
		Arrays.sort(a);
            return a;
    }

	public int [] ex4_2(int [] a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int t : a){
         list.add((Integer)t);
        }
        Collections.sort(list, Comparator.reverseOrder());
        
        for (int i = 0; i < a.length; i++){
            a[i] = list.get(i);
        }
        return a;
	}

	public String [] ex4_3(int [] a){
        String[] ret = new String[a.length];
		for (int i = 0; i < a.length; i++){
            if(a[i] > 0){
                ret[i] = "正" ;
            }else if(a[i] < 0){
                ret[i] = "負";
            }else {
                ret[i] = "零";
            }
        }
		return ret;

	}

	public int ex4_4(int a){
        int valLen = String.valueOf(a).length();
		
		return valLen;

	}

	public int ex4_5(int a){
        int sum = 1;
        for(int i = 2; i <= a; i++){
            sum += i; 
        }
		return sum;

	}

	public int [] ex4_6(int a){
        List<Integer> yakusu = new ArrayList<Integer>();
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                yakusu.add(i);
            }
        }
	    int [] ret = new int[yakusu.size()];
        for(int i = 0; i < ret.length; i++){
            ret[i]  = yakusu.get(i);
        }
		return ret;

	}

	public boolean ex4_7(int a){
        if (a == 1){
            return false; 
        }
	    
        for (int i = 2; i < a; i++){
            if (a % i == 0) {
                return false; 
            }
        }
		return true;

	}

	public int ex4_8(int [] a){
		
		int ret = 0;
        for (int i : a){
            ret += i; 
        }
		
		return ret;

	}

	public int ex4_9(int [] a){
        float ave = 0;

        for (int i: a){
            ave += i; 
        }

        int ret = Math.round(ave/a.length);
		return ret;

	}
}

