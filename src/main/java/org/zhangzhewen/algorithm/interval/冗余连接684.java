package org.zhangzhewen.algorithm.interval;

/**
 * 冗余连接684
 * <p>
 * 在本问题中, 树指的是一个连通且无环的无向图。
 * <p>
 * 输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。
 * <p>
 * 结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v] ，满足 u < v，表示连接顶点u 和v的无向图的边。
 * <p>
 * 返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边 [u, v] 应满足相同的格式 u < v。
 * <p>
 * 示例 1：
 * <p>
 * 输入: [[1,2], [1,3], [2,3]]
 * 输出: [2,3]
 * 解释: 给定的无向图为:
 * 1
 * / \
 * 2 - 3
 * 示例 2：
 * <p>
 * 输入: [[1,2], [2,3], [3,4], [1,4], [1,5]]
 * 输出: [1,4]
 * 解释: 给定的无向图为:
 * 5 - 1 - 2
 * |   |
 * 4 - 3
 * 注意:
 * <p>
 * 输入的二维数组大小在 3 到 1000。
 * 二维数组中的整数在1到N之间，其中N是输入数组的大小。
 *
 * @author zhangzhewen
 * @date 2020/11/4
 */
public class 冗余连接684 {

    public static void main(String[] args) {
//        new 冗余连接684().findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}});
//        new 冗余连接684().findRedundantConnection(new int[][]{{1, 3}, {3, 4}, {1, 5}, {3, 5}, {2, 3}});
        new 冗余连接684().findRedundantConnection(new int[][]{{1, 4}, {3, 4}, {1, 3}, {1, 2}, {4, 5}});
    }

    static class UnionFind {
        int[] data;
        int[] res;

        public UnionFind(int[][] edges) {
            data = new int[edges.length + 1];
            for (int i = 0; i < edges.length; i++) {
                data[i] = i;
            }
        }

        public boolean union(int a, int b) {
            int rootA = findRoot(a);
            int rootB = findRoot(b);
            if (rootA == rootB) {
                return false;
            }
            data[rootA] = rootB;
            return true;
        }

        public int findRoot(int i) {
            if (data[i] != i) {
                data[i] = findRoot(data[i]);
            }
            return data[i];
        }
    }

    public int[] findRedundantConnection(int[][] edges) {
        UnionFind u = new UnionFind(edges);
        for (int i = 0; i < edges.length; i++) {
            if (!u.union(edges[i][0], edges[i][1])) {
                return new int[]{edges[i][0], edges[i][1]};
            }
        }
        return u.res;
    }

}
