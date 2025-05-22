class Solution {
     public int totalNumbers(int[] digits) {
        HashSet<Integer> set = new HashSet<>();
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;
                    if (digits[k] % 2 == 0) {
                        int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                        set.add(number);
                    }
                }
            }
        }
        return set.size();
    }
    // public int totalNumbers(int[] digits) {
    //     int even_no=0;
    //     int zeroes=0;
    //     Arrays.sort(digits);
    //     for(int i=0;i<digits.length;i++){
    //         if(digits[i]==0){
    //             zeroes+=1;
    //         }
    //         else if(digits[i]%2==0){
    //             even_no+=1;
    //         }
    //     }
    //     int div=1;
    //     for(int i=0;i<digits.length;){
    //         int temp=digits[i];
    //         int count=0;
    //         while(true){
    //             if((i+1)>=digits.length){
    //                 break;
    //             }

    //             if(temp==digits[i+1]){
    //                 if(count==0){
    //                     count+=2;
    //                 }
    //                 else{
    //                     count++;
    //                 }
    //                 i++;
    //             }
    //             else{
    //                 i++;
    //                 break;
    //             }
    //         }
    //         if(count>0){
    //             div*=facto(count);
    //         }
    //         if((i+1)>=digits.length){
    //             break;
    //         }
    //     }
    //     int total=0;
    //     if(zeroes==1){
    //         total=((((digits.length-1)*(digits.length-2))/div)+((even_no*(digits.length-1-zeroes)*(digits.length-2))/div));
    //     }
    //     else if(zeroes>1){
    //         total=(((zeroes*(digits.length-zeroes)*(digits.length-2))/div)+((even_no*(digits.length-1-zeroes)*(digits.length-2))/div));
    //     }
    //     else{
    //         total=(even_no*(digits.length-1)*(digits.length-2))/div;
    //     }
    //     return total;
    // }
    // int facto(int no){
    //     if(no==1 || no==0){
    //         return 1;
    //     }
    //     else{
    //         return no*facto(no-1);
    //     }
    // }
}