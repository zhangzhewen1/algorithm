package org.zhangzhewen.algorithm.sort;

public abstract class Sortable {
    abstract int[] sort(int[] a);
    protected void print(){
        for(int e : sort(new int[]{301,3 ,5,7, 4, 2,23})){
            System.out.print(e+" ");
        }
    }
    protected void swap(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}


/*
    平均时间复杂度     最好情况    最坏情况    空间复杂度   排序方式    稳定性
冒泡
选择
插入
希尔
归并
快速
推
计数
桶
基数
*/