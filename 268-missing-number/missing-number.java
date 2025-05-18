class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        for(int i=0;i<=len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(i==nums[j])
                    break;
                else
                    count+=1;
            }
            if(count==len){
                return i;
            }
        }
        return 0;
    }
}