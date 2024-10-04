package com.sgg.pool;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            for(int i = 0 ; i < nums.length; i ++) {
                if(map.containsKey(target - nums[i])){
                    return new int[] {map.get(nums[i]), i};
                }
                map.put(nums[i],i);
            }

            return new int[0];

        }
    }
}
