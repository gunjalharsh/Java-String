
-----------------------PROBLEM STATEMENTS ON JAVA STRINGS---------------------
----------------------***********************************---------------------
1. Write a program which creates a String “Welcome to Java World” and perform 
the following 

i.	Returns the character at 5th position and display it.
ii.	Compare the above String with “Welcome” lexicographically ignoring
 case differences and display the result.
iii. Concatenates “- Let us learn” to the above string and display it.
iv.  Returns the position of the first occurrence of character ‘a’ and
 display it.
v.  Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
vi. Returns string between 4th position and 10th position and display it.
vii. Returns the lowercase of the string and display it
----------------------------------------------------------------------------

2.Write a program which creates a StringBuffer “This is StringBuffer” and
 performs the following. 

1.	Adds the string ”- This is a sample program” to existing string and 
	display it.
2.	Inserts the string “Object” into the existing string at 21st postion
	 and display it.
3.	Reverses the entire string and displays it.
4.	Replaces the word “Buffer” with “Builder” and display it.

---------------------------------------------------------------------------
3.Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. 
It parses the string with the delimiter as ‘\’ and displays the String in the
 following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE

Hint:  Use String Builder for concatenating the folder names with |.

---------------------------------------------------------------------------
4. Two input strings are accepted. If the two strings are of same length 
concat them and return, if they are not of same length, reduce the longer
 string to size of smaller one, and concat them

input1:"hello"
input2:"hi" 
output:"lohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"

-------------------------------------------------------------------
5. accept a string and find if it is of date format "dd/mm/yyyy".
input:01/13/2012
output:false

------------------------------------------------------------------
6. Find if a given pattern appears in both the input strings at same postions.
input1: "hh--ww--"
input2: "rt--er--"
output: true(false otherwise)
--------------------------------------------------------------------
7. Check whether a given string is palindrome also check whether it has
 atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
input: "reviver"
output: true(diff vowels)
input: "racecar"
output: true(diff vowels)
----------------------------------------------------------------------
8. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3

------------------------------------------------------------------------
9. Get a input string. Find if it is a negative number, if true return the
 absolute value, in other cases return -1.
input: "-123"
output: 123
input: "@123"
output: -1
------------------------------------------------------------------------
10. 
Write a Program that accepts a string and removes the duplicate characters.
---------------------------------------------------------------------

11.write a program to validate the ip address in the form a.b.c.d
   where a,b,c,d must be between 0and 255
   if validated return 1 else return 2

--------------------------------------------------------------
12. 
String encrption. replace the odd-index character with next character
(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.

------------------------------------------------------------------
13. write a program : 
GIVEN A STRING 555-666-1234
DISPLAY AS 55-56-661-234

---------------------------------------------------------------
14. write a program:
input1=commitment;
  output=cmmitmnt;
c be the first index position 
remove even vowels from the string

--------------------------------------------------------------
15. compare two strings, if the characters in string 1 are present in
   string 2, then it should be put as such in output, else '+' should be
   put in output...ignore case difference.

	input 1:"New York"
	input 2:"NWYR"

	output:N+w+Y+r+

----------------------------------------------------------------
16. input:
	Searchstring s1="GeniusRajkumarDev";
	String s2="Raj";
	String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in searchstring else return 2

---------------------------------------------------------------------
17. input1="abc2012345"
	input2="abc2112660"
	input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb 
reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4

---------------------------------------------------------------------
18. ount the number of times the second word in second string occurs in
 first string-case sensitive

input1=hai hello hai where hai Hai;
input2=what hai
output=3;
------------------------------------------------------------------------
19. Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2
---------------------------------------------------------------------
20. Email Validation
   String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five charcters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;

----------------------------------------------------------------------
21. INPUT1= helloworld
   INPUT2= 2. delete the char,if rpted twice.
   if occurs more than twice,leave the first occurence and delete the 
duplicate
   O/P= helwrd;

----------------------------------------------------------------------
22. Write a program to rearrange-
Input1=”Hello World”;  output- “dello WorlH”.

------------------------------------------------------------
23. count the number of words in the string
    Input string="i work in cognizant.";
    output=4;
-----------------------------------------------------------
24. Input1=”cowboy”; Output1=”cowcow”;
    Input1=”so”;output1=”sososo”; 
    HINT: if they give 3 letter word u have to display 2 time;
-----------------------------------------------------------
25. pan card number validation:
    all letters shud be in caps,shud be of 8 chars.
    first three letters must be alphabets.
    next 4 letters shud be digits and last letter shud be an alphabet
----------------------------------------------------------------------
26. i/p: Honesty is my best policy
    o/p: Honesty
    Return the maximum word length from the given string.
    If there are two words of same length then,
    return the word which comes first based on alphabetical order.

------------------------------------------------------------------
27. In a string check whether all the vowels are present
    if yes return 1 else 2.
    ex: String 1="education"
        output=1.
--------------------------------------------------------------------
28. swap the every 2 chrecters in the given string 
    If size is odd number then keep the last letter as it is.
    Ex:- input: forget
	 output: ofgrte
    Ex:- input  : NewYork
         output : eNYwrok
---------------------------------------------------------------------
29. input1="the sun raises in the east";
    output1=raises;
    count no vowels in each word and print the word which has max
    no of vowels if two word has max no of vowel print the first one
-----------------------------------------------------------------------
30.  Given a string s. Return all the words vertically in the same order in 
which they appear in s.
Words are returned as a list of strings, complete with spaces when is 
necessary. (Trailing spaces are not allowed).
Each word would be put on only one column and that in one column there will
be only one word.

Input: s = "HOW ARE YOU"
Output: ["HAY","ORO","WEU"]
Explanation: Each word is printed vertically. 
 "HAY"
 "ORO"
 "WEU"
------------
Input: s = "TO BE OR NOT TO BE"
Output: ["TBONTB","OEROOE","   T"]
Explanation: Trailing spaces is not allowed. 
"TBONTB"
"OEROOE"
"   T"
