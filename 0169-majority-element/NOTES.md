}else{
count--;
}
}
int count1=0;
for(int i=0;i<n;i++){
if(nums[i]==el) count1++;
}
if(count1>=n/2) return el;
return -1;
}
}
​
This code provided implements Moore's Voting Algorithm to find the majority element in an array. This algorithm runs in O(n) time and uses O(1) space, which is more efficient than using a HashMap.
​
**Explanation:**
**Initialization:**
​
**count:** A variable to track the number of occurrences of the potential majority element.
**n:**  The length of the array nums.
**el:** A variable to store the current candidate for the majority element, initialized with the first element of the array (nums[0]).
**First loop (Finding the candidate):**
​
This loop iterates through the array to find a potential majority element.
If count is 0, it assigns the current element (nums[i]) as the new candidate (el).
If the current element matches the candidate (el), the count is incremented.
If it doesn’t match, the count is decremented.
This process ensures that the majority element, if it exists, will be the final value of el after the loop finishes.
​
**Second loop (Validation):**
​
This loop counts the occurrences of the candidate (el) in the array.
The count is stored in count1.
Final check:
​
After counting the occurrences of el, the algorithm checks if count1 is greater than or equal to n / 2. If true, el is returned as the majority element.
If no majority element is found, the method returns -1.