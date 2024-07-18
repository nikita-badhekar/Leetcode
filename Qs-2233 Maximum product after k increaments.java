/*
2233 - Maximum product after k increaments
Approach

Increamenting 1 in a smallest element of array. for example 
nums[] = [0,4]
if we increamenting in smallest element then only we can get maximum product in 0 and 4 . 
0 is smallest increament by 4 so nums= [1,4]. 
1 is smallest increament by 4 so nums= [2,4].
2 is smallest increament by 4 so nums= [3,4].
3 is smallest increament by 4 so nums= [4,4].
4 is equal to 4 so increament any 4 nums= [5,4]. product = 20

Step 1 :Using Priority Queue going to use this approach. As the property of priority queue is to get smallest element everytime when we pop.
Step 2 : Adding elements to priority queue.
Step 3 : Increament top element by 1 by using poll() method removes the element at the front end of the container. It deletes the element in the container. then add modified top.
Step 4 : In result variable store product until priority queue is empty.
step 5 : Return Result
*/

class Solution {
    public int maximumProduct(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        for (int num : nums)    pq.add(num);
        
        while (k-->0) {
            int top = pq.poll() + 1 ;
            pq.add(top);
        }

        long res = 1;
        while (!pq.isEmpty()) {
            res = (res*pq.poll()) % 1000000007;
        }

        return (int)(res);
    
    }

}
