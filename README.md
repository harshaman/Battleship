# Battleship

- This is a command line, text-only game to simulate battleship against an easy computer opponent
- The game is played between 2 players, who each have a 10x10 grid with columns A-J and rows 1-10
- Ships are all 1 square wide and the player gets 1 each of length 2, 3, 4, and 5.
- The user types a command to start battleship game and the computer lays out the ships for both players. Ships can only be horizontal or vertical and cannot intersect.
- The players alternate turns and pick a coordinate to fire upon during each turn.
- After the user selects a square, the computer informs them of the result. If the square has no ship, it was a miss. If the square has a ship that has not been hit, it was a hit. When the user hits all the squares of the ship, they have sunk the ship. When they have sunk all the opponents’ ships, they win.

# Built With
- Java v11.0.15
- Apache Maven

# IDE
IntelliJ Idea or Eclipse

# Setup Guide
1. Clone the repository in your local using the following command: ``git clone git@github.com:harshaman/Battleship.git``
2. Import the project in an IDE of your choice.
3. Update maven dependency to ensure all the dependencies exist.
4. Run the app as a Java application. main() is present in GameInit.java.

Note:
- There are 2 game modes: Play with a computer bot (Option 1) or a 2 player mode (Otion 2). 
- To input the coordinates from the console for the human player, uncomment lines 143-154 in [GameInit.java](https://github.com/harshaman/Battleship/blob/main/src/main/java/tv/ispot/battleship/GameInit.java) and comment the lines 157-166.
- In order to win the game, a player must hit all the corners of the enclosing boundary of a ship. For example:
```
  0,1__________
    |    |     |
    |____|_____|
  0,0            2,0
  ```
  
  if the topleft coordinate of a ship is (0,1) and bottomRight coordinate is (2,0), a player must hit (0,1), (0,0), (1,0), (1,1), (2,0), (2,1) to fully destroy this ship of length 2, placed horizontally.
  
# Sample Output
```
Welcome to Battleship. Choose a game mode and type 'START' to play:
MAIN MENU:
1. Play with Computer
2. Play with a human opponent
1
Player 1: Ready
Bot is laying out its ships...
2022-06-16 14:11:38 DEBUG BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2)) 2
2022-06-16 14:11:38 DEBUG BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2)) 3
2022-06-16 14:11:38 DEBUG BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0)) 4
2022-06-16 14:11:38 DEBUG BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)) 5
Bot: Ready
Type 'START' and hit enter to start the game!
start
2022-06-16 14:11:43 INFO Battleship has begun!
2022-06-16 14:11:43 INFO Player 1's turn: 
2 5 3
2022-06-16 14:11:46 INFO Player 1 board:
2022-06-16 14:11:46 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:46 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:11:46 INFO Hits: []
2022-06-16 14:11:46 INFO Misses: []

2022-06-16 14:11:46 INFO Player 2 board: 

2022-06-16 14:11:46 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:46 INFO Hits: [TwoDPlane(x=5, y=3)]
2022-06-16 14:11:46 INFO Misses: []
2022-06-16 14:11:46 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 4, y: 4
2022-06-16 14:11:46 INFO Player 2 board:
2022-06-16 14:11:46 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:46 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:11:46 INFO Hits: [TwoDPlane(x=5, y=3)]
2022-06-16 14:11:46 INFO Misses: []

2022-06-16 14:11:46 INFO Player 1 board: 

2022-06-16 14:11:46 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:46 INFO Hits: []
2022-06-16 14:11:46 INFO Misses: [TwoDPlane(x=4, y=4)]
2022-06-16 14:11:46 INFO Player 1's turn: 
2 6 3
2022-06-16 14:11:54 INFO Player 1 board:
2022-06-16 14:11:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:54 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:11:54 INFO Hits: []
2022-06-16 14:11:54 INFO Misses: [TwoDPlane(x=4, y=4)]

2022-06-16 14:11:54 INFO Player 2 board: 

2022-06-16 14:11:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:54 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3)]
2022-06-16 14:11:54 INFO Misses: []
2022-06-16 14:11:54 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 1, y: 5
2022-06-16 14:11:54 INFO Player 2 board:
2022-06-16 14:11:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:54 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:11:54 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3)]
2022-06-16 14:11:54 INFO Misses: []

2022-06-16 14:11:54 INFO Player 1 board: 

2022-06-16 14:11:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:54 INFO Hits: []
2022-06-16 14:11:54 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5)]
2022-06-16 14:11:54 INFO Player 1's turn: 
2 7 3
2022-06-16 14:11:56 INFO Player 1 board:
2022-06-16 14:11:56 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:56 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:11:56 INFO Hits: []
2022-06-16 14:11:56 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5)]

2022-06-16 14:11:56 INFO Player 2 board: 

2022-06-16 14:11:56 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:56 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3)]
2022-06-16 14:11:56 INFO Misses: []
2022-06-16 14:11:56 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 3, y: 0
2022-06-16 14:11:56 INFO Player 2 board:
2022-06-16 14:11:56 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:56 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:11:56 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3)]
2022-06-16 14:11:56 INFO Misses: []

2022-06-16 14:11:56 INFO Player 1 board: 

2022-06-16 14:11:56 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:11:56 INFO Hits: []
2022-06-16 14:11:56 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0)]
2022-06-16 14:11:56 INFO Player 1's turn: 
2 5 2
2022-06-16 14:12:00 INFO Player 1 board:
2022-06-16 14:12:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:00 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:12:00 INFO Hits: []
2022-06-16 14:12:00 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0)]

2022-06-16 14:12:00 INFO Player 2 board: 

2022-06-16 14:12:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:00 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2)]
2022-06-16 14:12:00 INFO Misses: []
2022-06-16 14:12:00 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 5, y: 10
2022-06-16 14:12:00 INFO Player 2 board:
2022-06-16 14:12:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:00 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:12:00 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2)]
2022-06-16 14:12:00 INFO Misses: []

2022-06-16 14:12:00 INFO Player 1 board: 

2022-06-16 14:12:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:00 INFO Hits: []
2022-06-16 14:12:00 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10)]
2022-06-16 14:12:00 INFO Player 1's turn: 
2 6 2
2022-06-16 14:12:02 INFO Player 1 board:
2022-06-16 14:12:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:02 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:12:02 INFO Hits: []
2022-06-16 14:12:02 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10)]

2022-06-16 14:12:02 INFO Player 2 board: 

2022-06-16 14:12:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:02 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2)]
2022-06-16 14:12:02 INFO Misses: []
2022-06-16 14:12:02 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 7, y: 3
2022-06-16 14:12:02 INFO Player 2 board:
2022-06-16 14:12:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:02 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:12:02 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2)]
2022-06-16 14:12:02 INFO Misses: []

2022-06-16 14:12:02 INFO Player 1 board: 

2022-06-16 14:12:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:02 INFO Hits: []
2022-06-16 14:12:02 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3)]
2022-06-16 14:12:02 INFO Player 1's turn: 
2 7 2
2022-06-16 14:12:06 INFO Player 1 board:
2022-06-16 14:12:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:06 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:12:06 INFO Hits: []
2022-06-16 14:12:06 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3)]

2022-06-16 14:12:06 INFO Player 2 board: 

2022-06-16 14:12:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:06 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2)]
2022-06-16 14:12:06 INFO Misses: []
2022-06-16 14:12:06 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 0, y: 8
2022-06-16 14:12:06 INFO Player 2 board:
2022-06-16 14:12:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:06 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:12:06 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2)]
2022-06-16 14:12:06 INFO Misses: []

2022-06-16 14:12:06 INFO Player 1 board: 

2022-06-16 14:12:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:06 INFO Hits: []
2022-06-16 14:12:06 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8)]
2022-06-16 14:12:06 INFO Player 1's turn: 
2 3 5
2022-06-16 14:12:45 INFO Player 1 board:
2022-06-16 14:12:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:45 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:12:45 INFO Hits: []
2022-06-16 14:12:45 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8)]

2022-06-16 14:12:45 INFO Player 2 board: 

2022-06-16 14:12:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:45 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5)]
2022-06-16 14:12:45 INFO Misses: []
2022-06-16 14:12:45 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 5, y: 2
2022-06-16 14:12:45 INFO Player 2 board:
2022-06-16 14:12:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:45 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:12:45 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5)]
2022-06-16 14:12:45 INFO Misses: []

2022-06-16 14:12:45 INFO Player 1 board: 

2022-06-16 14:12:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:45 INFO Hits: []
2022-06-16 14:12:45 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2)]
2022-06-16 14:12:45 INFO Player 1's turn: 
2 4 5
2022-06-16 14:12:57 INFO Player 1 board:
2022-06-16 14:12:57 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:57 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:12:57 INFO Hits: []
2022-06-16 14:12:57 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2)]

2022-06-16 14:12:57 INFO Player 2 board: 

2022-06-16 14:12:57 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:57 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5)]
2022-06-16 14:12:57 INFO Misses: []
2022-06-16 14:12:57 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 2, y: 6
2022-06-16 14:12:57 INFO Player 2 board:
2022-06-16 14:12:57 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:57 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:12:57 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5)]
2022-06-16 14:12:57 INFO Misses: []

2022-06-16 14:12:57 INFO Player 1 board: 

2022-06-16 14:12:57 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:12:57 INFO Hits: []
2022-06-16 14:12:57 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6)]
2022-06-16 14:12:57 INFO Player 1's turn: 
2 3 4
2022-06-16 14:13:02 INFO Player 1 board:
2022-06-16 14:13:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:02 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:02 INFO Hits: []
2022-06-16 14:13:02 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6)]

2022-06-16 14:13:02 INFO Player 2 board: 

2022-06-16 14:13:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:02 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4)]
2022-06-16 14:13:02 INFO Misses: []
2022-06-16 14:13:02 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 9, y: 7
2022-06-16 14:13:02 INFO Player 2 board:
2022-06-16 14:13:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:02 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:02 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4)]
2022-06-16 14:13:02 INFO Misses: []

2022-06-16 14:13:02 INFO Player 1 board: 

2022-06-16 14:13:02 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:02 INFO Hits: []
2022-06-16 14:13:02 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7)]
2022-06-16 14:13:02 INFO Player 1's turn: 
2 4 4
2022-06-16 14:13:07 INFO Player 1 board:
2022-06-16 14:13:07 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:07 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:07 INFO Hits: []
2022-06-16 14:13:07 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7)]

2022-06-16 14:13:07 INFO Player 2 board: 

2022-06-16 14:13:07 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:07 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4)]
2022-06-16 14:13:07 INFO Misses: []
2022-06-16 14:13:07 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 3, y: 2
2022-06-16 14:13:07 INFO Player 2 board:
2022-06-16 14:13:07 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:07 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:07 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4)]
2022-06-16 14:13:07 INFO Misses: []

2022-06-16 14:13:07 INFO Player 1 board: 

2022-06-16 14:13:07 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:07 INFO Hits: []
2022-06-16 14:13:07 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2)]
2022-06-16 14:13:07 INFO Player 1's turn: 
2 3 3
2022-06-16 14:13:11 INFO Player 1 board:
2022-06-16 14:13:11 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:11 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:11 INFO Hits: []
2022-06-16 14:13:11 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2)]

2022-06-16 14:13:11 INFO Player 2 board: 

2022-06-16 14:13:11 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:11 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3)]
2022-06-16 14:13:11 INFO Misses: []
2022-06-16 14:13:11 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 3, y: 3
2022-06-16 14:13:11 INFO Player 2 board:
2022-06-16 14:13:11 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:11 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:11 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3)]
2022-06-16 14:13:11 INFO Misses: []

2022-06-16 14:13:11 INFO Player 1 board: 

2022-06-16 14:13:11 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:11 INFO Hits: []
2022-06-16 14:13:11 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3)]
2022-06-16 14:13:11 INFO Player 1's turn: 
2 4 3
2022-06-16 14:13:13 INFO Player 1 board:
2022-06-16 14:13:13 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:13 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:13 INFO Hits: []
2022-06-16 14:13:13 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3)]

2022-06-16 14:13:13 INFO Player 2 board: 

2022-06-16 14:13:13 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:13 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3)]
2022-06-16 14:13:13 INFO Misses: []
2022-06-16 14:13:13 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 8, y: 10
2022-06-16 14:13:13 INFO Player 2 board:
2022-06-16 14:13:13 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:13 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:13 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3)]
2022-06-16 14:13:13 INFO Misses: []

2022-06-16 14:13:13 INFO Player 1 board: 

2022-06-16 14:13:13 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:13 INFO Hits: []
2022-06-16 14:13:13 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10)]
2022-06-16 14:13:13 INFO Player 1's turn: 
2 3 2
2022-06-16 14:13:22 INFO Player 1 board:
2022-06-16 14:13:22 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:22 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:22 INFO Hits: []
2022-06-16 14:13:22 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10)]

2022-06-16 14:13:22 INFO Player 2 board: 

2022-06-16 14:13:22 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:22 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2)]
2022-06-16 14:13:22 INFO Misses: []
2022-06-16 14:13:22 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 9, y: 5
2022-06-16 14:13:22 INFO Player 2 board:
2022-06-16 14:13:22 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:22 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:22 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2)]
2022-06-16 14:13:22 INFO Misses: []

2022-06-16 14:13:22 INFO Player 1 board: 

2022-06-16 14:13:22 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:22 INFO Hits: []
2022-06-16 14:13:22 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5)]
2022-06-16 14:13:22 INFO Player 1's turn: 
2 4 3
2022-06-16 14:13:24 INFO Player 1 board:
2022-06-16 14:13:24 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:24 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:24 INFO Hits: []
2022-06-16 14:13:24 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5)]

2022-06-16 14:13:24 INFO Player 2 board: 

2022-06-16 14:13:24 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:24 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3)]
2022-06-16 14:13:24 INFO Misses: []
2022-06-16 14:13:24 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 10, y: 4
2022-06-16 14:13:24 INFO Player 2 board:
2022-06-16 14:13:24 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:24 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:24 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3)]
2022-06-16 14:13:24 INFO Misses: []

2022-06-16 14:13:24 INFO Player 1 board: 

2022-06-16 14:13:24 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:24 INFO Hits: []
2022-06-16 14:13:24 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4)]
2022-06-16 14:13:24 INFO Player 1's turn: 
2 4 2
2022-06-16 14:13:27 INFO Player 1 board:
2022-06-16 14:13:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:27 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:13:27 INFO Hits: []
2022-06-16 14:13:27 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4)]

2022-06-16 14:13:27 INFO Player 2 board: 

2022-06-16 14:13:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:27 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2)]
2022-06-16 14:13:27 INFO Misses: []
2022-06-16 14:13:27 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 7, y: 3
2022-06-16 14:13:27 INFO Player 2 board:
2022-06-16 14:13:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:27 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:13:27 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2)]
2022-06-16 14:13:27 INFO Misses: []

2022-06-16 14:13:27 INFO Player 1 board: 

2022-06-16 14:13:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:13:27 INFO Hits: []
2022-06-16 14:13:27 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3)]
2022-06-16 14:13:27 INFO Player 1's turn: 
2 5 1
2022-06-16 14:15:29 INFO Player 1 board:
2022-06-16 14:15:29 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:29 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:29 INFO Hits: []
2022-06-16 14:15:29 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3)]

2022-06-16 14:15:29 INFO Player 2 board: 

2022-06-16 14:15:29 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:29 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1)]
2022-06-16 14:15:29 INFO Misses: []
2022-06-16 14:15:29 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 10, y: 7
2022-06-16 14:15:29 INFO Player 2 board:
2022-06-16 14:15:29 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:29 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:29 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1)]
2022-06-16 14:15:29 INFO Misses: []

2022-06-16 14:15:29 INFO Player 1 board: 

2022-06-16 14:15:29 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:29 INFO Hits: []
2022-06-16 14:15:29 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7)]
2022-06-16 14:15:29 INFO Player 1's turn: 
2 5 0
2022-06-16 14:15:33 INFO Player 1 board:
2022-06-16 14:15:33 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:33 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:33 INFO Hits: []
2022-06-16 14:15:33 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7)]

2022-06-16 14:15:33 INFO Player 2 board: 

2022-06-16 14:15:33 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:33 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0)]
2022-06-16 14:15:33 INFO Misses: []
2022-06-16 14:15:33 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 8, y: 4
2022-06-16 14:15:33 INFO Player 2 board:
2022-06-16 14:15:33 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:33 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:33 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0)]
2022-06-16 14:15:33 INFO Misses: []

2022-06-16 14:15:33 INFO Player 1 board: 

2022-06-16 14:15:33 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:33 INFO Hits: []
2022-06-16 14:15:33 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4)]
2022-06-16 14:15:33 INFO Player 1's turn: 
2 6 1
2022-06-16 14:15:37 INFO Player 1 board:
2022-06-16 14:15:37 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:37 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:37 INFO Hits: []
2022-06-16 14:15:37 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4)]

2022-06-16 14:15:37 INFO Player 2 board: 

2022-06-16 14:15:37 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:37 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1)]
2022-06-16 14:15:37 INFO Misses: []
2022-06-16 14:15:37 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 6, y: 1
2022-06-16 14:15:37 INFO Player 2 board:
2022-06-16 14:15:37 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:37 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:37 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1)]
2022-06-16 14:15:37 INFO Misses: []

2022-06-16 14:15:37 INFO Player 1 board: 

2022-06-16 14:15:37 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:37 INFO Hits: []
2022-06-16 14:15:37 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1)]
2022-06-16 14:15:37 INFO Player 1's turn: 
2 6 0
2022-06-16 14:15:39 INFO Player 1 board:
2022-06-16 14:15:39 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:39 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:39 INFO Hits: []
2022-06-16 14:15:39 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1)]

2022-06-16 14:15:39 INFO Player 2 board: 

2022-06-16 14:15:39 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:39 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0)]
2022-06-16 14:15:39 INFO Misses: []
2022-06-16 14:15:39 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 2, y: 1
2022-06-16 14:15:39 INFO Player 2 board:
2022-06-16 14:15:39 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:39 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:39 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0)]
2022-06-16 14:15:39 INFO Misses: []

2022-06-16 14:15:39 INFO Player 1 board: 

2022-06-16 14:15:39 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:39 INFO Hits: []
2022-06-16 14:15:39 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1)]
2022-06-16 14:15:39 INFO Player 1's turn: 
2 7 1
2022-06-16 14:15:43 INFO Player 1 board:
2022-06-16 14:15:43 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:43 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:43 INFO Hits: []
2022-06-16 14:15:43 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1)]

2022-06-16 14:15:43 INFO Player 2 board: 

2022-06-16 14:15:43 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:43 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1)]
2022-06-16 14:15:43 INFO Misses: []
2022-06-16 14:15:43 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 8, y: 10
2022-06-16 14:15:43 INFO Player 2 board:
2022-06-16 14:15:43 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:43 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:43 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1)]
2022-06-16 14:15:43 INFO Misses: []

2022-06-16 14:15:43 INFO Player 1 board: 

2022-06-16 14:15:43 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:43 INFO Hits: []
2022-06-16 14:15:43 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10)]
2022-06-16 14:15:43 INFO Player 1's turn: 
2 7 0
2022-06-16 14:15:45 INFO Player 1 board:
2022-06-16 14:15:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:45 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:45 INFO Hits: []
2022-06-16 14:15:45 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10)]

2022-06-16 14:15:45 INFO Player 2 board: 

2022-06-16 14:15:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:45 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0)]
2022-06-16 14:15:45 INFO Misses: []
2022-06-16 14:15:45 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 6, y: 2
2022-06-16 14:15:45 INFO Player 2 board:
2022-06-16 14:15:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:45 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:45 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0)]
2022-06-16 14:15:45 INFO Misses: []

2022-06-16 14:15:45 INFO Player 1 board: 

2022-06-16 14:15:45 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:45 INFO Hits: []
2022-06-16 14:15:45 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2)]
2022-06-16 14:15:45 INFO Player 1's turn: 
2 8 1
2022-06-16 14:15:48 INFO Player 1 board:
2022-06-16 14:15:48 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:48 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:48 INFO Hits: []
2022-06-16 14:15:48 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2)]

2022-06-16 14:15:48 INFO Player 2 board: 

2022-06-16 14:15:48 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:48 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1)]
2022-06-16 14:15:48 INFO Misses: []
2022-06-16 14:15:48 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 4, y: 3
2022-06-16 14:15:48 INFO Player 2 board:
2022-06-16 14:15:48 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:48 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:48 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1)]
2022-06-16 14:15:48 INFO Misses: []

2022-06-16 14:15:48 INFO Player 1 board: 

2022-06-16 14:15:48 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:48 INFO Hits: []
2022-06-16 14:15:48 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3)]
2022-06-16 14:15:48 INFO Player 1's turn: 
2 8 0
2022-06-16 14:15:50 INFO Player 1 board:
2022-06-16 14:15:50 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:50 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:50 INFO Hits: []
2022-06-16 14:15:50 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3)]

2022-06-16 14:15:50 INFO Player 2 board: 

2022-06-16 14:15:50 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:50 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0)]
2022-06-16 14:15:50 INFO Misses: []
2022-06-16 14:15:50 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 5, y: 1
2022-06-16 14:15:50 INFO Player 2 board:
2022-06-16 14:15:50 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:50 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:50 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0)]
2022-06-16 14:15:50 INFO Misses: []

2022-06-16 14:15:50 INFO Player 1 board: 

2022-06-16 14:15:50 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:50 INFO Hits: []
2022-06-16 14:15:50 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1)]
2022-06-16 14:15:50 INFO Player 1's turn: 
2 9 1
2022-06-16 14:15:51 INFO Player 1 board:
2022-06-16 14:15:51 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:51 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:51 INFO Hits: []
2022-06-16 14:15:51 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1)]

2022-06-16 14:15:51 INFO Player 2 board: 

2022-06-16 14:15:51 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:51 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1)]
2022-06-16 14:15:51 INFO Misses: []
2022-06-16 14:15:51 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 4, y: 0
2022-06-16 14:15:51 INFO Player 2 board:
2022-06-16 14:15:51 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:51 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:51 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1)]
2022-06-16 14:15:51 INFO Misses: []

2022-06-16 14:15:51 INFO Player 1 board: 

2022-06-16 14:15:51 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:51 INFO Hits: []
2022-06-16 14:15:51 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0)]
2022-06-16 14:15:51 INFO Player 1's turn: 
2 9 0
2022-06-16 14:15:54 INFO Player 1 board:
2022-06-16 14:15:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:54 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:15:54 INFO Hits: []
2022-06-16 14:15:54 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0)]

2022-06-16 14:15:54 INFO Player 2 board: 

2022-06-16 14:15:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:54 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0)]
2022-06-16 14:15:54 INFO Misses: []
2022-06-16 14:15:54 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 7, y: 7
2022-06-16 14:15:54 INFO Player 2 board:
2022-06-16 14:15:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:54 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:15:54 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0)]
2022-06-16 14:15:54 INFO Misses: []

2022-06-16 14:15:54 INFO Player 1 board: 

2022-06-16 14:15:54 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:15:54 INFO Hits: []
2022-06-16 14:15:54 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7)]
2022-06-16 14:15:54 INFO Player 1's turn: 
2 5 5
2022-06-16 14:16:00 INFO Player 1 board:
2022-06-16 14:16:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:00 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:00 INFO Hits: []
2022-06-16 14:16:00 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7)]

2022-06-16 14:16:00 INFO Player 2 board: 

2022-06-16 14:16:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:00 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5)]
2022-06-16 14:16:00 INFO Misses: []
2022-06-16 14:16:00 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 9, y: 8
2022-06-16 14:16:00 INFO Player 2 board:
2022-06-16 14:16:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:00 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:00 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5)]
2022-06-16 14:16:00 INFO Misses: []

2022-06-16 14:16:00 INFO Player 1 board: 

2022-06-16 14:16:00 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:00 INFO Hits: []
2022-06-16 14:16:00 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8)]
2022-06-16 14:16:00 INFO Player 1's turn: 
2 6 5
2022-06-16 14:16:06 INFO Player 1 board:
2022-06-16 14:16:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:06 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:06 INFO Hits: []
2022-06-16 14:16:06 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8)]

2022-06-16 14:16:06 INFO Player 2 board: 

2022-06-16 14:16:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:06 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5)]
2022-06-16 14:16:06 INFO Misses: []
2022-06-16 14:16:06 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 9, y: 6
2022-06-16 14:16:06 INFO Player 2 board:
2022-06-16 14:16:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:06 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:06 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5)]
2022-06-16 14:16:06 INFO Misses: []

2022-06-16 14:16:06 INFO Player 1 board: 

2022-06-16 14:16:06 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:06 INFO Hits: []
2022-06-16 14:16:06 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6)]
2022-06-16 14:16:06 INFO Player 1's turn: 
2 7 5
2022-06-16 14:16:08 INFO Player 1 board:
2022-06-16 14:16:08 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:08 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:08 INFO Hits: []
2022-06-16 14:16:08 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6)]

2022-06-16 14:16:08 INFO Player 2 board: 

2022-06-16 14:16:08 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:08 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5)]
2022-06-16 14:16:08 INFO Misses: []
2022-06-16 14:16:08 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 8, y: 0
2022-06-16 14:16:08 INFO Player 2 board:
2022-06-16 14:16:08 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:08 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:08 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5)]
2022-06-16 14:16:08 INFO Misses: []

2022-06-16 14:16:08 INFO Player 1 board: 

2022-06-16 14:16:08 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:08 INFO Hits: []
2022-06-16 14:16:08 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0)]
2022-06-16 14:16:08 INFO Player 1's turn: 
2 8 5
2022-06-16 14:16:10 INFO Player 1 board:
2022-06-16 14:16:10 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:10 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:10 INFO Hits: []
2022-06-16 14:16:10 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0)]

2022-06-16 14:16:10 INFO Player 2 board: 

2022-06-16 14:16:10 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:10 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5)]
2022-06-16 14:16:10 INFO Misses: []
2022-06-16 14:16:10 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 1, y: 10
2022-06-16 14:16:10 INFO Player 2 board:
2022-06-16 14:16:10 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:10 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:10 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5)]
2022-06-16 14:16:10 INFO Misses: []

2022-06-16 14:16:10 INFO Player 1 board: 

2022-06-16 14:16:10 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:10 INFO Hits: []
2022-06-16 14:16:10 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10)]
2022-06-16 14:16:10 INFO Player 1's turn: 
2 9 5
2022-06-16 14:16:12 INFO Player 1 board:
2022-06-16 14:16:12 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:12 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:12 INFO Hits: []
2022-06-16 14:16:12 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10)]

2022-06-16 14:16:12 INFO Player 2 board: 

2022-06-16 14:16:12 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:12 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5)]
2022-06-16 14:16:12 INFO Misses: []
2022-06-16 14:16:12 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 1, y: 9
2022-06-16 14:16:12 INFO Player 2 board:
2022-06-16 14:16:12 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:12 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:12 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5)]
2022-06-16 14:16:12 INFO Misses: []

2022-06-16 14:16:12 INFO Player 1 board: 

2022-06-16 14:16:12 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:12 INFO Hits: []
2022-06-16 14:16:12 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9)]
2022-06-16 14:16:12 INFO Player 1's turn: 
2 10 5
2022-06-16 14:16:18 INFO Player 1 board:
2022-06-16 14:16:18 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:18 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:18 INFO Hits: []
2022-06-16 14:16:18 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9)]

2022-06-16 14:16:18 INFO Player 2 board: 

2022-06-16 14:16:18 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:18 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5)]
2022-06-16 14:16:18 INFO Misses: []
2022-06-16 14:16:18 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 10, y: 2
2022-06-16 14:16:18 INFO Player 2 board:
2022-06-16 14:16:18 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:18 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:18 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5)]
2022-06-16 14:16:18 INFO Misses: []

2022-06-16 14:16:18 INFO Player 1 board: 

2022-06-16 14:16:18 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:18 INFO Hits: []
2022-06-16 14:16:18 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2)]
2022-06-16 14:16:18 INFO Player 1's turn: 
2 5 4
2022-06-16 14:16:23 INFO Player 1 board:
2022-06-16 14:16:23 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:23 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:23 INFO Hits: []
2022-06-16 14:16:23 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2)]

2022-06-16 14:16:23 INFO Player 2 board: 

2022-06-16 14:16:23 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:23 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4)]
2022-06-16 14:16:23 INFO Misses: []
2022-06-16 14:16:23 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 9, y: 10
2022-06-16 14:16:23 INFO Player 2 board:
2022-06-16 14:16:23 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:23 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:23 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4)]
2022-06-16 14:16:23 INFO Misses: []

2022-06-16 14:16:23 INFO Player 1 board: 

2022-06-16 14:16:23 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:23 INFO Hits: []
2022-06-16 14:16:23 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10)]
2022-06-16 14:16:23 INFO Player 1's turn: 
2 6 4
2022-06-16 14:16:27 INFO Player 1 board:
2022-06-16 14:16:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:27 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:27 INFO Hits: []
2022-06-16 14:16:27 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10)]

2022-06-16 14:16:27 INFO Player 2 board: 

2022-06-16 14:16:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:27 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4)]
2022-06-16 14:16:27 INFO Misses: []
2022-06-16 14:16:27 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 5, y: 0
2022-06-16 14:16:27 INFO Player 2 board:
2022-06-16 14:16:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:27 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:27 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4)]
2022-06-16 14:16:27 INFO Misses: []

2022-06-16 14:16:27 INFO Player 1 board: 

2022-06-16 14:16:27 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:27 INFO Hits: []
2022-06-16 14:16:27 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0)]
2022-06-16 14:16:27 INFO Player 1's turn: 
2 7 4
2022-06-16 14:16:31 INFO Player 1 board:
2022-06-16 14:16:31 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:31 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:31 INFO Hits: []
2022-06-16 14:16:31 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0)]

2022-06-16 14:16:31 INFO Player 2 board: 

2022-06-16 14:16:31 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:31 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4)]
2022-06-16 14:16:31 INFO Misses: []
2022-06-16 14:16:31 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 7, y: 5
2022-06-16 14:16:31 INFO Player 2 board:
2022-06-16 14:16:31 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:31 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:31 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4)]
2022-06-16 14:16:31 INFO Misses: []

2022-06-16 14:16:31 INFO Player 1 board: 

2022-06-16 14:16:31 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:31 INFO Hits: []
2022-06-16 14:16:31 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0), TwoDPlane(x=7, y=5)]
2022-06-16 14:16:31 INFO Player 1's turn: 
2 8 4
2022-06-16 14:16:35 INFO Player 1 board:
2022-06-16 14:16:35 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:35 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:35 INFO Hits: []
2022-06-16 14:16:35 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0), TwoDPlane(x=7, y=5)]

2022-06-16 14:16:35 INFO Player 2 board: 

2022-06-16 14:16:35 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:35 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4), TwoDPlane(x=8, y=4)]
2022-06-16 14:16:35 INFO Misses: []
2022-06-16 14:16:35 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 5, y: 0
2022-06-16 14:16:35 INFO Player 2 board:
2022-06-16 14:16:35 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:35 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:35 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4), TwoDPlane(x=8, y=4)]
2022-06-16 14:16:35 INFO Misses: []

2022-06-16 14:16:35 INFO Player 1 board: 

2022-06-16 14:16:35 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:35 INFO Hits: []
2022-06-16 14:16:35 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0), TwoDPlane(x=7, y=5), TwoDPlane(x=5, y=0)]
2022-06-16 14:16:35 INFO Player 1's turn: 
2 9 4
2022-06-16 14:16:38 INFO Player 1 board:
2022-06-16 14:16:38 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:38 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:38 INFO Hits: []
2022-06-16 14:16:38 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0), TwoDPlane(x=7, y=5), TwoDPlane(x=5, y=0)]

2022-06-16 14:16:38 INFO Player 2 board: 

2022-06-16 14:16:38 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:38 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4), TwoDPlane(x=8, y=4), TwoDPlane(x=9, y=4)]
2022-06-16 14:16:38 INFO Misses: []
2022-06-16 14:16:38 INFO Player 2's turn: 
Player 2 chose: targetPlayerId: 1, x: 8, y: 0
2022-06-16 14:16:38 INFO Player 2 board:
2022-06-16 14:16:38 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:38 INFO Ships: [Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=3), coordBottomRight=TwoDPlane(x=7, y=2))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=3, y=5), coordBottomRight=TwoDPlane(x=4, y=2))), Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=1), coordBottomRight=TwoDPlane(x=9, y=0))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=5, y=5), coordBottomRight=TwoDPlane(x=10, y=4)))]
2022-06-16 14:16:38 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4), TwoDPlane(x=8, y=4), TwoDPlane(x=9, y=4)]
2022-06-16 14:16:38 INFO Misses: []

2022-06-16 14:16:38 INFO Player 1 board: 

2022-06-16 14:16:38 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:38 INFO Hits: []
2022-06-16 14:16:38 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0), TwoDPlane(x=7, y=5), TwoDPlane(x=5, y=0), TwoDPlane(x=8, y=0)]
2022-06-16 14:16:38 INFO Player 1's turn: 
2 10 4
2022-06-16 14:16:43 INFO Player 1 board:
2022-06-16 14:16:43 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:43 INFO Ships: [Ship(length=4, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=7), coordBottomRight=TwoDPlane(x=4, y=7))), Ship(length=3, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=1), coordBottomRight=TwoDPlane(x=4, y=4))), Ship(length=2, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=7, y=3), coordBottomRight=TwoDPlane(x=7, y=5))), Ship(length=5, boundary=BoundaryImpl(coordTopLeft=TwoDPlane(x=4, y=9), coordBottomRight=TwoDPlane(x=9, y=9)))]
2022-06-16 14:16:43 INFO Hits: []
2022-06-16 14:16:43 INFO Misses: [TwoDPlane(x=4, y=4), TwoDPlane(x=1, y=5), TwoDPlane(x=3, y=0), TwoDPlane(x=5, y=10), TwoDPlane(x=7, y=3), TwoDPlane(x=0, y=8), TwoDPlane(x=5, y=2), TwoDPlane(x=2, y=6), TwoDPlane(x=9, y=7), TwoDPlane(x=3, y=2), TwoDPlane(x=3, y=3), TwoDPlane(x=8, y=10), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=4), TwoDPlane(x=7, y=3), TwoDPlane(x=10, y=7), TwoDPlane(x=8, y=4), TwoDPlane(x=6, y=1), TwoDPlane(x=2, y=1), TwoDPlane(x=8, y=10), TwoDPlane(x=6, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=5, y=1), TwoDPlane(x=4, y=0), TwoDPlane(x=7, y=7), TwoDPlane(x=9, y=8), TwoDPlane(x=9, y=6), TwoDPlane(x=8, y=0), TwoDPlane(x=1, y=10), TwoDPlane(x=1, y=9), TwoDPlane(x=10, y=2), TwoDPlane(x=9, y=10), TwoDPlane(x=5, y=0), TwoDPlane(x=7, y=5), TwoDPlane(x=5, y=0), TwoDPlane(x=8, y=0)]

2022-06-16 14:16:43 INFO Player 2 board: 

2022-06-16 14:16:43 INFO Board boundary: BoundaryImpl(coordTopLeft=TwoDPlane(x=0, y=10), coordBottomRight=TwoDPlane(x=10, y=0))
2022-06-16 14:16:43 INFO Hits: [TwoDPlane(x=5, y=3), TwoDPlane(x=6, y=3), TwoDPlane(x=7, y=3), TwoDPlane(x=5, y=2), TwoDPlane(x=6, y=2), TwoDPlane(x=7, y=2), TwoDPlane(x=3, y=5), TwoDPlane(x=4, y=5), TwoDPlane(x=3, y=4), TwoDPlane(x=4, y=4), TwoDPlane(x=3, y=3), TwoDPlane(x=4, y=3), TwoDPlane(x=3, y=2), TwoDPlane(x=4, y=3), TwoDPlane(x=4, y=2), TwoDPlane(x=5, y=1), TwoDPlane(x=5, y=0), TwoDPlane(x=6, y=1), TwoDPlane(x=6, y=0), TwoDPlane(x=7, y=1), TwoDPlane(x=7, y=0), TwoDPlane(x=8, y=1), TwoDPlane(x=8, y=0), TwoDPlane(x=9, y=1), TwoDPlane(x=9, y=0), TwoDPlane(x=5, y=5), TwoDPlane(x=6, y=5), TwoDPlane(x=7, y=5), TwoDPlane(x=8, y=5), TwoDPlane(x=9, y=5), TwoDPlane(x=10, y=5), TwoDPlane(x=5, y=4), TwoDPlane(x=6, y=4), TwoDPlane(x=7, y=4), TwoDPlane(x=8, y=4), TwoDPlane(x=9, y=4), TwoDPlane(x=10, y=4)]
2022-06-16 14:16:43 INFO Misses: []
2022-06-16 14:16:43 INFO Game over!
2022-06-16 14:16:43 INFO Player 1 has won the game

Process finished with exit code 0
```
