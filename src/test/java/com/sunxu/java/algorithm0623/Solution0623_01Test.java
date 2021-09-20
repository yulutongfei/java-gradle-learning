package com.sunxu.java.algorithm0623;

import org.junit.Before;
import org.junit.Test;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/23 12:49
 */
public class Solution0623_01Test {

    private Solution0623_01 solution;
    @Before
    public void setUp() throws Exception {
        solution = new Solution0623_01();
    }

    @Test
    public void isValid() {
        testEmptyString();
        testSingleChar();
        testTwoChars();
        test3Chars();
        test4Chars();
        System.out.println("test over");
    }

    private void testEmptyString() {
        assert solution.isValid(null);
        assert solution.isValid("");
    }

    private void testSingleChar() {
        assert !solution.isValid("(");
        assert !solution.isValid(")");
    }

    private void testTwoChars() {
        assert solution.isValid("()");
        assert !solution.isValid("((");
        assert !solution.isValid("))");
        assert !solution.isValid(")(");
    }

    private void test3Chars() {
        assert !solution.isValid("())");
        assert !solution.isValid("(((");
        assert !solution.isValid(")))");
        assert !solution.isValid(")()");
    }

    private void test4Chars() {
        assert solution.isValid("()()");
        assert solution.isValid("(())");
        assert !solution.isValid("))((");
    }

    private void testOther() {
        assert solution.isValid("()()()");
        assert solution.isValid("((()))");
        assert solution.isValid("()(())");
        assert !solution.isValid("()(()(");
    }
}