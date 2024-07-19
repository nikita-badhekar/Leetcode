/*
Intuition
Creating boolean array of length of original array and storing elements in it . Then checking if value is already in an array then return num else return 0.

Approach
Step 1 : Initialization: A boolean array val is created with the same length as the input array nums. This boolean array is used to keep track of whether a number has been encountered before.

Step 2 : Iteration: The code iterates through each number in the nums array:

Step 3 : If the number has been seen before (i.e., val[num] is true), it returns the number as the duplicate.
Otherwise, it marks the number as seen by setting val[num] to true.

Step 4 : Return Statement: If no duplicate is found (although the problem guarantees there is one), the method returns 0. However, in the context of the problem, this line should not be reached.

Complexity
Time complexity: O(N)

*/

class Solution {
    public int findDuplicate(int[] nums) {
        boolean val[] = new boolean[nums.length];
        for(int num : nums){
            if(val[num]){
                return num;
            }
            val[num] = true;
        }
        return 0;
    }
}
