package doit.chap4.연습;

//fourTothree에 임의의 데이터가 몇 번째 데이터인지 찾는 인덱스를 구하시오.

public class PracticeQ5 {
    private int[] que; //스택용 배열
    private int capacity; //스택 용량
    private int front;
    private int rear;
    private int num;

    int search(int x) {
        int result =0;
        for (int i = 0; i < num; i++) {
            if (que[(i+front)%capacity]==x) {
                if (((i+front)%capacity-front)<0){
                    result = (i+front)%capacity+capacity-front+1;
                } else {
                    result = (i+front)%capacity-front+1;
                }
                break;
            }
        }

        return result;
    }
}
