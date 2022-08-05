package doit.chap2.연습;

//년월일을 필드로 갖는 클래스를 만드세요.(...이게 최선인가,,,?) java.util.calendar와 date를 이용하자...!

public class PracticeQ8 {
    static class YMD {
        int y;
        int m;
        int d;

        public YMD() {}

    }

    //((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0 :윤년

   static YMD YMDAfter(int n) {
        YMD ymd = new YMD();
       if (ymd.m == 1 || ymd.m == 3 || ymd.m == 5 || ymd.m == 7 || ymd.m == 8 || ymd.m == 10 || ymd.m == 12) {
           if (ymd.d + n > 31) {
               ymd.d= ymd.d+n-31;
               if (ymd.m==12) {
                   ymd.m=1;
                   ymd.y++;
               } else {
                   ymd.m++;
               }
           } else {
              ymd.d = ymd.d+n;
           }
       } else if (ymd.m == 2) {
           if (((ymd.y % 4) == 0 && (ymd.y % 100) != 0) || (ymd.y % 400) == 0){
               if (ymd.d+n>29) {
                   ymd.d= ymd.m+n-29;
                   ymd.m=3;
               } else {
                   ymd.d= ymd.d+n;
               }
           } else {
               if (ymd.d+n>28) {
                   ymd.d= ymd.m+n-28;
                   ymd.m=3;
               } else {
                   ymd.d= ymd.d+n;
               }
           }
       } else {
           if (ymd.d + n > 30) {
               ymd.d= ymd.d+n-30;
               ymd.m++;
           } else {
               ymd.d = ymd.d+n;
           }
       }

        return ymd;
    }

    static YMD YMDBefore(int n) {
        YMD ymd = new YMD();
        if (ymd.m == 1 ||ymd.m == 2 || ymd.m == 4 || ymd.m == 6 || ymd.m == 8 || ymd.m == 9 || ymd.m == 11) {
            if (ymd.d - n < 1) {
                ymd.d= n- ymd.d+31;
                if (ymd.m==1) {
                    ymd.m=12;
                    ymd.y--;
                } else {
                    ymd.m--;
                }
            } else {
                ymd.d = ymd.d-n;
            }
        } else if (ymd.m == 3) {
            if (((ymd.y % 4) == 0 && (ymd.y % 100) != 0) || (ymd.y % 400) == 0){
                if (ymd.d-n<1) {
                    ymd.d= n-ymd.m+29;
                    ymd.m=2;
                } else {
                    ymd.d= ymd.d-n;
                }
            } else {
                if (ymd.d-n<1) {
                    ymd.d= n-ymd.m+28;
                    ymd.m=2;
                } else {
                    ymd.d= ymd.d-n;
                }
            }
        } else {
            if (ymd.d - n < 30) {
                ymd.d= n-ymd.d+30;
                ymd.m--;
            } else {
                ymd.d = ymd.d-n;
            }
        }
        return ymd;
    }


}
