# RTS_Labs_Molly

Hey there! 

My name is Kishan Shah.

Hope you are doing well.

Please find all 3 exercise questions below.


(1) Print the number of integers in an array that are above the given input and the number that are below, e.g. for the array [1, 5, 2, 1, 10] with input 6, print “above: 1, below: 4”.

<-- Ans -->
For this question, first of all we need to check every element in the array for its value. So, can't get better time complexity than O(n).
Plus, we are not checking for distinct values. So, no need to use set collection for the unique values or sort the array to eliminate duplicates.
So, the thinking process of this is like, run through whole array and keep 2 counter variables while doing it for the above and below values.
Then we need to check that our current checking element is equal to the input value or not.
And if it is equal to the input value, then we don't increment any counters.
Otherwise we check that whether it is grater than or less than of our input value and increment the respective counter for it.

For the input, I just gave static values, but we can do it dynamically as well. Mostly using scanner.
Please find the Java code in the same repository. 


(2) 




