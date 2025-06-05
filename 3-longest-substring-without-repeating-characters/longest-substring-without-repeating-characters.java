class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")){
            return 0;
        }
        else if(s != null && s.trim().isEmpty()){
            return 1;
        }
        Set<Character> uniqueChars = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                uniqueChars.add(c);
            }
        }
        int unique_no=uniqueChars.size();
        uniqueChars.clear();
        boolean test=true;
        int index=0;
        int[] all=new int[s.length()];
        while (index!=s.length()){
            int count=0;
            for(int i=index;i<s.length();i++){
                int previous_length=uniqueChars.size();
                uniqueChars.add(s.charAt(i));
                if(previous_length<uniqueChars.size()){
                    count++;
                }
                else{
                    if(count==unique_no){
                        if(s.contains(" ")){
                            count+=1;
                        }
                        return count;
                    }
                    all[index]=count;
                    index++;
                    uniqueChars.clear();
                    break;
                }

                if(i==(s.length()-1)){
                    if(count>unique_no){
                        return count;
                    }
                    all[index]=count;
                    index++;
                    uniqueChars.clear();
                }
            }
            if(count==unique_no){
                return count;
            }
        }
        int max=all[0];
        for(int i=1;i<all.length;i++){
            if(all[i]>max){
                max=all[i];
            }
        } 
        if(s.contains(" ")){
            max+=1;
        }
        return max;
        // if(all.length>0){
        //     int max=all[0];
        //     for(int i=1;i<all.length;i++){
        //         if(all[i]>max){
        //             max=all[i];
        //         }
        //     }
        //     return max;
        // }
        // return 0;
    }
}