class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<ast.length;i++){
            if(ast[i]>0) st.push(ast[i]);
            else{
                while(!st.isEmpty()&& st.peek()>0 && st.peek()<-ast[i]){
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0){
                    st.push(ast[i]);
                }
                if(st.peek()==-ast[i]){
                    st.pop();
                }
            }
        }
        int ans[] = new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            ans[i]=st.pop();
            i--;
        }
        return ans;
    }
}