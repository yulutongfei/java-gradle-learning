package com.sunxu.java.algorithm0623;

import java.util.Stack;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/23 12:59
 *
 *【题目】在水中有许多鱼，可以认为这些鱼停放在 x 轴上。再给定两个数组 Size，Dir，Size[i] 表示第 i 条鱼的大小，Dir[i] 表示鱼的方向 （0 表示向左游，1 表示向右游）。这两个数组分别表示鱼的大小和游动的方向，并且两个数组的长度相等。鱼的行为符合以下几个条件:
 * 所有的鱼都同时开始游动，每次按照鱼的方向，都游动一个单位距离；
 * 当方向相对时，大鱼会吃掉小鱼；
 * 鱼的大小都不一样。
 * 输入：Size = [4, 2, 5, 3, 1], Dir = [1, 1, 0, 0, 0]
 * 输出：3
 */
public class Solution0623_02 {

    public int solution(int[] fishSize, int[] fishDirection) {
        if (fishSize.length <= 1) {
            return fishSize.length;
        }
        final int left = 0;
        final int right = 1;

        Stack<Integer> fishStack = new Stack<>();
        for (int i = 0; i < fishSize.length; i++) {
            int curFishSize = fishSize[i];
            int curFishDir = fishDirection[i];
            boolean hasEat = false;

            while (!fishStack.isEmpty() && fishDirection[fishStack.peek()] == right
                    && curFishDir == left) {
                if (fishSize[fishStack.peek()] > curFishSize) {
                    hasEat = true;
                    break;
                }
                fishStack.pop();
            }
            if (!hasEat) {
                fishStack.push(i);
            }
        }
        return fishStack.size();
    }
}
