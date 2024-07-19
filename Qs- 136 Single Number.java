/* XOR operation 
return number occured only once
[2 2 1]  === >  2 ^ 2 = 0
[0 1] ===> 0 ^ 1 = 1(Output)
*/


class Solution {
    public int singleNumber(int[] nums) {
        int sum = nums[0];
        for(int i=1 ; i<nums.length; i++){
            sum = sum ^ nums[i];
        }
        return sum;
    }
}
