# Cracking-The-Coding-Interview---Solutions
My own solutions to Cracking the Coding Interview by Gayle Laakmann

## Journal on My Thoughts : 

### Exercise 1.1

I remember quite a few months ago that I was having a bit of trouble completing the **IsUnique** exercise. In fact, that was the only exercise that I did NOT complete it on my own but instead I referred to Gayle Laakmann's answer. Her implementation on using the ascii array to achieve O(n) time instead of O(n^2) sparked that "Ah-ha!" moment that I reused it in exercise **1.4 - PalindromePermutation**.

### Exercise 1.4

This is an interesting challenge that gets my brain juice flowing. While a palindrome string is easy to understand and find, a permutation of a palindrome string introduces a little twist to the normal palindrome problem.

Firstly, I think we should define what it means for a string to be a palindrome: A palindrome string is spelled the same forwards as it is backwards. Therefore, words like *nursesrun* and *racecar* are both palindromes.

For a normal palindrome problem, we can use a for loop and divide the number of iterations equal to half the length of the palindrome word and do a check if the character in front corresponds to the character at the back. If the palindrome is at an odd length, the last character in the middle is left out. If it is not, it is consumed by the algorithm.

For example:

>1st iteration:
>[n]ursesru[n]

>2nd iteration:
>[nu]rsesr[un]

>3rd iteration:
>[nur]ses[run]

>4th iteration:
>[nurs]e[srun]

Since the character in the middle has no other remaining characters to compare to and all other characters are matched evenly, then this is considered a palindrome.

However, in this scenario, such implementation is not viable as the strings that we are given may not necessarily be in arranged palindrome order. I used a random example as a starting point of what other criterias a palindrome word might consist:

>1. Lets say we are given the string:                       "aaaaabbbbb"
>2. If we try to make a palindrome out of it:               "ababababab"
>3. If we reverse it:                                       "bababababa"

In the above example, 5a's and 5b's is *not* considered a palindrome as *2* is different than *3*

>1. Now lets say that we are given the string:               "aaaaaabbbbb"
>2. If we try to make a palindrome out of it:                "abababababa"
>3. If we reverse it:                                        "abababababa"

In this case, 6a's and 5b's *is* considered a palindrome as they spelled are the same forwards as they are backwards.
Lets test this with more examples:

>1. Now lets say that we are given the string:               "aabb"
>2. If we try to make a palindrome out of it:                "abba"
>3. If we reverse it:                                        "abba"

2a's and 2b's is also considered a palindrome.

A recurring pattern one may notice is that a palindrome - regardless of whether the total length of the string is odd or even - can only consist of 1 or none odd counts of a character as seen in the 2nd and 3rd example. Try to visualize other examples using this rule and you can see that it makes sense ;)

### Exercise 1.7

This was a hard one. I took the time to come up with 2 solutions to the problem, although none of them any better than O(n^2) time: 

In the first one, I went with the idea that I am able to convert both the corresponding columns and rows into 0 as I iterate through the matrix elements. This does not work well as I had intended as it ultimately converts all other elements to 0 after the first one.

Eg:

```2  4  3  1
3  1  2  1
1  4  1  3
1  2  4  1
1  0  1  0```

Into:

```2  0  0  0
3  0  0  0
1  0  0  0
1  0  0  0
0  0 [0] 0```

Instead of:

>2  0  3  0
>3  0  2  0
>1  0  1  0
>1  0  4  0
>0  0  0  0

In the second approach, I figured that the algorithm must loop through all the elements of the matrix at least once to determine the positions of where elements have a 0 value. I then store row and column positions into a stack (I intend to use queue but I don't think Java has one as far as I know and the FIFO and LIFO order doesn't really matter anyway) as it is much easier to iterate and pop individual elements of the stack (or queue) as compared to an ArrayList (which I did try but failed because it cannot easily reduce its size as compared to a List-type data structure). So I created 2 stacks, one to store row and one to store column and ultimately convert those elements perpendicular to these elements into 0.
