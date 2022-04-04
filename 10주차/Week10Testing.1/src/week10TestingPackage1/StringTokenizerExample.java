package week10TestingPackage1;

import java.util.*;
public class StringTokenizerExample {
public static void main(String args[]) {
        StringTokenizer stok = new StringTokenizer("사과 배 복숭아");
        System.out.println("토큰 갯수 : " + stok.countTokens());
        while (stok.hasMoreTokens()) {        //토큰이 있는 동안만  
            String str = stok.nextToken();     //토큰을 추출하여
            System.out.println(str);           //추출된 토큰 출력
        }
    }
}