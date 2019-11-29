import java.util.*;
import java.lang.*;
import java.io.*;

class Ex5{

	public double ex5_1(int [] a){

		
		int ret = 0;
        int[] data = a;
        for(int i=0; i < data.length; i++){
            ret += data[i];
        }
        double ave = (double)ret / (double)data.length;
		return ave;
	}
}
