package com.gmail.skywitty92.lintcode;

import javax.swing.tree.TreeNode;

/**
 * @Description TODO judge a binary tree is balanced or not.
 * @Author Gunther Meng
 * @Version 1.0
 */
public class BalancedBinaryTree {
        boolean isBalanced = true;
        /**
         * @param root: The root of binary tree.
         * @return: True if this Binary tree is Balanced, or false.
         */
        public boolean isBalanced(TreeNode root) {
            // write your code here
            getDepth(root);
            return isBalanced;
        }

        public int getDepth(TreeNode root) {
            if(!isBalanced)return 0;
            if(root == null) {
                return 0;
            }
            int left = getDepth(root.left);//左子树
            int right = getDepth(root.right);//右子树
            int depth = (left > right ? left : right) + 1;
            if(isBalanced && Math.abs(left - right) > 1) {
                isBalanced = false;
            }
            return depth;
        }


        class TreeNode {
             public int val;
             public TreeNode left, right;
             public TreeNode(int val) {
                 this.val = val;
                 this.left = this.right = null;
             }
        }


}
