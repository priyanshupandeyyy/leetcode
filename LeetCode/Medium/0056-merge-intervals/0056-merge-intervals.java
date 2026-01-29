class Solution {
    public int[][] merge(int[][] arr) {
        List<List<Integer>>ans=new ArrayList<>();
        if(arr.length==1)return new int[][]{{arr[0][0], arr[0][1]}};

        Arrays.sort(arr,(x,y)->x[0]-y[0]);
        int b=arr[0][1];
        int a=arr[0][0];
        for(int i=0;i<arr.length-1;i++){
            if(b>=arr[i+1][0]){
                b=Math.max(b,arr[i+1][1]);
            }
            else{
                List<Integer>list=new ArrayList<>();
                list.add(a);
                list.add(b);
                ans.add(list);

                a=arr[i+1][0];
                b=arr[i+1][1];
            }  
        }
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        ans.add(list);

        int[][]merge=new int[ans.size()][2];
            for(int i=0;i<ans.size();i++){
                merge[i][0]=ans.get(i).get(0);
                merge[i][1]=ans.get(i).get(1);
            }
        return merge;
    }
}