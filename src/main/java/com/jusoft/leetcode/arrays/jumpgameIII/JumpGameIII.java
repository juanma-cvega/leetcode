package com.jusoft.leetcode.arrays.jumpgameIII;

import java.util.*;

public class JumpGameIII {

    //Recursive solution
    public boolean canReach(int[] nums, int index) {
        if (nums[index] == 0) {
            return true;
        }
        boolean[] visited = new boolean[nums.length];
        return doReach(nums, index, visited);
    }

    private boolean doReach(int[] nums, int index, boolean[] visited) {
        if (index > nums.length - 1 || index < 0 || visited[index]) {
            return false;
        }
        if (nums[index] == 0) {
            return true;
        } else {
            visited[index] = true;
            return doReach(nums, index + nums[index], visited) || doReach(nums, index - nums[index], visited);
        }
    }

    //Breadth first search solution
    public boolean bfs(int[] nums, int index) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        queue.add(index);
        while(!queue.isEmpty()) {
            Integer currentIndex = queue.remove();
            if (nums[currentIndex] == 0) {
                return true;
            }
            visited[currentIndex] = true;
            int rightSide = currentIndex + nums[currentIndex];
            if (rightSide < nums.length && !visited[rightSide]) {
                queue.add(rightSide);
            }
            int leftSide = currentIndex - nums[currentIndex];
            if (leftSide > -1 && !visited[leftSide]) {
                queue.add(leftSide);
            }
        }
        return false;
    }

    // Depth search first solution
    public boolean dfs(int[] nums, int index) {
        Deque<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[nums.length];
        queue.add(index);
        while(!queue.isEmpty()) {
            int currentIndex = queue.pop();
            if (nums[currentIndex] == 0) {
                return true;
            }
            visited[currentIndex] = true;
            int rightSide = currentIndex + nums[currentIndex];
            if (rightSide < nums.length && !visited[rightSide]) {
                queue.add(rightSide);
            }
            int leftSide = currentIndex - nums[currentIndex];
            if (leftSide > -1 && !visited[leftSide]) {
                queue.add(leftSide);
            }
        }
        return false;
    }
}
