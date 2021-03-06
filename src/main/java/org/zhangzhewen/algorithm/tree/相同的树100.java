package org.zhangzhewen.algorithm.tree;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 * 示例 2:
 *
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * 输出: false
 * 示例 3:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * 输出: false
 *
 *
 *
 * @author zhangzhewen
 * @date 2020/9/14
 */
public class 相同的树100 {

    public static void main(String[] args) {
        new 相同的树100().isSameTree(new TreeNode(1,
                        new TreeNode(2,
                                null,
                                null
                        )
                        ,
                        null
                ),
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                null,
                                null
                        )
                )
        );
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        else if(p==null||q==null){
            return false;
        }
        else if(p.val == q.val){
            return true;
        }
        else if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
