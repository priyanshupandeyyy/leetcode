class Solution {
    private void Para(int n, List<String>ans,StringBuilder sb,int left,int right){
        if(left+right==2*n){
            ans.add(sb.toString());
            return;
        }

        if(left<n){
            sb.append('(');
            Para(n,ans,sb,left+1,right);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right<left){
            sb.append(')');
            Para(n,ans,sb,left,right+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        Para(n,ans,sb,0,0);
        return ans;
    }
}