int s=ans.size();
int[][] ansArr=new int[s][2];
for(int i=0;i<s;i++){
ansArr[i]=ans.get(i);
}
return ansArr;
}
}
​
**Approach**
The strategy to solve this problem is as follows:
​
Sort the intervals: First, we sort the intervals based on their start times. This ensures that intervals that might overlap are adjacent.
​
Traverse through intervals:
​
1. Initialize an empty list ans to store the merged intervals.
2. For each interval, check if it overlaps with the last interval added to the result list ans.
2.a. If the current interval does not overlap with the last interval in the list (i.e., its start is greater than the end of the last interval), simply add it to the list.
2.b. If it overlaps, merge the intervals by updating the end time of the last interval in the list to the maximum end time between the two intervals.
3. Return the merged intervals: Finally, convert the list ans into a 2D array and return it.