package week10TestingPackage1;

import java.util.*;
public class StringTokenizerExample {
public static void main(String args[]) {
        StringTokenizer stok = new StringTokenizer("��� �� ������");
        System.out.println("��ū ���� : " + stok.countTokens());
        while (stok.hasMoreTokens()) {        //��ū�� �ִ� ���ȸ�  
            String str = stok.nextToken();     //��ū�� �����Ͽ�
            System.out.println(str);           //����� ��ū ���
        }
    }
}