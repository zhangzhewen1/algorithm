package org.zhangzhewen.algorithm.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述
 *
 * @author zhangzhewen
 * @date 2019/5/20
 */
public class BFS {

    public static void bfs2() {
        TreeNode root = TreeNode.buildTrees();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            TreeNode t = q.poll();
            System.out.println(t.val);
            if(t.children!=null){
                for(TreeNode t2 : t.children){
                    q.add(t2);
                }
            }
        }
    }

    public static void bfs() {
        TreeNode root = TreeNode.buildTrees();
    }


    public static void main(String[] args) {
        bfs();
    }











































}
