package com.sunxu.java.algorithm0707;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/7 15:49
 */
public class Solution1 {

    class Node {

        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    class DoubleNode {

        public int value;
        public DoubleNode last;
        public DoubleNode next;

        public DoubleNode(int data) {
            this.value = data;
        }
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

    public static DoubleNode reverseDoubleList(DoubleNode head) {
        DoubleNode pre = null;
        DoubleNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
    }

    public void deleteByNum(Node head, int num) {
        if (head == null) {
            return;
        }
        while (head.value == num) {
            head = head.next;
        }
        Node cur = head.next;
        Node pre = head;
        while (cur != null) {
            if (cur.value == num) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
    }

    public void deleteByNum2(DoubleNode head, int num) {

    }
}
