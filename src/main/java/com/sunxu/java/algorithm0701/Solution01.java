package com.sunxu.java.algorithm0701;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/7/1 14:15
 *      3
 *   9      8
 *      6       7
 *
 */
public class Solution01 {

    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }

        List<List<Integer>> ans = new ArrayList<>();

        while (queue.size() > 0) {

            final int qSize = queue.size();
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < qSize; i++) {
                TreeNode cur = queue.poll();
                tmp.add(cur.val);
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
            }

            ans.add(tmp);
        }
        return ans;
    }
}
