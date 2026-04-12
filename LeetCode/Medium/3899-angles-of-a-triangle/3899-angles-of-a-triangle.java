class Solution {
    public double[] internalAngles(int[] s) {
        if(s[0]<s[1]+s[2] && s[1]<s[0]+s[2] && s[2]<s[0]+s[1]){
           // Use Law of Cosines
            double cosa=(s[1]*s[1]+s[2]*s[2]-s[0]*s[0])/(2.0*s[1]*s[2]);
            double cosb=(s[0]*s[0]+s[2]*s[2]-s[1]*s[1])/(2.0*s[0]*s[2]);
            double cosc=(s[0]*s[0]+s[1]*s[1]-s[2]*s[2])/(2.0*s[0]*s[1]);

            double a=Math.toDegrees(Math.acos(cosa));
            double b=Math.toDegrees(Math.acos(cosb));
            double c=Math.toDegrees(Math.acos(cosc));

            double[] ans={a,b,c};
            Arrays.sort(ans);
            return ans;
        }
        else return new double[]{};
    }
}