package slidingwindow;

import java.util.ArrayDeque;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            //Remove elements out of the current window if it's lesser than previous ones
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekFirst()]){
                deque.pollFirst();
            }
            //Add element to the deque
            deque.addLast(i);
            //Remove from front if out of window
            if(deque.peekFirst() <= i - k){
                deque.pollFirst();
            }
            //Add to result if we have a valid window
            if(i >= k - 1){
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
