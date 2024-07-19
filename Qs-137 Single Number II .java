/*
Approach
Step 1 : Map Initialization: A HashMap named map is created to store the integers from the array as keys and their counts as values.

Map<Integer, Integer> map = new HashMap<>();
Step 2 : Counting Occurrences:
The for loop iterates through each integer x in the nums array.
For each integer, the map updates its count. If the integer is already in the map, its count is incremented by 1 -- otherwise, the integer is added to the map with an initial count of 1.

for (int x : nums) {
    map.put(x, map.getOrDefault(x, 0) + 1);
}
Step 3 : Finding the Single Occurrence:
Another for loop iterates through each entry in the map.

for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() == 1) {
        return entry.getKey();
    }
}
If an entry (key-value pair) is found where the value (count) is 1, the method returns the key (the integer that appears only once).

Step 4 : Return Default Value:
If no integer in the array has a count of exactly 1, the method returns -1.

return -1;
*/

class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }
}
// 1. map initialze
// 2. put each element in map
// 3. iterate throgh for and return element when cound of key occurs is 1
// else return -1
