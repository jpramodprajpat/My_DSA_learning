package Tony_Stark;
public class Koko_Eating_bananas {
    class Solution
    {
        public boolean isPossible(int speed, int[] arr, int h){
            long totalTime = 0;  // 🛠 Use long
            for (int bananas : arr){
                totalTime += (bananas + speed - 1L) / speed; //🛠 Add 1L to make it long math
                // ⏱ Early exit for optimization
                if (totalTime > h) return false;
            }
            return totalTime <= h;
        }

        public int minEatingSpeed(int[] piles, int h)
        {
            int n = piles.length;

            // find the minimun
            int max = Integer.MIN_VALUE;
            for(int i = 0; i<n ; i++) max = Math.max(max,piles[i]);

            int lo = 1 , hi = max , ans = 0;
            while(lo<=hi)
            {
                int mid = lo + (hi-lo)/2;
                if(isPossible(mid,piles,h))
                {
                    ans = mid;
                    hi = mid-1;
                }else lo = mid+1;
            }
            return ans;
        }
    }
}
