class Solution {
    public double angleClock(int hour, int minutes) {
        double mindegree=minutes*6;
        if(hour==12)hour=0;

        double hrdegree=hour*30+(double)minutes/2;
        double ans= Math.abs(mindegree-hrdegree);
        if(ans>180)ans=360-ans;
        return ans;
    }
}