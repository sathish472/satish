package com.test.pract.yogi.basic;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[6];
        int[] c = new int[7];
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(c.length);
        System.out.println(a[0]);
        System.out.println(a[2]);
        System.out.println(b[0]);
        System.out.println(c[0]);
        int[][] d = new int[2][3];
        System.out.println(d[0]);
        System.out.println(d[0][0]);
        int[][] e = new int[4][];
        System.out.println(e);
        int[] f = new int[5];
        f[0]=10;
        f[1]=20;
        f[2]=30;
        f[3]=40;
        f[4]=50;
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);
        System.out.println(f[4]);
        char[] ch={'a','e','i','o','u'};
        System.out.println(ch[0]);
        System.out.println(ch[1]);
        System.out.println(ch[2]);
        System.out.println(ch[3]);
        System.out.println(ch[4]);
        String[] s={"Yogeswari","Gowthami","Sravani","Joshnavi"};
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(s[3]);

    }
}