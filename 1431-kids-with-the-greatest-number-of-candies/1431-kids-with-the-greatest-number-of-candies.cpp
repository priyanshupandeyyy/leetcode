class Solution {
public:
        vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
     int maxCandies = *max_element(candies.begin(), candies.end());
        
        // Step 2: Initialize the result vector
        vector<bool> result;
        
        // Step 3: Check if each kid can have the maximum candies with extraCandies
        for (int i = 0; i < candies.size(); i++) {
            // If the current kid's candies plus extraCandies are at least maxCandies, push tr
            if (candies[i] + extraCandies >= maxCandies) {
                result.push_back(true);
            } else {
                result.push_back(false);
            }
        }

        return result;
    }
};