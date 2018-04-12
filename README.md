## Die Cruncher

An algorithm to calculate the odds of having *N* unique numbers after rolling an *M*-sided die *L* times. After talking to a computer science graduate, I learnt that I had written a Monte Carlo regression.

### Process

My solution is recursive. It calculates the odds of a new number being rolled in a given rolling 'round', vs the odds of a new number not being rolled. It then calls itself to calculate the odds in each subsequent round, and so on.

Eventually it arrives at a point where it can calculate the odds of achieving *N* unique numbers after this and any future roll. This occurs in one of the three following scenarios:

1. There are not enough rolls left to get *N* unique numbers.
2. *N* unique numbers have been rolled.
3. There is only one roll left.

At this point, the program stops calling itself and returns its probability calculation. The odds of arriving at each meaningful scenario (see below) are in this way returned and cumulatively averaged.

### Analysis

Once it knows that *N* unique numbers are either guaranteed or impossible, the algorithm does not calculate scenarios beyond that point. This is what I mean by a 'meaningful' scenario. 

This approach increases the algorithm's efficiency, but makes it harder to read than a brute force algorithm that calculates all possible roll combinations and divides the total by those with *N* or more unique numbers.