class Solution {
    public int smallestIndex(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int div=nums[i];
            while(div>0){
                if(div<10){
                    sum+=div;
                    break;
                }
                else{
                    sum+=div%10;
                    div=div/10;
                }
            }
            if(sum==i){
                return i;
            }
            else{
                flag++;
            }
        }
        if(flag==nums.length){
            return -1;
        }
        return 0;
    }
}