// 1481. Least Number of Unique Integers after K Removals
// Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.

 

// Example 1:

// Input: arr = [5,5,4], k = 1
// Output: 1
// Explanation: Remove the single 4, only 5 is left.
// Example 2:
// Input: arr = [4,3,1,1,3,3,2], k = 3
// Output: 2
// Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
                Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        List<Integer> frequencies = new ArrayList<>(map.values());       // List to track all the frequencies
        Collections.sort(frequencies);                 // Sorting the frequencies
      
        int elementsRemoved = 0;                // Tracking the number of elements removed
        for (int i = 0; i < frequencies.size(); i++) {
            // Removing frequencies[i] elements, which equates to
            // removing one unique element
            elementsRemoved += frequencies.get(i);

            // If the number of elements removed exceeds k, return
            // the remaining number of unique elements
            if (elementsRemoved > k) {
                return frequencies.size() - i;
            }
        }

        // We have removed all elements, so no unique integers remain
        // Return 0 in this case
        return 0;
    }
}
