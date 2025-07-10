import java.util.HashSet;
/*You are given an array nums consisting of positive integers.
You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.
Return the number of distinct integers in the final array.*/
public class _03_leetcode_2442
{
    public int reverse(int num){
        int rev = 0;
        while(num!=0){
            rev = rev*10 + num%10;
            num = num/10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums) {
            set.add(ele);
            set.add(reverse(ele));
        }
        return set.size();
    }
}
