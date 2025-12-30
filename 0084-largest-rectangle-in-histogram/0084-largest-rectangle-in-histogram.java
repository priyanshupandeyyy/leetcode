class Solution {
    public int largestRectangleArea(int[] h) {
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
}