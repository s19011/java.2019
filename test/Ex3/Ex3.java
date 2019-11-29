class Ex3{

	public String ex3_0(int n){
    String ret = "";
    if (n > 0) {
      ret = "その値は正です";
    } else {
      ret = "その値は０か負です";
    }
		return ret;
	}

	public int ex3_1(int n){
        if (n == 0){
            return 0;
        }else {
            return 1; 
        }
	}

	public String ex3_2(int a, int b){
        String ret = "";
       if (a % b == 0) {
            ret = "4は12の約数です" ;
       } else {
            ret = "5は12の約数ではありません";
       }

		return ret;
	}

	public String ex3_3(int a, int b){
        String ret = "";
       if (a != b) {
           if (b > a) {
                ret = "9の方が大きいです" ;
           } else {
                ret = "8の方が大きいです";
           }
       } else {
            ret = "同じ値です" ;
       }
		return ret;

	}

	public String ex3_4(int a){
        String ret = "";
       if (a >= 0) {
           if (a % 5 == 0){
                ret = "その値は5で割り切れます" ;
           } else {
                ret = "その値は5で割り切れません" ;
           }
       
       } else {
            ret = "正でない整数値です" ;
       }

		return ret;

	}

	public String ex3_5(int a){
        String ret = "";
        if (a > 0){
            if (a % 10 == 0){
                ret = "その値は10の倍数です" ;
            } else {
                ret = "その値は10の倍数ではありません" ;
            }
        
        } else {
            ret = "正でない整数値です";
        }

		return ret;
	}
	
	public String ex3_6(int a){
        String ret = "";
        if (a > 0) {
            if (a % 3 != 0) {
                if (a % 3 == 1){
                    ret = "その値を3で割った余りは1です";
                } else {
                    ret = "その値を3で割った余りは2です";
                }
            } else {
                ret = "その値は3で割り切れます" ;
            }
        } else {
            ret = "正でない整数値です" ;
        }
		return ret;
	}

	public String ex3_7(int a){
        String ret = "";
        if (a >= 0 && 100 >= a ) {
            if (a > 59 && 0 <= a) {
                if (a >= 70 && a >- 80) {
                    if (a >= 80 && a <= 100){
                        ret = "優";
                    }else {
                        ret = "良"; 
                    }
                }else {
                    ret = "可"; 
                }
            }else {
                ret = "不可";
            }
        
        } else {
            ret = "範囲(0～100)外の値です";
        }
		return ret;
	}

	public double ex3_8(double a, double b){
        double ret = Math.max(a, b);
		return ret;
	}

	public int ex3_9(int a, int b){
        int ret_a = Math.abs(a);
        int ret_b = Math.abs(b);
        int ret;
        if (a < 0 || b < 0) {
            if (a < 0 && b < 0){
                ret = ret_b -= ret_a;
            }else {
                ret = ret_a += ret_b; 
            }
        }
		return ret = a -= b;
	}

	public String ex3_10(int a, int b){
        if (a > b){
            if (a -b <= 10){
                return "それらの差は10以下です" ;
            }else {
                return "それらの差は11以上です" ;
            }
        }else {
            if (b - a <= 10) {
                return "それらの差は10以下です" ;
            }else {
                return "それらの差は11以上です";
            }
        }
	}

	public int ex3_11(int a, int b, int c){
       int values[] = {a, b, c};
       int min = values[0];

       for (int index = 1; index < values.length; index ++){
            min = Math.min(min, values[index]) ;
       }
		return min;
	}

	public int ex3_12(int a, int b, int c){
        if (a >= b){
            if(b >= c){
                return b; 
            }else if(a <= c) {
                return a; 
            }else {
                return c;
            }

        }else if(a > c){
            return a; 
        }else if(b > c){
            return c; 
        }else {
            return b;    
        } 
	}

	public String ex3_13(int a){
        if (3 <= a && 5 >= a){
            return "春"; 
        }else if(6 <= a && 8 >= a){
            return "夏"; 
        }else if(9 <= a && 11 >= a){
            return "秋";
        }else if(a == 12 || a == 1 || a == 2){
            return "冬";
        }else {
            return "範囲(1～12)外の値です" ;
        }
    }
}	


