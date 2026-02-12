class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<ast.length;i++){
            if(ast[i]>0){
                st.push(ast[i]);
            }
            else{
                while(!st.isEmpty()&&st.peek()>0 && -ast[i]>st.peek()){
                    st.pop();
                }
                if(st.isEmpty()|| st.peek()<0) st.push(ast[i]);
                if(-ast[i]==st.peek()){
                    st.pop();
                }

            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            if(!st.isEmpty()){
            ans[i]=st.peek();
            st.pop();
            }
        }
        return ans;
    }
}