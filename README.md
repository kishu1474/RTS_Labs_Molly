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


(2) Rotate the characters in a string by a given input and have the overflow appear at the beginning, e.g. “MyString” rotated by 2 is “ngMyStri”.

<-- Ans -->
For this question, we just need to detach the last 'input value' characters from the string and append that in the front of the string.
Because, ultimately, we are doing the right rotation. And for that we need to rotate 'input value' characters and append them in the front.
So, insted of running the loop for 'input value' times, we can just cut and paste the substring.

Again for the input, we can use user input, but I did with static input for the demonstration. 
Please find the Java code in the same repository.


(3) If you could change 1 thing about your favorite framework/language/platform (pick one), what would it be?

<-- Ans -->
This is a nice one. 
For me, I appreciate the framework concept that we have in software world. It just makes things easy for us to develop new creative stuff. And frameworks keep changing by themselves as well.
So, my vote for this question would go for the language.
I just love Java. And they added pretty awesome features in Java 8 update and many of them were already introduced in other languages as well.
So, Java is also evolving to sustain its place in this modern software world.
But when we work with model classes in our applications, the main thing that I don't like is to generate getters and setters for all private variables.
It is true that Java provides us the generator feature so we don't need to write them by our own. But it is obvious that we have to implement getters and setters for private variables. So, why not just include this property in-built by default for every private variable!
Because the thing is, when we work on a project in real world, model class might have 30-40 variables. And to generate getters and setters for them will create a lot of lines of code for just a single model class!

So, basically, I would love to see this change in the future updates.


Thank you for reading.



