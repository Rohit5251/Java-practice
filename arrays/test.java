

/**
 * test
 */
public class test {
    public static int i=0;

    public static boolean Check(int nums[]){
        if(i==nums.length-1){
            //System.out.println(i);
            return true;
        }

        if(nums[i]>nums[i+1]){
            //System.out.println(i);
            return false;
        }

        i=i+1;
        return Check(nums);
    }

    public static int maxc=Integer.MIN_VALUE;
    public static int c=0;
    public static int findMaxConsecutiveOnes(int[] nums) {
        if(i==nums.length){
            return maxc;
        }

        if(nums[i]!=1){
            c=0;
            i=i+1;
            return findMaxConsecutiveOnes(nums);
        }

        c=c+1;
        maxc=Math.max(maxc, c);
        i=i+1;
        return findMaxConsecutiveOnes(nums);
    }

    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}