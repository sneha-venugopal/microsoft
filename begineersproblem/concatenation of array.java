class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr=new int[nums.length*2];
        int i=0;
        int j=0;
        while(i<nums.length)
        {
            arr[i]=nums[i];
            i++;
        }
        j=i;
        for(int ind=0;ind<nums.length;ind++)
        {
            arr[j]=nums[ind];
            j++;
        }
        return arr;
    }
}
