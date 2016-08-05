# cheat-in-scrabble

This project is written in Java. It has two major classes, "Word", which is used to represent a word and contains a static final List of points that are assigned to each character in scrabble, and contains two things, a String that is used to represent the word and an int that has the points that the word will fetch.
"Word" need not always contain a legal word. There are three kinds of words:
1. Any Word
2. Anagram of a legal word
3. Legal word

The next class is "Rack", which is used to represent the entire rack and contains a String that represents all the tiles present in the rack.

Our methodology is to
1. Sort the tiles in the rack to be in ascending alphabetical order
2. Find the power set of the characters rack (omitting 1-letter and 2-letter words)
3. Rewrite the dictionary so that it contains all words sorted to have their characters in the alphabetical order, followed by a '-', followed by the original word.
4. Run through the power set and return the Word that fetches the maximum points.
