int[] suffixMax=new int[n];
prefixMax[0]=height[0];
suffixMax[n-1]=height[n-1];
for(int i=1;i<n;i++){
prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
suffixMax[n-i-1]=Math.max(suffixMax[n-i],height[n-i-1]);
}
for(int i=0;i<n;i++){
int leftMax=prefixMax[i];
int rightMax=suffixMax[i];
if(height[i]<leftMax && height[i]<rightMax){
total+=Math.min(leftMax,rightMax)-height[i];
}
}
return total;
}
}
**Explanation**
This solution solves the Trapping Rain Water problem, where the goal is to determine how much water can be trapped between bars represented by an array of heights. The approach uses precomputed arrays for the maximum heights on both sides of each bar, allowing efficient calculation of the trapped water.
​
*Step 1: Initial Setup*
The first step is to initialize some variables: n is the length of the height array, total keeps track of the total amount of trapped water, and two arrays, prefixMax and suffixMax, are used to store the maximum height encountered from the left and right sides for each position. The prefixMax[0] is initialized to the first element of the height array, and suffixMax[n-1] is initialized to the last element.
​
*Step 2: Building prefixMax and suffixMax*
In the next phase, two for-loops are used to populate prefixMax and suffixMax. For prefixMax, the loop iterates from left to right, updating each element to be the maximum of the current height and the maximum value found so far on the left. Similarly, suffixMax is built by iterating from right to left, ensuring each element holds the maximum height to its right. These arrays allow us to easily find the maximum height on either side of each bar in constant time.
​
*Step 3: Calculating Trapped Water*
The third for-loop goes through each bar in the height array, calculating the amount of water trapped above it. For each bar at index i, the trapped water depends on the smaller of the prefixMax (left maximum) and suffixMax (right maximum) minus the height of the current bar. If both the left and right maximums are greater than the current bar, then water can be trapped, and the difference is added to the total.
​
*Final Step: Returning the Result*
After completing the loop, the total variable holds the total amount of trapped water, which is then returned.
​
*Time and Space Complexity*
The time complexity of the solution is O(n) because each element in the height array is processed in a few linear passes. The space complexity is O(n) as additional space is used for the prefixMax and suffixMax arrays.