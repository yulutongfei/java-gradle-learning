package com.sunxu.java.algorithm0707;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/7 16:58
 * 2个栈实现队列
 */
public class Solution3 {

    public static class TwoQueueStack<T> {

        public Queue<T> queue;
        public Queue<T> help;

        public TwoQueueStack() {
            queue = new LinkedList<>();
            help = new LinkedList<>();
        }

        public void push(T value) {
            queue.offer(value);
        }

        public T poll() {
            while (queue.size() > 1) {
                help.offer(queue.poll());
            }
            T ans = queue.poll();
            Queue<T> tmp = new LinkedList<>();
            queue = help;
            help = tmp;
            return ans;
        }

        public T peek() {
            while (queue.size() > 1) {
                help.offer(queue.poll());
            }
            T ans = queue.poll();
            help.offer(ans);
            Queue<T> tmp = new LinkedList<>();
            queue = help;
            help = tmp;
            return ans;
        }
    }

}
