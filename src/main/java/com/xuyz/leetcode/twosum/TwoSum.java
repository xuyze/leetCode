/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TwoSum
 * Author:   xuyz
 * Date:     2018/11/4 21:43
 * Description: 两数之和
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xuyz.leetcode.twosum;

/**
 * 〈一句话功能简述〉<br> 
 * 〈两数之和〉
 *
 * @author xuyz
 * @create 2018/11/4
 * @since 1.0.0
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //Map<Integer,Integer> map = new HashMap<Integer, Integer>();
//        for(int i = 0;i<nums.length;i++){
//            map.put(nums[i],i);
//        }
        //int[] nnums = bubbleSort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j = nums.length-1;j>i;j--){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    private static int[] bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {        // 相邻元素两两对比
                    int temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums,6);
        System.out.print(result[0]);
        System.out.print(result[1]);
    }
}
