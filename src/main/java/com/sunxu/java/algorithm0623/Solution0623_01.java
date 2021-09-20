package com.sunxu.java.algorithm0623;

import java.util.Objects;
import java.util.Stack;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/22 23:51
 *
 *【题目】字符串中只有字符'('和')'。合法字符串需要括号可以配对。比如：
 * 输入："()"
 * 输出：true
 * 解释：()，()()，(()) 是合法的。)(，()(，(() 是非法的。
 */
public class Solution0623_01 {

    public static void main(String[] args) {
        assert false;
    }

    public boolean isValid(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        if (str.length() % 2 == 1) {
            return false;
        }
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Objects.equals(c, '(')) {
                characters.push(c);
            }
            if (Objects.equals(c, ')')) {
                if (characters.isEmpty()) {
                    return false;
                }
                characters.pop();
            }
        }
        return characters.isEmpty();
    }
}