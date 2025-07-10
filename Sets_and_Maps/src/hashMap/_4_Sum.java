package hashMap;
import java.util.*;
public class _4_Sum {
    class Solution {

        /*
        // i => 0 --> n-1 (First)
        // j => i+1 --> n-1 (Second)
        // front<back --=> front => j+1 and back => n-1 ( Two Pointers ) (third and forth)
        */
        public List<List<Integer>> fourSum(int[] arr, int target) {
            List<List<Integer>> res = new ArrayList<>();
            int n = arr.length;
            if (n < 4) return res;
            Arrays.sort(arr);

            for(int i = 0 ; i<n-3; i++){
                for(int j = i+1; j<n-2 ; j++)
                {
                    long target_2 = (long)target - arr[i] - arr[j];
                    int front = j+1;
                    int back = n-1;
                    while(front<back){
                        long two_sum = (long)arr[front] + arr[back];
                        if(two_sum < target_2) front++;
                        else if (two_sum > target_2) back--;
                        else{
                            List<Integer> quad = new ArrayList<>();
                            quad.add(arr[i]);
                            quad.add(arr[j]);
                            quad.add(arr[front]);
                            quad.add(arr[back]);
                            res.add(quad);

                            // Prosseing duplicate for number 3
                            while(front<back && arr[front] == quad.get(2) ) front++;

                            // Prossing duplicates for number 4
                            while(front<back && arr[back] == quad.get(3) ) back--;
                        }
                    }
                    // Prosseing duplicate for number 2
                    while(j<n-1 && arr[j]==arr[j+1]) j++;

                }
                // Prosseing duplicate for number 1
                while(i<n-1 && arr[i]==arr[i+1]) i++;
            }
            return res;
        }
    }
    // TC : O(n^3)
}
