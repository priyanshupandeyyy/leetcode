class Solution {
    public String reverseWords(String s) {
        String a =s.trim();
        Stack<Character>st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        while(i>=0){
            char x=a.charAt(i);
            while(x!=' '&&i>=0){
                st.push(x);
                i--;
                if(i>=0) x=a.charAt(i);
            }
            while(st.size()!=0){
                sb.append(st.pop());
            }
            while (i >= 0 && a.charAt(i) == ' ') {
                i--;
            }
            if(i>=0)sb.append(' ');
        }
        return sb.toString();
    }
}