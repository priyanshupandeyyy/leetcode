class Solution {
     public int lHist(int[] h) {
        Stack<Integer>st = new Stack<>();
        int nse,pse,ele;
        int n=h.length;
        int area=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& h[st.peek()]>h[i]){
                ele=st.peek();
                st.pop();
                nse=i;
                pse=st.isEmpty()? -1:st.peek();
                area=Math.max(h[ele]*(nse-pse-1),area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ele=st.peek();
            st.pop();
            nse=n;
            pse=st.isEmpty()? -1:st.peek();
            area=Math.max(h[ele]*(nse-pse-1),area);
        }
        return area;
     }
    public int maximalRectangle(char[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int marea=0;
        int[] psum = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]=='1')psum[j]+=1;
                else psum[j]=0;
            }
            marea=Math.max(marea,lHist(psum));
        }
        return marea;
    }
}