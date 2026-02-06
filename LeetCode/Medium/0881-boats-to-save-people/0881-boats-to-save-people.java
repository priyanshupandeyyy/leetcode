class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,r=people.length-1;
        int c=0;
        while(i<=r){
            if(people[i]+people[r]<=limit){
                c++;
                i++;
                r--;
            }
            else{
                r--;
                c++;
            } 
        }
        return c;
    }
}