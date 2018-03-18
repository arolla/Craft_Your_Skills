Here is "Week 3" (the last one) :
With the money we earned, we are able to go on with our product, so keep up the good work !!!

We need to keep all previous functionnalities, this is mandatory for our reputation !

So we need to keep previous rules for our API :
It will take a number (positive integer) and provide :
- "Foo" if this number is multiple of 3
- "Bar" if this number is multiple of 5
- "Qix" if this number is multiple of 7

If number have several multiples, they appear in natural order (Foo, Bar, Qix).

We will return the given number as a string if there is no transformation **at all** to do.

The new rules are :
If the given number contains specific digit, we will apppend a word to the transformation in the order they appear in the number.
So if a number contains :
- 3, then we append "Foo"
- 5, then we append "Bar"
- 7, then we append "Qix"

So we may have multiples followed by occurrences.

Here, you have to add test for the new functionnality and add some to test numbers that triggers both functionnality in order to know if they work well together.
You have two main options to do that :
1. Update existing tests with cases that trigger only the multiples, and add tests that triggers only occurences (then ones that triggers both).
2. Update existing tests to call new services or package visible's methods : one dedicated to multiples, the other to occurences, and original service will call both of them to integrate them (without regressions, of course).


Once your done, I would like to know how it feels to be able :
- to add a brand new functionnality that has not much to do with previous one, 
- to move around exisiting functionnality without breaking anything AND being sure of that !

