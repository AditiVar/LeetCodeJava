class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int res=0;
        int small_ind=0;
        int small=Integer.MAX_VALUE;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    System.out.println("Fruits : "+fruits[i]+" is assigned to basket : "+baskets[j]);
                    baskets[j]=-1;
                    break;
                }
                if(j==(baskets.length-1) && baskets[j]<fruits[i]){
                    res++;
                }
            }
        }
        return res;
    }
}