package com.sunxu.java.algorithm0624;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/24 14:58
 *
 * 单链表反转
 */
public class Solution01 {

    class Node {
        Node next;
        int value;
    }

    public Node reverse(Node head) {
        Node pre = null;
        Node next;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
