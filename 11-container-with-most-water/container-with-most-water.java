class Solution {
    public int maxArea(int[] height) {
        int result=0;
        int left=0;
        int right=height.length-1;
        while(left!=right){
            int area=(height[left]<height[right]?height[left]:height[right])*(right-left);
            result=result<area?area:result;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        } 
        return result;  
    }
}