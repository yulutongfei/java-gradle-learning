package com.sunxu.java.algorithm0624;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/24 15:15
 * <p>
 * 【题目】一个整数数组 A，找到每个元素：右边第一个比我小的下标位置，没有则用 -1 表示。
 * 输入：[5, 2]
 * 输出：[1, -1]
 */
public class Solution02 {

    public static int[] findRightSmall(int[] arr) {
        // 新建返回数组
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        // 栈单调递增,如果当前数据比栈顶大则压栈
        for (int i = 0; i < arr.length; i++) {
            int curValue = arr[i];
            while (!stack.empty() && arr[stack.peek()] > curValue) {
                ans[stack.peek()] = i;
                stack.pop();
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            ans[stack.peek()] = -1;
            stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.equals(new int[]{1, -1}, Solution02.findRightSmall(new int[]{5, 4})));
        System.out.println(Arrays.equals(new int[]{5, 5, 5, 4, 5, -1, -1}, Solution02.findRightSmall(new int[]{1, 2, 4, 9, 4, 0, 5})));
    }
}
