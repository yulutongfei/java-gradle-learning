package com.sunxu.java.algorithm0625;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/24 16:53
 *
 *【题目】给定一个正整数数组和 k，要求依次取出 k 个数，输出其中数组的一个子序列，
 * 需要满足：1. 长度为 k；2.字典序最小。
 *
 * 输入：nums = [3,5,2,6], k = 2
 * 输出：[2,6]
 * [3] size = 1, left = 3
 * [3,5] size = 2, left = 2
 * [3,2] size = 2, left = 1
 * [2] size = 1, left = 1
 */
public class Solution01 {

    public int[] findSmallSeq(int[] nums, int k) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            // 当前节点
            int cur = nums[i];
            // 剩余个数
            int left = nums.length - i;
            while (!s.empty()  && (left + s.size() > k) && cur < s.peek()) {
                s.pop();
            }
            s.push(cur);
        }
        while (s.size() > k) {
            s.pop();
        }
        // 把k个元素取出来,注意取的顺序
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = s.peek();
            s.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution01 solution = new Solution01();
        System.out.println(Arrays.equals(new int[]{1,2,3}, solution.findSmallSeq(new int[]{9,2,4,5,1,2,6,3,100,4}, 3)));
        System.out.println(Arrays.equals(new int[]{1,2}, solution.findSmallSeq(new int[]{9,2,4,5,1,2,6,3,100,4}, 2)));
        System.out.println(Arrays.equals(new int[]{1}, solution.findSmallSeq(new int[]{9,2,4,5,1,2,6,3,100,4}, 1)));
        System.out.println(Arrays.equals(new int[]{1}, solution.findSmallSeq(new int[]{1,1,1,1,1}, 1)));
    }
}
