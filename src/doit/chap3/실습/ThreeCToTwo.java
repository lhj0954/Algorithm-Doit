package doit.chap3.실습;

class A implements Comparable<A> {
    public int compareTo(A c) {return 1;}
    /**
     * this가 c보다 크면 양의 값 반환
     * this가 c보다 작으면 음의 값 반환
     * this와 c가 같으면 0 반환
     */

    public boolean equals(Object c) {return true;}
    /**
     *this가 c와 같으면 true반환
     *this가 c와 다르면 false반환
     */
}

public class ThreeCToTwo {
}
