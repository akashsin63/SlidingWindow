public class longestSubarray {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,0,1,0};

        System.out.println(longestSubarr(nums));
    }
    public static  int longestSubarr(int[] nums) {
       int n = nums.length;

        int i =0, j =0, nzi = 0;

        int max = 0;

        boolean zero = false;
        while (j < n) {

            
            if (nums[j] == 0 && !zero) {
                zero = true;
                nzi = j + 1;
            }
           
            else if (nums[j] == 0 && zero) {
                zero = false;
                j--;
                max = Math.max(j - i, max);
                i = nzi;
            }
            j++;
        }

       
        return Math.max(j-i - 1, max); 
    }
}
