# LESSON 46-50

## FINAL PROJECT

1. We need to choose a city randomly.
2. The chance for the city should be proportional for the citizen count.
  99 citizens -> Goog 99%
  1 citizen -> Wocity 1%
3. Cities are inside database
4. We should have an API where we can call getRandomCity()
5. Winners shouldn't be excluded from next years lottery


way how to do it: give cities a number, use random int to get a winning number

simplest version of the chances would be: 
75% Goog
25% Wocity

[goog, goog, goog, wocity]

1. count the total amount of citizens -> 100
2. choose rndom number ->56
3. loop for each city to find 0. when its 0 or below then its the city that wins. in a loop constantly take away -1. 



