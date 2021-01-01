# Abominodo

Abominody is a wonderful new game base on the traditional game, dominoes. Game play is inspired by the "Dominoes" puzzles from the "Beyond Sudoku" magazine

The game involves a traditional set of 28 dominoes, and a box that allows all dominoes to placed face up in the bottom of box such that the entire bottom of the box is covered and none of the dominoes are overlapping. There is also a grid of numbers, which is different every game.

Abominodo is domino grid puzzles: a “human-type” algorithm, a brute-force method, and a scheme using a generalized odometer.

Abominodo Game Rules
---------------------------------------------------------------------------

#### Rule 1:
At the start of the game all dominoes are removed from the box. The player then consults the grid to work out where to place each domino, then places them in the box. The problem is that the edges of the dominoes are not shown on the grid, so the player does not know which way round the dominoes have to go. For example, consider the grid below:

![Alt text](http://www.scit.wlv.ac.uk/~in6659/abominodo/Screenshot-Abominodo1.png "Rule-1 Screenshot")

#### Rule 2:
The player picks up a domino and places it in the box in such a way that the numbers on the domino match the grid. Below you can see how the player has chosen to place double six at (3,3). It may also have been placed at (7,7). Has the player got it right? Every time the player places a domino they score points, even if the dominoes are in the wrong place, as long as they match the grid. If they are in the wrong places, the player will end up getting to a point where the player cannot play any more dominoes and has to give up.

![Alt text](http://www.scit.wlv.ac.uk/~in6659/abominodo/Screenshot-Abominodo2.png "Rule-2 Screenshot")

#### Rule 3:
The image below shows the all the dominoes in the final solution. This could not have been reached unless the first play was undone, because the player put the double six in the wrong place.

![Alt text](http://www.scit.wlv.ac.uk/~in6659/abominodo/Screenshot-Abominodo3.png "Rule-3 Screenshot")
