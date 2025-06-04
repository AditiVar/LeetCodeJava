class Solution {
    public int minimumPairRemoval(int[] nums) {
        int noOfOperations=0;
        while(true){
            if(isSorted(nums)){
                return noOfOperations;
            }
            else{
                int []sums=new int[nums.length-1];
                for(int i=0;i<(nums.length-1);i++){
                    sums[i]=nums[i]+nums[i+1];
                }
                int small=sums[0];
                int small_ind=0;
                for(int i=1;i<sums.length;i++){
                    if(sums[i]<small){
                        small=sums[i];
                        small_ind=i;
                        // System.out.println(small+" "+ small_ind);
                    }
                }
                int []new_num=new int[nums.length-1];
                for(int i=0;i<(small_ind);i++){
                    new_num[i]=nums[i];
                }
                new_num[small_ind]=nums[small_ind]+nums[small_ind+1];
                for(int i=(small_ind+2);i<nums.length;i++){
                    new_num[i-1]=nums[i];
                }
                noOfOperations++;
                nums=new_num.clone();
                // for(int i=0;i<nums.length;i++){
                //     System.out.print(nums[i]);
                // }
                // System.out.println();
            }
        }
    }
    public boolean isSorted(int[] nums){
        int []sorted=nums.clone();
        Arrays.sort(sorted);
        return Arrays.equals(nums, sorted);
    }
}