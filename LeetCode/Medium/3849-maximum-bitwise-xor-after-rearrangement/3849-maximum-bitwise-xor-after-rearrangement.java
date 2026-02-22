class Solution {
    public String maximumXor(String s, String t) {
        StringBuilder sb=new StringBuilder();
        int zero=0,one=0;
        for(int i=0;i<t.length();i++){
            char a=t.charAt(i);
            if(a=='0')zero++;
            else one++;
        }
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='0' && one!=0){
                sb.append('1');
                one--;
            }
            else if(a=='1' && zero!=0){
                sb.append('0');
                zero--;
            }
            else{
                sb.append(a);
                if(a=='0')zero--;
                else one--;
            }
        }
        StringBuilder ans=new StringBuilder();
        String x=sb.toString();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            char b=x.charAt(i);
            if(a==b)ans.append('0');
            else ans.append('1');
        }
        return ans.toString();
    }
}