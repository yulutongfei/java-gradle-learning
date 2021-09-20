package com.sunxu.java.algorithm0701;


import com.sun.tools.javac.util.Pair;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/1 17:03
 *
 * [3,3, 6,6, 7, 9, 5,5]
 * 找出7,9
 */
public class Solution2 {

    public Pair<Integer, Integer> findTwo(int[] arr) {
        int a = 0;
        for (int k : arr) {
            a = a ^ k;
        }
        // 此时 a = x ^ y
        // 找到 a最右边的位
        int b = a & (~a + 1);

        int x = 0;
        for (int j : arr) {
            if ((j & b) == 0) {
                x = x ^ j;
            }
        }

        // x^y = a
        int y = a ^ x;
        return new Pair<>(x, y);
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        Pair<Integer, Integer> pair = solution2.findTwo(new int[]{3, 3, 6, 6, 7, 9, 5, 5});
        System.out.println(pair.fst == 7);
        System.out.println(pair.snd == 9);
    }
}
