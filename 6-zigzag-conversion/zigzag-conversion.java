class Solution {
    public String convert(String s, int numRows) {
        String result="";
        if(numRows==0){
            result="";
        }
        else if(numRows == 1 || s.length()<numRows){
            result=s;
        }
        else{
            String[] s1=new String[numRows];
            for(int i=0;i<(numRows-1);i++){
                s1[i]="";
                int mult=2;
                s1[i]=s1[i]+s.charAt(i);
                // System.out.println(s[i]);
                int index=((numRows-1)*mult)-i;
                while(index<s.length()){
                    s1[i]=s1[i]+s.charAt(index);
                    if(i!=0 && i!=(numRows-1)){
                        index=index+2*i;
                        if(index<s.length()){
                            s1[i]=s1[i]+s.charAt(index);
                        }
                    }
                    mult+=2;
                    index=((numRows-1)*mult)-i;
                }
                result+=s1[i];
                // System.out.println(result);
            }
            int mult=1;
            int index=numRows-1;
            s1[numRows-1]="";
            while(index<s.length()){
                s1[numRows-1]=s1[numRows-1]+s.charAt(index);
                mult+=2;
                index=((numRows-1)*mult);
            }
            result+=s1[numRows-1];
            // System.out.println(result);
        }
        return result;
    }
}